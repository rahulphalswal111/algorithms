package factorypattern;

public class AWDManager implements Manager{

    @Override
    public void processRequest() {
        System.out.println("processing AWD request");
    }
}
