package firstpart.tasks;

import firstpart.constants.Type;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();
    private final Collection<Task> tasks = new ArrayList<>();
    private final Collection<Task> removedTasks = new ArrayList<>();
    public void add (Task task) {
        taskMap.put(task.getId(), task);
    }
    public Task remove (int id) {
        Collections.addAll(removedTasks, taskMap.get(id));
        Task tempTask = taskMap.get(id);
        taskMap.remove(id);
        return tempTask;
    }
    public Collection<Task> getAllByDate(LocalDate localDate) {
        return taskMap.values().stream().filter(task -> task.appearsIn()).collect(Collectors.toList());
    }
//    public static void main(String[] args) {
//        for (Type taskType : Type.values()) {
//            System.out.println(taskType + "" + taskType.values());
//            System.out.println(taskType + "" + taskType.valueOf("WORK"));
//
//        }
//    }
}
