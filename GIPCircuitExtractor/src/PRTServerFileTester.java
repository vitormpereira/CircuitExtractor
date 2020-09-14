import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GIPCircuitExtracterTester {
	
	GIPCircuitExtracter circuitExtractor;

	@Before
	public void setUp() throws Exception {
		circuitExtractor = new GIPCircuitExtracter();
	}

	@Test
	public void openFile() {
		assertEquals(circuitExtractor.filename, "input_file.txt");
	}

}
