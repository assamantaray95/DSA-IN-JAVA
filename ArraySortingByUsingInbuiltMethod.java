import java.util.Arrays;
public class ArraySortingByUsingInbuiltMethod {

    public static int[] arraySort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // ans 4
        int arr2[] = { 1, 4, 3, 2, 6, 7 };         // ans 2
        int arr3[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }; // ans 3
        int arr4[] = { 1, 2, 0, 0, 0 }; // ans -1
        int arr5[] = { 9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1}; //ans 2
        int[] ArrayValue1 = arraySort(arr1);
        String ArrayValueOne = Arrays.toString(ArrayValue1);
        System.out.println("After Sorting : "+ArrayValueOne);
        int[] ArrayValue2 = arraySort(arr2);
        String ArrayValueTwo = Arrays.toString(ArrayValue2);
        System.out.println("After Sorting : "+ArrayValueTwo);
        int[] ArrayValue3 = arraySort(arr3);
        String ArrayValueThree = Arrays.toString(ArrayValue3);
        System.out.println("After Sorting : "+ArrayValueThree);
         int[] ArrayValue4 = arraySort(arr4);
        String ArrayValueFour = Arrays.toString(ArrayValue4);
        System.out.println("After Sorting : "+ArrayValueFour);
         int[] ArrayValue5 = arraySort(arr5);
        String ArrayValueFive = Arrays.toString(ArrayValue5);
        System.out.println("After Sorting : "+ArrayValueFive);
    }
}

