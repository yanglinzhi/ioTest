import java.io.*;

/**
 * @author 20258
 */
public class Copy {
    public static void main(String[] args) throws IOException {
        String fileName = "new.jpg";
        String newFileName = "copy.jpg";
        File file = new File(fileName);
        File newFile = new File(newFileName);
        byte[] bytes = new byte[1024];
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }
        try {
            fis =  new FileInputStream(file);
            fos = new FileOutputStream(newFile);
            int readLen;
            while ((readLen = fis.read(bytes))> 0) {
                fos.write(bytes, 0, readLen);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            fis.close();
            fos.close();
        }

    }
}
