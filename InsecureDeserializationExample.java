import java.io.*;

// Ejemplo vulnerable: Deserialización insegura
public class InsecureDeserializationExample {
    public static void main(String[] args) throws Exception {
        byte[] data = args.length > 0 ? args[0].getBytes() : new byte[0];
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
        Object obj = ois.readObject();
        System.out.println(obj.toString());
    }
}
