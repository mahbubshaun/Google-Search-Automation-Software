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
    public static ArrayList<String> dup = new ArrayList<String>();
    public static ArrayList<String> ar2 = new ArrayList<String>();
    public static ArrayList<String> ar3 = new ArrayList<String>();
    public static ArrayList<String> links = new ArrayList<String>();
    public static ArrayList<String> lang;
    public static int off;
    public static String addr;
    public static String l_cat;
    public static String country;
    public static boolean ex;
    public static String city;
    public static String state;
    public static String page_n;
    public static boolean re_p;
    public static int total;
    public static Document doc3;
    public static long start;
    public static double seconds2;
    public static boolean Ad;
    protected static ChromeDriver driver2;
    protected static ChromeOptions options2;
    protected static int p;
    private static JTextField textField;
    private static JTextField textField_1;
    private static JTextField textField_2;
    private static JTextField textField_6;
    private JFrame frame;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    /**
     * Create the application.
     */
    public google() {
        initialize();
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    google window = new google();
                    window.frame.setVisible(true);
                    lang = new ArrayList<>(Arrays.asList(
                            "contact",
                            "kontakt",
                            "kontaktua",
                            "кантакт",
                            "kontakt",
                            "контакт",
                            "contacte",
                            "kontakt",
                            "Kontakt",
                            "contact",
                            "kontakt",
                            "ottaa yhteyttä",
                            "contact",
                            "contacto",
                            "Kontakt",
                            "Epikoinonía",
                            "kapcsolatba lépni",
                            "Hafðu samband",
                            "teagmháil",
                            "contatto",
                            "kontakts",
                            "kontaktas",
                            "kuntatt",
                            "kontakt",
                            "kontakt",
                            "contato",
                            "a lua legatura",
                            "контакт",
                            "контакт",
                            "kontakt",
                            "contacto",
                            "kontakta",
                            "контакт",
                            "cysylltu",
                            "קאָנטאַקט",
                            "联系",
                            "聯繫",
                            "liánxì",
                            "liánxì",
                            "اتصل",
                            "איש קשר",
                            "تماس"
                    ));


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void startScrapingProcess() {
        SwingWorker<Void, Void> email = new SwingWorker<Void, Void>() {

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


                try {

                    DateTime dt = new DateTime();

                    // gets the current month
                    int hours = dt.getHourOfDay(); // gets hour of day

                    int min = dt.getMinuteOfHour();

                    int seconds = dt.getSecondOfMinute();

                    int YEAR = dt.getYear();

                    int month = dt.getMonthOfYear();

                    int day = dt.getDayOfMonth();
                    InputStream inp = new FileInputStream(textField.getText());
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheetAt(0);
                    int ctr = 1;
                    Row row = null;
                    Cell cell = null;

                    Cell cell2 = null;

                    Cell cell3 = null;
                    Cell cell4 = null;

                    Cell cell5 = null;

                    Cell cell6 = null;

                    Cell cell7 = null;

                    Cell cell8 = null;

                    Cell cell9 = null;

                    Cell cell10 = null;

                    Cell cell11 = null;
                    row = sheet.getRow(0);

                    if (row == null) {
                        row = sheet.createRow(0);
                    }

                    //		System.out.println("in else :"+w);

                    cell = row.getCell(0);
                    if (cell == null) {
                        cell = row.createCell(0);
                    }
                    cell.setCellValue("KEYWORD");
                    cell2 = row.getCell(2);
                    if (cell2 == null) {
                        cell2 = row.createCell(2);
                    }
                    cell2.setCellValue("CONTACT US PAGE LINK");
                    cell3 = row.getCell(3);
                    if (cell3 == null) {
                        cell3 = row.createCell(3);
                    }
                    cell3.setCellValue("EMAIL 1");
                    cell4 = row.getCell(1);
                    if (cell4 == null) {
                        cell4 = row.createCell(1);
                    }
                    cell4.setCellValue("GOOGLE SEARCH LINK");
                    cell5 = row.getCell(5);
                    if (cell5 == null) {
                        cell5 = row.createCell(5);
                    }
                    cell5.setCellValue("EMAIL 3");
                    cell6 = row.getCell(4);
                    if (cell6 == null) {
                        cell6 = row.createCell(4);
                    }
                    cell6.setCellValue("EMAIL 2");

                    cell7 = row.getCell(6);
                    if (cell7 == null) {
                        cell7 = row.createCell(6);
                    }
                    cell7.setCellValue("PHONE 1");
                    cell8 = row.getCell(7);
                    if (cell8 == null) {
                        cell8 = row.createCell(7);
                    }
                    cell8.setCellValue("PHONE 2");
                    cell9 = row.getCell(8);
                    if (cell9 == null) {
                        cell9 = row.createCell(8);
                    }
                    cell9.setCellValue("PHONE 3");


                    FileOutputStream save2 = new FileOutputStream(textField.getText());
                    wb.write(save2);
                    save2.flush();
                    save2.close();

                    for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                        try {
                            row = sheet.getRow(i);
                            cell10 = row.getCell(1);

                            URI uri2 = new URI(cell10.toString());
                            String domain2 = uri2.getHost();
                            if (!dup.contains(domain2)) {
                                dup.add(domain2);
                            }
                        } catch (Exception dg) {

                        }
                    }
                    int tot_page = Integer.parseInt(textField_6.getText());

                    String path = new File(".").getCanonicalPath();
                    System.out.println("Application path is: " + path);
                    if (System.getProperty("os.name").contains("Windows")) {
                        System.setProperty("webdriver.chrome.driver", "" + path + "\\chromedriver\\chromedriver.exe");

                    } else {
                        System.setProperty("webdriver.chrome.driver", "" + path + "/chromedriver/chromedriver");
                    }


                    try {
                        String proxy_s1 = textField_1.getText();
                        String[] pp = proxy_s1.split(":");
                        ip = pp[0].trim();

                        port = pp[1].trim();

                        user = pp[2].trim();

                        passw = pp[3].trim();
                    } catch (Exception ty) {

                    }
                    Proxy proxy = new Proxy();
                    proxy.setHttpProxy(ip + ":" + port);
                    proxy.setSslProxy(ip + ":" + port);

                    //	proxy.setSocksUsername("J1CVZBUI");
                    //	proxy.setSocksPassword("5ACO19PR");
                    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                    capabilities.setCapability("proxy", proxy);

                    ChromeOptions options2 = new ChromeOptions();
                    options2.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
                    options2.setExperimentalOption("useAutomationExtension", false);

                    options2.addArguments("--disable-blink-features=AutomationControlled");
                    options2.setCapability("requireWindowFocus", true);
                    options2.addArguments("--ignore-certificate-errors");
                    options2.addArguments("start-maximized");

                    JFileChooser fr = new JFileChooser();
                    FileSystemView fw = fr.getFileSystemView();

                    File direc = fw.getDefaultDirectory();
                    System.out.println(fw.getDefaultDirectory());


                    options2.addArguments("user-data-dir=" + path + "/googlemap");

                    capabilities.setCapability(ChromeOptions.CAPABILITY, options2);
                    driver2 = new ChromeDriver(capabilities);
                    WebDriverWait wait1 = new WebDriverWait(driver2, 40);

                    Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

                    String t2 = String.valueOf(timestamp2);

                    String st = "[" + t2 + "] Searching keyword";
                    update(st);

                    driver2.get("https://www.google.com/search?q=" + textField_2.getText() + "&filter=0&biw=1366&bih=625");

                    Random r = new Random();
                    int low = 1000;
                    int high = 5000;

                    int wait = r.nextInt(high - low) + low;

                    Thread.sleep(wait);
                    JavascriptExecutor js = (JavascriptExecutor) driver2;


                    for (int i = 0; i < 40; i++) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                        if (js.executeScript("return document.readyState").toString().equals("complete")) {
                            System.out.println("page loaded ");
                            break;
                        }
                    }

                    for (int i = 0; i < 10; i++) {

                        List<WebElement> tot_res = driver2.findElements(By.xpath("//div[@class='rc']"));


                        System.out.println("total result found in the page: " + tot_res.size());
                        if (Ad == true) {
                            List<WebElement> tot_res2 = driver2.findElements(By.xpath("//a[@data-pcu]"));

                            System.out.println("total add found in the page: " + tot_res2.size());


                            for (int u = 0; u < tot_res2.size(); u++) {
                                tot_res.add(tot_res2.get(u));
                            }
                            System.out.println("total result found in the page: " + tot_res.size());
                        }
                        for (int j = 1; j <= tot_res.size(); j++) {

                            try {
                                link = driver2.findElement(By.xpath("((//div[@class='rc'])[" + j + "]//a)[1]"));
                                System.out.println(link.getAttribute("href"));
                                fetchedUrl = getFinalURL(link.getAttribute("href"));
                            } catch (Exception vh) {
                                link = tot_res.get(j - 1);
                                System.out.println(link.getAttribute("data-pcu"));
                                fetchedUrl = getFinalURL(link.getAttribute("data-pcu"));
                            }

                            System.out.println("FetchedURL is:" + fetchedUrl);

                            int w = 1;
                            int cj = sheet.getLastRowNum();

                            while (cj > 0) {

                                Row row2 = sheet.getRow(w);
                                if (row2 == null) {
                                    row2 = sheet.createRow(w);

                                }

                                Cell c = null;
                                Cell c2 = null;
                                c = row2.getCell(0);
                                if (c == null) {
                                    c = row2.createCell(0);
                                }

                                String em = c.toString();
                                if ((em.isEmpty())) {

                                    break;
                                } else {

                                    w++;

                                }
                            }

                            row = sheet.getRow(w);
                            if (row == null) {
                                row = sheet.createRow(w);
                            }

                            System.out.println("in else :" + w);

                            cell = row.getCell(0);
                            if (cell == null) {
                                cell = row.createCell(0);
                            }
                            cell2 = row.getCell(2);
                            if (cell2 == null) {
                                cell2 = row.createCell(2);
                            }

                            cell3 = row.getCell(3);
                            if (cell3 == null) {
                                cell3 = row.createCell(3);
                            }
                            cell4 = row.getCell(1);
                            if (cell4 == null) {
                                cell4 = row.createCell(1);
                            }

                            cell5 = row.getCell(5);
                            if (cell5 == null) {
                                cell5 = row.createCell(5);
                            }
                            cell6 = row.getCell(4);
                            if (cell6 == null) {
                                cell6 = row.createCell(4);
                            }
                            cell7 = row.getCell(6);
                            if (cell7 == null) {
                                cell7 = row.createCell(6);
                            }

                            cell8 = row.getCell(7);
                            if (cell8 == null) {
                                cell8 = row.createCell(7);
                            }

                            cell9 = row.getCell(8);
                            if (cell9 == null) {
                                cell9 = row.createCell(8);
                            }

                            try {
                                Document doc = Jsoup.connect(fetchedUrl).get();
                                URI uri = new URI(fetchedUrl);
                                String domain = uri.getHost();

                                System.out.println("domain is:" + domain);

                                if (!dup.contains(domain)) {
                                    dup.add(domain);
                                    cell.setCellValue(textField_2.getText());
                                    try {

                                        if (fetchedUrl.contains("https")) {
                                            start = System.nanoTime();
                                            doc3 = Jsoup.connect("https://" + domain).get();
                                            Long end = System.nanoTime();
                                            long elapsedTime = end - start;
                                            seconds2 = (double) elapsedTime / 1000000000.0;

                                            System.out.println("website took:" + seconds2);
                                        } else {


                                            start = System.nanoTime();
                                            doc3 = Jsoup.connect("http://" + domain).get();
                                            Long end = System.nanoTime();
                                            long elapsedTime = end - start;
                                            seconds2 = (double) elapsedTime / 1000000000.0;

                                            System.out.println("website took:" + seconds2);
                                        }
                                        try {
                                            Document doc4 = Jsoup.connect("https://" + domain + "/wp-admin").get();

                                            System.out.println(doc4.getElementById("user_login").toString());


                                        } catch (Exception g) {
                                            try {
                                                Document doc4 = Jsoup.connect("http://" + domain + "/wp-admin").get();

                                                System.out.println(doc4.getElementById("user_login").toString());

                                            } catch (Exception ff) {

                                            }

                                        }


                                        Elements linksOnPage2 = doc3.getAllElements();
                                        for (Element page2 : linksOnPage2) {

                                            if (((page2.text().contains("WooCommerce") || (page2.text().contains("wooCommerce") || (page2.text().contains("wooommerce")))))) {
                                                break;

                                            }


                                        }

                                        Elements elts = doc3.select("a");
                                        for (Element page2 : elts) {
                                            System.out.println("url is:" + page2.attr("abs:href").toString());
                                            System.out.println("text is:" + page2.ownText().toString());
                                            if (page2.attr("abs:href").toString().contains("@")) {
                                                ar.add(page2.attr("abs:href").toString());
                                            }
                                            String final_s = page2.ownText().toString().toLowerCase();
                                            String final_s2 = page2.attr("abs:href").toString().toLowerCase();

                                            boolean check = false;

                                            for (int l = 0; l < lang.size(); l++) {
                                                if (final_s.equals("")) {
                                                    String are = lang.get(l).toString();
                                                    if (final_s2.contains(are)) {
                                                        System.out.println("found in array text is:" + final_s2);
                                                        check = true;
                                                        break;
                                                    }
                                                } else {
                                                    String are = lang.get(l).toString();
                                                    if (final_s.contains(are)) {
                                                        System.out.println("found in array text is:" + final_s);
                                                        check = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            co = 0;
                                            co_page = "";
                                            if (domain.contains("www") || domain.contains("WWW")) {
                                                domain = domain.replaceAll("www.", "");

                                            }
                                            System.out.println("domain after removing www is:" + domain);

                                            if ((page2.attr("abs:href").toString().contains(domain)) && (check == true)) {
                                                co = 1;
                                                co_page = page2.attr("abs:href").toString();
                                                cell2.setCellValue(co_page);
                                                System.out.println("contact url is:" + page2.attr("abs:href").toString());


                                                Document document = Jsoup.connect(page2.attr("abs:href").toString()).get();

                                                Elements elts2 = document.select("a");
                                                for (Element page22 : elts2) {
                                                    if (page22.attr("abs:href").toString().contains("@")) {
                                                        String ma = page22.attr("abs:href").toString();
                                                        ma = ma.replaceAll("mailto:", "");
                                                        ar.add(ma);
                                                    }
                                                }
                                                Elements linksOnPage = document.getAllElements();
                                                for (Element page : linksOnPage) {

                                                    if (page.text().contains("@") || page.text().contains("mailto")) {
                                                        Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(page.text());
                                                        while (m.find()) {
                                                            if (ar.toString().contains(m.group())) {

                                                            } else {
                                                                ar.add(m.group());

                                                                System.out.println(m.group());

                                                            }
                                                        }

                                                    }

                                                    if (page.text().contains("+") || page.text().matches(".*\\d.*") || page.text().contains("Tel")) {


                                                        Iterator<PhoneNumberMatch> existsPhone = PhoneNumberUtil.getInstance().findNumbers(page.text(), "US").iterator();

                                                        while (existsPhone.hasNext()) {
                                                            String pn = existsPhone.next().rawString();

                                                            if (ar2.toString().contains(pn)) {

                                                            } else {
                                                                ar2.add(pn);

                                                                System.out.println(pn);
                                                            }


                                                        }
                                                    }


                                                }
                                                break;
                                            }

                                        }
                                    } catch (Exception fg) {
                                    }
                                    cell4.setCellValue(fetchedUrl.toString());

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
                                    try {
											/*
										for(int e=0;e<3;e++)
										{
										//	em=em.concat(ar.get(e).toString()+" ,");
											
											
										}
										*/

                                        cell3.setCellValue(ar.get(0).toString());
                                        cell6.setCellValue(ar.get(1).toString());
                                        cell5.setCellValue(ar.get(2).toString());

                                    } catch (Exception gj) {
                                        gj.printStackTrace();
                                        //cell2.setCellValue(em);
                                    }
                                    try {

                                        cell7.setCellValue(ar2.get(0).toString());
                                        cell8.setCellValue(ar2.get(1).toString());
                                        cell9.setCellValue(ar2.get(2).toString());
                                    } catch (Exception dg) {

                                    }
                                    FileOutputStream save = new FileOutputStream(textField.getText());
                                    wb.write(save);
                                    save.flush();
                                    save.close();

                                    ar.clear();
                                    ar2.clear();

                                    timestamp2 = new Timestamp(System.currentTimeMillis());

                                    t2 = String.valueOf(timestamp2);

                                    st = "[" + t2 + "] Data saved successfully";
                                    update(st);
                                }
                            } catch (Exception ffk) {
                            }


                        }


                        Thread.sleep(2000);

                        timestamp2 = new Timestamp(System.currentTimeMillis());

                        t2 = String.valueOf(timestamp2);

                        st = "[" + t2 + "]  Entry completed for current page";
                        update(st);
                        try {
                            if (driver2.findElement(By.xpath("//a[@id='pnnext']")).isDisplayed()) {

                                tot_page--;
                                if (tot_page <= 0) {
                                    timestamp2 = new Timestamp(System.currentTimeMillis());

                                    t2 = String.valueOf(timestamp2);

                                    st = "[" + t2 + "]  All the pages have been scrapped successfully!";
                                    update(st);
                                    break;
                                } else {
                                    wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='pnnext']"))).click();


                                    Thread.sleep(3000);

                                    for (i = 0; i < 40; i++) {
                                        try {
                                            Thread.sleep(1000);
                                        } catch (InterruptedException e) {
                                        }
                                        //To check page ready state.
                                        if (js.executeScript("return document.readyState").toString().equals("complete")) {

                                            break;
                                        }
                                    }

                                    low = 3000;
                                    high = 6000;

                                    wait = r.nextInt(high - low) + low;

                                    Thread.sleep(wait);
                                }
                                i = 0;
                            } else {
                                break;
                            }
                        } catch (Exception dg) {
                            timestamp2 = new Timestamp(System.currentTimeMillis());

                            t2 = String.valueOf(timestamp2);

                            st = "[" + t2 + "]  All the pages have been scrapped successfully!";

                            update(st);
                            break;
                        }


                    }
                } catch (Exception y) {
                    y.printStackTrace();

                    StringWriter sw = new StringWriter();
                    y.printStackTrace(new PrintWriter(sw));
                    String exceptionAsString = sw.toString();
                    System.out.println(exceptionAsString);
                    JOptionPane.showMessageDialog(null, "" + exceptionAsString + "",
                            "ERROR!", JOptionPane.ERROR_MESSAGE);


                }


                return null;
            }

        };
        email.execute();

    }

    private static void update(String st) {

        text.append("\n" + st);

        text.update(text.getGraphics());

        text.repaint();


    }

    public static void exist() {
        ex = true;


    }

    public static void allarr(ArrayList<String> ar2) {

        for (int y = 0; y < ar2.size(); y++) {
            ar.add(ar2.get(y));
//	System.out.println(ar2.get(y));
        }
    }

    public static String getFinalURL(String url) throws IOException {
        try {
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
        } catch (Exception f) {
            f.printStackTrace();
        }
        return url;
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

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

                path = textField.getText();
                if (path.isEmpty() || textField_6.getText().isEmpty() || textField_2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select excel sheet  / Page number is empty / Search keyword is empty");

                } else {

                    JOptionPane.showMessageDialog(null, "Bot started");

                    startScrapingProcess();
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

        JLabel lblV = new JLabel("V 1.1");
        lblV.setForeground(Color.WHITE);
        lblV.setFont(new Font("Times New Roman", Font.BOLD, 21));
        lblV.setBounds(10, 19, 60, 19);
        frame.getContentPane().add(lblV);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {


                    Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"taskkill.exe /F /IM chromedriver.exe /T");
                } catch (Exception rr) {

                }
                System.exit(0);

            }
        });
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(10, 61, 123, 47);

        lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("images/button (29).png")));

        lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(lblNewLabel_2);

        JLabel lblSelectFolder = new JLabel("IMPORT EXCEL SHEET");
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
        textField_6.setText("5");
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
        //frame.getContentPane().add(chckbxScrapeAd);

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

        ImageIcon img = new ImageIcon(getClass().getResource("images/googlem.jpg"));


        frame.setIconImage(img.getImage());

        label.setIcon(new ImageIcon(getClass().getResource("images/ps.jpg")));
    }

    public void SampleJFileChooser() {

        JFileChooser jFileChooser = new JFileChooser();
        ///jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jFileChooser.setCurrentDirectory(new File("/User/alvinreyes"));

        int result = jFileChooser.showOpenDialog(new JFrame());


        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jFileChooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            textField.setText(path);
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }
    }
}
