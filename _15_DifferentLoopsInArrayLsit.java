import java.util.*;

public class _15_DifferentLoopsInArrayLsit {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println("Using for loop");
        for (int i = 0; i < arrayList.size(); i++) {
            int element = arrayList.get(i);
            System.out.println(element);
        }
        
        System.out.println("Using for loop");
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            int element = iterator.next();
            System.out.println(element);
        }

        System.out.println("Using enhanced for loop");
        for(int element : arrayList){
            System.out.println(element);
        }
    }
}
