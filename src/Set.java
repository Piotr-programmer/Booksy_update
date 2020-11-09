public class Set {

    private String name;
    private float price;
    public Components components;


    public Set(String a, float c){
        name = a;
        price = c;
    }

    public float getPrice(){
        return price;

    }
    public String getName(){
        return name;
    }
    public void setPrice(float new_price){
        price = new_price;
    }

}
