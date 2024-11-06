package Facade;

import FactoryPattern.RepairService;
import FactoryPattern.RepairServiceFactory;
import Payment.PaymentStrategy;

public class HandymanFacade {
    private Scheduler scheduler;
    private RepairServiceFactory repairServiceFactory;

    public HandymanFacade() {
        this.scheduler = new Scheduler();
        this.repairServiceFactory = new RepairServiceFactory();
    }

    public void requestService(String serviceType) {
        RepairService service = repairServiceFactory.getRepairService(serviceType);
        System.out.println("Service Details: " + service.getServiceDetails());
        System.out.println("Estimated Cost: $" + service.getCost());
        String timeSlot = scheduler.suggestTimeSlot();
        System.out.println("Available Time Slot: " + timeSlot);
    }
}
