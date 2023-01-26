package firstandsecondparts.tasks;

import firstandsecondparts.exeptions.TaskNotFoundException;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();
//    private final Collection<Task> tasks = new ArrayList<>();
    private final Collection<Task> removedTasks = new ArrayList<>();
//    public Collection<Task> getRemovedTasks = new ArrayList<>();
//    public Map<LocalDate, Collection<Task>> getAllGroupByDate = new HashMap<>();
    public void add(Task task) {
//        if (tasks != null || !tasks.isEmpty()) {
            taskMap.put(task.getId(), task);
    }
    public Collection<Task> getRemovedTasks() {
//        getRemovedTasks = removedTasks;
//    return getRemovedTasks;
        return new ArrayList<>(removedTasks);
    }

    public Task remove(int id) throws TaskNotFoundException {
        if (taskMap.containsKey(id)) {
            Task tempTask = taskMap.get(id);
            removedTasks.add(tempTask);
            taskMap.remove(id);
            return tempTask;
        }
            throw new TaskNotFoundException();
        }
    public Task updateDescription (int i, String description) {
//        if (getAllGroupByDate.containsKey(tasks)) {
//            for (Task task : description) {
////                getRemovedTasks()
////            }
//        }
        taskMap.get(i).setDescription(description);
        return taskMap.get(i);
    }
    public Task updateTitle (int i, String title) {
        taskMap.get(i).setTitle(title);
        return taskMap.get(i);
    }
    public Collection<Task> getAllByDate(LocalDate localDate) {
        return taskMap.values().stream().filter(task -> task.appearsIn(localDate)).collect(Collectors.toList());
    }
    public Map<LocalDate, List<Task>> getAllGroupByDate() {
//        if (getAllGroupByDate.containsKey(tasks)) {
//            Collection<Task> newCollection = getAllGroupByDate.get(localDate);
//        }
        return taskMap.values().stream().collect(Collectors.groupingBy(task -> task.getDateTime().toLocalDate()));
   }
//    public static void main(String[] args) {
//        for (Type taskType : Type.values()) {
//            System.out.println(taskType + "" + taskType.values());
//            System.out.println(taskType + "" + taskType.valueOf("WORK"));
//
//        }
//    }
}
