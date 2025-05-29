package Tutorial05;

public class CodeVerification {
    public static void main(String[] args) {
        int aValue = 3;
        double result = multiply(aValue, 2);
        System.out.println("Result = " + result);
    }private static double multiply(int sum1, int sum2){
        sum1 = sum1 * sum2;
        return (double) sum1;

    }
}
