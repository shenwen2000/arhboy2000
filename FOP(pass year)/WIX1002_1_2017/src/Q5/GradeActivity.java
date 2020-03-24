package Q5;
public class GradeActivity {
    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public char getGrade(int marks){
        if(marks>=90)
            return 'A';
        else if(marks>=80)
            return 'B';
        else if(marks >= 70)
            return 'C';
        else if(marks >= 60)
            return 'D';
        else 
            return 'F';
    }

 public String toString() {
        return "\nTotal score:"+ getScore() + "\nEssay grade:"+getGrade(score);
    }
    }

