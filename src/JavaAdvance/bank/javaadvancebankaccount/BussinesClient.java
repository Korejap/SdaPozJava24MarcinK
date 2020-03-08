package JavaAdvance.bank.javaadvancebankaccount;

public class BussinesClient extends Client {
    private String companyName;

    public BussinesClient(String companyName) {
        super();
        this.companyName = companyName;
    }

    public String getNip(){
        return "12345";
    }
}
