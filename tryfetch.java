import java.net.*;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
 

public class tryfetch {

    public static void main(String[] args) throws IOException {

        // Make a URL to the web page
        URL url = new URL("https://textnook.wordpress.com/");

        // Get the input stream through URL Connection
       

        // read each line and write to System.out
        
          Document html = Jsoup.parse(url,30000); 
          String h1 = html.body().getElementsByTag("h1").text(); 
          String tim = html.body().getElementsByTag("time").text(); 
          System.out.println("Headings : /n" + h1);
          System.out.println("Time: /n" + tim);
          
 
            //System.out.println(line);
        
    }
}