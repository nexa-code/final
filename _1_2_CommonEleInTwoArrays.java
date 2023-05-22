import java.util.*;

public class _1_2_CommonEleInTwoArrays {
    public static void main(String[] args) {
        
        int[] arr1 = {1,5,2,3,6,7,4};
        int[] arr2 = {2,8,3,1,4};

        System.out.println("arr1: "+Arrays.toString(arr1));
        System.out.println("arr2: "+Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] commonElementsArray = new int[Math.min(arr1.length, arr2.length)];
        int index=0,i=0,j=0;

        while(i<arr1.length && j<arr2.length){
            if (arr1[i] == arr2[j]) {
                commonElementsArray[index++] = arr1[i];
                i++;
                j++;
            }else if (arr1[i]<arr2[j]) {
                i++;
            }else{
                j++;
            }
        }

        commonElementsArray = Arrays.copyOf(commonElementsArray, index);

        System.out.println("Common Elements in two: "+ Arrays.toString(commonElementsArray));
        
    }
}
