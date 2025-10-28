package org.example;

public class Task {
    private static int currentTime = 10;
    private int dueTime;

    public void assignTo(String teamMember) {

    }

    public void updateStatus(boolean newStatus) {

    }

    public void setDueTime(int dueTime) {
        this.dueTime = dueTime;
    }

    public boolean isOverDue() {
        return this.dueTime < currentTime;
    }
}
