package com.actitime.testscript;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider
public Object[][] getData() {
	Object[][]data= {
			{"http://localhost/login.do","admin","manager"},
			{"http://localhost/login.do","admin1","manager1"},
			{"http://localhost/login.do","admin2","manager2"},
			{"http://localhost/login.do","admin3","manager3"}
			};
	return data;
}
}
