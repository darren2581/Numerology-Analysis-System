import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Code {
    public static void main(String[] args) 
    {
        char choice;
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to our Numerology Analysis Program!");
        System.out.println("This program will help you find out the following details:");
        System.out.println("a. Life Path Number details");
        System.out.println("b. Generation details");
        System.out.print("Please pick your choice (a) or (b): ");
        choice = input.nextLine().charAt(0);
        while (choice != 'a' && choice != 'A' && choice != 'b' && choice != 'B') 
        {
            System.out.println("Invalid choice. Please enter 'a' or 'b' only.");
            System.out.print("Please pick your choice (a) or (b): ");
            choice = input.nextLine().charAt(0);
        }

        System.out.print("\nWould you like to fill in details for '1' or '2' people? (1/2): ");
        int people = Integer.parseInt(input.nextLine());
        while (people != 1 && people != 2) {
            System.out.print("Invalid number of people. Please enter '1' or '2' people only.");
            people = Integer.parseInt(input.nextLine());
        }
        System.out.println("To get started with the program, please fill in the form below.");

        SetGet[] setGet = new SetGet[people];

        for (int i = 0; i < people; i++) 
        {
            setGet[i] = new SetGet();
            int sum, pathNumber;
            String colour, generation, day, month, year;
            System.out.print("\nName: ");
            String name = input.nextLine();
            while(name.isEmpty())
            {
                System.out.println("Name cannot be empty. Please enter a valid name.");
                System.out.print("Name: ");
                name = input.nextLine();
            }
            while (true) {
                System.out.print("Day of birth (DD): ");
                day = input.nextLine();
                if (isNumeric(day) && Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= 31) {
                    break;
                } 
                else 
                {
                    System.out.println("Invalid input. Please enter a valid day between 1 and 31.");
                }
            }
            
            while (true) {
                System.out.print("Month of birth (MM): ");
                month = input.nextLine();
                if (isNumeric(month) && Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12) {
                    break;
                } 
                else 
                {
                    System.out.println("Invalid input. Please enter a valid month between 1 and 12.");
                }
            }
            
            while (true) {
                System.out.print("Year of birth (YYYY): ");
                year = input.nextLine();
                if (isNumeric(year) && Integer.parseInt(year) >= 1901 && Integer.parseInt(year) <= 2024) {
                    break;
                } 
                else 
                {
                    System.out.println("Invalid input. Please enter a valid year between 1901 and 2024.");
                }
            }

            writeToFile(name, day, month, year);

            setGet[i].setName(name);
            setGet[i].setDay(day);
            setGet[i].setMonth(month);
            setGet[i].setYear(year);

            if (choice == 'a' || choice == 'A') 
            {
                sum = calculateLifePathNumber(day, month, year);
                pathNumber = reduceLifePathNumber(sum);
                System.out.println("Your Life Path Number: " + pathNumber);
                setGet[i].setPathNumber(pathNumber);
                System.out.print("Your Lucky Colour: ");
                colour = determineColor(pathNumber);
                setGet[i].setColour(colour);
            } 
            else if (choice == 'b' || choice == 'B') 
            {
                System.out.print("Your generation: ");
                generation = Generations(year);
                setGet[i].setGenerations(generation);
            } 
            else 
            {
                System.out.println("Invalid choice. Please enter 'a' or 'b' only.");
                return;
            }
        }
        if (choice == 'a' || choice == 'A') 
        {
            System.out.println("\n\nLife Path Number details:");
            for (int i = 0; i < people; i++) 
            {
                System.out.println("\nWelcome to our program " + setGet[i].getName() + "!");
                System.out.println("we are given that your Date of birth is: " + setGet[i].getDay() + "/" + setGet[i].getMonth() + "/" + setGet[i].getYear());
                System.out.println("Your Life Path Number is: " + setGet[i].getPathNumber());
                System.out.println("Your Lucky Colour is: " + setGet[i].getColour());
            }
            System.out.println("\nThanks for using our program! Have a great day ahead! :)");
        }
        if (choice == 'b' || choice == 'B') 
        {
            System.out.println("\n\nGeneration details:");
            for (int i = 0; i < people; i++) 
            {
                System.out.println("\nWelcome to our program " + setGet[i].getName() + "!");
                System.out.println("we are given that your Date of birth is: " + setGet[i].getDay() + "/" + setGet[i].getMonth() + "/" + setGet[i].getYear());
                System.out.println("Your generation will be: " + setGet[i].getGenerations());
            }
            System.out.println("\nThanks for using our program! Have a great day ahead! :)");
        }
    }

    public static int calculateLifePathNumber(String days, String months, String years) 
    {
        int sum = 0;
        int masterDay = 0;
        int masterMonth = 0;
        try 
        {
            int day = Integer.parseInt(days);
            int month = Integer.parseInt(months);
            int year = Integer.parseInt(years);
            if (invalidDOB(day, month, year)) 
            {
                return -1;
            }
            int[] dob = new int[8];
            dob[0] = day / 10; // First digit of day
            dob[1] = day % 10; // Second digit of day
            dob[2] = month / 10; // First digit of month
            dob[3] = month % 10; // Second digit of month
            dob[4] = year / 1000; // First digit of year
            dob[5] = (year % 1000) / 100; // Second digit of year
            dob[6] = (year % 100) / 10; // Third digit of year
            dob[7] = year % 10; // Fourth digit of year
            if ((dob[0] == dob[1]) || (dob[2] == dob[3])) 
            {
                if (dob[0] == 1 && dob[1] == 1) 
                {
                    masterDay = 11;
                } 
                else if (dob[0] == 2 && dob[1] == 2) 
                {
                    masterDay = 22;
                } 
                else 
                {
                    masterDay = dob[0] + dob[1];
                }

                if (dob[2] == dob[3]) 
                {
                    masterMonth = 11;
                } 
                else 
                {
                    masterMonth = dob[2] + dob[3];
                }

                for (int i = 4; i < dob.length; i++) 
                {
                    sum = masterDay + masterMonth + dob[i];
                }
            }
            else 
            {
                masterDay = dob[0] + dob[1];
                masterMonth = dob[2] + dob[3];
                for (int i = 4; i < dob.length; i++) 
                {
                    sum = sum + dob[i]; 
                }
                sum = masterDay + masterMonth + sum;
            }
            return sum;
        }
        catch (NumberFormatException e) 
        {
            sum = -1;
            return sum;
        }
    }

    public static int reduceLifePathNumber(int sum)
    {
        if (sum < 1) 
        {
            return -1;
        }
        int lifePathNumber = 0;
        if (sum == 11 || sum == 22 || sum == 33) 
        {
            lifePathNumber = sum;
        } 
        else 
        {
            lifePathNumber = (sum / 10) + (sum % 10);
        }
        return lifePathNumber;
    }

    public static String Generations(String years) 
    {
        String generation;
        int year = Integer.parseInt(years);
        if (year >= 1901 && year <= 1945) 
        {
            generation = "Silent Generation";
        } 
        else if (year >= 1946 && year <= 1964) 
        {
            generation = "Baby Boomers Generation";
        } 
        else if (year >= 1965 && year <= 1979) 
        {
            generation = "Generation X";
        } 
        else if (year >= 1980 && year <= 1994) 
        {
            generation = "Millennials Generation";
        } 
        else if (year >= 1995 && year <= 2009) 
        {
            generation = "Generation Z";
        } 
        else if (year >= 2010 && year <= 2024) 
        {
            generation = "Generation Alpha";
        } 
        else 
        {
            generation = "Unknown Generation";
        }
        System.out.println(generation);
        return generation;
    }
    
    public static String determineColor(int pathNumber)
    {
        String color;
        switch (pathNumber) 
        {
            case 1:
                color = ("Red");
                break;
            case 2:
                color = ("Orange");
                break;
            case 3:
                color = ("Yellow");
                break;
            case 4:
                color = ("Green");
                break;
            case 5:
                color = ("Sky Blue");
                break;
            case 6:
                color = ("Indigo");
                break;
            case 7:
                color = ("Violet");
                break;
            case 8:
                color = ("Magenta");
                break;
            case 9:
                color = ("Gold");
                break;
            case 11:
                color = ("Silver");
                break;
            case 22:
                color = ("White");
                break;
            case 33:
                color = ("Crimson");
                break;
            default:
                color = ("Invalid");
                break;
        }
        System.out.println(color);
        return color;
    }

    public static void writeToFile(String name, String day, String month, String year) 
    {
        String filename = "PersonDetails.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) 
        {
            writer.write(name + ", " + day + "/" + month + "/" + year + "\n");
        } 
        catch (IOException e) 
        {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static boolean invalidDOB(int day, int month, int year) 
    {
        if (year < 1901 || year > 2024) {
            return true;
        }
        if (month < 1 || month > 12) {
            return true;
        }
        if (day < 1 || day > 31) {
            return true;
        }
        return false;
    }

    public static boolean isNumeric(String dob) {
        try {
            Integer.parseInt(dob);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }
}