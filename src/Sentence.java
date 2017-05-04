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

    //set text into text field
    public void setText(){
        String str = inputText();
        if (str.matches(sentenceRegex)) { //checking for compliance with a given template
            this.text = str;
        }
    }

    //search for matches in a string and insert the specified word
    void searchAndInsert(Word subWord, Word word){
        setPattern(subWord);
        setMatcher();
        while (matcher.find()) {
            matcher.appendReplacement(rs, matcher.group().trim()+" "+word.getText());
        }
        matcher.appendTail(rs);
    }

    //create and set regex
    private String collectionOfRegex(Word subword){
        String regex = regex1+subword.getText()+regex2;
        return regex;
    }

    //set a pattern using the given subword
    private void setPattern(Word subWord){
        this.pattern = Pattern.compile(collectionOfRegex(subWord));
    }

    //set a matcher using the pattern
    private void setMatcher(){
        this.matcher = pattern.matcher(this.getText());
    }

    //return the resulting string
    StringBuffer getResultSentence(){
        return this.rs;
    }
}
