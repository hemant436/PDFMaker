package pdf;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;

import org.apache.commons.io.FileUtils;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class HTMLtoPDF {
	
	static String one = "<!doctype html> <html lang=\"en\"> <head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/> <title>eRaktKosh Notification Mail</title> <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> <style type=\"text/css\"> a[x-apple-data-detectors] {color: inherit !important;} </style> </head> <body style=\"margin: 0; padding: 0;\"> <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\"> <tr> <td style=\"padding: 20px 0 30px 0;\"> <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"700\" style=\"border-collapse: collapse; border: 1px solid #cccccc;\"> <tr> <td align=\"center\"  style=\"padding: 10px 0 10px 0;\">";
	static String two = "</td> </tr> <tr> <td bgcolor=\"#E0EAFC\" style=\"padding: 20px 20px 20px 20px;\"> <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;\"> <tr> <td style=\"color: #153643; font-family: Arial, sans-serif;\"> <h1 style=\"font-size: 16px; margin: 0;\">Dear Sir/Madam,</h1> </td> </tr> <tr> <td style=\"color: #153643; font-family: Arial, sans-serif; font-size: 16px; line-height: 24px; padding: 10px 0 10px 0;\"> <p style=\"margin: 0;\">A Blood Donation Camp is being organised by ORGANIZER NAME. Who are interested can participate in camp and help others.</p> </td>  </tr>   <tr style=\"justify-content: center;\"> <td style=\"font-weight: bold;color: green; font-family: Arial, sans-serif; font-size: 16px; line-height: 24px;padding: 10px 0 0 0;font-weight: bold;text-align: center;font-style: italic; \" > Camp Name </td> </tr> <tr style=\"justify-content: center;\"> <td style=\"font-weight: bold;color:black; font-family: Arial, sans-serif; font-size: 16px; line-height: 24px;padding: 10px 0 0 0;font-weight: bold;text-align: center;font-style: italic; \" > Rotary Blood Donation </td> </tr> <tr style=\"justify-content: center;\"> <td style=\"font-weight: bold;color:blue; font-family: Arial, sans-serif; font-size: 16px; line-height: 24px;padding: 10px 0 0 0;font-weight: bold;text-align: center;font-style: italic; \" > Camp Venue </td> </tr> <tr style=\"justify-content: center;\"> <td style=\"font-weight: bold;color:black; font-family: Arial, sans-serif; font-size: 16px; line-height: 24px;padding: 10px 0 0 0;font-weight: bold;text-align: center;font-style: italic; \" > Sector 62,Anusandhan Bhawan, Noida </td> </tr> <tr style=\"justify-content: center;\"> <td style=\"font-weight: bold;color:red; font-family: Arial, sans-serif; font-size: 16px; line-height: 24px;padding: 10px 0 0 0;font-weight: bold;text-align: center;font-style: italic; \" > Date & Time </td> </tr> <tr style=\"justify-content: center;\"> <td style=\"font-weight: bold;color:black; font-family: Arial, sans-serif; font-size: 16px; line-height: 24px;padding: 10px 0 0 0;font-weight: bold;text-align: center;font-style: italic; \" > 28-Jan-2020 14:05 PM </td> </tr> <tr style=\"justify-content: center;\"> <td style=\"color: #153643; font-family: Arial, sans-serif; font-size: 16px; line-height: 24px;padding: 10px 0 0 0;font-weight: bold;text-align: center;font-style: italic; \" > <br><p style=\"margin: 0;\">\"You don't have to be a doctor to save lives, just donate blood\"</p></br> </td>  </tr> <tr style=\"justify-content: center;\"> <td style=\"color: #153643; font-family: Arial, sans-serif; font-size: 16px; line-height: 24px;padding: 10px 0 0 0;font-weight: bold;text-align: center;font-style: italic; \" > <p style=\"margin: 0;\"><a href=\"#\"  style=\"color:Red; font-size: 16px;\">Register Now</a></p><br></br> </td>  </tr>   <tr> <td style=\"color: #153643; font-family: Arial, sans-serif; font-size: 16px; line-height: 24px;padding: 10px 0 0 0 \" > <p style=\"margin: 0;font-weight: bold;\">Yours Sincerely,<br></br>e-RaktKosh Team</p> </td>  </tr> </table> </td> </tr> <tr> <td bgcolor=\"#ee4c50\" style=\"padding: 15px 15px;\"> <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;\"> <tr> <td style=\"color: #ffffff; font-family: Arial, sans-serif; font-size: 14px;\"> <p style=\"margin: 0;\"><a href=\"#\" style=\"color:white;\">Contact Us</a> | <a href=\"#\" style=\"color:white;\">About Us</a><br></br></p> </td> <td align=\"right\"> <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse;\"> <tr> <td> <a href=\"http://www.twitter.com/\"> <img src=\"https://assets.codepen.io/210284/tw.gif\" alt=\"Twitter.\" width=\"38\" height=\"38\" style=\"display: block;\" border=\"0\" /> </a> </td> <td style=\"font-size: 0; line-height: 0;\" width=\"20\">&nbsp;</td> <td> <a href=\"http://www.twitter.com/\"> <img src=\"https://assets.codepen.io/210284/fb.gif\" alt=\"Facebook.\" width=\"38\" height=\"38\" style=\"display: block;\" border=\"0\" /> </a> </td> </tr> </table> </td> </tr> </table> </td> </tr> </table>  </td> </tr> </table> </body> </html>";
	static String middle = "/PDF/webapp/images/Rakt5.png";
	static String m = "<img src="+middle+" height=\"70\"alt=\"eRaktKosh\" title=\"eRaktKosh\"/>";
	
	public static void main(String[] args ,String[] c) throws DocumentException, IOException, URISyntaxException {
		// TODO Auto-generated method stub
		//generatePDFFromHTML("C:\\Users\\Hemant\\Documents\\Resume's\\latest_resume\\image.html");
		//htmlToImage();
		System.out.println("Hemant");
		File file = null;
		InputStream stream = new ByteArrayInputStream(one.getBytes("UTF-8"));
		FileUtils.copyInputStreamToFile(stream, file);
		System.out.println("hjhj"+file);

	}
	
	
	
	public static void main(String[] a) {
		
		System.out.println("Hemant");
		File file = null;
		InputStream stream;
		try {
			stream = new ByteArrayInputStream(one.getBytes("UTF-8"));
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
	private static void generatePDFFromHTML(String filename) throws DocumentException, IOException {
	    
		String fina = one.concat(m).concat(two);
		Document document = new Document();
	    PdfWriter writer = PdfWriter.getInstance(document,
	      new FileOutputStream("C:\\Users\\Hemant\\Documents\\Resume's\\latest_resume\\html.pdf"));
	    		//new StringReader(fina));
	    document.open();
	    XMLWorkerHelper.getInstance().parseXHtml(writer, document,
	      new FileInputStream(filename));
	    document.close();
	}
	  private static final int WIDTH = 1204;
	    private static final int HEIGHT = 768;
	static void htmlToImage() throws IOException, URISyntaxException {
		String fina = one.concat(m).concat(two);
		JEditorPane editorPane = new JEditorPane();
		//InputStream is = new FileInputStream(fina);
        editorPane.setEditable(false);
      //  new File(fina).toURI().toURL();
        //new File ("/PDF/main/webapp/WEB-INF/images/image1.html").toURI().toURL();
        		//new File("C:\\Users\\Hemant\\Documents\\Resume's\\latest_resume\\image1.html").toURI().toURL();
        URL url =new File("/PDF/src/main/webapp/WEB-INF/images/image1.html").toURI().toURL();
        editorPane.setPage(fina);
        editorPane.setSize(WIDTH, HEIGHT);

        // render the page
        BufferedImage renderedImage = new BufferedImage(940, 640, BufferedImage.TYPE_INT_RGB);
        editorPane.print(renderedImage.getGraphics());

        // write result to file
        ImageIO.write(renderedImage, "PNG", new File("C:\\Users\\Hemant\\Documents\\Resume's\\latest_resume\\hello-world.png"));
	}
	static void print(int a, int b ,int limit) {
		
		while(a <= b && a < limit) {
			System.out.print(" "+a);
			a++;
		}
	}
	
	static void printMissingNumber(int[] a , int limit) {
		if(a.length == 0)
			return;
		
		Arrays.sort(a);
		int i = 0;
		
		if(a[0] < limit && a[0] > 1)
			print(1,a[0]-1 ,limit);
		
		for ( i = 0; i< a.length-1 ; i++) {

			if(a[i] < limit && a[i+1] - a[i]  != 1)
				print(a[i] + 1 , a[i+1]-1 , limit);
		}
		
		i = a[i];
		i++;
		
		while ( i <= limit) {
			System.out.print(" "+i);
			i++;
		}


	}
	
	static void html2image() {
		String html = "<body lang=PT-BR style='tab-interval:35.4pt'><img src='http://nxcache.nexon.net/all/v1.5.2/img/gnt/games-dropdown/maplestory.jpg'></body>";

       
		
		
	}

}



