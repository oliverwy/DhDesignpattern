package ch15_abstractfactorypattern.reflectionplusfactorydatabasevisit;

public class DataAccessfactory {
    // private final static String db="Sqlserver";
    // private final static String db = "Accesss";
    private String objectstr;

    public DataAccessfactory(String objectstr) {
        super();
        this.objectstr = objectstr;
    }

    private String getPackagename() {
        return this.getClass().getPackage().getName();
    }

    public String getObjectstr() {
        return objectstr;
    }

    public void setObjectstr(String objectstr) {
        this.objectstr = objectstr;
    }

    public IFactory createobj() {
        IFactory databasefactory = null;
        try {
            databasefactory = (IFactory) Class.forName(getPackagename() + '.' + objectstr).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return databasefactory;
    }


}
