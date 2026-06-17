import java.io.*;

public class MainReadJavaFile {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");

        String filePath = home +  File.separator  + "MyFiles" + File.separator + "MyFile.txt";
        File fl = new File(filePath);
        if (fl.exists() == false){


        System.out.println("The file is not exists");
        return;
    }
        try {
            FileReader fr = new FileReader(fl);
            BufferedReader br =new BufferedReader(fr);

            String line = br.readLine();
            System.out.println(line);

            br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The end");
}
}