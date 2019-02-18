import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int sum = 0;
        int shortestBookSoFar = Integer.MAX_VALUE;
        int n = 0;

        try {
            Scanner input = new Scanner(new File("input.txt"));
            while(input.hasNextLine()){

                String line = input.nextLine();
                String[] parts = line.split(":");
                if(parts.length == 2){
                    String title = parts[0];
                    int pages = Integer.parseInt(parts[1]);
                    //sum = sum + pages;
                    sum += pages;
                    n = n+1;
                    if(pages < shortestBookSoFar)
                        shortestBookSoFar = pages;
                    System.out.println(bookToString(title, pages));
                }

            }
            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("Could not open input file");
            System.exit(1);
        }
        System.out.println("The total number of pages is " + sum);
        System.out.println("The average number of pages is " + average(sum, n));
        System.out.println("The shortest book was " +shortestBookSoFar + " pages");

    }
    public static String bookToString(String title, int pages){
        String s = String.format("%30s %4d %4.1f hours",title, pages, timeToRead(pages, 1.0));
        return s;
    }
    public static double timeToRead(int pages, double readingRate){
        //Reading rate is page per minute.
        double hours = 0.0;
        hours = pages / (readingRate * 60);
        return hours;
    }
    public static int average(int sum, int n){
        double result = (1.0 * sum/n) + 0.5;

        return (int)result;
    }
}
/*
The Way of Kings              997 pages, Time to read: 8.3 hours

    x <- x+1

*/