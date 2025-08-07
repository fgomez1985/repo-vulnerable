// Ejemplo vulnerable: Command Injection
public class CommandInjectionExample {
    public static void main(String[] args) throws Exception {
        String userInput = args.length > 0 ? args[0] : "ls";
        Runtime.getRuntime().exec(userInput);
    }
}
