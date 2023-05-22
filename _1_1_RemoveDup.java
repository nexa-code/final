import java.util.*;

public class _1_1_RemoveDup{
    public static void main(String[] args){
        int[] arr = {1,2,3,2,1,4,5,6,7,6,9};

        System.out.println("Original Array: "+ Arrays.toString(arr));

        int length = arr.length;

        for(int i=0;i<length;i++){
            for (int j = i+1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < length-1; k++) {
                        arr[k] = arr[k+1];
                    }
                    length--;
                    j--;
                }
            }
        }


        int[] uniqueElements = Arrays.copyOf(arr,length);

        System.out.println("Unique Elements array: "+ Arrays.toString(uniqueElements));
    }
}