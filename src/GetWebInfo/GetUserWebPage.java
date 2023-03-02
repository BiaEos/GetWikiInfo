/**
 * Created by: Alyson
 * Date: 3/2/23
 * Time: 6:52 AM
 * Project Name: GetWebInfo
 * Email: altrembl@amazon.com
 * Slack: altrembl
 **/


package GetWebInfo;

import java.util.Scanner;

public class GetUserWebPage {
    public static String topic;
    public static String wikiPage;
    Scanner scanner = new Scanner(System.in);

    public void askUserTopic() {
        System.out.println("What topic would you like to search?");
        topic = scanner.nextLine();
    }

    public String getTopic() {
        return topic;
    }

    public String getWikiPage() {
        wikiPage = "https://en.wikipedia.org/wiki/" + topic;
        return wikiPage;
    }
}
