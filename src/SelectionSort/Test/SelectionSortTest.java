package SelectionSort.Test;

public class SelectionSortTest {
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            if (minIndex != i) { //this will make sure we break from the loop when everything is sorted
                int temp = array[minIndex]; //take away the min no and place assign it to temp
                array[minIndex] = array[i]; //now assume the min no is no at the first index
                array[i] = temp;   //pass the min number to the current outer index, but before that make sure you take its current value
            }
        }
    }

    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 5, 22, 11, 90, 12};
        int n = my_array.length;
//        System.out.println("n: " + n); //just link range in python
//        System.out.println("n-1 : "+  (n-1));

        for (int i = 0; i < n -1; i++) {
            System.out.println("outer i after :" + i + ": th iteration");

            int minIndex = i;

            System.out.println("minIndex before starting another outer itr an iteration: " + minIndex );

            for (int j = i + 1; j < n ; j++) { //this iterations starts from the second num
                System.out.println("j on iteration: " + j);
                if(my_array[j] < my_array[minIndex]) {
                    minIndex = j;
                    System.out.println( "minValue after the inner iteration : " + my_array[minIndex]);

                }
            }

            if (minIndex != i) {
                int temp = my_array[minIndex];
                System.out.println( "lowerst value in the list]" + temp);

                my_array[minIndex] = my_array[i]; //the next min index array is the next out iteration value
                my_array[i] = temp;
//            System.out.println();
            }
        }

        for (int i: my_array){
            System.out.print(i + " ");
        }

//        int[] array = {64, 25, 12, 22, 11};
//        selectionSort(array);
//
//        System.out.println("Sorted array:");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }


    }



}
