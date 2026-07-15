import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Task 3: intentional hard assertion failure so HyperExecute retryOnFailure can be demonstrated.
 */
public class Task3FailTest {

    @Test(description = "Task 3 intentional hard assertion failure")
    public void task3_intentional_hard_assertion_failure() {
        System.out.println("Task3: about to fail with a hard TestNG assertion");
        Assert.fail("Task3 intentional hard assertion failure - not flaky");
    }
}
