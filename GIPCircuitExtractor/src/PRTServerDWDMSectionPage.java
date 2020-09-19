import java.net.MalformedURLException;

import org.jsoup.HttpStatusException;

public class PRTServerDWDMSectionPage {

	private String url = "";


	public PRTServerDWDMSectionPage() {
		// TODO Auto-generated constructor stub
	}

	public PRTServerDWDMSectionPage(String filename) {
		// TODO Auto-generated constructor stub
		setFilename(filename);
	}

	public void setFilename(String filename) {
		this.url = filename;
	}

	public String getURL() {
		return url;
	}

	public void connect() throws Exception {
		// TODO Auto-generated method stub
		if(url.equals(""))
			throw new MalformedURLException("Ilegal URL: ''" + url);
		else
			throw new HttpStatusException("Error in page " + url, 0, url);
	}

}
