import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.print("Insert sentence -> " );
        Sentence sentence = new Sentence();

        System.out.print("Insert sub -> ");
        Word subWord = new Word();

        System.out.print("Insert word -> ");
        Word word = new Word();

        sentence.searchAndInsert(subWord,word);

        System.out.println(sentence.getResultSentence());


    }





}
