package FactoryPattern;

class RepairServiceFactory {
    public static RepairService getRepairService(String serviceType) {
        switch (serviceType.toLowerCase()) {
            case "electrical":
                return new ElectricalRepair();
            case "plumbing":
                return new PlumbingRepair();
            default:
                throw new IllegalArgumentException("Invalid service type");
        }
    }
}
