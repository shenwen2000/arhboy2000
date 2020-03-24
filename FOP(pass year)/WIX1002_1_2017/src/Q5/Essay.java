package Q5;
public class Essay extends GradeActivity{
    private int marksGrammar,marksSpelling,marksLength,marksContent;

    public Essay(int marksGrammar, int marksSpelling, int marksLength, int marksContent) {
        this.marksGrammar = marksGrammar;
        this.marksSpelling = marksSpelling;
        this.marksLength = marksLength;
        this.marksContent = marksContent;
    }
     public String toString() {
        return "\nEssay score: "+"\nGrammar:"+ marksGrammar+"\nSpelling:"+marksSpelling
                +"\nLength:"+marksLength+"\nContent:"+marksContent+"\n"+ super.toString();
    }

}
