package Tutorial05;

public class CodeVerificationII {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 4;
        mixup (a,b,3);
    }
    private static void mixup(int b, int c, int a){
        a = b+c - a;
        System.out.println(a + " " +c);
    }
}
