import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String firstName = "Max";
        String lastName = "Griffon";

        //System.out.println(lastName + ", " + firstName);
        //printName(firstName, lastName);
        //printName("Fred", "Flintstone");

        try {
            Scanner input = new Scanner(new File("people.txt"));
            while (input.hasNextLine()) {
                String line;
                line = input.nextLine();
                //System.out.println("The line is: " + line);
                String[] parts = line.split("\\|");
                int n = parts.length;
                //System.out.printf("There are %d items in parts\n", n);
                if(n == 3) {
                    System.out.println("parts[0] is " + parts[0]);
                    printName(parts[2], parts[0]);
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println("Could not open the file");
            System.exit(1);
        }


        System.out.println("\nDone!");
    }

    public static void printName(String first, String last){
        //System.out.println(last + ", " + first);
        System.out.printf("%s, %s\n", last, first);
    }
}
