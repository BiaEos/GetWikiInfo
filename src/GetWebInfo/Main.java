package GetWebInfo;

import java.io.FileReader;

import static GetWebInfo.GetUserWebPage.topic;
import static GetWebInfo.GetUserWebPage.wikiPage;

public class Main {

    public static void main(String[] args) {
        GetUserWebPage userTopic = new GetUserWebPage();
        userTopic.askUserTopic();
        topic = userTopic.getTopic();
        wikiPage = userTopic.getWikiPage();

        CreateFiles newFile = new CreateFiles();
        String path = "/Users/main/Projects/GetWebInfo/WikiPages/" + topic + "HTML.txt";
        String pathOut = "/Users/main/Projects/GetWebInfo/WikiPages/" + topic + ".txt";
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
