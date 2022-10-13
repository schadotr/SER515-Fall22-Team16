package BuilderPattern.components;
import java.lang.Integer;

public class Grade {
    public Integer assignment;
    public Integer quiz;
    public Integer midTerm;
    public Integer presentation;
    public Integer finalExam;

    public void setAssignment(int assignment){
        this.assignment = assignment;
    }

    public void setQuiz(int quiz){
        this.quiz = quiz;
    }

    public void setMidTerm(int midTerm){
        this.midTerm = midTerm;
    }

    public void setPresentation(int presentation){
        this.presentation = presentation;
    }

    public void setFinalExam(int finalExam){
        this.finalExam = finalExam;
    }
}
