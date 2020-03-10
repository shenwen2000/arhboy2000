package Q2;
public class Sentence {
    private String sentence;
    private int length,noOfvowel,noOfWord;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }
    public int countVowels(){
        // can use Character.toLowerCase so don't need to compare too much case
        for(int i = 0; i< sentence.length(); i++){
            if(sentence.charAt(i)== 'A'
              || sentence.charAt(i)== 'a' 
              || sentence.charAt(i)== 'e'
              || sentence.charAt(i)== 'E'
              ||sentence.charAt(i)== 'i'
              || sentence.charAt(i)== 'I'
              || sentence.charAt(i)== 'O'
              || sentence.charAt(i)== 'o'
              || sentence.charAt(i)== 'U'
              || sentence.charAt(i)== 'u')
                noOfvowel++;
        }
        return noOfvowel;
     }
     public int countWords(){
        for(int i = 0; i< sentence.length(); i++){
            if(sentence.charAt(i) == ' ')
                noOfWord++;
        }
        return noOfWord;
     }

    @Override
    public String toString() {
        return "The sentence is : " + sentence
                + "\nThe length of the sentence : "+sentence.length()
                +"\nThe number of vowels : " + countVowels()
                +"\nThe number of words : " + (countWords()+1);
    }
    }  

