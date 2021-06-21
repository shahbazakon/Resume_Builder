package ResumeTemplate;
import java.io.IOException;

//import javax.swing.*;

//import com.itextpdf.text.Document;
import com.itextpdf.io.font.FontConstants; 
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.font.PdfFontFactory; 
import com.itextpdf.kernel.font.PdfFont; 
import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 

import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.TabStop;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.BaseDirection;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TabAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;  


public class ResumeTemplate 
{
	public static final String Rubik ="Fonts\\Rubik-VariableFont_wght.ttf";
	public static final String Rubik_Medium ="Fonts\\Rubik-Medium.ttf";
	
//	public static void main(String[] args) throws IOException ,DocumentException
	public ResumeTemplate
	(
			//presonal Detail
//			------------------
			String First_Name,				
			String Second_Name,
			String Email,
			String LinkedIn,
			String City,
			String Twitter,
			String GitHub,
			String Facebook,
			String Phone_Number,
			String Address,
			
			//Education Details
//			-------------------
			String College_Univercity,
			String FromYear1,
			String ToYear1,
			String ClgQualification,
			String ClgDescription,				
			String School,
			String FromYear2,
			String ToYear2,
			String SclQualification,
			String SclDescription,
			
			
			
			//Project Details
//			-----------------
			String P_Link1,
			String P_Title1,
			String P_Description1,
			String P_Title2,
			String P_Link2,
			String P_Description2,
			
			
			//Experience Detail
//			-------------------
			String InstituteOrigination1,
			String Position1,
			String Duration1,
			String ExpDescription1,				
			String InstituteOrigination2,
			String Position2,
			String Duration2,
			String ExpDescription2,
			
			//Extra Detalis
//			---------------
			String Skill1,
			String Skill2,
			String Skill3,
			String Skill4,
			String Skill5,
			String Skill6,
			String Intrust1,
			String Intrust2,
			String Intrust3,
			String Intrust4,
			String Intrust5,
			String Intrust6
			) throws IOException ,DocumentException
	{
//	      ---------------------------------------------------------------------------------------------------------
	      String PDFname = First_Name+"_"+ Second_Name +"_Resume.pdf";										// Set Pdf Name
	      String Srcpath = "E:/"+ PDFname;											//path where the PDF will Save
	      PdfWriter pdfwriter = new PdfWriter(Srcpath);
	      PdfDocument pdfDocument = new PdfDocument(pdfwriter);
	      Document document = new Document(pdfDocument);
	      PdfFont objRubic = PdfFontFactory.createFont(Rubik, true);				 // Object of Rubik Font
	      PdfFont objRubic_Medium = PdfFontFactory.createFont(Rubik_Medium, true); // Object of Rubik_Medium Font
//	      ---------------------------------------------------------------------------------------------------------


	      
	      
//	      ------------------------ TEXT STYLE Start--------------------------------
	      com.itextpdf.kernel.color.Color Primiry_color = new DeviceRgb(47,79,79);
	      com.itextpdf.kernel.color.Color Secondy_color = new DeviceRgb(0,128,128);
	      
	      
	      //MainHeading
	      Style MainHeading = new Style();          
	      MainHeading
	      			 .setFontColor(Primiry_color)
   		 			 .setBold()
   		 			 .setFont(objRubic_Medium)
   		 			 .setFontSize(10)
   		 			 .setFont(objRubic)
   		 			 .setTextAlignment(TextAlignment.LEFT);
	      
	      //SubHeading
	      Style SubHeading = new Style();			
	      SubHeading.setFontSize(10)
	      			.setFontColor(Secondy_color)
	      			.setFont(objRubic)
    				.setBold();
	      
	      //SubText
	      Style MainText = new Style();
	      MainText.setFontSize(8)
	      .setFont(objRubic);
//	      ----------------------------------------------------------------------------
	     
  
	      
//========================================================================================================================||	      
//----------------------------------------------------RESUME HEADER-------------------------------------------------------||
//========================================================================================================================||	      
	      Paragraph Address_Para = new Paragraph()
	    		  .setTextAlignment(TextAlignment.RIGHT);
	      
	      Text Address_Head = new Text("Street Address") .addStyle(MainText);;
	      Text Address1 = new Text("\n" + Address+ ","+ City) .addStyle(MainText);;
	      Text Phone = new Text("\n" + "+91"+Phone_Number) .addStyle(MainText);;
	      
	      Address_Para.add(Address_Head)
	      			  .add(Address1)
	      			  .add(Phone);
	      
	      document.add(Address_Para); 
	      
	      
	      
	      //FUll Name Section Start---------------------->>
	      Paragraph Full_Name = new Paragraph()
	    		  .setBackgroundColor(Primiry_color, 1000)
	    		  .setHeight(30)
	    		  .setPadding(3)
	    		  .setMarginBottom(10);
	      
	      Text Name = new Text(" "+ First_Name +" "+Second_Name)
	    		  .setFontSize(20f)
	    		  .setFontColor(Color.WHITE)
	    		  .setFont(objRubic_Medium);
	    		  
	      Full_Name.add(Name);
	      document.add(Full_Name);
	      
	      
//========================================================================================================================||	      
//-------------------------------------------------------PRESONAL DETALIS-------------------------------------------------||
//========================================================================================================================||	      
	      
	      float columnWidth[] = {200f, 200f,200f, 200f};
		     Table table = new Table(columnWidth);
		     table.setPaddingTop(7f);
		     table.setBorder(new SolidBorder(Color.WHITE,1));
	     
	      
	     Paragraph Accounts = new Paragraph()
		      		.setTextAlignment(TextAlignment.JUSTIFIED)
		      		.setPaddingLeft(15f);
		 Text Email1 = new Text(Email)
	    		  .addStyle(MainText);
	     Text Facebook1 = new Text("\n"+"FacebooK/" + Facebook)
	    		  .addStyle(MainText);
	     Text GitHub1 = new Text("\n"+"GitHub/" + GitHub)
	    		  .addStyle(MainText);
	     Text LinkedIn1 = new Text("\n"+"LimkedIn/" + LinkedIn)
	    		  .addStyle(MainText);
	     Text Twitter1 = new Text("\n"+"Twitter/" + Twitter)
	    		  .addStyle(MainText);
	     ;  
	     
	     Accounts
	     		 .add(Email1)
	     		 .add(Facebook1)
	     		 .add(GitHub1)
	     		 .add(LinkedIn1)
	     		 .add(Twitter1);
	     		
	     
	     
	     table.addCell(new Cell(0,1)
	    		 .setBorder(new SolidBorder(Color.WHITE,1))
	    		 .setBorderBottom(new SolidBorder(Primiry_color,1))
	    		 .add("SOCIAL ACCOUNTS")
	    		 .setPadding(7f)
	    		 .addStyle(MainHeading)
	    		 .setTextAlignment(TextAlignment.RIGHT)
	    		 );
	      table.addCell(new Cell(0,3)
	    		  .setPadding(7f)
	    		  .add(Accounts)
	    		  .setBorder(new SolidBorder(Color.WHITE,1))
	    		  .setBorderBottom(new SolidBorder(Primiry_color,1)));
	      
 	     
//========================================================================================================================||	      
//-------------------------------------------------------EDUCATIONAL DETALIS----------------------------------------------||
//========================================================================================================================||

	      
	      
	     Paragraph Educational = new Paragraph()
		      		.setTextAlignment(TextAlignment.JUSTIFIED)
		      		.setPaddingLeft(15f);
	     
	     Text College = new Text(College_Univercity)
	    		  .addStyle(SubHeading);
	     Text ClgDuration =  new Text("\n"+FromYear1+" to "+ToYear1)
	    		 .addStyle(MainText)
	    		 .setFontColor(Color.GRAY);
	     Text Branch = new Text("\n"+ClgQualification)
	    		  .addStyle(MainText);;
	     Text ClgDescription1 = new Text("\n"+ClgDescription)
	    		  .addStyle(MainText);;
	     
	     Educational.add(College)
	     			.add(ClgDuration)
	     			.add(Branch)
	     			.add(ClgDescription1);
	   
	     Text School1 = new Text("\n \n"+ School)
	    		  .addStyle(SubHeading);
	    
	     Text SchDuration =  new Text("\n"+FromYear2+" to "+ToYear2)
	    		 .addStyle(MainText)
	    		 .setFontColor(Color.GRAY);
	     Text Class = new Text("\n"+SclQualification)
	    		  .addStyle(MainText);
	     Text SchDescription = new Text("\n"+SclDescription)
	    		  .addStyle(MainText);
	     
	     Educational.add(School1)
	     			.add(SchDuration)
	     			.add(Class)
	     			.add(SchDescription);
	     
	     table.addCell(new Cell(0,1)
	    		 .setPadding(7f)
	    		 .add("EDUCATION DETAILS")
	    		 .setBorder(new SolidBorder(Color.WHITE,1))
	    		 .setBorderBottom(new SolidBorder(Primiry_color,1))
	    		 .setTextAlignment(TextAlignment.RIGHT)
	    		 .addStyle(MainHeading)
	    		 );
	      table.addCell(new Cell(0,3)
	    		  .setPadding(7f)
	    		  .setBorder(new SolidBorder(Color.WHITE,1))
	    		  .setBorderBottom(new SolidBorder(Primiry_color,1))
	    		  .add(Educational));

	     
	     
//========================================================================================================================||	      
//-----------------------------------------------------EXPERIENCE DETALIS-------------------------------------------------||
//========================================================================================================================||	     

		      
		     Paragraph experiences = new Paragraph()
			      		.setTextAlignment(TextAlignment.JUSTIFIED)
			      		.setPaddingLeft(15f);
			      		
		     Text Institute = new Text(InstituteOrigination1)
		    		  .addStyle(SubHeading);
		     Text position = new Text("\n"+Position1)
		    		  .addStyle(MainText);;
		     Text InsDuration =  new Text("\n"+"Duration:"+Duration1)
		    		 .addStyle(MainText)
		    		 .setFontColor(Color.GRAY);
		     Text instDescription = new Text("\n"+ExpDescription1)
		    		  .addStyle(MainText);;
		     
		     Text Institute2 = new Text("\n"+"\n"+InstituteOrigination2)
		    		  .addStyle(SubHeading);		    		 
		     Text position2 = new Text("\n"+Position2)
		    		  .addStyle(MainText);;
		     Text InsDuration2 =  new Text("\n"+"Duration:"+Position2)
		    		 .addStyle(MainText)
		    		 .setFontColor(Color.GRAY);
		     Text instDescription2 = new Text("\n"+ExpDescription2)
		    		  .addStyle(MainText);
		     	     
		     experiences.add(Institute)
			  			.add(position)
			  			.add(InsDuration)
			  			.add(instDescription)
  						.add(Institute2)
		     			.add(position2)
		     			.add(InsDuration2)
		     			.add(instDescription2);

		     table.addCell(new Cell(0,1)
		    		 .add("EXPERIENCE")
		    		 .setPadding(7f)
		    		 .setBorder(new SolidBorder(Color.WHITE,1))
		    		 .setBorderBottom(new SolidBorder(Primiry_color,1))
		    		 .setTextAlignment(TextAlignment.RIGHT)
		    		 .addStyle(MainHeading)
		    		 );
		      table.addCell(new Cell(0,3)
		    		  .setPadding(7f)
		    		  .setBorder(new SolidBorder(Color.WHITE,1))
		    		  .setBorderBottom(new SolidBorder(Primiry_color,1))
		    		  .add(experiences));

//========================================================================================================================||	      
//--------------------------------------------------------PROJECT DETALIS-------------------------------------------------||
//========================================================================================================================||			
			      
			      
			     Paragraph project = new Paragraph()
				      		.setTextAlignment(TextAlignment.JUSTIFIED)
				      		.setPaddingLeft(15f);
				      		
			     Text project_title = new Text(P_Title1)
			    		  .addStyle(SubHeading);
			     Text project_link = new Text("\n"+"LINK: "+P_Link1)
			    		  .addStyle(MainText);;
			     Text project_Description = new Text("\n"+P_Description1)
			    		  .addStyle(MainText);;

			     project.add(project_title)
			     		.add(project_link)
			     		.add(project_Description);
			     
			     Text project_title1 = new Text("\n"+"\n"+P_Title2)
			    		  .addStyle(SubHeading);
			     Text project_link1 = new Text("\n"+"LINK: "+P_Link2)
			    		  .addStyle(MainText);
			     Text project_Description1 = new Text("\n"+P_Description2)
			    		  .addStyle(MainText);

			     project.add(project_title1)
			     		.add(project_link1)
			     		.add(project_Description1);


			     table.addCell(new Cell(0,1)
			    		 .add("PROJECTS")
			    		 .setPadding(7f)
			    		 .setBorder(new SolidBorder(Color.WHITE,1))
			    		 .setBorderBottom(new SolidBorder(Primiry_color,1))
			    		 .setTextAlignment(TextAlignment.RIGHT)
			    		 .addStyle(MainHeading)
			    		 );
			      table.addCell(new Cell(0,3)
			    		  .setPadding(7f)
			    		  .setBorder(new SolidBorder(Color.WHITE,1))
			    		  .setBorderBottom(new SolidBorder(Primiry_color,1))
			    		  .add(project));
//========================================================================================================================||	      
//----------------------------------------------------------EXtra DETALIS-------------------------------------------------||
//========================================================================================================================||
			   				      
				     Paragraph skill = new Paragraph()
					      		.setTextAlignment(TextAlignment.JUSTIFIED)
					      		.setPaddingLeft(15f);
				     
				     Text Skill11 = new Text(Skill1)
				    		  .addStyle(MainText);
				     Text Skill21 = new Text("\n"+Skill2)
				    		  .addStyle(MainText);
				     Text Skill31 = new Text("\n"+Skill3)
				    		  .addStyle(MainText);
				     Text Skill41 = new Text("\n"+Skill4)
				    		 .addStyle(MainText);
				     Text Skill51 = new Text("\n"+Skill5)
				    		 .addStyle(MainText);
				     Text Skill61 = new Text("\n"+Skill6)
				    		 .addStyle(MainText);
				  skill.add(Skill11)
				  		.add(Skill21)
				  		.add(Skill31)
				  		.add(Skill41)
				  		.add(Skill51)
				  		.add(Skill61)
				  		;
				   
				   
	 		   Paragraph intrests = new Paragraph()
						   .setPaddingLeft(20);
				   
				   Text intrest1 = new Text(Intrust1)
						    .addStyle(MainText);
				   Text intrest2 = new Text("\n"+Intrust2)
						    .addStyle(MainText);
				   Text intrest3 = new Text("\n"+Intrust3)
						    .addStyle(MainText);
				   Text intrest4 = new Text("\n"+Intrust4)
						   .addStyle(MainText);
				   Text intrest5 = new Text("\n"+Intrust5)
						   .addStyle(MainText);
				   Text intrest6 = new Text("\n"+Intrust6)
						   .addStyle(MainText);
				   
				   intrests.add(intrest1)
				   .add(intrest2)
				   .add(intrest3)
				   .add(intrest4)
				   .add(intrest5)
				   .add(intrest6)
				   ;
				   
				      table.addCell(new Cell(0,1)
				    		  .add("SKILLS")
				    		  .setPadding(7f)
				    		  .setBorder(new SolidBorder(Color.WHITE,1))
				    		  .setTextAlignment(TextAlignment.RIGHT)
				    		  .addStyle(MainHeading)
				    		  .setBorder(new SolidBorder(Color.WHITE,1))
				    		  .setBorderTop(new SolidBorder(Primiry_color,1))
				    		  );
				      table.addCell(new Cell(0,1)
				    		  .setPadding(7f)
				    		  .setBorder(new SolidBorder(Color.WHITE,1))
				    		  .setBorderTop(new SolidBorder(Primiry_color,1))
				    		  .add(skill));
				      
				      
				      table.addCell(new Cell(0,1)
				    		  .add("INTREST")
				    		  .setPadding(7f)
				    		  .setBorder(new SolidBorder(Color.WHITE,2))
				    		  .setBorderTop(new SolidBorder(Primiry_color,1))
				    		  .setTextAlignment(TextAlignment.RIGHT)
				    		  .addStyle(MainHeading));
				      
				      table.addCell(new Cell(0,1)
				    		  .add(intrests)
				    		  .setBorder(new SolidBorder(Color.WHITE,1))
				    		  .setBorderTop(new SolidBorder(Primiry_color,1))
				    		  .setPadding(7f));
				      
				   
				   
				  document.add(table);    
			     document.close();
//<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
	      System.out.println("PDF Created");
	}
	

	
}

