package GetWebInfo;

import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GetUserWebPage userTopic = new GetUserWebPage();
        userTopic.getUserTopic();
        String topic = userTopic.getTopic();

        CreateFiles newFile = new CreateFiles();
        String path = "/Users/main/Projects/GetWebInfo/" + topic + "HTML.txt";
        String pathOut = "/Users/main/Projects/GetWebInfo/" + topic + ".txt";
        newFile.createTempFile(path);
        newFile.createFile(pathOut);

        WriteToFile writeFile = new WriteToFile();
        writeFile.writeHTMLToFile(path);

        try {
            FileReader in = new FileReader(path);
            Html2Text parser = new Html2Text();
            parser.parse(in);
            in.close();
            String output = parser.getText();
            writeFile.writeTextToFile(pathOut, output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
