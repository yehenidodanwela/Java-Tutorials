package Tutorial05;

public class DoubleRecursion {
    public static void main(String[] args) {
        int result = t(4);
        System.out.println("t(4) = " + result);
    }
    private static int t(int n){
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 3;
        } else {
            return t(n - 2) + t(n - 1);
        }
    }
}
