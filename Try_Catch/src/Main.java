public class Main {
    public static  void main(String[] args) {


        int i = 0;
        int j = 0;
        String str = null;
        int nums[] = new int [5];



        try
        {
            j = 18 / i;

            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);


        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot dive by zero,,,");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in th elimit of the Array,,");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");

    }
}
