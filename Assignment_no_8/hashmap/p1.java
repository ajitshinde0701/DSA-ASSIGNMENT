import java.util.*;
class Demo{
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = {1,2,2,3,3,3,4,4};
        for(int i =0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        int maxFreq = 0;
        int secondMaxFreq = 0;  
        int result = 0; 
        int maxEle = 0; 
        for(int key: hm.keySet()){
            
            if(hm.get(key)>maxFreq){
                secondMaxFreq = maxFreq;
                maxFreq = hm.get(key);
                result = maxEle;
                maxEle = key;
            }
            else if(hm.get(key)<maxFreq && hm.get(key)>secondMaxFreq){
                secondMaxFreq = hm.get(key);
                result = key;
            }
        }
        System.out.println( result);
    }
}