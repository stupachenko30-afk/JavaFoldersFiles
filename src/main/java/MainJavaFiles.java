import java.io.*;

public class MainJavaFiles {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        String folderPath = home + File.separator + "MyFiles";
        File fld = new File(folderPath);
        fld.mkdirs();
        String filePath = folderPath + File.separator + "MyFile.txt";
        File fl = new File(filePath);
        try {
            if (fl.exists()== false)
            fl.createNewFile();
            FileWriter fw = new FileWriter(fl);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello file!");
            bw.newLine();
            bw.write("Kristina hi!");
            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());;

        }
    }
}
