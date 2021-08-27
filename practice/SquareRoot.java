package practice;

public class SquareRoot {

    public static void main(String[] args) {
        int n = 49;
        int sqrt = findSquareRoot(n);
        int sqrt2 = findSquareRoot2(n);
        System.out.println(sqrt);
    }

    //
    private static int findSquareRoot2(int n) {
        return 0;
    }

    // Floor Square root
    private static int findSquareRoot(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int i = 1, result = 1;
        while (result <= n) {
            i++;
            result = i*i;
        }
        return i-1;
    }

}
