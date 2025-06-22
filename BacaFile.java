import java.io.FileReader;
import java.io.IOException;

public class BacaFile {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
            int karakter;
            System.out.print("Isi file: ");
            while ((karakter = reader.read()) != -1) {
                System.out.print((char) karakter);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
}
