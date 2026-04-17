import java.util.HashMap;
class Demo{
    public static void main(String[]args){
    HashMap<Integer, Integer> hm = new HashMap<>();
    int [] arr = {1,1,2,2,3,5};
    for(int i : arr){
        hm.put(i, hm.getOrDefault(i, 0) + 1);
    }
    System.out.println(hm);

    }
}