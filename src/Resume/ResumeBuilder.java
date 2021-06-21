package Resume;
import ResumeTemplate.*;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

import com.itextpdf.text.DocumentException;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class ResumeBuilder {


	private JFrame frame;
	String FName,SName,EmailId,FacebookId,LinkedInId,Citys,GitHubId,PhoneNo,TwitterId,Addresses;
	private JPanel EducationD_Page;
	private JPanel ProjectsD_Page;
	private JTextField College_Univercity;
	private JTextField FromYear1;
	private JTextField ToYear1;
	private JTextField ClgQualification;
	private JTextField FromYear2;
	private JTextField ToYear2;
	private JTextPane SclDescription;
	private JTextField SclQualification;
	private JTextField P_Link1;
	private JTextField P_Title1;
	private JTextField P_Link2;
	private JTextField P_Title2;
	private JTextField Skill1;
	private JTextField InstituteOrigination1;
	private JTextField Position1;
	private JTextField Duration1;
	private JTextField Duration2;
	private JTextField Position2;
	private JTextField InstituteOrigination2;
	private JTextField Skill2;
	private JTextField Skill3;
	private JTextField Skill5;
	private JTextField Skill4;
	private JTextField Skill6;
	private JTextField Intrust1;
	private JTextField Intrust4;
	private JTextField Intrust5;
	private JTextField Intrust2;
	private JTextField Intrust3;
	private JTextField Intrust6;
	private JTextPane ClgDescription;
	private JTextPane ExpDescription2;
	private JPanel ExperienceD_Page;
	private JPanel ExtD_panel;
	private JPanel Resume_Download_Page;
	private JPanel PresonalD_Page;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResumeBuilder window = new ResumeBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public ResumeBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
				
		
		frame = new JFrame();
		frame.setBounds(100, 100, 877, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
//		============================================================================================================
//		======================================>>>> 1. Personal Details <<<<=========================================
//		============================================================================================================
		
		PresonalD_Page = new JPanel();							
		frame.getContentPane().add(PresonalD_Page, "p1");
		PresonalD_Page.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		PresonalD_Page.setBounds(29, 11, 809, 445);
		frame.getContentPane().add(PresonalD_Page);
		PresonalD_Page.setLayout(null);
		
		JPanel PreDContainer = new JPanel();
		PreDContainer.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		PreDContainer.setBounds(34, 23, 789, 39);
		PresonalD_Page.add(PreDContainer);
		
		JLabel PresonalDetails = new JLabel("Presonal Details");
		PresonalDetails.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 22));
		PreDContainer.add(PresonalDetails);
		
		JLabel First_Name_Label = new JLabel("First Name*");
		First_Name_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		First_Name_Label.setBounds(93, 83, 82, 21);
		PresonalD_Page.add(First_Name_Label);
		
		JTextField First_Name = new JTextField();
		First_Name.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		First_Name.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		First_Name.setBackground(new Color(240, 240, 240));
		First_Name.setForeground(new Color(25, 25, 112));
		First_Name.setBounds(93, 109, 262, 29);
		PresonalD_Page.add(First_Name);
		First_Name.setColumns(10);
		
		JTextField Second_Name = new JTextField();
		Second_Name.setColumns(10);
		Second_Name.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Second_Name.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Second_Name.setBackground(new Color(240, 240, 240));
		Second_Name.setForeground(new Color(25, 25, 112));
		Second_Name.setBounds(460, 109, 262, 29);
		PresonalD_Page.add(Second_Name);
		
		JLabel Second_Name_label = new JLabel("Second Name*");
		Second_Name_label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Second_Name_label.setBounds(460, 83, 116, 21);
		PresonalD_Page.add(Second_Name_label);
		
		JTextField Email = new JTextField();
		Email.setForeground(new Color(25, 25, 112));
		Email.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Email.setColumns(10);
		Email.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Email.setBackground(UIManager.getColor("Button.background"));
		Email.setBounds(93, 175, 234, 29);
		PresonalD_Page.add(Email);
		
		
		JLabel Email_Label = new JLabel("Email*");
		Email_Label.setForeground(Color.BLACK);
		Email_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Email_Label.setBounds(93, 150, 82, 21);
		PresonalD_Page.add(Email_Label);
		
		JTextField LinkedIn = new JTextField();
		LinkedIn.setForeground(new Color(25, 25, 112));
		LinkedIn.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		LinkedIn.setColumns(10);
		LinkedIn.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		LinkedIn.setBackground(UIManager.getColor("Button.background"));
		LinkedIn.setBounds(93, 307, 234, 29);
		PresonalD_Page.add(LinkedIn);
		
		JLabel LinkedIn_Label = new JLabel("Linked In*");
		LinkedIn_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		LinkedIn_Label.setBounds(93, 281, 82, 21);
		PresonalD_Page.add(LinkedIn_Label);
		
		JTextField Address = new JTextField();
		Address.setForeground(new Color(25, 25, 112));
		Address.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Address.setColumns(10);
		Address.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Address.setBackground(UIManager.getColor("Button.background"));
		Address.setBounds(93, 241, 234, 29);
		
		PresonalD_Page.add(Address);
		
		JLabel Address_lable = new JLabel("Address*");
		Address_lable.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Address_lable.setBounds(93, 215, 95, 21);
		PresonalD_Page.add(Address_lable);
		
		JTextField Facebook = new JTextField();
		Facebook.setForeground(new Color(25, 25, 112));
		Facebook.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Facebook.setColumns(10);
		Facebook.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Facebook.setBackground(UIManager.getColor("Button.background"));
		Facebook.setBounds(93, 373, 234, 29);
		PresonalD_Page.add(Facebook);
		
		JLabel Facebook_Label = new JLabel("Facebook*");
		Facebook_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Facebook_Label.setBounds(93, 347, 82, 21);
		PresonalD_Page.add(Facebook_Label);
		
		JTextField Phone_Number = new JTextField();
		Phone_Number.setForeground(new Color(25, 25, 112));
		Phone_Number.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Phone_Number.setColumns(10);
		Phone_Number.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Phone_Number.setBackground(UIManager.getColor("Button.background"));
		Phone_Number.setBounds(460, 175, 234, 29);
		PresonalD_Page.add(Phone_Number);
		
		JLabel Phone_Number_Label = new JLabel("Phone Number*");
		Phone_Number_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Phone_Number_Label.setBounds(460, 149, 116, 21);
		PresonalD_Page.add(Phone_Number_Label);
		
		JLabel GitHub_Label = new JLabel("GitHub*");
		GitHub_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		GitHub_Label.setBounds(460, 347, 82, 21);
		PresonalD_Page.add(GitHub_Label);
		
		JTextField GitHub = new JTextField();
		GitHub.setForeground(new Color(25, 25, 112));
		GitHub.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		GitHub.setColumns(10);
		GitHub.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		GitHub.setBackground(UIManager.getColor("Button.background"));
		GitHub.setBounds(460, 373, 234, 29);
		PresonalD_Page.add(GitHub);
		
		JLabel Twitter_Label = new JLabel("Twitter*");
		Twitter_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Twitter_Label.setBounds(460, 281, 51, 21);
		PresonalD_Page.add(Twitter_Label);
		
		JTextField Twitter = new JTextField();
		Twitter.setForeground(new Color(25, 25, 112));
		Twitter.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Twitter.setColumns(10);
		Twitter.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Twitter.setBackground(UIManager.getColor("Button.background"));
		Twitter.setBounds(460, 307, 234, 29);
		PresonalD_Page.add(Twitter);
		
		JLabel City_Label = new JLabel("City*");
		City_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		City_Label.setBounds(460, 215, 82, 21);
		PresonalD_Page.add(City_Label);
		
		JTextField City = new JTextField();
		City.setForeground(new Color(25, 25, 112));
		City.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		City.setColumns(10);
		City.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		City.setBackground(UIManager.getColor("Button.background"));
		City.setBounds(460, 241, 234, 29);
		PresonalD_Page.add(City);
		
		JButton Back_Btn_1 = new JButton("Back");
		Back_Btn_1.setBorder(new LineBorder(new Color(240, 240, 240), 3, false));
		Back_Btn_1.setForeground(new Color(245, 245, 245));
		Back_Btn_1.setBackground(new Color(128, 128, 128));
		Back_Btn_1.setBounds(265, 413, 82, 29);
		PresonalD_Page.add(Back_Btn_1);
		
		JButton Next_Btn_1 = new JButton("Next");
		Next_Btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
				c.show(frame.getContentPane(), "p2");
								
			}
		});
		
		Next_Btn_1.setForeground(new Color(245, 245, 245));
		Next_Btn_1.setBorder(new LineBorder(new Color(240, 240, 240), 3, false));
		Next_Btn_1.setBackground(new Color(0, 0, 128));
		Next_Btn_1.setBounds(470, 413, 82, 29);
		PresonalD_Page.add(Next_Btn_1);
		
		JLabel PageNo1 = new JLabel("1/5");
		PageNo1.setForeground(new Color(128, 128, 128));
		PageNo1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		PageNo1.setBounds(396, 442, 20, 14);
		PresonalD_Page.add(PageNo1);
		
		try
		{
//			1.
			JLabel iconmail = new JLabel();
			iconmail.setBounds(330, 175, 27, 27);
			BufferedImage Img = null;
			Img = ImageIO.read(new File("Resume Builder Assets\\email.png"));
			Image icon = Img.getScaledInstance(iconmail.getWidth(), iconmail.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format = new ImageIcon(icon);
			iconmail.setIcon(format);
			PresonalD_Page.add(iconmail);
//			2.
			JLabel icontwitter = new JLabel();
			icontwitter.setBounds(695, 307, 29, 29);
			BufferedImage Imgt = null;
			Imgt = ImageIO.read(new File("Resume Builder Assets\\twitter.png"));
			Image icont = Imgt.getScaledInstance(icontwitter.getWidth(), icontwitter.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon formatt = new ImageIcon(icont);
			icontwitter.setIcon(formatt);
			PresonalD_Page.add(icontwitter);
//			3
			JLabel iconphone = new JLabel();
			iconphone.setBounds(695, 177, 27, 27);
			BufferedImage Img11 = null;
			Img11 = ImageIO.read(new File("Resume Builder Assets\\truecaller.png"));
			Image icon11 = Img11.getScaledInstance(iconphone.getWidth(), iconphone.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format11 = new ImageIcon(icon11);
			iconphone.setIcon(format11);
			PresonalD_Page.add(iconphone);
//			4.
			JLabel iconinsta = new JLabel();
			iconinsta.setBounds(330, 241, 27, 27);
			BufferedImage Img111 = null;
			Img111 = ImageIO.read(new File("Resume Builder Assets\\home3.png"));
			Image icon111 = Img111.getScaledInstance(iconinsta.getWidth(), iconinsta.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format111 = new ImageIcon(icon111);
			iconinsta.setIcon(format111);
			PresonalD_Page.add(iconinsta);
//			5.
			JLabel iconwebsite = new JLabel();
			iconwebsite.setBounds(695, 243, 27, 27);
			BufferedImage Img1111 = null;
			Img1111 = ImageIO.read(new File("Resume Builder Assets\\home2.png"));
			Image icon1111 = Img1111.getScaledInstance(iconwebsite.getWidth(), iconwebsite.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format1111 = new ImageIcon(icon1111);
			iconwebsite.setIcon(format1111);
			PresonalD_Page.add(iconwebsite);
//			6.
			JLabel iconLinkedin = new JLabel();
			iconLinkedin.setBounds(330, 307, 27, 27);
			BufferedImage Imgl = null;
			Imgl = ImageIO.read(new File("Resume Builder Assets\\linkedin.png"));
			Image iconl = Imgl.getScaledInstance(iconLinkedin.getWidth(), iconLinkedin.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon formatl = new ImageIcon(iconl);
			iconLinkedin.setIcon(formatl);
			PresonalD_Page.add(iconLinkedin);
//			7.
			JLabel iconfb = new JLabel();
			iconfb.setBounds(330, 373, 27, 27);
			BufferedImage Img3 = null;
			Img3 = ImageIO.read(new File("Resume Builder Assets\\facebook.png"));
			Image icon3 = Img3.getScaledInstance(iconfb.getWidth(), iconfb.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format3 = new ImageIcon(icon3);
			iconfb.setIcon(format3);
			PresonalD_Page.add(iconfb);
//			8.
			JLabel icongithub = new JLabel();
			icongithub.setBounds(695, 373, 29, 29);
			BufferedImage Img4 = null;
			Img4 = ImageIO.read(new File("Resume Builder Assets\\-U5.png"));
			Image icon4 = Img4.getScaledInstance(icongithub.getWidth(), icongithub.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format4 = new ImageIcon(icon4);
			icongithub.setIcon(format4);
			PresonalD_Page.add(icongithub);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		

		
//		============================================================================================================
//		====================================>>>> 2.Education Details <<<<===========================================
//		============================================================================================================
		
		
		
		
		EducationD_Page = new JPanel();	
		frame.getContentPane().add(EducationD_Page, "p2");
		EducationD_Page.setLayout(null);
		
		JPanel EduContainer = new JPanel();
		EduContainer.setBounds(34, 23, 789, 39);
		EduContainer.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		EducationD_Page.add(EduContainer);
		
		JLabel EducationDetails = new JLabel("Education Details");
		EducationDetails.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 22));
		EduContainer.add(EducationDetails);
		
		JLabel Form_Year_Label = new JLabel("From Year*");
		Form_Year_Label.setBounds(396, 89, 74, 20);
		Form_Year_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		
		
		EducationD_Page.add(Form_Year_Label);
		
		College_Univercity = new JTextField();
		College_Univercity.setBounds(57, 115, 281, 27);
		College_Univercity.setForeground(new Color(25, 25, 112));
		College_Univercity.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		College_Univercity.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		College_Univercity.setBackground(UIManager.getColor("Button.background"));
		EducationD_Page.add(College_Univercity);
		College_Univercity.setColumns(10);
		
		JLabel College_Univercity_label_1 = new JLabel("College/Univercity*");
		College_Univercity_label_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		College_Univercity_label_1.setBounds(57, 89, 137, 20);
		EducationD_Page.add(College_Univercity_label_1);
		
		FromYear1 = new JTextField();
		FromYear1.setForeground(new Color(25, 25, 112));
		FromYear1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		FromYear1.setColumns(10);
		FromYear1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		FromYear1.setBackground(UIManager.getColor("Button.background"));
		FromYear1.setBounds(396, 115, 156, 27);
		EducationD_Page.add(FromYear1);
		
		ToYear1 = new JTextField();
		ToYear1.setForeground(new Color(25, 25, 112));
		ToYear1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		ToYear1.setColumns(10);
		ToYear1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		ToYear1.setBackground(UIManager.getColor("Button.background"));
		ToYear1.setBounds(623, 115, 156, 27);
		EducationD_Page.add(ToYear1);
		
		JLabel To_Year_Label = new JLabel("To Year*");
		To_Year_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		To_Year_Label.setBounds(623, 89, 74, 20);
		EducationD_Page.add(To_Year_Label);
		
		ClgQualification = new JTextField();
		ClgQualification.setForeground(new Color(25, 25, 112));
		ClgQualification.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		ClgQualification.setColumns(10);
		ClgQualification.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		ClgQualification.setBackground(UIManager.getColor("Button.background"));
		ClgQualification.setBounds(57, 188, 231, 27);
		EducationD_Page.add(ClgQualification);
		
		JLabel Qualification_Label_1 = new JLabel("Qualification*");
		Qualification_Label_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Qualification_Label_1.setBounds(57, 162, 100, 20);
		EducationD_Page.add(Qualification_Label_1);
		
		JLabel Description_Label_1 = new JLabel("Description*");
		Description_Label_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Description_Label_1.setBounds(351, 162, 119, 20);
		EducationD_Page.add(Description_Label_1);
		
		ClgDescription = new JTextPane();
		ClgDescription.setForeground(new Color(25, 25, 112));
		ClgDescription.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ClgDescription.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		ClgDescription.setBackground(UIManager.getColor("Button.background"));
		ClgDescription.setBounds(351, 187, 455, 28);
		EducationD_Page.add(ClgDescription);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(34, 239, 789, 2);
		EducationD_Page.add(separator);
		
		FromYear2 = new JTextField();
		FromYear2.setForeground(new Color(25, 25, 112));
		FromYear2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		FromYear2.setColumns(10);
		FromYear2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		FromYear2.setBackground(UIManager.getColor("Button.background"));
		FromYear2.setBounds(396, 279, 156, 27);
		EducationD_Page.add(FromYear2);
		
		JLabel Form_Year_Label_1 = new JLabel("From Year*");
		Form_Year_Label_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Form_Year_Label_1.setBounds(396, 253, 74, 20);
		EducationD_Page.add(Form_Year_Label_1);
		
		ToYear2 = new JTextField();
		ToYear2.setForeground(new Color(25, 25, 112));
		ToYear2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		ToYear2.setColumns(10);
		ToYear2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		ToYear2.setBackground(UIManager.getColor("Button.background"));
		ToYear2.setBounds(623, 279, 156, 27);
		EducationD_Page.add(ToYear2);
		
		JLabel To_Year_Label_1 = new JLabel("To Year*");
		To_Year_Label_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		To_Year_Label_1.setBounds(623, 253, 74, 20);
		EducationD_Page.add(To_Year_Label_1);
		
		SclDescription = new JTextPane();
		SclDescription.setForeground(new Color(25, 25, 112));
		SclDescription.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
//		SclDescription.setColumns(10);
		SclDescription.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		SclDescription.setBackground(UIManager.getColor("Button.background"));
		SclDescription.setBounds(341, 351, 465, 27);
		EducationD_Page.add(SclDescription);
		
		JLabel Description_Label_2 = new JLabel("Description*");
		Description_Label_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Description_Label_2.setBounds(341, 325, 100, 20);
		EducationD_Page.add(Description_Label_2);
		
		JTextField School = new JTextField();
		School.setForeground(new Color(25, 25, 112));
		School.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		School.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		School.setBackground(UIManager.getColor("Button.background"));
		School.setBounds(57, 279, 281, 27);
		EducationD_Page.add(School);
		
		JLabel School_Label = new JLabel("School*");
		School_Label.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		School_Label.setBounds(57, 253, 67, 20);
		EducationD_Page.add(School_Label);
		
		JLabel Qualification_Label_2 = new JLabel("Qualification*");
		Qualification_Label_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Qualification_Label_2.setBounds(57, 325, 100, 20);
		EducationD_Page.add(Qualification_Label_2);
		
		SclQualification = new JTextField();
		SclQualification.setForeground(new Color(25, 25, 112));
		SclQualification.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		SclQualification.setColumns(10);
		SclQualification.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		SclQualification.setBackground(UIManager.getColor("Button.background"));
		SclQualification.setBounds(57, 351, 231, 27);
		EducationD_Page.add(SclQualification);
		
		
		JButton Back_Btn_2 = new JButton("Back");
		Back_Btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
				c.show(frame.getContentPane(), "p1");
							
			}
		});
		
	
		Back_Btn_2.setBorder(new LineBorder(new Color(240, 240, 240), 3, false));
		Back_Btn_2.setForeground(new Color(245, 245, 245));
		Back_Btn_2.setBackground(new Color(0, 0, 128));
		Back_Btn_2.setBounds(265, 413, 82, 29);
		EducationD_Page.add(Back_Btn_2);
		
		JButton Next_Btn_2 = new JButton("Next");
		Next_Btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
				c.show(frame.getContentPane(), "p3");
							
			}
		});
		
		Next_Btn_2.setForeground(new Color(245, 245, 245));
		Next_Btn_2.setBorder(new LineBorder(new Color(240, 240, 240), 3, false));
		Next_Btn_2.setBackground(new Color(0, 0, 128));
		Next_Btn_2.setBounds(470, 413, 82, 29);
		EducationD_Page.add(Next_Btn_2);

		JLabel PageNo2 = new JLabel("2/5");
		PageNo2.setForeground(new Color(128, 128, 128));
		PageNo2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		PageNo2.setBounds(396, 442, 22, 20);
		EducationD_Page.add(PageNo2);
		
		try
		{
//			1.
			JLabel iconmail = new JLabel();
			iconmail.setBounds(554, 115, 27, 27);
			BufferedImage Img = null;
			Img = ImageIO.read(new File("Resume Builder Assets\\-kd.png"));
			Image icon = Img.getScaledInstance(iconmail.getWidth(), iconmail.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format = new ImageIcon(icon);
			iconmail.setIcon(format);
			EducationD_Page.add(iconmail);
			
//			2.
			JLabel iconmail1 = new JLabel();
			iconmail1.setBounds(779, 115, 27, 27);
			BufferedImage Img1 = null;
			Img1 = ImageIO.read(new File("Resume Builder Assets\\-kd.png"));
			Image icon1 = Img1.getScaledInstance(iconmail1.getWidth(), iconmail1.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format1 = new ImageIcon(icon1);
			iconmail1.setIcon(format1);
			EducationD_Page.add(iconmail1);
			
//			3.
			JLabel iconmail3 = new JLabel();
			iconmail3.setBounds(291, 188, 27, 27);
			BufferedImage Img3 = null;
			Img3 = ImageIO.read(new File("Resume Builder Assets\\jTj.png"));
			Image icon3 = Img3.getScaledInstance(iconmail3.getWidth(), iconmail3.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format3 = new ImageIcon(icon3);
			iconmail3.setIcon(format3);

//			5.
			JLabel iconmail5 = new JLabel();
			iconmail5.setBounds(340, 279, 27, 27);
			BufferedImage Img5 = null;
			Img5 = ImageIO.read(new File("Resume Builder Assets\\jV3.png"));
			Image icon5 = Img5.getScaledInstance(iconmail5.getWidth(), iconmail5.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format5 = new ImageIcon(icon5);
			iconmail5.setIcon(format5);
			EducationD_Page.add(iconmail5);
//			6.
			JLabel iconmail6 = new JLabel();
			iconmail6.setBounds(779, 279, 27, 27);
			BufferedImage Img6 = null;
			Img6 = ImageIO.read(new File("Resume Builder Assets\\-kd.png"));
			Image icon6 = Img6.getScaledInstance(iconmail6.getWidth(), iconmail6.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format6 = new ImageIcon(icon6);
			iconmail6.setIcon(format6);
			EducationD_Page.add(iconmail6);
			
			JLabel iconmail61 = new JLabel();
			iconmail61.setBounds(554, 279, 27, 27);
			BufferedImage Img61 = null;
			Img61 = ImageIO.read(new File("Resume Builder Assets\\-kd.png"));
			Image icon61 = Img61.getScaledInstance(iconmail61.getWidth(), iconmail61.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format61 = new ImageIcon(icon61);
			iconmail61.setIcon(format61);
			EducationD_Page.add(iconmail61);
//			7.
			JLabel iconmail7 = new JLabel();
			iconmail7.setBounds(779, 279, 27, 27);
			BufferedImage Img7 = null;
			Img7 = ImageIO.read(new File("Resume Builder Assets\\-kd.png"));
			Image icon7 = Img7.getScaledInstance(iconmail7.getWidth(), iconmail7.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format7 = new ImageIcon(icon7);
			iconmail7.setIcon(format7);
	
//			9.
			JLabel iconmail9 = new JLabel();
			iconmail9.setBounds(291, 188, 27, 27);
			BufferedImage Img9 = null;
			Img9 = ImageIO.read(new File("Resume Builder Assets\\jTj.png"));
			Image icon9 = Img9.getScaledInstance(iconmail9.getWidth(), iconmail9.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format9 = new ImageIcon(icon9);
			iconmail9.setIcon(format9);
			EducationD_Page.add(iconmail9);
			
			JLabel iconmail91 = new JLabel();
			iconmail91.setBounds(291, 351, 27, 27);
			BufferedImage Img91 = null;
			Img91 = ImageIO.read(new File("Resume Builder Assets\\jTj.png"));
			Image icon91 = Img91.getScaledInstance(iconmail91.getWidth(), iconmail91.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format91 = new ImageIcon(icon91);
			iconmail91.setIcon(format91);
			EducationD_Page.add(iconmail91);
//			10.
			JLabel iconmail10 = new JLabel();
			iconmail10.setBounds(340, 115, 27, 27);
			BufferedImage Img10 = null;
			Img10 = ImageIO.read(new File("Resume Builder Assets\\jV3.png"));
			Image icon10 = Img10.getScaledInstance(iconmail10.getWidth(), iconmail10.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format10 = new ImageIcon(icon10);
			iconmail10.setIcon(format10);
			EducationD_Page.add(iconmail10);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
//		============================================================================================================
//		======================================>>>> Projects Details <<<<============================================
//		============================================================================================================
		
		ProjectsD_Page = new JPanel();
		frame.getContentPane().add(ProjectsD_Page, "p3");
		ProjectsD_Page.setLayout(null);
		
		JPanel ProDContainer = new JPanel();
		ProDContainer.setBounds(34, 23, 789, 39);
		ProDContainer.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		ProjectsD_Page.add(ProDContainer);
		
		JLabel ProjectDetails = new JLabel("Projects Details");
		ProjectDetails.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 22));
		ProDContainer.add(ProjectDetails);
		
		JLabel P_Title_Label_1 = new JLabel("Title* :");
		P_Title_Label_1.setBounds(69, 115, 74, 20);
		P_Title_Label_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		ProjectsD_Page.add(P_Title_Label_1);
		
		JLabel Project1 = new JLabel("Project 1");
		Project1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		Project1.setBounds(378, 69, 90, 28);
		ProjectsD_Page.add(Project1);
		
		JLabel P_Link_Label_1 = new JLabel("Link* :");
		P_Link_Label_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		P_Link_Label_1.setBounds(69, 155, 74, 20);
		ProjectsD_Page.add(P_Link_Label_1);
		
		P_Link1 = new JTextField();
		P_Link1.setForeground(new Color(25, 25, 112));
		P_Link1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		P_Link1.setColumns(10);
		P_Link1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		P_Link1.setBackground(UIManager.getColor("Button.background"));
		P_Link1.setBounds(162, 148, 592, 27);
		ProjectsD_Page.add(P_Link1);
		
		P_Title1 = new JTextField();
		P_Title1.setForeground(new Color(25, 25, 112));
		P_Title1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		P_Title1.setColumns(10);
		P_Title1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		P_Title1.setBackground(UIManager.getColor("Button.background"));
		P_Title1.setBounds(162, 109, 592, 27);
		ProjectsD_Page.add(P_Title1);
		
		JLabel P_Description_Label_1 = new JLabel("Description* :");
		P_Description_Label_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		P_Description_Label_1.setBounds(69, 196, 90, 20);
		ProjectsD_Page.add(P_Description_Label_1);
		
		JTextPane P_Description1 = new JTextPane();
		P_Description1.setBounds(162, 187, 592, 36);
		P_Description1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		P_Description1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		P_Description1.setBackground(UIManager.getColor("Button.background"));
		P_Description1.setForeground(new Color(25, 25, 112));
		ProjectsD_Page.add(P_Description1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(211, 211, 211));
		separator_1.setBackground(Color.DARK_GRAY);
		separator_1.setBounds(63, 235, 744, 7);
		ProjectsD_Page.add(separator_1);
		
		JLabel P_Title_Label_2 = new JLabel("Title* :");
		P_Title_Label_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		P_Title_Label_2.setBounds(69, 290, 74, 20);
		ProjectsD_Page.add(P_Title_Label_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Project 2");
		lblNewLabel_4_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(378, 244, 92, 27);
		ProjectsD_Page.add(lblNewLabel_4_1);
		
		JLabel P_Link_Label_2 = new JLabel("Link* :");
		P_Link_Label_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		P_Link_Label_2.setBounds(69, 329, 74, 20);
		ProjectsD_Page.add(P_Link_Label_2);
		
		P_Link2 = new JTextField();
		P_Link2.setForeground(new Color(25, 25, 112));
		P_Link2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		P_Link2.setColumns(10);
		P_Link2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		P_Link2.setBackground(UIManager.getColor("Button.background"));
		P_Link2.setBounds(162, 322, 592, 27);
		ProjectsD_Page.add(P_Link2);
		
		P_Title2 = new JTextField();
		P_Title2.setForeground(new Color(25, 25, 112));
		P_Title2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		P_Title2.setColumns(10);
		P_Title2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		P_Title2.setBackground(UIManager.getColor("Button.background"));
		P_Title2.setBounds(162, 283, 592, 27);
		ProjectsD_Page.add(P_Title2);
		
		JLabel P_Description_Label_2 = new JLabel("Description* :");
		P_Description_Label_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		P_Description_Label_2.setBounds(69, 372, 90, 20);
		ProjectsD_Page.add(P_Description_Label_2);
		
		JTextPane P_Description2 = new JTextPane();
		P_Description2.setForeground(new Color(25, 25, 112));
		P_Description2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		P_Description2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		P_Description2.setBackground(UIManager.getColor("Button.background"));
		P_Description2.setBounds(162, 363, 592, 38);
		ProjectsD_Page.add(P_Description2);
		
		JButton Back_Btn_3 = new JButton("Back");
		Back_Btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
				c.show(frame.getContentPane(), "p2");
			}
		});
		Back_Btn_3.setBounds(265, 413, 82, 29);
		Back_Btn_3.setBackground(new Color(0, 0, 128));
		Back_Btn_3.setForeground(new Color(245, 245, 245));
		Back_Btn_3.setBorder(new LineBorder(new Color(240, 240, 240), 3, false));
		ProjectsD_Page.add(Back_Btn_3);
		
		JButton Next_btn_3 = new JButton("Next");
		Next_btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
				c.show(frame.getContentPane(), "p4");
			}
		});
		Next_btn_3.setBounds(470, 413, 82, 29);
		Next_btn_3.setBackground(new Color(0, 0, 128));
		Next_btn_3.setBorder(new LineBorder(new Color(240, 240, 240), 3, false));
		Next_btn_3.setForeground(new Color(245, 245, 245));
		ProjectsD_Page.add(Next_btn_3);
		
		JLabel PageNo3 = new JLabel("3/5");
		PageNo3.setBounds(396, 442, 22, 20);
		PageNo3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		PageNo3.setForeground(new Color(128, 128, 128));
		ProjectsD_Page.add(PageNo3);
		
		try
		{
//			1.
			JLabel iconmail = new JLabel();
			iconmail.setBounds(759, 148, 27, 27);
			BufferedImage Img = null;
			Img = ImageIO.read(new File("Resume Builder Assets\\Hor.png"));
			Image icon = Img.getScaledInstance(iconmail.getWidth(), iconmail.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format = new ImageIcon(icon);
			iconmail.setIcon(format);
			ProjectsD_Page.add(iconmail);
//			2.
			JLabel iconmail1 = new JLabel();
			iconmail1.setBounds(759, 189, 27, 27);
			BufferedImage Img1 = null;
			Img1 = ImageIO.read(new File("Resume Builder Assets\\e5b.png"));
			Image icon1 = Img1.getScaledInstance(iconmail1.getWidth(), iconmail1.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format1 = new ImageIcon(icon1);
			iconmail1.setIcon(format1);
			ProjectsD_Page.add(iconmail1);
//			3.
			JLabel iconmail3 = new JLabel();
			iconmail3.setBounds(759, 283, 27, 27);
			BufferedImage Img3 = null;
			Img3 = ImageIO.read(new File("Resume Builder Assets\\9aN.png"));
			Image icon3 = Img3.getScaledInstance(iconmail3.getWidth(), iconmail3.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format3 = new ImageIcon(icon3);
			iconmail3.setIcon(format3);
			ProjectsD_Page.add(iconmail3);
//			4.
			JLabel iconmail4 = new JLabel();
			iconmail4.setBounds(759, 322, 27, 27);
			BufferedImage Img4 = null;
			Img4 = ImageIO.read(new File("Resume Builder Assets\\Hor.png"));
			Image icon4 = Img4.getScaledInstance(iconmail4.getWidth(), iconmail4.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format4 = new ImageIcon(icon4);
			iconmail4.setIcon(format4);
			ProjectsD_Page.add(iconmail4);
//			5.
			JLabel iconmail5 = new JLabel();
			iconmail5.setBounds(759, 372, 27, 27);
			BufferedImage Img5 = null;
			Img5 = ImageIO.read(new File("Resume Builder Assets\\e5b.png"));
			Image icon5 = Img5.getScaledInstance(iconmail5.getWidth(), iconmail5.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format5 = new ImageIcon(icon5);
			iconmail5.setIcon(format5);
			ProjectsD_Page.add(iconmail5);
//			6.
			JLabel iconmail6 = new JLabel();
			iconmail6.setBounds(759, 109, 27, 27);
			BufferedImage Img6 = null;
			Img6 = ImageIO.read(new File("Resume Builder Assets\\9aN.png"));
			Image icon6 = Img6.getScaledInstance(iconmail6.getWidth(), iconmail6.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format6 = new ImageIcon(icon6);
			iconmail6.setIcon(format6);
			ProjectsD_Page.add(iconmail6);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
//		============================================================================================================
//		=====================================>>>> Experience Details <<<<===========================================
//		============================================================================================================
		
		ExperienceD_Page = new JPanel();
		frame.getContentPane().add(ExperienceD_Page, "p4");
		ExperienceD_Page.setLayout(null);
		
		JPanel ExpContainers = new JPanel();
		ExpContainers.setBounds(34, 23, 789, 39);
		ExpContainers.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		ExperienceD_Page.add(ExpContainers);
		
		JLabel ExperienceDetails = new JLabel("Experience Details");
		ExperienceDetails.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 22));
		ExpContainers.add(ExperienceDetails);
		
		JLabel Institute_Lanel_1 = new JLabel("Institute/Origination*");
		Institute_Lanel_1.setBounds(56, 88, 134, 16);
		Institute_Lanel_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		ExperienceD_Page.add(Institute_Lanel_1);
		
		InstituteOrigination1 = new JTextField();
		InstituteOrigination1.setForeground(new Color(25, 25, 112));
		InstituteOrigination1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		InstituteOrigination1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		InstituteOrigination1.setBackground(UIManager.getColor("Button.background"));
		InstituteOrigination1.setBounds(56, 116, 207, 25);
		ExperienceD_Page.add(InstituteOrigination1);
		InstituteOrigination1.setColumns(10);
		
		Position1 = new JTextField();
		Position1.setForeground(new Color(25, 25, 112));
		Position1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Position1.setColumns(10);
		Position1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Position1.setBackground(UIManager.getColor("Button.background"));
		Position1.setBounds(313, 116, 207, 25);
		ExperienceD_Page.add(Position1);
		
		JLabel Position_Label_1 = new JLabel("Position*");
		Position_Label_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Position_Label_1.setBounds(313, 88, 68, 16);
		ExperienceD_Page.add(Position_Label_1);
		
		Duration1 = new JTextField();
		Duration1.setForeground(new Color(25, 25, 112));
		Duration1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Duration1.setColumns(10);
		Duration1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Duration1.setBackground(UIManager.getColor("Button.background"));
		Duration1.setBounds(572, 116, 201, 25);
		ExperienceD_Page.add(Duration1);
		
		JLabel Duration_Label_1 = new JLabel("Duration*");
		Duration_Label_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Duration_Label_1.setBounds(572, 88, 68, 16);
		ExperienceD_Page.add(Duration_Label_1);
		
		JTextPane ExpDescription1 = new JTextPane();
		ExpDescription1.setBounds(56, 176, 717, 30);
		ExpDescription1.setBackground(UIManager.getColor("Button.background"));
		ExpDescription1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		ExpDescription1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ExpDescription1.setForeground(new Color(25, 25, 112));
		ExperienceD_Page.add(ExpDescription1);
		
		JLabel Exp_Description_Label_1 = new JLabel("Description*");
		Exp_Description_Label_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Exp_Description_Label_1.setBounds(56, 148, 79, 16);
		ExperienceD_Page.add(Exp_Description_Label_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(192, 192, 192));
		separator_2.setBackground(Color.DARK_GRAY);
		separator_2.setBounds(56, 226, 746, 9);
		ExperienceD_Page.add(separator_2);
		
		JLabel Institute_Lanel_2 = new JLabel("Institute/Origination*");
		Institute_Lanel_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Institute_Lanel_2.setBounds(56, 256, 134, 16);
		ExperienceD_Page.add(Institute_Lanel_2);
		
		JLabel Position_Label_2 = new JLabel("Position*");
		Position_Label_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Position_Label_2.setBounds(313, 256, 68, 16);
		ExperienceD_Page.add(Position_Label_2);
		
		JLabel Duration_Label_2 = new JLabel("Duration*");
		Duration_Label_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Duration_Label_2.setBounds(572, 256, 68, 16);
		ExperienceD_Page.add(Duration_Label_2);
		
		Duration2 = new JTextField();
		Duration2.setForeground(new Color(25, 25, 112));
		Duration2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Duration2.setColumns(10);
		Duration2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Duration2.setBackground(UIManager.getColor("Button.background"));
		Duration2.setBounds(572, 284, 201, 25);
		ExperienceD_Page.add(Duration2);
		
		Position2 = new JTextField();
		Position2.setForeground(new Color(25, 25, 112));
		Position2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Position2.setColumns(10);
		Position2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Position2.setBackground(UIManager.getColor("Button.background"));
		Position2.setBounds(313, 284, 207, 25);
		ExperienceD_Page.add(Position2);
		
		InstituteOrigination2 = new JTextField();
		InstituteOrigination2.setForeground(new Color(25, 25, 112));
		InstituteOrigination2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		InstituteOrigination2.setColumns(10);
		InstituteOrigination2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		InstituteOrigination2.setBackground(UIManager.getColor("Button.background"));
		InstituteOrigination2.setBounds(56, 284, 207, 25);
		ExperienceD_Page.add(InstituteOrigination2);
		
		JLabel Exp_Description_Label_2 = new JLabel("Description*");
		Exp_Description_Label_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Exp_Description_Label_2.setBounds(56, 316, 79, 16);
		ExperienceD_Page.add(Exp_Description_Label_2);
		
		ExpDescription2 = new JTextPane();
		ExpDescription2.setForeground(new Color(25, 25, 112));
		ExpDescription2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ExpDescription2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		ExpDescription2.setBackground(UIManager.getColor("Button.background"));
		ExpDescription2.setBounds(56, 344, 717, 28);
		ExperienceD_Page.add(ExpDescription2);
		

		JButton Back_Btn_4 = new JButton("Back");
		Back_Btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
				c.show(frame.getContentPane(), "p3");
			}
		});
		Back_Btn_4.setBounds(265, 413, 82, 29);
		Back_Btn_4.setBackground(new Color(0, 0, 128));
		Back_Btn_4.setForeground(new Color(245, 245, 245));
		Back_Btn_4.setBorder(new LineBorder(new Color(240, 240, 240), 3, false));
		ExperienceD_Page.add(Back_Btn_4);
		
		JButton Next_btn_4 = new JButton("Next");
		Next_btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
				c.show(frame.getContentPane(), "p5");
			}
		});
		Next_btn_4.setBounds(470, 413, 82, 29);
		Next_btn_4.setBackground(new Color(0, 0, 128));
		Next_btn_4.setBorder(new LineBorder(new Color(240, 240, 240), 3, false));
		Next_btn_4.setForeground(new Color(245, 245, 245));
		ExperienceD_Page.add(Next_btn_4);
		
		JLabel PageNo4 = new JLabel("4/5");
		PageNo4.setBounds(396, 442, 22, 20);
		PageNo4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		PageNo4.setForeground(new Color(128, 128, 128));
		ExperienceD_Page.add(PageNo4);
		
		try
		{
//			1.
			JLabel iconmail = new JLabel();
			iconmail.setBounds(523, 116, 25, 25);
			BufferedImage Img = null;
			Img = ImageIO.read(new File("Resume Builder Assets\\fXI.png"));
			Image icon = Img.getScaledInstance(iconmail.getWidth(), iconmail.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format = new ImageIcon(icon);
			iconmail.setIcon(format);
			ExperienceD_Page.add(iconmail);
//			2.
			JLabel iconmail1 = new JLabel();
			iconmail1.setBounds(773, 116, 25, 25);
			BufferedImage Img1 = null;
			Img1 = ImageIO.read(new File("Resume Builder Assets\\XTc.png"));
			Image icon1 = Img1.getScaledInstance(iconmail1.getWidth(), iconmail1.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format1 = new ImageIcon(icon1);
			iconmail1.setIcon(format1);
			ExperienceD_Page.add(iconmail1);
//			3.
			JLabel iconmail3 = new JLabel();
			iconmail3.setBounds(265, 284, 25, 25);
			BufferedImage Img3 = null;
			Img3 = ImageIO.read(new File("Resume Builder Assets\\1cE.png"));
			Image icon3 = Img3.getScaledInstance(iconmail3.getWidth(), iconmail3.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format3 = new ImageIcon(icon3);
			iconmail3.setIcon(format3);
			ExperienceD_Page.add(iconmail3);
//			4.
			JLabel iconmail4 = new JLabel();
			iconmail4.setBounds(773, 284, 25, 25);
			BufferedImage Img4 = null;
			Img4 = ImageIO.read(new File("Resume Builder Assets\\XTc.png"));
			Image icon4 = Img4.getScaledInstance(iconmail4.getWidth(), iconmail4.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format4 = new ImageIcon(icon4);
			iconmail4.setIcon(format4);
			ExperienceD_Page.add(iconmail4);
//			5.
			JLabel iconmail5 = new JLabel();
			iconmail5.setBounds(523, 284, 25, 25);
			BufferedImage Img5 = null;
			Img5 = ImageIO.read(new File("Resume Builder Assets\\fXI.png"));
			Image icon5 = Img5.getScaledInstance(iconmail5.getWidth(), iconmail5.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format5 = new ImageIcon(icon5);
			iconmail5.setIcon(format5);
			ExperienceD_Page.add(iconmail5);
//			6.
			JLabel iconmail6 = new JLabel();
			iconmail6.setBounds(777, 176, 25, 25);
			BufferedImage Img6 = null;
			Img6 = ImageIO.read(new File("Resume Builder Assets\\e5b.png"));
			Image icon6 = Img6.getScaledInstance(iconmail6.getWidth(), iconmail6.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format6 = new ImageIcon(icon6);
			iconmail6.setIcon(format6);
			ExperienceD_Page.add(iconmail6);
//			7.
			JLabel iconmail7 = new JLabel();
			iconmail7.setBounds(773, 344, 25, 25);
			BufferedImage Img7 = null;
			Img7 = ImageIO.read(new File("Resume Builder Assets\\e5b.png"));
			Image icon7 = Img7.getScaledInstance(iconmail7.getWidth(), iconmail7.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format7 = new ImageIcon(icon7);
			iconmail7.setIcon(format7);
			ExperienceD_Page.add(iconmail7);
//			8.

			JLabel iconmail8 = new JLabel();
			iconmail8.setBounds(265, 116, 25, 25);
			BufferedImage Img8 = null;
			Img8 = ImageIO.read(new File("Resume Builder Assets\\1cE.png"));
			Image icon8 = Img8.getScaledInstance(iconmail8.getWidth(), iconmail8.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon format8 = new ImageIcon(icon8);
			iconmail8.setIcon(format8);
			ExperienceD_Page.add(iconmail8);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
//		============================================================================================================
//		=========================================>>>> Extra Details <<<<============================================
//		============================================================================================================
		
		ExtD_panel = new JPanel();
		frame.getContentPane().add(ExtD_panel, "p5");
		ExtD_panel.setLayout(null);
		JPanel ExtDContainer = new JPanel();
		ExtDContainer.setBounds(34, 23, 789, 39);
		ExtDContainer.setBorder(new LineBorder(new Color(192, 192, 192), 2, true));
		ExtD_panel.add(ExtDContainer);
		
		JLabel ExtraDetails = new JLabel("Extra Details");
		ExtraDetails.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 22));
		ExtDContainer.add(ExtraDetails);
		
		JLabel Skills_Label_1 = new JLabel("Skill 1");
		Skills_Label_1.setBounds(44, 103, 50, 16);
		Skills_Label_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		ExtD_panel.add(Skills_Label_1);
		
		Skill1 = new JTextField();
		Skill1.setForeground(new Color(25, 25, 112));
		Skill1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Skill1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Skill1.setBackground(UIManager.getColor("Button.background"));
		Skill1.setBounds(44, 121, 230, 21);
		ExtD_panel.add(Skill1);
		Skill1.setColumns(10);
		
		JLabel SkillsLanguage = new JLabel("Skills/Language");
		SkillsLanguage.setBounds(61, 74, 149, 29);
		SkillsLanguage.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		ExtD_panel.add(SkillsLanguage);
		
		JLabel Skills_Label_2 = new JLabel("Skill 2");
		Skills_Label_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Skills_Label_2.setBounds(306, 102, 50, 16);
		ExtD_panel.add(Skills_Label_2);
		
		Skill2 = new JTextField();
		Skill2.setForeground(new Color(25, 25, 112));
		Skill2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Skill2.setColumns(10);
		Skill2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Skill2.setBackground(UIManager.getColor("Button.background"));
		Skill2.setBounds(306, 121, 230, 21);
		ExtD_panel.add(Skill2);
		
		JLabel Skills_Label_3 = new JLabel("Skill 3");
		Skills_Label_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Skills_Label_3.setBounds(568, 102, 50, 16);
		ExtD_panel.add(Skills_Label_3);
		
		Skill3 = new JTextField();
		Skill3.setForeground(new Color(25, 25, 112));
		Skill3.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Skill3.setColumns(10);
		Skill3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Skill3.setBackground(UIManager.getColor("Button.background"));
		Skill3.setBounds(568, 121, 230, 21);
		ExtD_panel.add(Skill3);
		
		Skill5 = new JTextField();
		Skill5.setForeground(new Color(25, 25, 112));
		Skill5.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Skill5.setColumns(10);
		Skill5.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Skill5.setBackground(UIManager.getColor("Button.background"));
		Skill5.setBounds(306, 186, 230, 21);
		ExtD_panel.add(Skill5);
		
		Skill4 = new JTextField();
		Skill4.setForeground(new Color(25, 25, 112));
		Skill4.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Skill4.setColumns(10);
		Skill4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Skill4.setBackground(UIManager.getColor("Button.background"));
		Skill4.setBounds(44, 186, 230, 21);
		ExtD_panel.add(Skill4);
		
		JLabel Skills_Label_4 = new JLabel("Skill 4");
		Skills_Label_4.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Skills_Label_4.setBounds(44, 168, 50, 16);
		ExtD_panel.add(Skills_Label_4);
		
		JLabel Skills_Label_5 = new JLabel("Skill 5");
		Skills_Label_5.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Skills_Label_5.setBounds(306, 167, 50, 16);
		ExtD_panel.add(Skills_Label_5);
		
		JLabel Skills_Label_6 = new JLabel("Skill 6");
		Skills_Label_6.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Skills_Label_6.setBounds(568, 167, 50, 16);
		ExtD_panel.add(Skills_Label_6);
		
		Skill6 = new JTextField();
		Skill6.setForeground(new Color(25, 25, 112));
		Skill6.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Skill6.setColumns(10);
		Skill6.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Skill6.setBackground(UIManager.getColor("Button.background"));
		Skill6.setBounds(568, 186, 230, 21);
		ExtD_panel.add(Skill6);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(192, 192, 192));
		separator_3.setBackground(Color.DARK_GRAY);
		separator_3.setBounds(44, 230, 754, 2);
		ExtD_panel.add(separator_3);
		
		Intrust1 = new JTextField();
		Intrust1.setForeground(new Color(25, 25, 112));
		Intrust1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Intrust1.setColumns(10);
		Intrust1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Intrust1.setBackground(UIManager.getColor("Button.background"));
		Intrust1.setBounds(44, 298, 230, 21);
		ExtD_panel.add(Intrust1);
		
		JLabel Intrust_Label_1 = new JLabel("Intrust 1");
		Intrust_Label_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Intrust_Label_1.setBounds(44, 280, 65, 16);
		ExtD_panel.add(Intrust_Label_1);
		
		JLabel Intrust_Label_4 = new JLabel("Intrust 4");
		Intrust_Label_4.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Intrust_Label_4.setBounds(44, 345, 65, 16);
		ExtD_panel.add(Intrust_Label_4);
		
		Intrust4 = new JTextField();
		Intrust4.setForeground(new Color(25, 25, 112));
		Intrust4.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Intrust4.setColumns(10);
		Intrust4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Intrust4.setBackground(UIManager.getColor("Button.background"));
		Intrust4.setBounds(44, 363, 230, 21);
		ExtD_panel.add(Intrust4);
		
		Intrust5 = new JTextField();
		Intrust5.setForeground(new Color(25, 25, 112));
		Intrust5.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Intrust5.setColumns(10);
		Intrust5.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Intrust5.setBackground(UIManager.getColor("Button.background"));
		Intrust5.setBounds(306, 363, 230, 21);
		ExtD_panel.add(Intrust5);
		
		JLabel Intrust_Label_5 = new JLabel("Intrust 5");
		Intrust_Label_5.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Intrust_Label_5.setBounds(306, 344, 65, 16);
		ExtD_panel.add(Intrust_Label_5);
		
		JLabel Intrust_Label_2 = new JLabel("Intrust 2");
		Intrust_Label_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Intrust_Label_2.setBounds(306, 279, 65, 16);
		ExtD_panel.add(Intrust_Label_2);
		
		Intrust2 = new JTextField();
		Intrust2.setForeground(new Color(25, 25, 112));
		Intrust2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Intrust2.setColumns(10);
		Intrust2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Intrust2.setBackground(UIManager.getColor("Button.background"));
		Intrust2.setBounds(306, 298, 230, 21);
		ExtD_panel.add(Intrust2);
		
		Intrust3 = new JTextField();
		Intrust3.setForeground(new Color(25, 25, 112));
		Intrust3.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Intrust3.setColumns(10);
		Intrust3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Intrust3.setBackground(UIManager.getColor("Button.background"));
		Intrust3.setBounds(568, 298, 230, 21);
		ExtD_panel.add(Intrust3);
		
		JLabel Intrust_Label_3 = new JLabel("Intrust 3");
		Intrust_Label_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Intrust_Label_3.setBounds(568, 279, 65, 16);
		ExtD_panel.add(Intrust_Label_3);
		
		JLabel Intrust_Label_6 = new JLabel("Intrust 6");
		Intrust_Label_6.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Intrust_Label_6.setBounds(568, 344, 65, 16);
		ExtD_panel.add(Intrust_Label_6);
		
		Intrust6 = new JTextField();
		Intrust6.setForeground(new Color(25, 25, 112));
		Intrust6.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Intrust6.setColumns(10);
		Intrust6.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Intrust6.setBackground(UIManager.getColor("Button.background"));
		Intrust6.setBounds(568, 363, 230, 21);
		ExtD_panel.add(Intrust6);
		
		JLabel lblNewLabel_8_1 = new JLabel("Intrust");
		lblNewLabel_8_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_8_1.setBounds(61, 244, 65, 29);
		ExtD_panel.add(lblNewLabel_8_1);
		
		JButton Back_btn_5 = new JButton("Back");
		Back_btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
				c.show(frame.getContentPane(), "p4");
			}
		});
		Back_btn_5.setBounds(265, 413, 82, 29);
		Back_btn_5.setBackground(new Color(0, 0, 128));
		Back_btn_5.setForeground(new Color(245, 245, 245));
		Back_btn_5.setBorder(new LineBorder(new Color(240, 240, 240), 3, false));
		ExtD_panel.add(Back_btn_5);
		
		JButton Submit_btn = new JButton("Submit");
		
		Submit_btn.setBounds(470, 413, 82, 29);
		Submit_btn.setBackground(new Color(0, 128, 0));
		Submit_btn.setBorder(new LineBorder(new Color(240, 240, 240), 1, true));
		Submit_btn.setForeground(new Color(245, 245, 245));
		ExtD_panel.add(Submit_btn);
		
		JLabel lblNewLabel_511 = new JLabel("5/5");
		lblNewLabel_511.setBounds(396, 442, 22, 20);
		lblNewLabel_511.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_511.setForeground(new Color(128, 128, 128));
		ExtD_panel.add(lblNewLabel_511);

//		============================================================================================================
//		=========================================>>>> Final Page <<<<===============================================
//		============================================================================================================
		
		Resume_Download_Page = new JPanel();
		frame.getContentPane().add(Resume_Download_Page, "p6");
		Resume_Download_Page.setLayout(null);
		
		JLabel user_full_name = new JLabel("USER FULL NAME");
		user_full_name.setFont(new Font("Dialog", Font.BOLD, 20));
		user_full_name.setBounds(349, 52, 417, 37);
		Resume_Download_Page.add(user_full_name);
		
		JLabel user_email = new JLabel("EMAIL ADDRESS");
		user_email.setForeground(new Color(0, 0, 128));
		user_email.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		user_email.setBounds(213, 116, 251, 30);
		Resume_Download_Page.add(user_email);
		
		JLabel user_phone = new JLabel("USER PHONE");
		user_phone.setForeground(new Color(0, 0, 128));
		user_phone.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		user_phone.setBounds(213, 154, 397, 30);
		Resume_Download_Page.add(user_phone);
		
		JLabel user_address = new JLabel("ADDERSS");
		user_address.setForeground(new Color(0, 0, 128));
		user_address.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		user_address.setBounds(213, 203, 315, 30);
		Resume_Download_Page.add(user_address);
		
		JLabel path = new JLabel("RESUME PATH");
		path.setForeground(new Color(0, 191, 255));
		path.setFont(new Font("Copperplate Gothic Light", Font.ITALIC, 12));
		path.setBounds(245, 245, 417, 24);
		Resume_Download_Page.add(path);
		
		JButton ViewButton = new JButton("VIEW");
	
		ViewButton.setBorder(new LineBorder(new Color(0, 0, 255)));
		ViewButton.setBackground(new Color(30, 144, 255));
		ViewButton.setForeground(Color.WHITE);
		ViewButton.setFont(new Font("Malgun Gothic", Font.BOLD, 14));
		ViewButton.setBounds(323, 298, 179, 26);
		Resume_Download_Page.add(ViewButton);
		
		Submit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				// Write Here Code For Resume Submition
				
				CardLayout c = (CardLayout)(frame.getContentPane().getLayout());
				c.show(frame.getContentPane(), "p6");
				
				
				
				
				
				//presonal Detail
//				------------------
				FName = First_Name.getText();				
				SName = Second_Name.getText();
				EmailId = Email.getText();
				LinkedInId = LinkedIn.getText();
				Citys = City.getText();
				TwitterId = Twitter.getText();
				GitHubId = GitHub.getText();
				FacebookId = Facebook.getText();
				PhoneNo = Phone_Number.getText();
				Addresses = Address.getText();
				
				//Education Details
//				-------------------
				College_Univercity.getText();
				FromYear1.getText();
				ToYear1.getText();
				ClgQualification.getText();
				ClgDescription.getText();				
				School.getText();
				FromYear2.getText();
				ToYear2.getText();
				SclQualification.getText();
				SclDescription.getText();
				
				
				
				//Project Details
//				-----------------
				P_Link1.getText();
				P_Title1.getText();
				P_Description1.getText();
				P_Title2.getText();
				P_Link2.getText();
				P_Description2.getText();
				
				
				//Experience DEtail
//				-------------------
				InstituteOrigination1.getText();
				Position1.getText();
				Duration1.getText();
				ExpDescription1.getText();				
				InstituteOrigination2.getText();
				Position2.getText();
				Duration2.getText();
				ExpDescription2.getText();
				
				//Extra Detalis
//				---------------
				Skill1.getText();
				Skill2.getText();
				Skill3.getText();
				Skill4.getText();
				Skill5.getText();
				Skill6.getText();
				Intrust1.getText();
				Intrust2.getText();
				Intrust3.getText();
				Intrust4.getText();
				Intrust5.getText();
				Intrust6.getText();
				  
//				--------------------------RESUME VIEW PAGE-------------------------------
				user_full_name.setText(First_Name.getText()+" " + Second_Name.getText());
				user_email.setText(Email.getText());
				user_phone.setText("+91"+ Phone_Number.getText());
				user_address.setText(Address.getText() +","+City.getText());
				String resumePtah = "E:/"+ First_Name.getText() +"_"+ Second_Name.getText() +"_Resume.pdf";
				path.setText("PATH:  "+ resumePtah);
//				-------------------------------------------------------------------------
				
				
				System.out.println("--------------------------------------------------------------");
				System.out.println("PDF SAVED");
				System.out.println("PATH:"+"\n"+"\t \t" +"E:/"+ First_Name.getText() +"_"+ Second_Name.getText() +"_Resume.pdf");
				System.out.println("--------------------------------------------------------------");
				System.out.println(FName + " " + SName);	//Temporary print all Values
				System.out.println("Email: " + EmailId);
				System.out.println("Phone Number: " + PhoneNo);
				System.out.println("Facebook: " + FacebookId);
				System.out.println("LinkedIn: " + LinkedInId);
				System.out.println("Twitter: " + TwitterId);
				System.out.println("GitHub: " + GitHubId);
				System.out.println("---------------------------------------------------------------");
				
				try 
				{
					new ResumeTemplate(
							//presonal Detail
//							-------------------
							First_Name.getText(),				
							Second_Name.getText(),
							Email.getText(),
							LinkedIn.getText(),
							City.getText(),
							Twitter.getText(),
							GitHub.getText(),
							Facebook.getText(),
							Phone_Number.getText(),
							Address.getText(),
							
							//Education Details
//							---------------------------
							College_Univercity.getText(),
							FromYear1.getText(),
							ToYear1.getText(),
							ClgQualification.getText(),
							ClgDescription.getText(),				
							School.getText(),
							FromYear2.getText(),
							ToYear2.getText(),
							SclQualification.getText(),
							SclDescription.getText(),
							
							
							
							//Project Details
//							-----------------
							P_Link1.getText(),
							P_Title1.getText(),
							P_Description1.getText(),
							P_Title2.getText(),
							P_Link2.getText(),
							P_Description2.getText(),
							
							
							//Experience DEtail
//							------------------------------
							InstituteOrigination1.getText(),
							Position1.getText(),
							Duration1.getText(),
							ExpDescription1.getText(),				
							InstituteOrigination2.getText(),
							Position2.getText(),
							Duration2.getText(),
							ExpDescription2.getText(),
							
							//Extra Detalis
//							---------------
							Skill1.getText(),
							Skill2.getText(),
							Skill3.getText(),
							Skill4.getText(),
							Skill5.getText(),
							Skill6.getText(),
							Intrust1.getText(),
							Intrust2.getText(),
							Intrust3.getText(),
							Intrust4.getText(),
							Intrust5.getText(),
							Intrust6.getText()
							
							
							);
				} 
				catch (IOException | DocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
		});	
		ViewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
//				vied resume
				try  
				{  
				//constructor of file class having file as argument  
				File file = new File("E://"+ First_Name.getText() +"_"+ Second_Name.getText() +"_Resume.pdf");   
				if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
				{  
				System.out.println("not supported");  
				return;  
				}  
				Desktop desktop = Desktop.getDesktop();  
				if(file.exists())         //checks file exists or not  
				desktop.open(file);              //opens the specified file  
				}  
				catch(Exception excp)  
				{  
				excp.printStackTrace();  
				}  
				}  
		});
	}
	}
