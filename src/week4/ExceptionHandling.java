package week4;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {

        int num = 6;




        try {
            int result = num / 0;
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("cannot divided by zero"); 

        }
    }
}