package FirstJsoupProject.DataFromHTML;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SourceFromWebsite {
	public static Document SourceDownload() throws IOException{
    	Connection connect = Jsoup.connect("https://pl.wikipedia.org/wiki/Lista_najwi%C4%99kszych_stadion%C3%B3w_pi%C5%82karskich");
    	Document document = connect.get();
    	return document;
   
	}
}
