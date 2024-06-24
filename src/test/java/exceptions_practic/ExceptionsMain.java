package exceptions_practic;

public class ExceptionsMain {
    public static void main(String[] args) {
        Man man = new Man(0);
        try {
            man.setAge(-2);
        } catch (AgeException e) {
            throw new RuntimeException(e);
        }
    }
}
