import java.security.MessageDigest;

// Ejemplo vulnerable: Hash criptográfico débil
public class WeakHashExample {
    public static void main(String[] args) throws Exception {
        String password = args.length > 0 ? args[0] : "password";
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        System.out.println("MD5: " + sb.toString());
    }
}
