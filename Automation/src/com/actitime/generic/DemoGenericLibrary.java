package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		System.out.println(f.getPropertyData("url"));
		System.out.println(f.getPropertyData("username"));
		System.out.println(f.getPropertyData("password"));
		f.setExcelData("CreateCustomer", 1, 2, "SBI_003");
		String cn = f.getExcelData("CreateCustomer", 1, 2);
		
		System.out.println(cn);
		}
}
