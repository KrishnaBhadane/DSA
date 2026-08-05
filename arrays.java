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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nums[] = inputArray(sc);
        printArr(nums);

        sc.close();
    }
}
