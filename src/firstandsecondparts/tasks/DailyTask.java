package firstandsecondparts.tasks;

import firstandsecondparts.constants.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DailyTask extends Task{
    public DailyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title,description, type, dateTime);
    }
@Override
    public boolean appearsIn(LocalDate localDate) {
        return localDate.isAfter(getDateTime().toLocalDate()) ;
    }
}
