import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.DefaultCaret;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.joda.time.DateTime;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.i18n.phonenumbers.PhoneNumberMatch;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
public class google {

	private JFrame frame;
	protected static ChromeDriver driver2;
	protected static ChromeOptions options2;
    public static JTextArea text;
    public static String path;
    
    public static ChromeOptions options;
    
    public static WebDriver driver;
    
  
    
    public static String l;
    
    public static String ip;
   // static SheetsQuickstart sp = new SheetsQuickstart();
    public static String port;
    
    public static String user;
    
    public static String passw;
    public static ArrayList<String> ar = new ArrayList<String>();
    public static ArrayList<String> ar2 = new ArrayList<String>();
    public static ArrayList<String> ar3 = new ArrayList<String>();
    public static ArrayList<String> links = new ArrayList<String>();
    public static ArrayList<String> lang = new ArrayList<String>();
    public static int off;
    
    public static String addr;
    public static String l_cat;
    public static String country;
    public static boolean ex;
	public static String city;
	public static String state;
	protected static int p;
    
    public static String page_n;
    public static boolean re_p;
    public static int total;
    private static JTextField textField;
    private static JTextField textField_1;
    private static JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private static JTextField textField_6;
    public static Document doc3;
    public static long start;
    public static double seconds2;
    public static boolean Ad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					try{
						Connection myConn =null;
						
				        Statement myStmt=null;
				        ResultSet myRs=null;
				  
				        String dburl="jdbc:mysql://database-1.cuzswbxyyf4l.us-east-2.rds.amazonaws.com:3306/bots";
				        String user="root";
				        String pass="Hacershaun1";
					 myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
			           myStmt=(Statement) myConn.createStatement();
			           String sql ="Select license from bot_v where bot_name='derkleineprinz'";
			           myRs= myStmt.executeQuery(sql);
			           
			           if((myRs.next()))
			           {
			        	   String li = myRs.getString("license");
			        	   if(li.equals("true")){
			        		   google window = new google();
								window.frame.setVisible(true);
			        	   }
			        	   else{
			        		   JOptionPane.showMessageDialog(null, "NO internet connection or something is not right..");
			        	   }
			           }
			           
			           myConn.close();
			           myStmt.close();
			           
			           myRs.close();
			           
					}catch(Exception b)
					{
					 b.printStackTrace();
					}
		
					lang.add("contact");
					
					lang.add("kontakt");
					
					lang.add("kontaktua");
					
					lang.add("кантакт");
					
					lang.add("kontakt");
					
					lang.add("контакт");
					
					lang.add("contacte");
					
					lang.add("kontakt");
					
					lang.add("Kontakt");
					
					lang.add("contact");
					
					
					lang.add("kontakt");
					
					lang.add("ottaa yhteyttä");
					
					lang.add("contact");
					
					lang.add("contacto");
					
					lang.add("Kontakt");
					
					lang.add("Epikoinonía");
					
					lang.add("kapcsolatba lépni");
					
					lang.add("Hafðu samband");
					
					lang.add("teagmháil");
					
					lang.add("contatto");
					
					lang.add("kontakts");
					
					lang.add("kontaktas");
					
					
					lang.add("kuntatt");
					
					
					
					lang.add("kontakt");
					
					lang.add("kontakt");
					
					lang.add("contato");
					
					lang.add("a lua legatura");
					
					
					lang.add("контакт");
					lang.add("контакт");
					
					lang.add("kontakt");
					
					lang.add("contacto");
					
					lang.add("kontakta");
					
					
					lang.add("контакт");
					
					lang.add("cysylltu");
					
					
					lang.add("קאָנטאַקט");
					
					 
					lang.add("联系");
					lang.add("聯繫");
					
					lang.add("liánxì");
					
					lang.add("liánxì");
					
					
					lang.add("اتصل");
					
					lang.add("איש קשר");
					
					lang.add("تماس");
					//String fetchedUrl = getFinalURL("https://www.kroger.com/food-tips/cooking-skills/101-simple-cooking-tips");
				   // System.out.println("FetchedURL is:" + fetchedUrl);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public google() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 667, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GOOGLE SCRAPING BOT");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(145, 17, 371, 27);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {

			//	 String value1 = comboBox.getSelectedItem().toString();
				 
