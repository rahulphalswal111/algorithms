package factorypattern;

public class ManagerFactory {
    public static Manager getManager(final String managerIdentifier) {
        switch(managerIdentifier) {
            case "AGL":
                return new AGLManager();
            case "AWD":
                return new AWDManager();
            default:
                return new AWDManager();
        }
    }
}
