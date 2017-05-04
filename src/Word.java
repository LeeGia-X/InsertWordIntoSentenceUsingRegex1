
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
