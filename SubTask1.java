public class SubTask1
{
    public static void main(String[] args)
    {
        double firstNumber = Integer.parseInt(args[0]);
        double secondNumber = Integer.parseInt(args[1]);

        double res = firstNumber + secondNumber;
        System.out.printf("SubTask1. Sum of this two numbers is %.1f. \n", res);
    }
}
