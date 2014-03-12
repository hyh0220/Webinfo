/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webinfo;


import java.io.IOException;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author yanhaohu
 */
public class WEBinfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getinfo("uiowa","red");
        getinfo("uiowa","blue");
        getinfo("uiowa","studart");
        getinfo("uiowa","hawkdorm");
        getinfo("uiowa","hawkexpress");
        getinfo("uiowa","interdorm");
        getinfo("uiowa","mayflower");
        getinfo("uiowa","mts");
        getinfo("uiowa","pentnight");
        getinfo("uiowa","pentacrest");
        
        getinfo("iowa-city","seventhave");
        getinfo("iowa-city","brdwy");
        getinfo("iowa-city","brdwynw");
        getinfo("iowa-city","crosspark");
        getinfo("iowa-city","manville");
        
        getinfo("coralville","tenthst");
        getinfo("coralville","amexpress");
        getinfo("coralville","amnorthlib");
        getinfo("coralville","lantern");
    }
    
    
    //function
    private static void getinfo(String agent,String name){  
    Document doc;
        String text = "";
	try {
		// need http protocol
		doc = (Document) Jsoup.connect("http://ebongo.org/routes/"+agent+"/"+name).get();
		// get page title
                Element bb = doc.select("div.alert-box.warning.radius").first(); 
                if (bb!= null) {
                text = bb.text();
            }
                else {text = "null";}
                System.out.println(name+":"+text);
	} catch (IOException lol) {
	}
 
    }
}

    

