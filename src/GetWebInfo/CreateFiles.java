/**
 * Created by: Alyson
 * Date: 3/2/23
 * Time: 2:51 AM
 * Project Name: GetWebInfo
 * Email: altrembl@amazon.com
 * Slack: altrembl
 **/


package GetWebInfo;

import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;

public class CreateFiles {
    public String path;
    public void createTempFile(String path) {
        this.path = path;
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                System.out.println("File created.");
            }
        } catch (IOException e) {
            System.out.println("File not created.");
            exit(0);
        }
        file.deleteOnExit();
        System.out.println(path);
    }

    public void createFile(String path) {
        this.path = path;
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                System.out.println("File created.");
            }
        } catch (IOException e) {
            System.out.println("File not created.");
            exit(0);
        }
        System.out.println(path);
    }
}
