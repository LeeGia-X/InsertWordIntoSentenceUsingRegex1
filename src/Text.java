import java.util.Scanner;

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

    boolean emptyTextCheck() {
        if (this.getText().isEmpty()){
            return true;
        } else  {return false;}
    }
}
