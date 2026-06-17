import java.io.*;

public class MainJavaFoldersFiles {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        //C:\Users\asus
        System.out.println(home);
        System.out.println(File.separator);
        String folderPath = home + File.separator + "MyFolder";
        File fld = new File(folderPath);
        fld.mkdirs();

        folderPath =home + File.separator + "1" + File.separator + "2";
        fld = new File(folderPath);
        fld.mkdirs();
        //fld.delete();

        File test = new File(home);
        File[] files = test.listFiles();
        for (File f: files){
            System.out.println(f);
        }



        System.out.println("end");


    }
}
