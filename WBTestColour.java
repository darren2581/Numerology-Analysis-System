import java.io.*;

public class WBTestColour {
    public static void main(String[] args) {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));
        
        case1();
        case2();
        case3();
        case4();
        case5();
        case6();
        case7();
        case8();
        case9();
        case11();
        case22();
        case33();
        caseDef();
    }
     public static void case1()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(1);
        assert "Red".equals(capOut.toString().trim()) : "Enter case 1 part.";

        System.setOut(originalOut);
     }

     public static void case2()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(2);
        assert "Orange".equals(capOut.toString().trim()) : "Enter case 2 part.";

        System.setOut(originalOut);
        System.out.println("All tests pass!");
     }

     public static void case3()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(3);
        assert "Yellow".equals(capOut.toString().trim()) : "Enter case 3 part.";

        System.setOut(originalOut);
     }

     public static void case4()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(4);
        assert "Green".equals(capOut.toString().trim()) : "Enter case 4 part.";

        System.setOut(originalOut);
     }
     public static void case5()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(5);
        assert "Sky Blue".equals(capOut.toString().trim()) : "Enter case 5 part.";

        System.setOut(originalOut);
     }
     public static void case6()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(6);
        assert "Indigo".equals(capOut.toString().trim()) : "Enter case 6 part.";

        System.setOut(originalOut);
     }
     public static void case7()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(7);
        assert "Violet".equals(capOut.toString().trim()) : "Enter case 7 part.";

        System.setOut(originalOut);
     }
     public static void case8()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(8);
        assert "Magenta".equals(capOut.toString().trim()) : "Enter case 8 part.";

        System.setOut(originalOut);
        System.out.println("All tests pass!");
     }
     public static void case9()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(9);
        assert "Gold".equals(capOut.toString().trim()) : "Enter case 9 part.";

        System.setOut(originalOut);
        System.out.println("All tests pass!");
     }
     public static void case11()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(11);
        assert "Silver".equals(capOut.toString().trim()) : "Enter case 11 part.";

        System.setOut(originalOut);
        System.out.println("All tests pass!");
     }
     public static void case22()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(22);
        assert "White".equals(capOut.toString().trim()) : "Enter case 22 part.";

        System.setOut(originalOut);
        System.out.println("All tests pass!");
     }
     public static void case33()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(33);
        assert "Crimson".equals(capOut.toString().trim()) : "Enter case 33 part.";

        System.setOut(originalOut);
        System.out.println("All tests pass!");
     }
     public static void caseDef()
     {
        ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capOut));

        Code.determineColor(35);
        assert "Invalid".equals(capOut.toString().trim()) : "Enter case default part.";

        System.setOut(originalOut);
        System.out.println("All tests pass!");
     }
}