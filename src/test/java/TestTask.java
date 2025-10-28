import org.example.Task;
import org.junit.Assert;
import org.junit.Test;

public class TestTask {

    @Test
    public void isOverDuePositive() {
        Task task = new Task();
        Assert.assertTrue(task.isOverDue());
    }

    @Test
    public void isOverDueNegative() {
        Task task = new Task();
        Assert.assertFalse(task.isOverDue());
    }
}
