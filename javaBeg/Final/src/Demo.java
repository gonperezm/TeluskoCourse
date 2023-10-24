
class Laptop
{
   String model;
   int price;


   public String toString()
   {
       return model + " : " + price;
   }
}








public class Demo {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo yoga";
        obj.price = 1000;




        System.out.println(obj.toString());
    }
}
