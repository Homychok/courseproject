package firstpart.tasks;

import firstpart.constants.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {
    private String title;
    private Type type;
    private Integer idGenerator;
    private Integer id;
    private LocalDateTime dateTime;
    private String description;

    public Task(String title, String description, Type type, LocalDateTime dateTime) {
        this.title = title;
        this.type = type;
        this.dateTime = dateTime;
        this.description = description;
    }
    public Task(Task task, Integer id) {
        this.title = task.getTitle();
        this.type = task.getType();
        this.dateTime = task.getDateTime();
        this.description = task.getDescription();
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public Integer getId() {
        for (int i = 0; i < 100; i++) {
            idGenerator = i++;
            id = idGenerator;
        }
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return Objects.equals(getTitle(), task.getTitle()) && getType() == task.getType() && Objects.equals(idGenerator, task.idGenerator) && Objects.equals(getId(), task.getId()) && Objects.equals(getDateTime(), task.getDateTime()) && Objects.equals(getDescription(), task.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getType(), getId(), getDateTime(), getDescription());
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", type=" + type +
                ", id=" + id +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                '}';
    }

    public boolean appearsIn(){return false;}
}
