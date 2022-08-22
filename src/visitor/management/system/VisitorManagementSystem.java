
package visitor.management.system;

import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.Properties;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Sides;
import javax.swing.JFrame;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

public class VisitorManagementSystem 
{    
   
 
    public static VisitorDetail v;
    public static VisitorDetailsObjects model;
    public static MainPage mainPage;
    public static JFrame window,visitorDetailFrame,visitorListFrame,adminPageFrame,adminFxnFrame,webcamFrame;
   public static AdminPage adminPage;
   public static AdminFunctions adminFunctions;
   public static VisitorList vlist;
   
 
    public static void main(String[] args) 
    
    {
  
        
     
    
        
        
//        try
//        {
//             PDDocument document = PDDocument.load(new File("e:/userData.pdf"));
//
//        PrintService myPrintService = findPrintService("Fax");
//
//        PrinterJob job = PrinterJob.getPrinterJob();
//        job.setPageable(new PDFPageable(document));
//        job.setPrintService(myPrintService);
//        job.print();
//
//        }
//        catch(Exception e)
//        {
//            System.out.println("error"+e);
//        }
//       
        
        v=new VisitorDetail();
        
        v.init();
        v.start();
        model=new VisitorDetailsObjects();
        VisitorManagementSystem vos=new VisitorManagementSystem();
        
        VisitorDetail v=new VisitorDetail(vos,model);
        v.init();
        v.start();
      
        mainPage= new MainPage(vos);
        mainPage.init();
        mainPage.start();
        
        adminPage= new AdminPage(vos,model);
        adminPage.init();
        adminPage.start();
        
        vlist= new VisitorList(vos);
        vlist.init();
        vlist.start();
        
        adminFunctions= new AdminFunctions(vos);
        adminFunctions.init();
        adminFunctions.start();
        
        
        window = new JFrame("Main Screen");
        window.setContentPane(mainPage);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();              
        //Arrange the components.
        //System.out.println(theApplet.getSize());
        window.setVisible(true); 
        
        
    }
   
       
   

    public  void m() 
    
    {
     v=new VisitorDetail();
         
        v.init();
        v.start();
      
        JFrame window = new JFrame("Visitor Details");
        window.setContentPane(v);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();              
        //Arrange the components.
        //System.out.println(theApplet.getSize());
        window.setVisible(true); 
        
        
   }
    
    
   
}
