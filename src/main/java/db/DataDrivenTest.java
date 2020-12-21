package db;

import bcb.Test;

public class DataDrivenTest {
	
	 @Test(dataProvider = "dp")
	  public void f(Integer n, String s) {
	  }

}
