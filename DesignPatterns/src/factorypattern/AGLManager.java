package factorypattern;

public class AGLManager implements Manager{
    @Override
    public void processRequest() {
        System.out.println("Processing AGL request");
    }
}
