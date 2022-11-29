public class SubTask6
{
    public static void main(String[] args)
    {
        columnLetters(338);
        columnLetters(703);
        System.out.println(columNumber("ABC"));
        System.out.println(columNumber("abc"));
        System.out.println(columNumber("aaa"));

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
            if (i % 26 == 0)
            {
                columnLetters += "Z";
                i += -0.1;
            }
            else
            {
                columnLetters += alphabet.charAt((int) (i % 26 - 1));
            }
        }

        String columnLettersReverse = "";
        for (int i = 0; i < columnLetters.length(); i++)
        {
            columnLettersReverse += columnLetters.charAt(columnLetters.length() - 1 - i);
        }
        System.out.println("SubTask6. " + columnLettersReverse);
    }
}