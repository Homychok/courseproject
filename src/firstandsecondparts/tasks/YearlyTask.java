package firstandsecondparts.tasks;

import firstandsecondparts.constants.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task {
    public YearlyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title, description, type, dateTime);
    }
@Override
    public boolean appearsIn(LocalDate localDate) {
        return localDate.getDayOfYear() == getDateTime().getDayOfYear() && localDate.isAfter(getDateTime().toLocalDate());
    }
}