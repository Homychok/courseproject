package firstpart.tasks;

import firstpart.constants.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WeeklyTask extends Task{
    public WeeklyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title,description, type, dateTime);
    }

    public boolean appearsIn(LocalDate localDate) {
        if (localDate.getDayOfWeek() == getDateTime().getDayOfWeek() && localDate.isAfter(getDateTime().toLocalDate())) {
            return true;
        } else return false;    }
}