				path=textField.getText();
				if(path.isEmpty() || textField_6.getText().isEmpty() || textField_2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please select excel sheet storing folder / Page number is empty / Search keyword is empty");	
					
				}
				else{
					
				
			            
					
			//           sp.SaveProp("EXCEL_PATH","PROXY","LINK","BIN","EMAIL","NUMBER","EMAIL_SERVICE", path,textField_2.getText(),textField_1.getText(),textField_3.getText(),textField_5.getText(), textField_4.getText(),textField_6.getText());
			            
					JOptionPane.showMessageDialog(null,"Bot started");
				
			
					rebeet();
				 }
				
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
		lblNewLabel_1.setBounds(181, 298, 291, 47);
		frame.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 381, 641, 176);
		frame.getContentPane().add(scrollPane);
		 text = new JTextArea();
		 DefaultCaret caret = (DefaultCaret) text.getCaret();
		 caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		 text.setBackground(Color.GRAY);
		 text.setEditable(false);
			text.setLineWrap(true);
		       text.setWrapStyleWord(true);
		       text.setFont(new Font("Times New Roman", Font.BOLD, 15));
		       scrollPane.setViewportView(text);
		
		JLabel lblRealTimeLog = new JLabel("REALTIME LOG");
		lblRealTimeLog.setForeground(Color.WHITE);
		lblRealTimeLog.setBackground(Color.YELLOW);
		lblRealTimeLog.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRealTimeLog.setHorizontalAlignment(SwingConstants.CENTER);
		lblRealTimeLog.setBounds(10, 356, 641, 14);
		frame.getContentPane().add(lblRealTimeLog);
		
		JLabel lblV = new JLabel("V 4");
		lblV.setForeground(Color.WHITE);
		lblV.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblV.setBounds(10, 19, 60, 19);
		frame.getContentPane().add(lblV);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					 
					 
					 Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"taskkill.exe /F /IM chromedriver.exe /T");
				 }catch(Exception rr)
				 {
					 
				 }
				 System.exit(0);
				
			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 61, 123, 47);
		
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("images/button (29).png")));
		
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblSelectFolder = new JLabel("SELECT FOLDER");
		lblSelectFolder.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectFolder.setForeground(Color.WHITE);
		lblSelectFolder.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSelectFolder.setBackground(Color.YELLOW);
		lblSelectFolder.setBounds(145, 75, 371, 14);
		frame.getContentPane().add(lblSelectFolder);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SampleJFileChooser();
			}
		});
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(145, 138, 371, 56);
		frame.getContentPane().add(label_2);
		
