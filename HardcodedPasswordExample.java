// Ejemplo vulnerable: Contraseña hardcodeada
public class HardcodedPasswordExample {
    private static final String PASSWORD = "secret123";
    public static void main(String[] args) {
        if (args.length > 0 && PASSWORD.equals(args[0])) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
