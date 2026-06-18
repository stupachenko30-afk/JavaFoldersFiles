import java.io.*;
import java.util.ArrayList;

public class MainInputOutputFiles {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        //readNamesFromFile(list);
        fillList(list);
        System.out.println(list);
        writeListToFile(list);

    }

    private static void writeListToFile(ArrayList<String> list) {
        String home = System.getProperty("user.home");
        String folderPath = home + File.separator + "names";
        File fld = new File(folderPath);
        if (fld.exists() == false)
            fld.mkdirs();
        String filePath = folderPath + File.separator + "name.txt";
        File fl = new File(filePath);
        if (fl.exists() == false) {
            try {
                fl.createNewFile();
                FileWriter fw = new FileWriter(fl);
                BufferedWriter bw = new BufferedWriter(fw);
                for (String name : list){
                    bw.write(name);
                    bw.newLine();
                }
                bw.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void fillList(ArrayList<String> list) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true){
            try {
                System.out.print("enter any name >>>>");
                String  answer = br.readLine();
                list.add(answer);
                System.out.print("Do you want to continue? yes or no");
                answer = br.readLine();
                if (answer.equalsIgnoreCase("no"))
                {
                    br.close();
                    break;
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


        }}}


/*

    Homework
#1
1.create folder -> "fruits" in user.home
2.in folder "fruits" create file "myFavoriteFruits.txt"
3.Ask user to enter any fruits and  add them to TreeSet<String>
4.Write all fruits from TreeSet to File

#2
Advanced
write methods public void readNamesFromFile(list);
 */