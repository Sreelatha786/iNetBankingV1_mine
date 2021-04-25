import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//T SREELATHA//eclipse-workspace//iNetBankingV1//Drivers//chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://frontend.nopcommerce.com/");
		
	}

}
