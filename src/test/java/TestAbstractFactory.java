import com.javafundamental.pattern.abstractFactory.Computer;
import com.javafundamental.pattern.abstractFactory.ComputerFactory;
import com.javafundamental.pattern.abstractFactory.PCFactory;
import com.javafundamental.pattern.abstractFactory.ServerFactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "500GB", "4.3Ghz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("12GB", "1TB", "4.3Ghz Xeon"));
        System.out.println("PC Abstract Factory : " + pc);
        System.out.println("Server Abstract Factory : " + server);
    }
}
