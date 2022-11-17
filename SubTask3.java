public class SubTask3
{
    public static void main(String[] args)
    {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int answer;
        while (true)
        {
            if (firstNumber == 0)
            {
                answer = secondNumber;
                break;
            } else if (secondNumber == 0)
            {
                answer = firstNumber;
                break;
            }
            if (firstNumber >= secondNumber)
            {
                firstNumber = firstNumber - secondNumber;
            } else
            {
                secondNumber = secondNumber - firstNumber;
            }
        }
        System.out.println("SubTask3. The largest number by which both these numbers can be divided is " + answer);
    }
}