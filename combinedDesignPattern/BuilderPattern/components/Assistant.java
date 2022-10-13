package BuilderPattern.components;
import java.lang.String;
import BuilderPattern.components.AssistantType;

public interface Assistant {
    public void setAssistantType(AssistantType assistantType);
    public void setAssistantName(String assistantName);
    public void setAssistantCourse(String assistantCourse);
    public void setAssistantID(String assistantID);
}
