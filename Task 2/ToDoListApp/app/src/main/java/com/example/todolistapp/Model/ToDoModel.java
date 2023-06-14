package com.example.todolistapp.Model;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ToDoModel extends TaskId {


    FirebaseUser user;
    String uid;
    private String task, due;

    private int status;

    public String getTask() {
        return task;
    }

    public String getDue() {
        return due;
    }

    public int getStatus() {
        return status;
    }

    public String getUid() {
        user = FirebaseAuth.getInstance().getCurrentUser();
        uid = user.getUid();
        return uid;
    }
}
