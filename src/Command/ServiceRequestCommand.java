package Command;

import Facade.HandymanFacade;
import Facade.PaymentFacade;

public class ServiceRequestCommand implements Command {
    private HandymanFacade handymanFacade;
    private PaymentFacade paymentFacade;
    private String serviceType;

    public ServiceRequestCommand(String serviceType) {
        this.handymanFacade = new HandymanFacade();
        this.serviceType = serviceType;
        paymentFacade = new PaymentFacade();
    }

    public void execute() {
        handymanFacade.requestService(serviceType);
        paymentFacade.processUserPayment();
    }
}
