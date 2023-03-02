/**
 * Created by: Alyson
 * Date: 3/2/23
 * Time: 2:24 AM
 * Project Name: GetWebInfo
 * Email: altrembl@amazon.com
 * Slack: altrembl
 **/


package GetWebInfo;

import java.net.*;
import java.io.*;

public class UrlConnectionReader {
    public String url = "https://en.wikipedia.org/wiki/Cyclone_Dumazile";
    public String output;

    public String getUrlContents(String theUrl) {
        StringBuilder content = new StringBuilder();

        try {
            URL url = new URL(theUrl);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream())
            );
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
            bufferedReader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public String getOutput() {
        output = getUrlContents(url);
        return output;
    }
}
