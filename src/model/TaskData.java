package model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private  Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }
    public Set<Task> getTasks(String assignee){
        if(assignee.equalsIgnoreCase("ann")){
            return this.getAnnsTasks();
        }
        if(assignee.equalsIgnoreCase("bob")){
            return this.getBobsTasks();
        }
        if(assignee.equalsIgnoreCase("carol")){
            return this.getCarolsTasks();
        }
        if(assignee.equalsIgnoreCase("all")){
            HashSet<Task> total = new LinkedHashSet<>();
            total.addAll(this.getAnnsTasks());
            total.addAll(this.getBobsTasks());
            total.addAll(this.getCarolsTasks());
            return total;
        }
        return new HashSet<>();
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public void setAnnsTasks(Set<Task> annsTasks) {
        this.annsTasks = annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public void setBobsTasks(Set<Task> bobsTasks) {
        this.bobsTasks = bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public void setCarolsTasks(Set<Task> carolsTasks) {
        this.carolsTasks = carolsTasks;
    }
}
