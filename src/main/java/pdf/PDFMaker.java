package pdf;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.font.FontProvider;
import com.itextpdf.layout.font.FontSet;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;

import javax.swing.text.StyleConstants.ColorConstants;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData; 
import com.itextpdf.io.image.ImageDataFactory;

public class PDFMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	paraPDF();	
	}
	
	
	static void paraPDF() {
		try {
		String dest = "E:\\PDFs\\addingParagraph.pdf";       
	      PdfWriter writer = new PdfWriter(dest);           
	      
	      // Creating a PdfDocument       
	      PdfDocument pdf = new PdfDocument(writer);              
	      PdfPage pdfPage = pdf.addNewPage(); 
	      
	      // Creating a Document        
	      Document document = new Document(pdf);  
	      String para1 = "Dear Sir/Madam,";  
	      
	      String para2 = "A Blood Donation Camp is being organised by Hemant Parmar. Who are interested can participate in camp and help others.";              
	      Font green = new Font(FontFamily.HELVETICA, 12, Font.ITALIC, BaseColor.GREEN);
	      Chunk greenText = new Chunk("A Blood Donation Camp is being organised by ORGANIZER NAME. Who are interested can participate in camp and help others. ", green);
	      String para = "\r\n\r\n\t";
	      // Creating Paragraphs     
	      Text t = new Text("\r\n\t\t\t\t  Camp Name");
	      PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
	      PdfFont italic = PdfFontFactory.createFont(FontConstants.TIMES_ITALIC);
	      PdfFont boldItalic = PdfFontFactory.createFont(FontConstants.TIMES_BOLDITALIC);
	      PdfFont newFont = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLDOBLIQUE);
	      t.setFont(boldItalic);   
	      
	      Text campNameN = new Text("Rotary Blood Donation");
	      campNameN.setFont(newFont);
	      Text campVenueHead = new Text(" Camp Venue");
	      campVenueHead.setFont(boldItalic);
	      //campVenueHead.setFont(font);
	      Text campdateHead = new Text(" Date & Time").setFont(boldItalic);
	     // campdateHead.setFont(font);
	      Text campVenueValue = new Text("Sector 62,Anusandhan Bhawan, Noida");
	      campVenueValue.setFont(newFont);
	      Text campdatevalue = new Text("28-Jan-2020 14:05 PM");
	      campdatevalue.setFont(newFont);
	      Text tagLine = new Text("You don't have to be a doctor to save lives, just donate blood");
	      tagLine.setFont(boldItalic).setFontSize(15f).setFontColor(Color.convertRgbToCmyk(new DeviceRgb(62, 177, 181)));
	      t.setFontColor(Color.DARK_GRAY);
	      campVenueHead.setFontColor(Color.DARK_GRAY);
	      campdateHead.setFontColor(Color.DARK_GRAY);
	      Paragraph paragraph1 = new Paragraph(para1);
	      paragraph1.setFont(font);
	      paragraph1.setFontColor(Color.BLACK);
	      Paragraph paragraph2 = new Paragraph(para2);
	      paragraph2.setFontColor(Color.BLACK);
	      Paragraph paragraph3 = new Paragraph(para);
	      Paragraph paragraph5 = new Paragraph(campNameN);//.setBackgroundColor(new DeviceRgb(88,92,90));
	      Paragraph para6 = new Paragraph(campVenueHead);
	      para6.setFont(boldItalic);
	      Paragraph para7 = new Paragraph(campVenueValue);//.setBackgroundColor(new DeviceRgb(88,92,90));
	      Paragraph para8 = new Paragraph(campdateHead);
	      para8.setFont(boldItalic);
	      Paragraph para9 = new Paragraph(campdatevalue);
	      Paragraph para10 = new Paragraph(tagLine).setTextAlignment(TextAlignment.CENTER);
	      para9.setTextAlignment(TextAlignment.CENTER);
//	      para9.setBackgroundColor(new DeviceRgb(88,92,90));
	      para8.setTextAlignment(TextAlignment.CENTER);
	      para7.setTextAlignment(TextAlignment.CENTER);
	      para10.setTextAlignment(TextAlignment.CENTER).setFontColor(Color.BLACK);
	      para6.setTextAlignment(TextAlignment.CENTER);
	      paragraph5.setTextAlignment(TextAlignment.CENTER);
	      Paragraph para4 = new Paragraph(t);
	      para4.setTextAlignment(TextAlignment.CENTER);
	      Paragraph para11 = new Paragraph("\r\nYours Sincerely,\r\n"
	      		
	      		+ "e-RaktKosh Team").setFont(boldItalic).setFontColor(Color.BLACK);
	    
			  String imFile = "E:\\PDFs\\Rakt5.png"; 
			  ImageData data =  ImageDataFactory.create(imFile);
			  
			  // Creating an Image object 
			  Image image = new Image(data);
			  image.setFixedPosition(250,765);
			     
	      // Adding image to the document       
	      
	      PdfCanvas canvas = new PdfCanvas(pdfPage);  
	      canvas.setFillColorGray(0.5f);
	      canvas.setFillColor(new DeviceRgb(255,0,0));
	      //canvas.setStrokeColor(new DeviceRgb(255,0,0));
	      // Initial point of the line       
	     // canvas.moveTo(100, 300);              
	      Rectangle rec = new Rectangle(15,25,565,810);
	      
	     
	      canvas.rectangle(rec);
	      
	      
	      document.add(image);
	      
	      document.setBackgroundColor(new DeviceRgb(255,0,0));

	      // Drawing the line       
	      canvas.moveTo(15, 760);  
	      canvas.lineTo(580, 760);    
	      
	      //canvas.lineTo(800, 300);
	      //canvas.setColor(new DeviceRgb(255,0,0), true);
	     
	      // Closing the path stroke       
	      canvas.closePathStroke();
	      document.add(paragraph3);   
	      //document.setStrokeColor(new DeviceRgb(255,0,0));
	      // Adding paragraphs to document       
	      //document.add(paragraph1);
	      document.add(para10);
	     document.add(paragraph2);           
	     document.add(para4);
	     document.add(paragraph5);
	     document.add(para6);
	     document.add(para7);
	     document.add(para8);
	     document.add(para9);
	     
	     document.add(para11);

	     
	      // Closing the document       
	      document.close();             
	      System.out.println("Paragraph added");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
