package GetWebInfo;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        CreateFiles newFile = new CreateFiles();
        String path = "/Users/main/Projects/GetWebInfo/WebsiteHTML.txt";
        String pathOut = "/Users/main/Projects/GetWebInfo/WebsiteText.txt";
        newFile.createTempFile(path);
        newFile.createFile(pathOut);

        WriteToFile writeFile = new WriteToFile();
        writeFile.writeHTMLToFile(path);

        try {
            // the HTML to convert
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
