public class SubTask4
{
    public static void main(String[] args)
    {
        System.out.print("SubTask4. ");
        int i = Integer.parseInt(args[0]);
        int sum = 0;
        for (int j = Integer.toString(i).length(); j > 0; j--)
        {
            sum += i / Math.pow(10, j - 1);
            if (j != 1)
            {
                System.out.printf("%.0f + ", i / Math.pow(10, j - 1));
            } else
            {
                System.out.printf("%.0f = ", i / Math.pow(10, 0));
            }
            i = i % (int) Math.pow(10, j - 1);
        }
        System.out.println(sum);
    }
}