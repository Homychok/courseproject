package firstpart.tasks;

import firstpart.constants.Type;

import java.time.LocalDateTime;

public class YearlyTask extends Task{
    public YearlyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title,description, type, dateTime);
    }

    @Override
    public boolean appearsIn() {
        return false;
    }
}
