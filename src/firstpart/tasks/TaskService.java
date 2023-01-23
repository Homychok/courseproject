package firstpart.tasks;

import firstpart.constants.Type;

public class TaskService {
    public static void main(String[] args) {
        for (Type taskType : Type.values()) {
            System.out.println(taskType + "" + taskType.values());
            System.out.println(taskType + "" + taskType.valueOf("WORK"));

        }
    }
}
