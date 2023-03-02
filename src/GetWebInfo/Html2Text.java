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
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.*;
import javax.swing.text.html.parser.*;

public class Html2Text extends HTMLEditorKit.ParserCallback {
    StringBuffer stringBuffer;
    private boolean inP = false;

    public Html2Text() {
    }

    public void parse(Reader in) throws IOException {
        stringBuffer = new StringBuffer();
        ParserDelegator delegator = new ParserDelegator();
        delegator.parse(in, this, Boolean.TRUE);
    }

    public void handleText(char[] text, int pos) {
        if (inP) {
            stringBuffer.append(text);
        }
    }

    public void handleStartTag(HTML.Tag t, MutableAttributeSet attribute, int pos) {
        super.handleStartTag(t, attribute, pos);
        if (t == HTML.Tag.P) {
            inP = true;
        }
    }

    public void handleEndTag(HTML.Tag t, int pos) {
        super.handleEndTag(t, pos);
        if (t == HTML.Tag.P) {
            inP = false;
        }
    }

    public String getText() {
        return stringBuffer.toString();
    }
}
