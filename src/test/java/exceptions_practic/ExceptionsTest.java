package exceptions_practic;

public class ExceptionsTest {
    public static void main(String[] args) {
        try {
            System.out.println(4123 / 1);
        }catch (Exception e){
            System.err.println("division by zero");
        }finally {
            System.out.println("fweew");
        }
    }
}

