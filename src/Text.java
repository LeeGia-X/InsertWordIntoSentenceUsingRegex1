import java.util.Scanner;

public abstract class Text {
    String text = "";

    //test reading
    String inputText(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    abstract void setText();

    //set text into text field
    public String getText() {
        return this.text;
    }

    //check if text is set
    boolean emptyTextCheck() {
        if (this.getText().isEmpty()){
            return true;
        } else  {return false;}
    }
}
