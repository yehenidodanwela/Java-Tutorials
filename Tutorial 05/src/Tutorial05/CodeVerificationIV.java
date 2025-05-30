package Tutorial05;

public class CodeVerificationIV {
    public static void main(String[] args) {
        double Num1 =3.0;
        int Num2 = 2;
        int total;
        total = processA (Num1, Num2);
        System.out.println(total);
    }
    private static int processA(double Sum, int Count){
        int newAnswer = (int) (Sum + Count);
        return newAnswer;
    }
    private static int processA(int Sum, double Count){
        int newAnswer = (int) (Sum * Count);
        return newAnswer;
    }
}

// There are two versions of processA, java chooses which overloaded method to call based on the parameter types, Since Num1 is a double and Num2 is an int, this matches the first version; It adds 3 to 2, because Java calls the method processA(double, int) — which does addition
// Java decides which method to call based on the types of the arguments passed, In your main method, you wrote:Num1 is a double and Num2 is an int, So Java looks for a method with this exact match in parameter types

// To make both methods return int, change return type to 'int' and cast the result before returning