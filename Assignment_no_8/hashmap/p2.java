

import java.util.*;
class Demo{
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        int target = 2;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0;i<arr.length;i++){
           hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
       

        for(int key: hm.keySet()){
            if(hm.get(key)>target){
                System.out.print(key+" ");
            }
        }
        
    }
}
