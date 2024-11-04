package FactoryPattern;

class ElectricalRepair implements RepairService {
    public String getServiceDetails() {
        return "Electrical Repair Servic";
    }

    public double getCost() {
        return 500.0;
    }
}
