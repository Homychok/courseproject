package firstandsecondparts.tasks;

import firstandsecondparts.constants.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {
    public OneTimeTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title,description, type, dateTime);
    }

    public boolean appearsIn(LocalDate localDate) {
       return localDate.getDayOfWeek() == getDateTime().getDayOfWeek()&& localDate.isAfter(getDateTime().toLocalDate());
    }
}
