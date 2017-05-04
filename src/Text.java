import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 03.05.2017.
 */
public abstract class Text {
    String text = "";

    String inputText(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    abstract void setText();

    public String getText() {
        return this.text;
    }

    boolean checkText() {
        if (this.getText().isEmpty()){
            return true;
        } else  {return false;}
    }
}
