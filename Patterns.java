import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Any Number For Rows And Clms Of Patterns");
        // int n = sc.nextInt();
        int n = 5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);;
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        System.out.println();
        pattern7(n);
        System.out.println();
        pattern8(n);
        System.out.println();
        pattern9(n);
        sc.close();
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void pattern5(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void pattern6(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1 ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void pattern8(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void pattern9(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int row = (i < n) ? i : 2 * n - i - 1;

            for (int j = 0; j < n - row - 1; j++)
                System.out.print(" ");

            for (int j = 0; j < 2 * row + 1; j++)
                System.out.print("*");

            System.out.println();
        }
        System.out.println("---------------------------");
    }
}
