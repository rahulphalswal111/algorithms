import factorypattern.Manager;
import factorypattern.ManagerFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager awdManager = ManagerFactory.getManager("AWD");
        awdManager.processRequest();
    }
}