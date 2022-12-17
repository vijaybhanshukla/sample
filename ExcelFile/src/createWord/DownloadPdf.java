package createWord;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadPdf {
	public static void main(String[] args) {
		
	
	
	 try {
         URL url = new URL( "file://DESKTOP-6BTH6LO/Users/user/Downloads/Olive+Crypto+Employee.pdf");




         File destination_file = new File("C:\\Users\\user\\Desktop\\olive.pdf");
         FileUtils.copyURLToFile(url, destination_file);
     } catch (MalformedURLException e1) {
         e1.printStackTrace();
     } catch (IOException e1) {
         e1.printStackTrace();
     }

}
}
