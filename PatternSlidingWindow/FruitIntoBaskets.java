//Problem Statement #
//Given an array of characters where each character represents a fruit tree, you are given two baskets and your goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have only one type of fruit.

package PatternSlidingWindow;

import java.util.HashMap;

public class FruitIntoBaskets {
    public static int fruitIntoBaskets(int[] fruits){
        int result=0;
        int i=0;
        int j=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        if(fruits.length==0){
            return 0;
        }
        while (j< fruits.length){
            hm.put(fruits[j],hm.getOrDefault(j,0)+1);
            while (hm.size()>2){
                if (hm.get(fruits[i])==1){
                    hm.remove(fruits[i]);
                }
                else {
                    hm.put(fruits[i] , hm.get(fruits[i])-1);
                }
                i++;
            }
            result = Math.max(result,j-i+1);
            j++;
        }
        return  result;
    }

    public static int fruitIntoBaskets2(int[] fruits) {
        int result = 0;
        int i = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        if (fruits.length == 0) {
            return 0;
        }
        for (int j = 0; j < fruits.length; j++) {
            hm.put(fruits[j], hm.getOrDefault(fruits[j], 0) + 1);
            while (hm.size() > 2) {
                hm.put(fruits[i], hm.get(fruits[i])-1);
                if (hm.get(fruits[i]) == 0) {
                    hm.remove(fruits[i]);
                }
                i++;
            }
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
    public static void main(String[] args) {
       // int fruits[] ={1,2,2,4,4,4,4,4,5,2,4};
        int fruits[] = {'c','c','d','b','a','a','a','b','a','a','c','b','a','c'};
        System.out.println(fruitIntoBaskets2(fruits));
    }
}
