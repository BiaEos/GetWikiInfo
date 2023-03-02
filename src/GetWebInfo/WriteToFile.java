/**
 * Created by: Alyson
 * Date: 3/2/23
 * Time: 2:56 AM
 * Project Name: GetWebInfo
 * Email: altrembl@amazon.com
 * Slack: altrembl
 **/


package GetWebInfo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public void writeHTMLToFile(String path) {
        UrlConnectionReader connectionReader = new UrlConnectionReader();
        String output = connectionReader.getOutput();
        try {
            FileWriter myWriter = new FileWriter(path);
            myWriter.write(output);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeTextToFile(String path, String output) {
        try {
            FileWriter myWriter = new FileWriter(path);
            myWriter.write(output);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
