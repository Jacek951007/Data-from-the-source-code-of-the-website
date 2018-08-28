package FirstJsoupProject.DataFromHTML;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNames {
	public static ArrayList<String> Names(String names){
		ArrayList<String> listOfNames = new ArrayList<String>();
		StringBuffer name = new StringBuffer();
		int counter=0;
		StringBuffer finalName = new StringBuffer();
		String pattern = "\">(.*)</a></td>|\">(.*)</a>(\\))</td>";
	    Pattern r = Pattern.compile(pattern);
	    Matcher m = r.matcher(names);
	    while(m.find()) {
	    	name.append(m.group(1)); 
		    if(name.toString().equals("null")) {
		    	name.delete(0, name.length());
		    	name.append(m.group(2));
		    	name.append(m.group(3));
		    }     
		    if(counter %2== 0) {
		    	finalName.append(name.toString()+" miasto: ");
		    	name.delete(0,name.length());
		    	
		    }
		    else{
		    	finalName.append(name.toString());
		    	listOfNames.add(finalName.toString());
		    	finalName.delete(0,finalName.length());
		    	name.delete(0,name.length());
		    }
	    
	     counter++;
	        
	    }
		
		
		return listOfNames;
	}
	
}
