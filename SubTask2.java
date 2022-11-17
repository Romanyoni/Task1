public class SubTask2
{
    public static void main(String[] args)
    {
        String someText = "";

        String string1 = args[0];
        String string2 = args[1];

        someText = string1 + " " + string2;

//        Scanner scanner = new Scanner(System.in);
//        while (true)
//        {
//
//           String newText = scanner.nextLine();
//            if (!newText.isEmpty())
//            {
//                someText = someText + " " + newText;
//            } else
//            {
//                break;
//            }
//        }
        System.out.println("SubTask2. " + someText);
    }
}