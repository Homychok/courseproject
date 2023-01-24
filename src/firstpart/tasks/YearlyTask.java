package firstpart.tasks;

import firstpart.constants.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task{
    public YearlyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title,description, type, dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        if(LocalDate.now().isAfter(LocalDate.of(2023)))
        return false;
    }
}
