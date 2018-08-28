package FirstJsoupProject.DataFromHTML;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class LineWithValues {
	public static String LineWithElements(Document document) {
		
	    Elements capacityDownload = document.getElementsByClass("tabela-liczba");       
        String capacityStadium = capacityDownload.toString();
		return capacityStadium;
		
	}
}
