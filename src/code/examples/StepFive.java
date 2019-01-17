package code.examples;

public class StepFive {

    public static void main(String[] args) {
//        runtimeExceptionExample();

        System.out.println("I am going to try to calculate a sum of two arguments");
        try {
            System.out.println("Number sum: " + calculateSum(Integer.parseInt(args[0]),
                    Integer.parseInt(args[1])));
        } catch (NumberFormatException exc) {
            System.out.println("One of the arguments was not a number");
        } finally {
            System.out.println("I am going to print this value regardless of the outcome ;)");
        }



    }

    private static int calculateSum(int a, int b) {
        return a + b;
    }

    private static void runtimeExceptionExample() {
        int x = 0;
        int y = 10;
        int z = y / x;
    }
}
