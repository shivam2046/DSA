//print all natural number from 1 to n 

class basics {
    public void printone(int n) {
        if (n == 0)
            return;

        printone(n - 1);
        System.out.print(n + " ");

    }

    static void printnatural(int x, int n) {
        if (x == n + 1)
            return;
        System.out.print(x + " ");
        printnatural(x + 1, n);
    }

    public int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        int calcfact = factorial(n - 1) * n;

        return calcfact;
    }

    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;

        int fibonaci = fib(n - 2) + fib(n - 1);
        return fibonaci;
    }

    static int sumofdigit(int n) {
        if (n == 0 || n <= 9)
            return n;
        int smallans = sumofdigit(n / 10) + n % 10;
        return smallans;

    }

    static int countdigit(int n) {
        int count = 0;
        if (n == 0 || n <= 9)
            return count + 1;
        else
            return 1 + countdigit(n / 10);

    }

    public int calcpow(int p, int q) {
        if (q == 0)
            return 1;
        else if (q % 2 == 0) {
            return calcpow(p, q / 2) * calcpow(p, q / 2);
        } else {
            return calcpow(p, q / 2) * calcpow(p, q / 2) * p;
        }
    }

    static int printtable(int x, int y) {
        if (y == 1)
            return x;
        printtable(x, y - 1);

        int result = x * y;
        System.out.println(x + " * " + y + " = " + result);

        return result;
    }

    static int igcd(int x, int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;

        }
        return y;
    }
    static int rgcd(int x, int y){
        if(y==0) return x;
        return rgcd(y,x%y);
    }

    public static void main(String[] args) {
        basics b = new basics();
        b.printone(10);
        System.out.println();
        printnatural(0, 15);
        System.out.println();
        int x = b.factorial(5);
        System.out.println(x);
        System.out.println(fib(10));
        System.out.println(sumofdigit(1234));
        System.out.println(countdigit(1265746534));
        int ans = b.calcpow(2, 6);
        System.out.println(ans);
        System.out.println();
       
        System.out.println(printtable(4, 10));
        System.out.println();
        System.out.println(igcd(24,54));
        System.out.println(rgcd(24,54));
    }
}