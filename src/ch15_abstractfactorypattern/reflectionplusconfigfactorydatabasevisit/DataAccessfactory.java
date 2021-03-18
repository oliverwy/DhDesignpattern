package ch15_abstractfactorypattern.reflectionplusconfigfactorydatabasevisit;

import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

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

    public void setObjectstr(String objectstr) {
        this.objectstr = objectstr;
    }

    public IFactory createDatabase() throws InvalidFileFormatException, IOException {
        IFactory databasefactory = null;
        Wini ini = new Wini(new File("src/appconfig.ini"));
        objectstr = ini.get("dbconfig", "dbtype");
        try {
            databasefactory = (IFactory) Class.forName(getPackagename() + '.' + objectstr).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return databasefactory;
    }

}
