package com.workintech.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1=new Task("Java Collections", "Write List" ,
                "Ann",Priority.LOW ,Status.ASSIGNED);

        Task task2=new Task("Java Collections", "Write List",
                "Bob", Priority.LOW,Status.ASSIGNED);

        Task task3=new Task("Java Collections", "Write List",
                "Carol",Priority.LOW,Status.ASSIGNED);

        Task task4=new Task("Java Collections", "Write List",
                "Bob",Priority.LOW,Status.ASSIGNED);
        Task task5=new Task("Java Collections", "Write List",
                "Ann",Priority.LOW,Status.ASSIGNED);

            Set<Task> annsTask= new LinkedHashSet<>();
            annsTask.add(task1);
            annsTask.add(task5);

            Set<Task> bobsTask= new LinkedHashSet<>();
            bobsTask.add(task2);
            bobsTask.add(task4);

            Set<Task> carlosTask= new LinkedHashSet<>();
            carlosTask.add(task3);

            TaskData taskData=new TaskData(annsTask,bobsTask,carlosTask);
        List<Set<Task>> tasks=new ArrayList<>();
        tasks.add(annsTask);
        tasks.add(bobsTask);
        tasks.add(carlosTask);
        taskData.getUnion(tasks);

        System.out.println(taskData.getUnion(tasks));


        
    }
}