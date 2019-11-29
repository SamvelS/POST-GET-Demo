package models;

public class TaskModel {
    private String title;
    private String description;

    public TaskModel(String title, String description) {
        this.setTitle(title);
        this.setDescription(description);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
