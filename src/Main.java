import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(FibonacciTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println("Failure:"+failure.toString());
        }

        if(result.wasSuccessful()){
            System.out.println("Your JUnit test was successfull!");
        }
    }
}

