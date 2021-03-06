import java.io.InputStream;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import org.apache.commons.io.IOUtils;

public class ConvertXMLtoJSON {

	public static void main(String[] args) throws Exception {
		InputStream is = 
			ConvertXMLtoJSON.class.getResourceAsStream("/?usn=1pe09cs002");
		String xml = IOUtils.toString(is);

		XMLSerializer xmlSerializer = new XMLSerializer(); 
		JSON json = xmlSerializer.read( xml );  
		System.out.println( json.toString(2) );
	}
}