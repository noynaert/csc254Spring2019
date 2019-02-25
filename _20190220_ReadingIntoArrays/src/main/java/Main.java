import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.printf("There are %d arguments on the simulated command line\n", args.length );
        for(int i = 0; i< args.length; i++){
            System.out.printf("args[%d] is %s\n", i, args[i]);
        }
        String fileName = "input.txt";
        int maximumSize = 100;

        if(args.length > 0){
            fileName = args[0];
        }
        if(args.length > 1){
            maximumSize = Integer.parseInt(args[1]);
        }
        //The command line should contain a file name, and the maximum number of items in an array.

        System.out.println("The file name is " + fileName);
        System.out.println("The maximum number of items in the array is " + maximumSize);

        //Set up array
        String[] words = new String[maximumSize];   //physical size is maximumSize
        int n = 0;                                  //logical size is n

        //open Scanner
        try {
            Scanner input = new Scanner(new File(fileName));
            while(input.hasNextLine()  && n < maximumSize) {
                String line = input.nextLine();
                    String[] parts = line.split("[\\s\\.\\!\\,]+");
                    int i = 0;
                    while (i < parts.length && n < maximumSize){
                       String word = parts[i].toLowerCase();
                        if(word.length() > 0){
                            if(!needleIsInHaystack(words,word,n)) {
                                words[n] = word;
                                n++;
                            }
                        }
                        i++;
                    }
            }
            System.out.printf("I read %d lines\n", n);
            print(words,n);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nDone");
    }

    public static boolean needleIsInHaystack(String[] haystack, String needle, int n){
        boolean found = false;

        int i = 0;
        while(!found && i < n){
            found = needle.equals(haystack[i]);
            i++;
        }

        return found;
    }

    public static void print(String[] list, int n){
        System.out.printf("\n--------- %d items on the list ----------\n", n);
        for(int i=0;i<n;i++){
            System.out.printf("list[%d] is %s\n", i, list[i]);
        }
    }
}
