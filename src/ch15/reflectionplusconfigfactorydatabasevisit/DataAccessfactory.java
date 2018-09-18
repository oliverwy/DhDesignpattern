package ch15.reflectionplusconfigfactorydatabasevisit;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DataAccessfactory {

	// private final static String db="Sqlserver";
	// private final static String db = "Accesss";
	private String objectstr;

	private String getPackagename() {
		return this.getClass().getPackage().getName();
	}

	public String getObjectstr() {
		return objectstr;
	}

	public String getDatabaseConfig() throws DocumentException {
		SAXReader saxReader = new SAXReader();
		File inputFile = new File("src/appconfig.xml");
		//System.out.println(inputFile);
		Document document = saxReader.read(inputFile);
		Element root = document.getRootElement();
		System.out.println(root.getText());
		Element e = (Element) root.selectSingleNode("/databaseconfig/dbtype");

		// allSong节点下的Name节点的value
		String db = e.getText();

		return db;
	}

	public void setObjectstr(String objectstr) {
		this.objectstr = objectstr;
	}

	public IFactory createDatabase() {
		IFactory databasefactory = null;
		try {
			databasefactory = (IFactory) Class.forName(getPackagename() + '.' + objectstr).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return databasefactory;
	}

}
