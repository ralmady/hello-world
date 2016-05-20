package SAX;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Beolv {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser sp = spf.newSAXParser();
		
		EmployeeHandler empHandler = new EmployeeHandler();
		sp.parse(new File("employees.xml"), empHandler);
		
		empHandler.getEmployeelist().forEach(System.out::println);
		

	}

}
