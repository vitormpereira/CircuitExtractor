import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.jsoup.HttpStatusException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PRTServerDWDMSectionPageTest {
	
	private PRTServerDWDMSectionPage circuitExtractor;
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Before
	public void setup() throws Exception {
		circuitExtractor = new PRTServerDWDMSectionPage();
	}

	@Test
	public void should_createObjectWithNoURL() {
		assertEquals("", circuitExtractor.getURL());
	}
	
	@Test
	public void should_createObjectWithFilename() {
		String url = "https:\\\\path.html";
		circuitExtractor = new PRTServerDWDMSectionPage(url);
		assertEquals(url, circuitExtractor.getURL());
	}
	
	@Test
	public void should_throwExceptionWhenOpenObjectWithNoFilename() throws Exception {
		exceptionRule.expect(MalformedURLException.class);
		exceptionRule.expectMessage("Ilegal URL: ''");
		circuitExtractor.connect();
	}
	
	@Test
	public void should_ThrowExceptionWhenOpenObjectAndFileIsNotFound() throws Exception {
		String url = "https:\\\\path.html";
				
		exceptionRule.expect(HttpStatusException.class);
		exceptionRule.expectMessage("Error in page " + url);
		
		circuitExtractor.setFilename(url);
		circuitExtractor.connect();
	}
	@Test
	public void getListOfCircuits() {
		
	}
	@Test
	public void getTitle() {
		
	}
}
