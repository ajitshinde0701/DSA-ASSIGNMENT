import java.util.*;
class Demo{
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,7};
        int[] arr1 = {1,1,2,2,2,3,};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

         for(int i =0;i<arr1.length;i++){
            hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
        }
        
       

        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()== 1){
               System.out.println(entry.getKey());
            }
          
        }
    }
}  
