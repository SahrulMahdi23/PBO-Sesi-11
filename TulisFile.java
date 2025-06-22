import java.io.FileWriter;
import java.io.IOException;

public class TulisFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write("nama saya raja aditia.");
            writer.close();
            System.out.println("Berhasil menulis ke file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }
    }
}
