package Tutorial05;

public class QuestionThree {
    public static void main(String[] args) {
        printNumbers(1);
    }
    private static void printNumbers(int num){
        if (num <= 100) {
            System.out.println(num);
            printNumbers(num + 1);
        }
    }
}
