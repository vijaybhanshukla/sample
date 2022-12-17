package createReadExcelFiles;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadFile {
	
	public static void main(String[] args) {
        try {
            URL url = new URL( "file://DESKTOP-6BTH6LO/Users/user/Desktop/one.xls");


            File destination_file = new File("C:\\Users\\user\\Desktop\\o.xls");
            FileUtils.copyURLToFile(url, destination_file);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
