package FirstJsoupProject.DataFromHTML;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindValues {
	public static ArrayList<Integer> Values(String capacityStadium){
		ArrayList<Integer> listOfValue = new ArrayList<Integer>();   	
    	StringBuffer capacity = new StringBuffer();
    	int value;
    	//<td style="text-align: right" class="tabela-liczba" data-sort-value="&quot;&amp;<strong">120&nbsp;000<sup id="cite_ref-1" class
    	String pattern = "\">([0-9]*).*\\;([0-9]*)<";
	    Pattern r = Pattern.compile(pattern);
	    Matcher m = r.matcher(capacityStadium);
    	while(m.find()) {
    		capacity.append(m.group(1));
    		capacity.append(m.group(2));
    		listOfValue.add(Integer.parseInt(capacity.toString()));
    	// Here, I handle exception, because it is mistake in source code of wiki.
    		if(Integer.parseInt(capacity.toString())==75075) {
    			listOfValue.add(75024);
    		}
    		capacity.delete(0, capacity.length());
    	}
    	
       // Solution before i meet Regex 
       /* for(int i=0;i<capacityStadium.length();i++) {        	
        	if(capacityStadium.charAt(i)=='g') {
        		for(int j=i+2;j<j+12;j++) {
        			if(capacityStadium.charAt(j)=='<') {
        				break;
        			}
        			else {
        				if(Character.isDigit(capacityStadium.charAt(j))) {
        					capacity.append(capacityStadium.charAt(j));
        				}
        			}
        		}
        		if(capacity.toString().isEmpty()) {
        	
        		}
        		else {
        			value = Integer.parseInt(capacity.toString());
        			listOfValue.add(value);
        			value = 0;
        			capacity.delete(0, 10);
        		}
        	}
        }*/
    	
		return listOfValue;
	}
}
