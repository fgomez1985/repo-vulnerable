import java.util.Random;

// Ejemplo vulnerable: Random predecible
public class InsecureRandomExample {
    public static void main(String[] args) {
        Random r = new Random(12345); // semilla fija
        String token = Integer.toHexString(r.nextInt());
        System.out.println("Token: " + token);
    }
}
