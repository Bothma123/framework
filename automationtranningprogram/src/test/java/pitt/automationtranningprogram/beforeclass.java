package pitt.automationtranningprogram;

public class beforeclass {

	public beforeclass() {
		//System.setProperty('webdriver.chrome.driver", "C;\\Users\\IGU Staff\\eclipse-workpaceRestore\\AutomationTrain
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UserDB\\eclipse-workspace\\automationtranningprogram\\drivers\\msedgedriver.exe");
		//driver=new ChromeDriver();
		driver=new EdgeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
		@AfterClass
		public void afterClass() {
		
		// TODO Auto-generated method stub

	}

}
