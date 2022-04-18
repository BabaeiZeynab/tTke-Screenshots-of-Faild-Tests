package Com.takeScreenShotfromError;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

@Listeners(CustomListener.class)
public class ScreenshotTes extends Base{



	@BeforeMethod
	public void setUp() {
		initialize();
	}


	@Test
	public void failed1() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void failed2() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void failed3() {
		Assert.assertEquals(false, true);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
