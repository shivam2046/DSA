public class Rec {

    static int power(int a, int n) {

        if (n == 0)
            return 1;

        // if n is even
        if (n % 2 == 0)
            return power(a, n / 2) * power(a, n / 2);

        // if n is odd
        return a * power(a, n / 2) * power(a, n / 2);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 6)); // 32
    }
    
}
