import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        Ninja one = new Ninja("Bruce", 9);
        Ninja two = new Ninja("Jackie", 8);
        Ninja three=new Ninja("Bob", 5);
        Ninja me = new Ninja("Evan", 0);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        ArrayList<Ninja> trouble = new ArrayList<>();
        trouble.add(one);
        trouble.add(two);
        trouble.add(me);
        trouble.add(three);
        trouble.add(new Ninja("Mary", 9));


        print(trouble);

        Collections.sort(trouble);
        print(trouble);

        ///Some other types of arraylists
        ArrayList<String> words = new ArrayList<>();
        words.add("dog");
        words.add("cat");
        words.add("rabbit");
        words.add("ardvark");

        //Integer and Double are wrapper classes
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(3));
        numbers.add(9);   //uses boxing
        numbers.add(-3);
        numbers.add(44);
        numbers.add(8);
        Collections.sort(numbers);
        print(numbers);

     //   System.out.println(Integer.MAX_VALUE);

        System.out.println("Done");
    }

    public static<E> void print(ArrayList<E> list){
        System.out.printf("-------------- %d objects ---------------\n",list.size());
        for(E danger: list){
            System.out.println(">>> " + danger);
        }
    }
}
