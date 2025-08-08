import java.util.ArrayList;

// Ejemplo vulnerable: Denegación de servicio por consumo de memoria
public class DenialOfServiceExample {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        while (true) {
            list.add(new int[1024]);
        }
    }
}
