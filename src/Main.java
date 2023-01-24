import firstpart.tasks.*;

import java.time.LocalDateTime;

import static firstpart.constants.Type.PERSONAL;
import static firstpart.constants.Type.WORK;

public class Main {
    public static void main(String[] args) {
        DailyTask dailyTask = new DailyTask("Домашнее задание", "Необходимо прослушать лекцию и выполнить ДЗ", WORK, (LocalDateTime.of(2023, 01,25, 9, 00)));
        MonthlyTask monthlyTask = new MonthlyTask("Расписание", "Необходимо составить расписание на месяц", WORK, (LocalDateTime.of(2023, 01,31, 12, 00)));
        OneTimeTask oneTimeTask = new OneTimeTask("Завтрак", "Необходимо приготовить утром завтрак", PERSONAL, (LocalDateTime.of(2023, 01,24, 19, 28)));
        WeeklyTask weeklyTask = new WeeklyTask("Уборка", "Необходимо прибрать в квартире", PERSONAL, (LocalDateTime.of(2023, 01,28, 19, 28)) );
        YearlyTask yearlyTask = new YearlyTask("Подарки", "Необходимо купить подарки на Новый Год", PERSONAL, (LocalDateTime.of(2023, 12,01, 12, 00)));
    TaskService taskService = new TaskService();
    taskService.add(dailyTask);
    taskService.add(monthlyTask);
    taskService.add(oneTimeTask);
    taskService.add(weeklyTask);
    taskService.add(yearlyTask);
        System.out.println(taskService.remove(3));
        System.out.println(taskService);

    }

}