package FirstJsoupProject.DataFromHTML;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LineWithNames {
	public static String LineWithElements(Document document) {
		Elements namesDowload = document.getElementsByTag("td");
		String names = namesDowload.toString();
		
		
		
		return names;
		
	}
}
