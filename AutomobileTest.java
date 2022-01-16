package Exercise1_3;

import junit.framework.TestCase;

public class AutomobileTest extends TestCase {
	public void testConstructor() {
		new Automobile("MPV", 137, 993.5, true);
		new Automobile("Sedan", 198, 53.2, false);
	}
}
