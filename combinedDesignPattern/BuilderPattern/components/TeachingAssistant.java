package BuilderPattern.components;
import BuilderPattern.components.Assistant;
import java.util.ArrayList;
import java.util.List;

public class TeachingAssistant implements Assistant {

    public AssistantType assistantType;
    public String assistantName;
    public String assistantCourse;
    public String assistantID;

    public TeachingAssistant(){
    }

    public void setAssistantType(AssistantType assistantType){
        this.assistantType = assistantType;
    }
    public void setAssistantName(String assistantName){
        this.assistantName = assistantName;
    }
    public void setAssistantCourse(String assistantCourse){
        this.assistantCourse = assistantCourse;
    }
    public void setAssistantID(String assistantID){
        this.assistantID = assistantID;
    }
}
