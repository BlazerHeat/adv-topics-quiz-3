package org.example;

public class Task {
    private static int currentTime = 10;
    private int dueTime;

    private String teamMember;

    public void assignTo(String teamMember) {
        this.teamMember = teamMember;
    }

    public String getTeamMember() {
        return this.teamMember;
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
