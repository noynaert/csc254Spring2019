public class Pizza {
    private String toppings;
    private double price;

     //Constructor
    public Pizza(String toppings, double price){
        setToppings(toppings);
        setPrice(price);
    }

    public Pizza(){
       this("Cheese", 0.00);
    }


    //Setters
    public void setToppings(String toppings){
        String top = toppings.toLowerCase();
        top = top.substring(0,1).toUpperCase() + top.substring(1);

        this.toppings = top;
    }
    public void setPrice(double price){
        this.price = price;
    }
    //Getters
    public String getToppings(){
        return toppings;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        String result = String.format("Toppings: %s Price: %1.2f", toppings, price);

        return result;
    }

}
