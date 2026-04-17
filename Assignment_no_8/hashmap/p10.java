import java.util.*;
class Demo{
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3};
        int[] arr2 = {2,2,4};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<arr1.length;i++){
            for(int j =0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
                    arr2[j] = -1;
                    break;
                }
            } 
        }
        for(int key: hm.keySet()){
            System.out.print(key+" ");
        }
    }
}