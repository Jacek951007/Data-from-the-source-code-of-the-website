package FirstJsoupProject.DataFromHTML;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.jsoup.nodes.Document;
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	Document document = new SourceFromWebsite().SourceDownload();    	
    	
    	String capacityStadium = new LineWithValues().LineWithElements(document);   	
    	ArrayList<Integer> valuesStadium = new FindValues().Values(capacityStadium);  


    	String names = new LineWithNames().LineWithElements(document);
    	ArrayList<String> nameStadium = new FindNames().Names(names);

  
    
    }
}
