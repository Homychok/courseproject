package firstandsecondparts.tasks;

import firstandsecondparts.exeptions.TaskNotFoundException;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();
    private final Collection<Task> tasks = new ArrayList<>();
    private final Collection<Task> removedTasks = new ArrayList<>();
    public Collection<Task> getRemovedTasks = new ArrayList<>();
    public Map<LocalDate, Collection<Task>> getAllGroupByDate = new HashMap<>();
    public void add(Task task) {
        if (tasks != null || !tasks.isEmpty()) {
            taskMap.put(task.getId(), task); }
    }
    public Collection<Task> getRemovedTasks() {
        getRemovedTasks = removedTasks;
    return getRemovedTasks;
    }

    public Task remove(int id) throws TaskNotFoundException {
        if (taskMap.containsKey(id)) {

            Task tempTask = taskMap.get(id);

            removedTasks.add(tempTask);
            taskMap.remove(id);
            return tempTask;
        } else {
            throw new TaskNotFoundException();
        }
    }
    public Task updateDescription (int String) {
//        if (getAllGroupByDate.containsKey(tasks)) {
//            for (Task task : description) {
////                getRemovedTasks()
////            }
//        }
//
//        return null;
        return null;
    }
    public Task updateTitle (int String) {

        return null;
    }
    public Collection<Task> getAllByDate(LocalDate localDate) {
        return taskMap.values().stream().filter(task -> task.appearsIn()).collect(Collectors.toList());
    }
    public Map<LocalDate, Collection<Task>> getAllGroupByDate(LocalDate localDate) {
        if (getAllGroupByDate.containsKey(tasks)) {
            Collection<Task> newCollection = getAllGroupByDate.get(localDate);
        }
        return getAllGroupByDate;
   }
//    public static void main(String[] args) {
//        for (Type taskType : Type.values()) {
//            System.out.println(taskType + "" + taskType.values());
//            System.out.println(taskType + "" + taskType.valueOf("WORK"));
//
//        }
//    }
}
