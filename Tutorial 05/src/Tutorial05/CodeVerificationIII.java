package Tutorial05;

public class CodeVerificationIII {
    static int aValue = 5;
    public static void main(String[] args) {
        int aValue = 6;
        int bValue = 4;

        int result = process(bValue);
        System.out.println(result);
        System.out.println(aValue);
    }
    private static int process (int aValue){ //AA
        aValue = aValue + 4;
        return aValue;

    }
}

// a) if line AA was private static void process (int cValue);Only the name of the parameter changes, So nothing changes functionally, just a different variable name is used inside the method
// c) // To return a double, just change 'int' to 'double' in the function's return type : private static int process (double aValue){} and return (double) aValue;