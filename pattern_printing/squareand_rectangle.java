package pattern_printing;

import java.util.Scanner;

public class squareand_rectangle {

    public static void alphabetsquare(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i % 2) == 0) {
                    System.out.print((char) (i + 96) + " ");
                } else {
                    System.out.print((char) (i + 64) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }
    }

    public static void triangle1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % 2) == 0) {
                    System.out.print((char) (j + 64));
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void hollow(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*" + ' ');
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void plus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == ((n / 2) + 1) || j == ((n / 2) + 1)) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void cross(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void binarytriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void righttriangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j > n - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void midtriangle(int n) {

        int col = 2 * n - 1;
        int mid = (col + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= col; j++) {
                if (j == mid - i + 1) {
                    System.out.print("* ");
                } else if (j <= mid + i - 1 && j > mid - i + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void kite(int n) {

        int mid = (n + 1) / 2;

        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == mid - i + 1) {
                    System.out.print("*");
                } else if (j <= mid + i - 1 && j > mid - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        for (int i = mid + 1; i <= n; i++) {
            int left = i - mid + 1;
            int right = n - i + mid;

            for (int j = 1; j <= n; j++) {
                if (j >= left && j <= right) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        // alphabetsquare(n);
        // triangle1(n);
        // hollow(n);
        // plus(n);
        // cross(n);
        // binarytriangle(n);
        // righttriangle(n);
        // midtriangle(n);
        kite(n);
    }
}
