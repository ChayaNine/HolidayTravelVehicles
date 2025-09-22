public class SalesPerson {
    private String name;
    private String salespersonID;

    // constructor
    public SalesPerson(String name, String salesPersonID) {
        this.name = name;
        this.salespersonID = salesPersonID;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSalesPersonID() {
        return salespersonID;
    }
    public void setSalesPersonID(String salesPersonID) {
        this.salespersonID = salesPersonID;
    }

    @Override
    public String toString() {
        return "SalesPerson id = " + salespersonID + ", name = " + name;
    }


}
