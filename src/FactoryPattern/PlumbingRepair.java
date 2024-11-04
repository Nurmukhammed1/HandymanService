package FactoryPattern;

class PlumbingRepair implements RepairService {
    public String getServiceDetails() {
        return "Plumbing Repair Service";
    }

    public double getCost() {
        return 40.0;
    }
}
