/**
 * Created by: Alyson
 * Date: 3/2/23
 * Time: 2:43 AM
 * Project Name: GetWebInfo
 * Email: altrembl@amazon.com
 * Slack: altrembl
 **/


package GetWebInfo;

import java.io.*;
import javax.swing.text.html.*;
import javax.swing.text.html.parser.*;

public class Html2Text extends HTMLEditorKit.ParserCallback {
    StringBuffer stringBuffer;
    public String output;

    public Html2Text() {
    }

    public void parse(Reader in) throws IOException {
        stringBuffer = new StringBuffer();
        ParserDelegator delegator = new ParserDelegator();
        // the third parameter is TRUE to ignore charset directive
        delegator.parse(in, this, Boolean.TRUE);
    }

    public void handleText(char[] text, int pos) {
        stringBuffer.append(text);
    }

    public String getText() {
        return stringBuffer.toString();
    }
}
