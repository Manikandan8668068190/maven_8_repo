package pollscm;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class jenkinsParameterTest 
{
	@Test
	public void receiveParameter()
	{
		String value = System.getProperty("browser");
		Reporter.log(value,true);
	}

}
