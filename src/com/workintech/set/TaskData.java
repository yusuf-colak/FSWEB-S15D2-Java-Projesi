package com.workintech.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getTask(String taskOwer){
        if (taskOwer.equals("ann")){
            return annsTasks;
        }
        if (taskOwer.equals("bob")){
            return bobsTasks;
        }
        if (taskOwer.equals("carol")){
            return carolsTasks;
        }
        if (taskOwer.equals("all")){
            Set<Task> hepsi= new HashSet<>();
            hepsi.addAll(annsTasks);
            hepsi.addAll(bobsTasks);
            hepsi.addAll(carolsTasks);
            return hepsi;
        }
        else return new HashSet<>();

    }

    public Set<Task> getUnion(List<Set<Task>> taskList){
        Set<Task> totals= new HashSet<>();
        for (Set<Task> tasks: taskList){
            System.out.println("Task: "+tasks );
            totals.addAll(tasks);
        }
        return totals;
    }


}
