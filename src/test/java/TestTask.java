import org.example.Task;
import org.junit.Assert;
import org.junit.Test;

public class TestTask {

    @Test
    public void isOverDuePositive() {
        // Assuming current time is 10
        Task task = new Task();
        task.setDueTime(5);
        Assert.assertTrue(task.isOverDue());
    }

    @Test
    public void isOverDueNegative() {
        Task task = new Task();
        task.setDueTime(20);
        Assert.assertFalse(task.isOverDue());
    }
}
