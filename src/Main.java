import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "Alice Smith", "123 Main St", "555-1234");
        SalesPerson sp = new SalesPerson("SP01", "Bob Jones");
        NewVehicle car = new NewVehicle("SN1001", "HolidayCar", "SedanX", 2025, "Toyota", 25000.00);

        DealerInstalledOptions gps = new DealerInstalledOptions("OPT1", "GPS Navigation", 1200.00);
        DealerInstalledOptions sunroof = new DealerInstalledOptions("OPT2", "Sunroof", 800.00);

        TradeInVehicles oldCar = new TradeInVehicles("SN888", "Honda", "Civic", 2015);

        SalesInvoice invoice = new SalesInvoice("INV001", LocalDate.now(), "Signed by Alice",
                24000.00, 1800.00, 300.00, customer, sp, car);

        invoice.addOption(gps);
        invoice.addOption(sunroof);
        invoice.setTradeInVehicle(oldCar);

        System.out.println(invoice);
        System.out.println(sp);
        System.out.println(car);
        System.out.println(customer);
    }
}
