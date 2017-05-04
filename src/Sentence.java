import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Sentence extends Text{
    private String sentenceRegex = "^[а-яА-ЯёЁa-zA-Z0-9,.!? ]+$";
    private StringBuffer rs = new StringBuffer();
    private String regex1 = "[\\w*]";
    private String regex2 = "\\b";
    private Pattern pattern;
    private Matcher matcher;

    public Sentence(){
        do {
            this.setText();
            if (this.emptyTextCheck()){
                System.out.print("Only word characters and punctuation marks are allowed. Try one more time. -> ");
            }
        } while(this.emptyTextCheck());
    }

    public void setText(){
        String str = inputText();
        if (str.matches(sentenceRegex)) {
            this.text = str;
        }
    }

    void searchAndInsert(Word subWord, Word word){
        setPattern(subWord);
        setMatcher();
        while (matcher.find()) {
            matcher.appendReplacement(rs, matcher.group().trim()+" "+word.getText());
        }
        matcher.appendTail(rs);
    }

    private String collectionOfRegex(Word subword){
        String regex = regex1+subword.getText()+regex2;
        return regex;
    }

    private void setPattern(Word subWord){
        this.pattern = Pattern.compile(collectionOfRegex(subWord));
    }

    private void setMatcher(){
        this.matcher = pattern.matcher(this.getText());
    }

    StringBuffer getResultSentence(){
        return this.rs;
    }
}
