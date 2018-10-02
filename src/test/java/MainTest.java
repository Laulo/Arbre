import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTest {
	public static void main(String[] args) {
    	Result result = JUnitCore.runClasses(TestArbreAUnSommet.class, TestArbreAjouterEnfant.class, TestArbreADeuxSommets.class, TestArbrePereFilsPetitFils.class);
    	for (Failure failure : result.getFailures()) {
      		System.out.println(failure.toString());
    	}
		int total = result.getRunCount();
		System.out.println(total - result.getFailureCount() + "/" + total + " tests pass");
  }
}

