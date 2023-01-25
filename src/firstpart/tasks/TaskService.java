package firstpart.tasks;

import firstpart.constants.Type;
import firstpart.exeptions.TaskNotFoundException;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();
    private final Collection<Task> tasks = new ArrayList<>();
    private final Collection<Task> removedTasks = new ArrayList<>();

    public void add(Task task) {
        if (tasks == null || tasks.isEmpty()) {
            new TaskNotFoundException();
        }
        taskMap.put(task.getId(), task);
    }

    public Task remove(int id) {
        if (taskMap.containsKey(id)) {

            Task tempTask = taskMap.get(id);

            removedTasks.add(tempTask);
            taskMap.remove(id);
            return tempTask;
        } else {
            new TaskNotFoundException();
        }
        return null;
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
