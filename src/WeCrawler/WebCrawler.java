package WeCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
	
	// To store the URLs in the 
    //FIFO order required for BFS 
    private Queue<String> queue; 
  
    // To store visited URls 
    private HashSet<String> 
        discovered_websites; 
    
    public WebCrawler() {
    	this.queue = new LinkedList<>();
    	this.discovered_websites = new HashSet<String>();
    }
    //BFS
	public void discover(String root) {
		this.queue.add(root);
		this.discovered_websites.add(root);
		while(!this.queue.isEmpty()) {
			String v = queue.remove();
			
			//to store raw html of website
			String raw = readUrl(v);
			String regex = "https://(\\w+\\.)*(\\w+)"; 
			
			//to store the pattern of the url formed by regex
			Pattern pattern = Pattern.compile(regex);
			// To extract all the URL that 
            // matches the pattern in raw 
            Matcher matcher = pattern.matcher(raw); 
            // It will loop until all the URLs 
            // in the current website get stored 
            // in the queue 
            while(matcher.find()) {
            	//to store next url in raw
            	String actual = matcher.group();
            	
            	//whether it is visited or not
            	if(!discovered_websites.contains(actual)) {
            			discovered_websites.add(actual);
            			System.out.println(actual);
            			this.queue.add(actual);
            	}
            }
			
		}
		
	}
	private String readUrl(String v) {

        // Initializing empty string 
        String raw = ""; 
  
        // Use try-catch block to handle 
        // any exceptions given by this code 
        try { 
            // Convert the string in URL 
            URL url = new URL(v); 
  
            // Read the HTML from website 
            BufferedReader br 
                = new BufferedReader( 
                    new InputStreamReader( 
                        url.openStream())); 
  
            // To store the input 
            // from the website 
            String input = ""; 
  
            // Read the HTML line by line 
            // and append it to raw 
            while ((input 
                    = br.readLine()) 
                   != null) { 
                raw += input; 
            } 
  
            // Close BufferedReader 
            br.close(); 
        } 
  
        catch (Exception ex) { 
            ex.printStackTrace(); 
        } 
  
        return raw; 
	}

}
