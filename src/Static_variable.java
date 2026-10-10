class Mob{
    String brand;
    int price;
    String network;
    static String name;
    public void show(){
        System.out.println(brand + ", " + price + ", " + name);
    }
}
public class Static_variable {
    public static void main(String[] args) {
        Mob obj = new Mob();
        Mob obj1 = new Mob();

        obj.brand = "Apple";
        obj.price = 2000;
        Mob.name = "SmartPhone";

        obj1.brand = "Samsung";
        obj1.price = 2500;
        Mob.name = "SmartPhones";

        obj.name = "Phone";
        obj.show();
        obj1.show();
    }
}