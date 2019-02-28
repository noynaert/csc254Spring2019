public class Main {
    public static void main(String[] args){   //args is a parameter
        double[] numbers = {3.2, 5.7, 8.6, 3.2, 9.1};
        String[] words = {"Happy", "Cheerful", "Good vibes", "Upbeat"};
        String[] foods = new String[10];
        foods[0] = "banana";
        foods[1] = "Pizza";
        foods[2] = "Coconut";
        foods[6] = "Ice Cream";

        print(numbers, numbers.length);  //numbers and numbers.length are the arguments
        print(words,words.length);
        print(foods, 10);
        printRecursive(numbers, 0);

        System.out.println("Done");
    }

    public static void print(double[] list, int n){    //list and n are the parameters
        System.out.printf("----------- %d items ------------\n", n);

        for(int i=0;i<n;i++){
            System.out.printf("[%d] %s\n", i, list[i]);
        }
       // System.out.println(list[n]);
    }
    public static int print(String[] list, int n){
        int count = 0;
        for(String item: list){
            if (item != null){
                count++;
            }
        }
        System.out.printf("----------- %d items ------------\n",count);
        for(String word : list) {
            if(word != null)
                System.out.println(word);
        }

        return count;
    }
    public static void printRecursive(double[] list, int i){
        if(i != list.length ){
            System.out.printf("[%d] %s\n", i, list[i]);
            printRecursive(list, i+1);
        }
    }

}
