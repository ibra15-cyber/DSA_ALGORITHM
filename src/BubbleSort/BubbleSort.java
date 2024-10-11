package BubbleSort;

public class BubbleSort {

    public static void main(String[] args) {

        //iterate an array
        //for each 2 element, if the 2nd is less than the first, swap their position
        //after first complete iteration no one there's no guarantee a no will be at its position
        //so you have to iterate it the same no of times as the number of elements in the array O (n2)

        int[] array = {64, 34, 25, 5, 22, 11, 90, 12};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j+1] < array[j]) { //if the second number in the list is less than the first
                    int temp = array[j];  //copy the first no
                    array[j] = array[j+1]; //the first index is the second no
                    array[j+1] = temp; //while the second index is the first no
                }
            }
        }

        for(int i : array) {
            System.out.println(i + " ");
        }
    }
}
