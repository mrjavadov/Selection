public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = {17,22,15,14};
        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
//Yuxarida olan massivde selection sort alqoritmasi icra olunur
//Ilk olaraq massivin en kicik elementi tapir ve ilk element ile deyisdirilir
//sonra ikinci en kicik element tapilib 1ci index ile evez olunur
//Butun prosesler bu sekilde icra olunur

//{17,22,15,14}
//{14,22,15,17}
//{14,15,22,17}
//{14,15,17,22}






