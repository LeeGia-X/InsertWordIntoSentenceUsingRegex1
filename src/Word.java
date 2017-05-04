import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 03.05.2017.
 */
public class Word extends Text {
    String wordRegex = "^\\w*";

    public Word(){
        do {
            this.setText();
            if (this.checkText()){
                System.out.print("Only word characters are allowed. Try one more time. -> ");
            }
        } while(this.checkText());
    }

    void setText(){
        String str = inputText();
        if (str.matches(wordRegex)) {
            this.text = str;
        }
    }

    public String getText() {
        return this.text;
    }

}
