package pdf;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;

import org.apache.commons.io.FileUtils;

public class Main {
	static String one = "<!doctype html> <html lang=\"en\"> <head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/> <title>eRaktKosh Notification Mail</title> <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> <style type=\"text/css\"> a[x-apple-data-detectors] {color: inherit !important;} </style> </head> <body style=\"margin: 0; padding: 0;\"> <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\"> <tr> <td style=\"padding: 20px 0 30px 0;\"> <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"700\" style=\"border-collapse: collapse; border: 1px solid #cccccc;\"> <tr> <td align=\"center\"  style=\"padding: 10px 0 10px 0;\">";

	public static void main(String[] args) throws URISyntaxException {
		// TODO Auto-generated method stub
		System.out.println("Hemant");
		File file = null;
		InputStream stream;
		try {
			new Main().getFileFromResourceAsStream("image1.html");
			//ii();
			stream = new ByteArrayInputStream(one.getBytes("UTF-8"));
			//FileUtils.copyInputStreamToFile(stream, file);
//			File f = new File(Main.class.getResource("/pdf/image1.html"));
			
			//URL url = new URL(URLEncoder.encode(one));
			
			//System.out.println(" sdsd "+f);
		}catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hjhj"+file);
	}
	private static final int WIDTH = 1204;
    private static final int HEIGHT = 768;

    public static void ii() throws IOException {
        // open HTML page
        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);
        URL urlToPage = new File(Main.class.getResource("/pdf/image1.html").toExternalForm()).toURI().toURL();
        editorPane.setPage(one);
        editorPane.setSize(WIDTH, HEIGHT);

        // render the page
        BufferedImage renderedImage = new BufferedImage(940, 640, BufferedImage.TYPE_INT_RGB);
        editorPane.print(renderedImage.getGraphics());

        // write result to file
        ImageIO.write(renderedImage, "PNG", new File("C:\\Users\\Hemant\\Documents\\Resume's\\latest_resume\\hello-world.png"));
    }

    private InputStream getFileFromResourceAsStream(String fileName) {

        // The class loader that loaded the class
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }

    }
    
  
    	

    	
  
    
}
