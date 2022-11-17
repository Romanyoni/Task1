public class SubTask6
{
    public static void main(String[] args)
    {
        System.out.println("\nSubTask6. " + columNumber("abc"));
        columnLetters(73178);
        rightColumNumber("abc");
    }

    public static int columNumber(String yourInput)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int columnNumber = 0;
        for (int i = 0; i < yourInput.length(); i++)
        {
            if (i > 0)
            {
                columnNumber = alphabet.length() * columnNumber;
            }
            columnNumber += alphabet.indexOf(yourInput.toUpperCase().charAt(i)) + 1;
        }
        return (columnNumber);
    }

    public static void columnLetters(int yourInput)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String columnLetters = "";
        for (double i = yourInput; i > 1; i = i / 26)
        {
            columnLetters += alphabet.charAt((int) (i % 26 - 1));
        }

        String columnLettersReverse = "";
        for (int i = 0; i < columnLetters.length(); i++)
        {
            columnLettersReverse += columnLetters.charAt(columnLetters.length() - 1 - i);
        }
        System.out.println("SubTask6. " + columnLettersReverse);
    }

    public static void rightColumNumber(String yourInput)
    {
        columnLetters(columNumber(yourInput) + 1);
    }
}