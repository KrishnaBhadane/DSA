import java.util.Scanner;

public class arrays {

    public static int[] inputArray(Scanner sc) {
        int n;
        System.out.println("Input Your Array Size");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Input Your Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int largestElement(int arr[]) {
        int largetElement = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (largetElement < arr[i]) {
                largetElement = arr[i];
            }
        }


        return largetElement;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nums[] = inputArray(sc);
        printArr(nums);
        System.out.println();
        System.out.println("The largest element from array is : " + largestElement(nums));
        sc.close();
    }
}
