import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try {
            Scanner input = new Scanner(new File("cats.txt"));

            while(input.hasNextLine()){
                String line = input.nextLine();
               // System.out.println(line);

                String[] parts = line.split("\\s+");
                if(parts.length == 2){
                    String name = parts[0];
                    double weight = Double.parseDouble(parts[1]);
                    //printCat(name, weight);
                    System.out.println(catToString(name, weight));
                }


               // System.out.printf("There are %d parts\n", parts.length);
               // for(int i=0;i<parts.length;i++){
               //     System.out.printf("\t%d is %s\n", i, parts[i]);
               // }
            }

            input.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println("Could not open cats.txt");
            System.exit(1);
        }

    }
    public static double lbToKg(double pounds){
        double kg;
        kg = pounds * 0.453592;
        return kg;
    }
    public static String catToString(String name, double weight){
        double kg = lbToKg(weight);
        String result = "";
        result = String.format("%s %3.1f pounds, or %1.1f kg", name, weight, kg);
        return result;
    }
}
