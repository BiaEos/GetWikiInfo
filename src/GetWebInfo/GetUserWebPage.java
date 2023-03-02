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
    public String topic;
    public String wikiPage;
    Scanner scanner = new Scanner(System.in);

    public void getUserTopic() {
        System.out.println("What topic would you like to search?");
        topic = scanner.nextLine();
    }
    public void getUserWebPage() {
        System.out.println("Please type the WikiPage you'd like to read:");
        wikiPage = scanner.nextLine();
    }

    public String getTopic() {
        return topic;
    }

    public String getWikiPage() {
        return wikiPage;
    }
}
