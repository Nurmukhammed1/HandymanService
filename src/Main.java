import java.util.Scanner;
import Command.ServiceRequestCommand;
import Facade.HandymanFacade;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceRequestCommand serviceRequestCommand;
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to Service");
            System.out.println("Please choose an option:");
            System.out.println("1. Request a Service");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter the service name:");
                    String serviceName = scanner.next();
                    serviceRequestCommand = new ServiceRequestCommand(serviceName);
                    serviceRequestCommand.execute();
                    System.out.println("You have successfully executed the service " + serviceName);
                    System.out.println();
                    break;
                case 2:
                    exit = true;
                    System.out.println("Thank you for using our service");
                    break;
            }
        }
    }
}