
public class Main {
    public static void main(String[] args) {
        System.out.print("Insert sentence -> " );
        Sentence sentence = new Sentence();
        System.out.print("Insert sub -> ");
        Word subWord = new Word();
        System.out.print("Insert word -> ");
        Word word = new Word();
        sentence.searchAndInsert(subWord,word); //search for matches in given sentence and insert the specified word
        System.out.println(sentence.getResultSentence()); //output of result sentence
    }
}
