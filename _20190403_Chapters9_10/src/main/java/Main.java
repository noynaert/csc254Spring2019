import java.math.BigInteger;

public class Main {
    public static void main(String[] args){

        Zombie a = new Zombie("Kenneth", 5);
        Zombie b = new Zombie( "Susan", 3);

        System.out.println(a);
        System.out.println(b);

        a.immobileLevel = 3;

        System.out.println(a);
        System.out.println(b);

        System.out.println(Zombie.immobileLevel);
        Zombie.doSomething();

        StringBuilder s = new StringBuilder("abcdefg");
        s.replace(3,5, "-");
        System.out.println(s);


        long kindaBig = 3000000000L;
        BigInteger reallyBig = new BigInteger("3000000000");
        BigInteger sum = reallyBig.add(new BigInteger("7"));
        System.out.println(sum);





        System.out.println("Done");
    }
}
