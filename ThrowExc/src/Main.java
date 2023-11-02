public class Main {
    public static  void main(String[] args) {


        int i = 20;
        int j = 0;

        try
        {
            j = 18 / i;
            if(j==0)
                throw new ArithmeticException(" I dont want to print ZERO");


        }
        catch(ArithmeticException e) {
            j=18/1;
            System.out.println("that the default output" +e);
        }

        catch(Exception e) {
            System.out.println("something went wrong");
        }



        System.out.println("j is = " + j);

        System.out.println("Bye");

    }
}
