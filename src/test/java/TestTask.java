import org.example.Task;
import org.junit.Assert;
import org.junit.Test;

public class TestTask {

    @Test
    public void testUpdateStatusPositive() {
        Task task = new Task();
        task.updateStatus(true);

        Assert.assertTrue(task.currentStatus);
    }

    @Test
    public void testAssignTeamMember() {
        Task task = new Task();
        String teamMember = "Vatsal";
        task.assignTo(teamMember);

        Assert.assertEquals(teamMember, task.getTeamMember());
    }

    @Test
    public void isOverDuePositive() {
        // Assuming current time is 10
        Task task = new Task();
        task.setDueTime(5);
        Assert.assertTrue(task.isOverDue());
    }

    @Test
    public void isOverDueNegative() {
        // Assuming current time is 10
        Task task = new Task();
        task.setDueTime(20);
        Assert.assertFalse(task.isOverDue());
    }
}
