import firstandsecondparts.exeptions.TaskNotFoundException;
import firstandsecondparts.tasks.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static firstandsecondparts.constants.Type.PERSONAL;
import static firstandsecondparts.constants.Type.WORK;

public class Main {
    public static void main(String[] args) throws TaskNotFoundException {
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
        System.out.println(taskService.getAllByDate(LocalDate.of(2023, 01, 24)));
        System.out.println(yearlyTask.appearsIn(LocalDate.of(2023,12,02)));
        System.out.println(monthlyTask);
        System.out.println(yearlyTask);
        System.out.println(taskService.getRemovedTasks());
        System.out.println(taskService.getAllGroupByDate());
        taskService.updateDescription(1, "Задача выполнена");
        try {
            System.out.println(taskService.remove(9));
        } catch (TaskNotFoundException e) {
            System.out.println("Этой задачи не существует!");
        }
        try {
            System.out.println(taskService.remove(8));
        } catch (TaskNotFoundException e) {
            System.out.println("Этой задачи не существует!");
        }



    }

}