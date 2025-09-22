import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SalesInvoice {
    private double finalNegotiatedPrice;
    private double taxes;
    private double licenseFees;
    private String invoiceID;
    private LocalDate date;
    private String customerSignature;

    private Customer customer;
    private NewVehicle newVehicle;
    private SalesPerson salesPerson;
    private TradeInVehicles tradeInVehicles;
    private final List<DealerInstalledOptions> options = new ArrayList<>();


    public SalesInvoice(String invoiceID, LocalDate date, String customerSignature, double finalNegotiatedPrice, double taxes, double licenseFees, Customer customer, SalesPerson salesPerson, NewVehicle newVehicle) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.customerSignature = customerSignature;
        this.finalNegotiatedPrice = finalNegotiatedPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.customer = customer;
        this.salesPerson = salesPerson;
        this.newVehicle = newVehicle;
    }

    public void addOption(DealerInstalledOptions option) {
        this.options.add(option);
    }

    public void setTradeInVehicle(TradeInVehicles tradeInVehicles) {
        this.tradeInVehicles = tradeInVehicles;
    }

    public double computeTotalDue() {
        double optionSum = options.stream().mapToDouble(DealerInstalledOptions::getPrice).sum();
        return finalNegotiatedPrice + taxes + licenseFees + optionSum;
    }

    @Override
    public String toString() {
        return "Invoice#" + invoiceID + " Date=" + date +
                "\n  Customer: " + customer +
                "\n  SalesPerson: " + salesPerson +
                "\n  Vehicle: " + newVehicle +
                (tradeInVehicles != null ? ("\n  Trade-in: " + tradeInVehicles) : "") +
                "\n  Options: " + options +
                "\n  Final Price: " + finalNegotiatedPrice +
                "\n  Taxes: " + taxes +
                "\n  License Fees: " + licenseFees +
                "\n  Total Due: " + computeTotalDue() +
                "\n  Signature: " + customerSignature;
    }

}


