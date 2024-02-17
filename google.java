import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import java.io.*;
import java.util.*;
import org.joda.time.DateTime;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

public class Scraper {
    private static WebDriver driver2;
    private static final ArrayList<String> dup = new ArrayList<>();
    private static final ArrayList<String> ar = new ArrayList<>();
    private static final ArrayList<String> ar2 = new ArrayList<>();
    private static String ip, port, user, passw;

    public static void main(String[] args) {
        startScrapingProcess();
    }

    public static void startScrapingProcess() {
        SwingWorker<Void, Void> email = new SwingWorker<>() {
            @Override
            protected Void doInBackground() {
                try {
                    DateTime dt = new DateTime();
                    int hours = dt.getHourOfDay();
                    int min = dt.getMinuteOfHour();
                    int seconds = dt.getSecondOfMinute();
                    int YEAR = dt.getYear();
                    int month = dt.getMonthOfYear();
                    int day = dt.getDayOfMonth();

                    generateExcelFile(YEAR, month, day, hours, min, seconds);

                    Workbook wb = readExistingExcelFile();

                    processExcelRows(wb);

                    setupWebDriverAndScrapeData(wb);

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
                return null;
            }
        };
        email.execute();
    }

    private static void generateExcelFile(int YEAR, int month, int day, int hours, int min, int seconds) throws IOException {
        String filename = textField.getText() + "/" + textField_2.getText() + "-(" + YEAR + "-" + month + "-" + day + "-" + hours + "-" + min + "-" + seconds + ").xls";
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet2 = workbook.createSheet("FirstSheet");
        FileOutputStream fileOut = new FileOutputStream(filename);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
        System.out.println("Your excel file has been generated!");
    }

    private static Workbook readExistingExcelFile() throws IOException, InvalidFormatException {
        return WorkbookFactory.create(new FileInputStream(textField.getText()));
    }

    private static void processExcelRows(Workbook wb) throws IOException {
        Sheet sheet = wb.getSheetAt(0);
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) {
                row = sheet.createRow(i);
            }
            Cell cell10 = row.getCell(1);
            if (cell10 == null) {
                cell10 = row.createCell(1);
            }
            URI uri2 = new URI(cell10.toString());
            String domain2 = uri2.getHost();
            if (!dup.contains(domain2)) {
                dup.add(domain2);
            }
        }
    }

    private static void setupWebDriverAndScrapeData(Workbook wb) {
        try {
            ChromeOptions options2 = new ChromeOptions();
            // Set ChromeDriver path based on OS
            String path = new File(".").getCanonicalPath();
            if (System.getProperty("os.name").contains("Windows")) {
                System.setProperty("webdriver.chrome.driver", path + "\\chromedriver\\chromedriver.exe");
            } else {
                System.setProperty("webdriver.chrome.driver", path + "/chromedriver/chromedriver");
            }

            // Set proxy if provided
            Proxy proxy = new Proxy();
            proxy.setHttpProxy(ip + ":" + port);
            proxy.setSslProxy(ip + ":" + port);
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("proxy", proxy);

            // Configure ChromeOptions
            options2.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            options2.setExperimentalOption("useAutomationExtension", false);
            options2.addArguments("--disable-blink-features=AutomationControlled");
            options2.setCapability("requireWindowFocus", true);
            options2.addArguments("--ignore-certificate-errors");
            options2.addArguments("start-maximized");

            // Set user-data-dir for Chrome profile
            options2.addArguments("user-data-dir=" + path + "/googlemap");
            capabilities.setCapability(ChromeOptions.CAPABILITY, options2);

            // Initialize WebDriver
            driver2 = new ChromeDriver(capabilities);
            WebDriverWait wait1 = new WebDriverWait(driver2, 40);

            // Perform scraping logic
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

            for (int i = 0; i < 40; i++) {
                if (driver2.executeScript("return document.readyState").toString().equals("complete")) {
                    System.out.println("Page loaded");
                    break;
                }
                Thread.sleep(1000);
            }

            for (int i = 0; i < 10; i++) {
                List<WebElement> tot_res = driver2.findElements(By.xpath("//div[@class='rc']"));
                System.out.println("Total result found in the page: " + tot_res.size());
                // Handle pagination and scraping logic
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver2 != null) {
                driver2.quit();
            }
        }
    }
}
