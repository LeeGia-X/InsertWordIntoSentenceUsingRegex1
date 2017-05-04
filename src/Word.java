
public class Word extends Text {
    String wordRegex = "^[а-яА-ЯёЁa-zA-Z0-9]+$";

    public Word(){
        do {
            this.setText();
            if (this.emptyTextCheck()){
                System.out.print("Only word characters are allowed. Try one more time. -> ");
            }
        } while(this.emptyTextCheck());
    }

    //set text into text field
    void setText(){
        String str = inputText();
        if (str.matches(wordRegex)) { //checking for compliance with a given template
            this.text = str;
        }
    }

    //get text from text field
    public String getText() {
        return this.text;
    }

}
