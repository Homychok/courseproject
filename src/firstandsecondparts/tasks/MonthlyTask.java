package firstandsecondparts.tasks;

import firstandsecondparts.constants.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask  extends Task{
    public MonthlyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title,description, type, dateTime);
    }

    public boolean appearsIn(LocalDate localDate) {
        return localDate.getDayOfMonth() == getDateTime().getDayOfMonth() && localDate.isAfter(getDateTime().toLocalDate());
        }
}
