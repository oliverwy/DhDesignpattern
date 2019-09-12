package ch15abstractfactorypattern.simpleplusabstractfactory;


public class DataAccess {
    //private final static String db="Sqlserver";
    private final static String db = "Accesss";

    public static IUser createUser() {
        IUser result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverUser();
                break;
            case "Accesss":
                result = new AccessUser();
                break;
        }

        return result;

    }

    public static IDepatment createDepartment() {
        IDepatment result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverDepartment();
                break;
            case "Accesss":
                result = new AccessDepartment();
                break;
        }

        return result;
    }
}
