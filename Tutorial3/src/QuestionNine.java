public class QuestionNine {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            int num = i;
            int sum = 0;
            int temp = num;

            while (temp != 0){
                int digit = temp % 10;
                sum += Math.pow(digit, 3);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num + " is an Armstrong number");
            }
        }
    }

}
