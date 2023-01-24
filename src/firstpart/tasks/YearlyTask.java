package firstpart.tasks;

import firstpart.constants.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task{
    public YearlyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title,description, type, dateTime);
    }

    public boolean appearsIn(LocalDate localDate) {
        if (localDate.isAfter(LocalDate.of(2023,01,01)) &&
                localDate.isBefore(LocalDate.of(2023, 12, 31))) {
            return true;
        } else return false;
    }
}
