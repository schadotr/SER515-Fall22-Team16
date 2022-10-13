import BuilderPattern.Demo.Client;
import facadePattern.SyllabusCreatorFacade;


public class Main {
    public static void main(String args[]) {
        SyllabusCreatorFacade facade = new SyllabusCreatorFacade();
        System.out.println("************************   Facade Pattern  ***************************");
        System.out.println();
        System.out.println();
        facade.main(new String[]{""});
        System.out.println();
        Client client = new Client();
        client.main(new String[]{"Hello"});
    }
}