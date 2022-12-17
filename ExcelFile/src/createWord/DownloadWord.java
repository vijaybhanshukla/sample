package createWord;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadWord {
	
	public static void main(String[] args) {
        try {
            URL url = new URL( "file://DESKTOP-6BTH6LO/Users/user/Desktop/word.docx");



            File destination_file = new File("C:\\Users\\user\\Desktop\\w.docx");
            FileUtils.copyURLToFile(url, destination_file);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

}
}
