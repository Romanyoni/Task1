public class SubTask5
{
    public static void main(String[] args)
    {
        System.out.print("SubTask5. ");
      int yourNumber = Integer.parseInt(args[0]);
        boolean isPrime = true;
        for (int i = 2; i <= yourNumber; i++)
        {
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            isPrime = (isPrime) ? System.out.printf("%s ", i).checkError() : true;
        }
    }
}