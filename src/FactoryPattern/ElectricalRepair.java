package FactoryPattern;

class ElectricalRepair implements RepairService {
    public String getServiceDetails() {
        return "Electrical Repair Service";
    }

    public double getCost() {
        return 50.0;
    }
}
