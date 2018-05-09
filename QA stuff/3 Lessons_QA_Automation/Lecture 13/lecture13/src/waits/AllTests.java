package waits; 

import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AlertsTest.class,
	ElementStateTests.class,
	ExplicitWaitTest.class,
	FramesTest.class,
	WindowPopupTest.class
	})
public class AllTests {
  //nothing is required here, just leave it with empty body
}

