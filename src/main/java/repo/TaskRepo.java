package repo;

import java.util.List;
import java.util.ArrayList;

import models.TaskModel;

public class TaskRepo {
    private final List<TaskModel> models = new ArrayList<TaskModel>();
    private static TaskRepo instance;

    private TaskRepo() {}

    public static TaskRepo getInstance(){
        if(instance == null) {
            synchronized (TaskRepo.class) {
                if(instance == null) {
                    instance = new TaskRepo();
                }
            }
        }

        return instance;
    }

    public synchronized void addModel(TaskModel modelToAdd) {
        this.models.add(modelToAdd);
    }

    public synchronized List<TaskModel> getModels() {
        List<TaskModel> modelsToReturn = new ArrayList<TaskModel>();

        for (TaskModel model :
                this.models) {
            modelsToReturn.add(new TaskModel(model.getTitle(), model.getDescription()));
        }

        return  modelsToReturn;
    }
}
