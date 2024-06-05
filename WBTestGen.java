import java.io.*;
public class WBTestGen 
{
    public static void main(String[] args)
    {
        SG();
        BBG();
        GX();
        MG();
        GZ();
        GA();
        UG();
    }

    public static void SG()
    {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.Generations("1925");
        assert "Silent Generation".equals(capOut.toString().trim()) : "Test if part.";

        System.setOut(originalOut);
    }

    public static void BBG()
    {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.Generations("1950");
        assert "Baby Boomers Generation".equals(capOut.toString().trim()) : "Test first else part.";

        System.setOut(originalOut);
    }

    public static void GX()
    {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.Generations("1977");
        assert "Generation X".equals(capOut.toString().trim()) : "Test second else part.";

        System.setOut(originalOut);
    }

    public static void MG()
    {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.Generations("1987");
        assert "Millennials Generation".equals(capOut.toString().trim()) : "Test third else part.";

        System.setOut(originalOut);
    }

    public static void GZ()
    {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.Generations("2004");
        assert "Generation Z".equals(capOut.toString().trim()) : "Test fourth else part.";

        System.setOut(originalOut);
    }

    public static void GA()
    {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.Generations("2014");
        assert "Generation Alpha".equals(capOut.toString().trim()) : "Test fifth else part.";

        System.setOut(originalOut);
    }

    public static void UG()
    {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.Generations("2025");
        assert "Unknown Generation".equals(capOut.toString().trim()) : "Test else part.";

        System.setOut(originalOut);
    }
}
