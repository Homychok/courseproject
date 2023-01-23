package firstpart.tasks;

import firstpart.constants.Type;

import java.time.LocalDateTime;

public class MonthlyTask  extends Task{
    public MonthlyTask(String title, Type type, LocalDateTime dateTime, String description) {
        super(title, type, dateTime, description);
    }

    @Override
    public boolean appearsIn() {
        return false;
    }
}
