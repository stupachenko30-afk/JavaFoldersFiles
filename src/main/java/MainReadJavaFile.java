import java.io.File;

public class MainReadJavaFile {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");

        String filePath = home +  File.separator  + "MyFiles" + File.separator + "MyFile.txt";
        File fl = new File(filePath);
        if (fl.exists()== false){

        }
        System.out.println("The file is not exists");
        return;
    }
}
