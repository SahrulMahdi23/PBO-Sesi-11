import java.io.File;

public class InfoFile {
    public static void main(String[] args) {
        File file = new File("data.txt");

        if (file.exists()) {
            System.out.println("Nama File: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Bisa dibaca: " + file.canRead());
            System.out.println("Bisa ditulis: " + file.canWrite());
            System.out.println("Ukuran file (bytes): " + file.length());
        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}
