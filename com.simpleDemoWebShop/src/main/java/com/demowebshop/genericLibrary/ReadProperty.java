package com.demowebshop.genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
public static void main(String[] args) throws IOException {
	File f= new File("./src/test/resources/propertyfile");
	FileInputStream fis = new FileInputStream(f);
	Properties p= new Properties();
	p.load(fis);
	String key = p.getProperty("browser");
	
}
}