label_2.setIcon(new ImageIcon(getClass().getResource("images/button (46).png")));
		
		
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(181, 107, 291, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_4 = new JLabel("PROXY");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 154, 123, 19);
	//	frame.getContentPane().add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(10, 184, 123, 20);
	//	frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("SEARCH KEYWORD");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(181, 216, 291, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(181, 267, 291, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(528, 267, 123, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPage = new JLabel("PAGE");
		lblPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPage.setForeground(Color.WHITE);
		lblPage.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPage.setBounds(528, 229, 123, 14);
		frame.getContentPane().add(lblPage);
		
		JCheckBox chckbxScrapeAd = new JCheckBox("SCRAPE AD");
		chckbxScrapeAd.addItemListener(new ItemListener() {
			

			public void itemStateChanged(ItemEvent e) {
				

				JCheckBox chckbxNewCheckBox = (JCheckBox) e.getSource();

                // The item affected by the event.
                Object item = e.getItem();

              

                if (e.getStateChange() == ItemEvent.SELECTED) {
                	//textField.setText(item.toString());
                	
                	System.out.println("checked");
                	
                	Ad = true;

                	
                }
                if (e.getStateChange() == ItemEvent.DESELECTED) {
                	Ad = false;
                }
			}
		});
		
		chckbxScrapeAd.setBounds(10, 267, 112, 23);
		frame.getContentPane().add(chckbxScrapeAd);
		
		JLabel lblNewLabel_6 = new JLabel("2CAPTCHA API");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 235, 128, 27);
		//frame.getContentPane().add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(10, 268, 123, 20);
	//	frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("TEST REDIRECT URL");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(502, 157, 149, 14);
	//	frame.getContentPane().add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(502, 184, 149, 20);
	//	frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("RESULT");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String fetchedUrl;
				try {
					fetchedUrl = getFinalURL(textField_4.getText());
					System.out.println("FetchedURL is:" + fetchedUrl);
					textField_5.setText(fetchedUrl);
					textField_5.getGraphics();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 
			}
		});
		btnNewButton.setBounds(539, 264, 89, 23);
		//frame.getContentPane().add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(502, 235, 149, 20);
	//	frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setBounds(0, -13, 617, 592);
	//	frame.getContentPane().add(label);
		
		 ImageIcon img =new ImageIcon(getClass().getResource("images/googlem.jpg"));
	        
	       
	        
	        frame.setIconImage(img.getImage());
	        
	        label.setIcon(new ImageIcon(getClass().getResource("images/ps.jpg")));
	}
	 public void SampleJFileChooser(){
         
	        JFileChooser jFileChooser = new JFileChooser();
	        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        jFileChooser.setCurrentDirectory(new File("/User/alvinreyes"));
	         
	        int result = jFileChooser.showOpenDialog(new JFrame());
	     
	     
	        if (result == JFileChooser.APPROVE_OPTION) {
	            File selectedFile = jFileChooser.getSelectedFile();
	            path=selectedFile.getAbsolutePath();
	            textField.setText(path);
	            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
	        }
	    }
	public static void rebeet(){
		SwingWorker<Void,Void> email = new SwingWorker<Void,Void>()
				{

					private int s;
					private int i;
					private String co_page;
					private int co;
					private String em;
					private String pho;
					private String filename;
					private WebElement link;
					private String fetchedUrl;
					
			

					@Override
					protected Void doInBackground() throws Exception {
						
						
						
					
						try{
							
							DateTime dt = new DateTime();
							
						    // gets the current month
						int hours = dt.getHourOfDay(); // gets hour of day
						
						int min = dt.getMinuteOfHour();
						
						int seconds = dt.getSecondOfMinute();
						
						int YEAR = dt.getYear();
						
						int month = dt.getMonthOfYear(); 
						
						int day = dt.getDayOfMonth();
						
						 try {
					             filename =textField.getText()+"/"+textField_2.getText()+"-("+YEAR+"-"+month+"-"+day+"-"+hours+"-"+min+"-"+seconds+").xls ";
					            HSSFWorkbook workbook = new HSSFWorkbook();
					            HSSFSheet sheet2 = workbook.createSheet("FirstSheet"); 

					           
					            FileOutputStream fileOut = new FileOutputStream(filename);
					            workbook.write(fileOut);
					            fileOut.close();
					            workbook.close();
					            System.out.println("Your excel file has been generated!");

					        } catch ( Exception ex ) {
					            System.out.println(ex);
					        }
							
							
							  InputStream inp = new FileInputStream( filename );
								 Workbook wb = WorkbookFactory.create(inp);
								 Sheet sheet = wb.getSheetAt(0);
								 int ctr  = 1;
								 Row row = null;
							      Cell cell =null; 
							      
							      Cell cell2 =null; 
							      
							      Cell cell3 =null; 
							      Cell cell4 =null;
							      
							      Cell cell5 =null;
							      
							      Cell cell6 =null;
							      
							      Cell cell7 =null;
							      
							      Cell cell8 =null;
							      
							      Cell cell9 =null;
							      
							      Cell cell10 =null;
							      
							      Cell cell11 =null; 
							      row = sheet.getRow(0);
							  
									if(row == null)
									{
										row = sheet.createRow(0);
									}
									
							//		System.out.println("in else :"+w);
									
									cell = row.getCell(0);
									if(cell == null)
									{
										cell = row.createCell(0);
									}
									cell.setCellValue("GOOGLE SEARCH RESULT LINKS");
									cell2 = row.getCell(2);
									if(cell2 == null)
									{
										cell2 = row.createCell(2);
									}
									cell2.setCellValue("EMAIL");
									cell3 = row.getCell(3);
									if(cell3 == null)
									{
										cell3 = row.createCell(3);
									}
									cell3.setCellValue("PHONE NUMBER");
									cell4 = row.getCell(1);
									if(cell4 == null)
									{
										cell4 = row.createCell(1);
									}
									cell4.setCellValue("CONTACT US LINK");
									cell5 = row.getCell(5);
									if(cell5 == null)
									{
										cell5 = row.createCell(5);
									}
									cell5.setCellValue("LOADING TIME");
									cell6 = row.getCell(4);
									if(cell6 == null)
									{
										cell6 = row.createCell(4);
									}
									cell6.setCellValue("WORDPRESS");
									cell7 = row.getCell(6);
									if(cell7 == null)
									{
										cell7 = row.createCell(6);
									}
									cell7.setCellValue("SSL");
									
									cell8 = row.getCell(7);
									if(cell8 == null)
									{
										cell8 = row.createCell(7);
									}
									
									cell8.setCellValue("WOOCOMMERCE");
							//      progressBar.setMaximum(sheet.getLastRowNum());
							  //    progressBar.update(progressBar.getGraphics());
							
									
									FileOutputStream	  save2 = new FileOutputStream(filename);
									wb.write(save2);
									save2.flush();
									save2.close();
									
							int tot_page = Integer.parseInt(textField_6.getText());
									
									String path = new File(".").getCanonicalPath();
									System.out.println("Application path is: "+path);
									if(System.getProperty("os.name").contains("Windows"))
									{
									System.setProperty("webdriver.chrome.driver",""+path+"\\chromedriver\\chromedriver.exe");

									}else
									{
										System.setProperty("webdriver.chrome.driver",""+path+"/chromedriver/chromedriver");
									}
							//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
									
								//	String proxy = cell10.toString();
									
									try{
										String proxy_s1 = textField_1.getText();
										String[] pp = proxy_s1.split ( ":" );
								 ip = pp[0].trim();
									 
									 port = pp[1].trim();
									
									 user = pp[2].trim();
									
									 passw = pp[3].trim();
										}catch(Exception ty)
										{
											
										}
									 Proxy proxy = new Proxy();
										proxy.setHttpProxy(ip+":"+port);
										proxy.setSslProxy(ip+":"+port);
										
									//	proxy.setSocksUsername("J1CVZBUI");
									//	proxy.setSocksPassword("5ACO19PR");
										DesiredCapabilities capabilities = DesiredCapabilities.chrome();
										capabilities.setCapability("proxy", proxy); 
										
									ChromeOptions options2 = new ChromeOptions();
									options2.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
									options2.setExperimentalOption("useAutomationExtension", false);
								//	options2.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36");
				                    options2.addArguments("--disable-blink-features=AutomationControlled");
				                    options2.setCapability("requireWindowFocus", true);
				                    options2.addArguments("--ignore-certificate-errors");
				                    options2.addArguments("start-maximized");
				                   
				                    JFileChooser fr = new JFileChooser();
								     FileSystemView fw = fr.getFileSystemView();
								     
								     File direc = fw.getDefaultDirectory();
								     System.out.println(fw.getDefaultDirectory());
				                //    options2.addArguments("user-data-dir="+fw.getDefaultDirectory()+"\\googlemap");
				                    
				              //      options2.addArguments("user-data-dir="+path+"\\googlemap");
				                    
				                    capabilities.setCapability(ChromeOptions.CAPABILITY, options2);
				                   driver2 = new ChromeDriver(capabilities);
				                   WebDriverWait wait1 = new WebDriverWait(driver2,40);
				                   
				                   Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
									
									 String t2 = String.valueOf(timestamp2);
									 
									 String	st ="["+t2+"] Searching keyword";
									update(st);
									
				                   driver2.get("https://www.google.com/search?q="+textField_2.getText()+"&filter=0&biw=1366&bih=625");
				                   
				                   
				                   
				                 //  WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(" //input[@title='Search']")));
				                  // element1.clear();
				                   
				                  // element1.sendKeys(textField_2.getText());
				                   
				                   
				                   Random r = new Random();
				                   int low = 1000;
									 int high = 5000;
									 
								int	wait   = r.nextInt(high-low) + low;
				                   
								Thread.sleep(wait);
				                  // element1.submit();
								  JavascriptExecutor js = (JavascriptExecutor)driver2; 
				                 
				                   
				                   
				                //   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='result-stats']")));
				                 //  String res = driver2.findElement(By.xpath("//*[@id='result-stats']")).getText();
				                   
				                for (int i=0; i<40; i++){ 
									   try {
									    Thread.sleep(1000);
									    }catch (InterruptedException e) {} 
									   //To check page ready state.
									   if (js.executeScript("return document.readyState").toString().equals("complete")){ 
										   System.out.println("page loaded ");
									    break; 
									   }   
									  }
				                 //  wait1.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id='result-stats']"), res));	
				                  // System.out.println("total search result found : "+res);
				                   
				                 //a[@id='pnnext']
				                   
				                   
				                //   ((//div[@class='r'])[1]//a)[1]
				                		   
				                   for(int i =0;i<10;i++)
									{  
				                   
				                	 
				                	   
									
									   
									List<WebElement> tot_res = driver2.findElements(By.xpath("//div[@class='rc']"));	
									
									
									System.out.println("total result found in the page: "+tot_res.size());
									if(Ad == true)
									{
									List<WebElement> tot_res2 = driver2.findElements(By.xpath("//a[@data-pcu]"));

									System.out.println("total add found in the page: "+tot_res2.size());
									
									
									for(int u=0;u<tot_res2.size();u++)
									{
										tot_res.add(tot_res2.get(u));
									}
									System.out.println("total result found in the page: "+tot_res.size());
									}
									for(int j=1;j<=tot_res.size();j++)
									{
									
										try{
										 link = driver2.findElement(By.xpath("((//div[@class='rc'])["+j+"]//a)[1]"));
										 System.out.println(link.getAttribute("href"));
											fetchedUrl = getFinalURL(link.getAttribute("href"));
										}catch(Exception vh)
										{
										// link = driver2.findElement(By.xpath("//*[@class='gBIQub KETUZd qzEoUe']["+j+"]//span"));
										 link	=  tot_res.get(j-1);
										 System.out.println(link.getAttribute("data-pcu"));
										 fetchedUrl = getFinalURL(link.getAttribute("data-pcu"));
										}
										
									    System.out.println("FetchedURL is:" + fetchedUrl);
									    
									    int	w=1;
										int	 cj = sheet.getLastRowNum();

											while (cj > 0) {

											Row	 row2 = sheet.getRow(w);
												if (row2 == null) {
													row2 = sheet.createRow(w);

												}

												Cell c = null;
												Cell c2 = null;
												c = row2.getCell(0);
												if (c == null) {
													c = row2.createCell(0);
												}

												// c2=row2.getCell(0);
												String em = c.toString();
												if ((em.isEmpty()))

												{
													// System.out.println("lego will start updating
													// from row: "+row_int);

												//	st = "bot will start saving accounts details from row: " + w;
													//update(st);
												//	Thread.sleep(5000);

													break;
												} else {

													w++;

												}
											}
											
												row=sheet.getRow(w);
												if(row == null)
												{
													row = sheet.createRow(w);
												}
												
												System.out.println("in else :"+w);
												
												cell = row.getCell(0);
												if(cell == null)
												{
													cell = row.createCell(0);
												}
												cell2 = row.getCell(2);
												if(cell2 == null)
												{
													cell2 = row.createCell(2);
												}
												
												cell3 = row.getCell(3);
												if(cell3 == null)
												{
													cell3 = row.createCell(3);
												}
												cell4 = row.getCell(1);
												if(cell4 == null)
												{
													cell4 = row.createCell(1);
												}
												
												cell5 = row.getCell(5);
												if(cell5 == null)
												{
													cell5 = row.createCell(5);
												}
												cell6 = row.getCell(4);
												if(cell6 == null)
												{
													cell6 = row.createCell(4);
												}
												cell7 = row.getCell(6);
												if(cell7 == null)
												{
													cell7 = row.createCell(6);
												}
												cell8 = row.getCell(7);
												if(cell8 == null)
												{
													cell8 = row.createCell(7);
												}
												try{
									    Document doc = Jsoup.connect(fetchedUrl).get();
									    URI uri = new URI(fetchedUrl);
								       String domain = uri.getHost();
									//    String domain = "tasis.ch" ;
								        System.out.println("domain is:" + domain);
								        /*
								        if(domain.contains("www")||domain.contains("WWW") )
								        {
								        	domain = domain.replaceAll("www.", "");
								        	
								        }
								        System.out.println("domain after removing www is:" + domain);
								        */
								      
								        try{
								       
								        if(fetchedUrl.contains("https"))
								        {
								        	 start = System.nanoTime();
								   doc3 = Jsoup.connect("https://"+domain).get();
								   cell7.setCellValue("Y");
								   Long end = System.nanoTime();
							        long elapsedTime = end - start;
							     seconds2 = (double) elapsedTime / 1000000000.0;
							        
							        System.out.println("website took:" + seconds2);
								        }else{
								        
								        	
								        		start = System.nanoTime();
								        		doc3 = Jsoup.connect("http://"+domain).get();
								        		cell7.setCellValue("N");
								        		  Long end = System.nanoTime();
											        long elapsedTime = end - start;
											        seconds2 = (double) elapsedTime / 1000000000.0;
											        
											        System.out.println("website took:" + seconds2);
								        	}
								        	  try{
									        	  Document doc4 = Jsoup.connect("https://"+domain+"/wp-admin").get();
									        	  
									        	  System.out.println(doc4.getElementById("user_login").toString());
									        	  
									        	  cell6.setCellValue("Y");
									        	 
									        //	  cell7.setCellValue("Y");
									        }catch(Exception g)
									        {
									        	try{
									        	 Document doc4 = Jsoup.connect("http://"+domain+"/wp-admin").get();
									        	  
									        	  System.out.println(doc4.getElementById("user_login").toString());
									        	  cell6.setCellValue("N");
									        	}catch(Exception ff)
									        	{
									        		cell6.setCellValue("N");
									        	}
									        	// cell7.setCellValue("Y");
									        	// cell7.setCellValue("N");
									        }
								   //    Document doc3 = Jsoup.connect("https://www.fis.edu/").get();	
								      
								        
								        Elements linksOnPage2 = doc3.getAllElements();
								          for (Element page2 : linksOnPage2) {
								              
									            //	getPageLinks(page.attr("abs:href"));
									            	
									          // 	System.out.println(page.attr("abs:href"));
								        	  
								        	  
								        	 
								        		  
								        		  if(((page2.text().contains("WooCommerce") || (page2.text().contains("wooCommerce")||(page2.text().contains("wooommerce"))))))
									        		  
									        	  {
									        		  cell8.setCellValue("Y");
									        		  break;
									        		 
									        	  }else{
									        		  cell8.setCellValue("N");
									        	  }
								        		  
								        		
								        		 
								        	  
                                          
								        	  
								          }
								    	cell5.setCellValue(seconds2+" s");
								    	
									    Elements elts = doc3.select("a");
									    for (Element page2 : elts) {
									  System.out.println("url is:" + page2.attr("abs:href").toString());
									  System.out.println("text is:" + page2.ownText().toString());
									  if(page2.attr("abs:href").toString().contains("@"))
									  {
										  ar.add(page2.attr("abs:href").toString());
									  }
									  String final_s = page2.ownText().toString().toLowerCase();
									  String final_s2 = page2.attr("abs:href").toString().toLowerCase();
									  
									  boolean check = false;
									  
									  for(int l=0;l<lang.size();l++)
									  {
										  if(final_s.equals(""))
										  {
											  String are = lang.get(l).toString();
											  if(final_s2.contains(are))
											  {
												  System.out.println("found in array text is:" + final_s2);
												  check = true;
												  break;
											  }
										  }else
										  {
											  String are = lang.get(l).toString();
										  if(final_s.contains(are))
										  {
											  System.out.println("found in array text is:" + final_s);
											  check = true;
											  break;
										  }
									  }
									  }
									   co=0;
									 co_page ="";
								       if(domain.contains("www")||domain.contains("WWW") )
								        {
								        	domain = domain.replaceAll("www.", "");
								        	
								        }
								        System.out.println("domain after removing www is:" + domain);
									   // if((page2.attr("abs:href").toString().contains(domain))&& ((page2.attr("abs:href").toString().contains("CONTACT")||(page2.attr("abs:href").toString().contains("Contact")||(page2.attr("abs:href").toString().contains("contact") ||(page2.ownText().toString().contains("contact") ||(page2.ownText().toString().contains("Contact") ||(page2.ownText().toString().contains("CONTACT")))))))))
									 if((page2.attr("abs:href").toString().contains(domain))&& (check == true))
									    	
									    
									    {
									    	co=1;
									    	co_page=page2.attr("abs:href").toString();
									    	cell4.setCellValue(co_page);
									    	  System.out.println("contact url is:" + page2.attr("abs:href").toString());
									    
									    
									    Document    document = Jsoup.connect(page2.attr("abs:href").toString()).get();
								          //3. Parse the HTML to extract links to other URLs
								      //    Elements linksOnPage = document.select("a[href]");
									  
										  Elements linksOnPage = document.getAllElements();
								          for (Element page : linksOnPage) {
								              
									            //	getPageLinks(page.attr("abs:href"));
									            	
									          // 	System.out.println(page.attr("abs:href"));
								        	 
								        	  
								        	  if(page.text().contains("@"))
								        	  {
								        		  Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(page.text());
								        		    while (m.find()) {
								        		    	if(ar.toString().contains(m.group()))
								        		    	{
								        		    		
								        		    	}else{
								        		    	ar.add(m.group());
								        		    	
								        		        System.out.println(m.group());
								        		        
								        		    	}
								        		    }
								        		//  System.out.println(page.text());
								        	  }
								        	  
								        	  if(page.text().contains("+")||page.text().matches(".*\\d.*"))
								        	  {
								        		  /*
								        		  Matcher m = Pattern.compile("[+0-9]+[0-9]").matcher(page.text());
								        		    while (m.find()) {
								        		        System.out.println(m.group());
								        		    }
								        		    */
								        		//  System.out.println(page.text());
								        		  Iterator<PhoneNumberMatch> existsPhone=PhoneNumberUtil.getInstance().findNumbers(page.text(), "US").iterator();

								          	    while (existsPhone.hasNext()){
								          	    	String pn = existsPhone.next().rawString();
								          	    //	System.out.println(existsPhone.next().rawString());
								          	    	
								          	    	if(ar2.toString().contains(pn))
								    		    	{
								    		    		
								    		    	}else{
								    		    	ar2.add(pn);
								    		      //  System.out.println(m.group());
								    		    	
								    		    	
								    		    	 System.out.println(pn);
								    		    	}
								    		    	
								          	       
								          	    }
								        	  }
								        	  
								        
								          }
								          break;
									    }
									    
									    }
									}catch(Exception fg)
									{
									}
									}catch(Exception ffk)
									{
									}
											cell.setCellValue(fetchedUrl.toString());
											
											// Remove duplicates 
									        ArrayList<String> 
									            newList = removeDuplicates(ar); 
									  
									        // Print the ArrayList with duplicates removed 
									        System.out.println("ArrayList with duplicates removed: "
									                           + newList); 
									     // Remove duplicates 
									        ArrayList<String> 
									            newList2 = removeDuplicates(ar2); 
									  
									        // Print the ArrayList with duplicates removed 
									        System.out.println("ArrayList2 with duplicates removed: "
									                           + newList2); 
											 em = "";
											try{
												
											for(int e=0;e<4;e++)
											{
												em=em.concat(ar.get(e).toString()+" ,");
												
											}
											cell2.setCellValue(em);
											}catch(Exception gj)
											{
												gj.printStackTrace();
												cell2.setCellValue(em);
											}
											 pho = "";
											try{
												
											for(int e=0;e<4;e++)
											{
												pho=pho.concat(ar2.get(e).toString()+" ,");
														
												
											}
												cell3.setCellValue(pho.toString());
											}catch(Exception hg)
											{
												hg.printStackTrace();
												cell3.setCellValue(pho.toString());
											}
											
											FileOutputStream	  save = new FileOutputStream(filename);
											wb.write(save);
											save.flush();
											save.close();
											
											ar.clear();
											ar2.clear();

											 timestamp2 = new Timestamp(System.currentTimeMillis());
												
											  t2 = String.valueOf(timestamp2);
											 
											 	st ="["+t2+"] Link :"+j+" is saved successfully";
											update(st);
										
									}
									
				                
									
						//			
									
								//	System.out.println("link is :"+link);
									
								//	WebDriverWait wait1 = new WebDriverWait(driver2,40);
									//driver2.get("https://www.google.com/");
									
									
								
							
								
								
//progressBar.setValue(w);;
//progressBar.update(progressBar.getGraphics());

//cell11.setCellValue("completed");



//driver2.close();

//driver2.quit();

Thread.sleep(2000);

timestamp2 = new Timestamp(System.currentTimeMillis());

t2 = String.valueOf(timestamp2);

	st ="["+t2+"]  Entry completed for current page";
update(st);
try{
if(driver2.findElement(By.xpath("//a[@id='pnnext']")).isDisplayed())
{
//	res = driver2.findElement(By.xpath("//*[@id='result-stats']")).getText();
//	driver2.findElement(By.xpath("//a[@id='pnnext']")).click();
	tot_page--;
	if(tot_page<=0)
	{
		timestamp2 = new Timestamp(System.currentTimeMillis());

		t2 = String.valueOf(timestamp2);

			st ="["+t2+"]  All the pages have been scrapped successfully!";
			update(st);
		break;
	}else{
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='pnnext']"))).click();
	
	
	Thread.sleep(3000);
	
	  for ( i=0; i<40; i++){ 
		   try {
		    Thread.sleep(1000);
		    }catch (InterruptedException e) {} 
		   //To check page ready state.
		   if (js.executeScript("return document.readyState").toString().equals("complete")){ 
			   
		    break; 
		   }   
		  }
    
    
 //   wait1.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id='result-stats']"), res));
    
    low = 3000;
		  high = 6000;
		 
		wait   = r.nextInt(high-low) + low;
    
	Thread.sleep(wait);
}
	i=0;
}
else{
	break;
}
}catch(Exception dg)
{
	timestamp2 = new Timestamp(System.currentTimeMillis());

	t2 = String.valueOf(timestamp2);

		st ="["+t2+"]  All the pages have been scrapped successfully!";
		
		update(st);
	break;
}


								}
							}
							
		                 
								
								
		                    
						catch(Exception y)
						{
							y.printStackTrace();
							
							 StringWriter sw = new StringWriter();
							 y.printStackTrace(new PrintWriter(sw));
					            String exceptionAsString = sw.toString();
					            System.out.println(exceptionAsString);
						 JOptionPane.showMessageDialog(null, ""+exceptionAsString+"",
							      "ERROR!", JOptionPane.ERROR_MESSAGE);
							      
					//	 driver2.close();
						// driver2.quit();
						// Thread.sleep(10000);
					//	 rebeet();
						}
						
						
							return null;
					}
			
				};
				email.execute();
				
	}
	
	private static void update(String st) {
		
		text.append("\n"+st);
		
		text.update(text.getGraphics());
		
		text.repaint();

		
}
	  public static void exist( )  {
		   	 ex=true;
		   	

		 	}
	  
	  public static void allarr(ArrayList<String> ar2 )  {
		   	 
for(int y=0;y<ar2.size();y++)
{
	ar.add(ar2.get(y));
//	System.out.println(ar2.get(y));
}
		 	}
	  
	  
		public static String getFinalURL(String url) throws IOException {
			try{
			System.setProperty("http.agent", "Mozilla/5.0");
		//	System.setProperty("sun.net.client.defaultConnectTimeout", "15000");
		//	System.setProperty("sun.net.client.defaultReadTimeout", "15000");
		    HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
		    con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
		    con.setInstanceFollowRedirects(false);
		    con.setConnectTimeout(10000);
		    con.setReadTimeout(10000);//This is to prevent url connection hangs
		    con.setRequestProperty("Connection", "close");
		   // con.setConnectTimeout(15 * 1000);
		     // con.setRequestMethod("GET");
		    con.connect();
		    con.getInputStream();
		    if (con.getResponseCode() == HttpURLConnection.HTTP_MOVED_PERM || con.getResponseCode() == HttpURLConnection.HTTP_MOVED_TEMP) {
		        String redirectUrl = con.getHeaderField("Location");
		        return getFinalURL(redirectUrl);
		    }
			}catch(Exception f)
			{
				f.printStackTrace();
			}
		    return url;
		}
		
		 public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
		    { 
		  
		        // Create a new ArrayList 
		        ArrayList<T> newList = new ArrayList<T>(); 
		  
		        // Traverse through the first list 
		        for (T element : list) { 
		  
		            // If this element is not present in newList 
		            // then add it 
		            if (!newList.contains(element)) { 
		  
		                newList.add(element); 
		            } 
		        } 
		  
		        // return the new list 
		        return newList; 
		    } 
}
