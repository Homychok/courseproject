package firstpart.tasks;

import firstpart.constants.Type;

import java.util.*;

public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();
    private final Collection<Task> tasks = new ArrayList<>();
    private final Collection<Task> removedTasks = new ArrayList<>();
    public void add (Task task) {
        taskMap.put(task.getId(), task);
    }
    public Task remove (Integer id) {
        Collections.addAll(removedTasks, taskMap.get(id));
        taskMap.remove(id);
        return (Task) tasks;
    }
//    public static void main(String[] args) {
//        for (Type taskType : Type.values()) {
//            System.out.println(taskType + "" + taskType.values());
//            System.out.println(taskType + "" + taskType.valueOf("WORK"));
//
//        }
//    }
}
