import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "new.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);

        while (true) {
            char c = (char)( new Random().nextInt(32)+50);
            fos.write(c);
            if (file.length() == 10240) {
                break;
            }
        }
        fos.close();
    }
}