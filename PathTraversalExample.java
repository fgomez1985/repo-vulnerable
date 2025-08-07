import java.io.*;

// Ejemplo vulnerable: Path Traversal
public class PathTraversalExample {
    public static void main(String[] args) throws Exception {
        String filename = args.length > 0 ? args[0] : "../../etc/passwd";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            System.out.println(br.readLine());
        }
    }
}
