import java.io.File;
import java.io.IOException;

public class MembuatFile {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            if (file.createNewFile()) {
                System.out.println("File berhasil dibuat: " + file.getName());
            } else {
                System.out.println("File sudah ada.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan.");
            e.printStackTrace();
        }
    }
}
