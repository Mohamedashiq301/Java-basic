package CollectionFrameWork;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception{
		Properties p =new Properties();
		
		/*
		p.setProperty("Brand", "Dell");
		p.setProperty("Processor", "i7");
		p.setProperty("OS", "Windows 10");
		p.setProperty("Model", "Latitude");
		
		p.storeToXML(new FileOutputStream("c:/TestFiles/DellTest.xml"), "Laptop");
		*/
		
		
		p.load(new FileInputStream("c:/TestFiles/DellTest.txt"));
		System.out.println(p.getProperty("Brand"));
	}
}
