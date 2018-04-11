import com.javafundamental.pattern.factory.Computer;
import com.javafundamental.pattern.factory.ComputerFactory;

public class TestFactory {
    public static void main(String[] main) {
        Computer pc = ComputerFactory.getComputer("PC", "2GB", "500GB", "2.4Ghz");
        Computer server = ComputerFactory.getComputer("server", "16GB", "1TB", "2.9Ghz");

        System.out.println("PC Specs : " + pc);
        System.out.println("Server specs : " + server);
    }
}
