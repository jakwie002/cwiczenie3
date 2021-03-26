package Lab3;

import cwiczenie2.Task;
import cwiczenie2.CATEGORY;
import lombok.*;

@NoArgsConstructor


public class Subtask extends Task {
    private String SubtaskName;
    String getSubtaskName() {
        return null;
    }

    void SubtaskName(String subtaskName) {

    }

    @Override
    public String toString() {
        return "Subtask{" +
                "subtaskName='" + SubtaskName + '\'' +
                '}';
    }



    public Subtask(String taskName, String taskDescription, CATEGORY taskCategory, String taskDateTimeStop, String subtaskName) {
        super(taskName, taskDescription, taskCategory, taskDateTimeStop);
        this.SubtaskName = subtaskName;
    }

}