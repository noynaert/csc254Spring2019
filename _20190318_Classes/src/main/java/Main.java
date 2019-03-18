public class Main {
    public static void main(String[] args){

        Pizza sam;
        sam = new Pizza();
        //sam.toppings = "sausage";
        //sam.price= 9.00;


        sam.setToppings("gReEN PePpers");
        sam.setPrice(9.37);

        System.out.printf("Sam's pizza has %s and costs $%s\n", sam.getToppings(), sam.getPrice());

        Pizza betty = new Pizza();

        betty.setToppings("Pepperoni");
        betty.setPrice(9.30);

        System.out.printf("Betty's pizza has %s and costs $%s\n", betty.getToppings(), betty.getPrice());



        System.out.println(sam);
        System.out.println(betty);

        Pizza jacob = new Pizza("pePPeronI", 5.00);
        System.out.println(jacob);

        System.out.println("Done");
    }
}
