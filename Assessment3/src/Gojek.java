import java.util.ArrayList;
import java.util.List;

public class Gojek {
    List<Member> members;

    public Gojek() {
        this.members = new ArrayList<>();
    }

    public void transaksi(String id1, String id2, double saldo) {
    }

    public void viewCustomer(String id) {
        Member customer = cekId(id);
        if (customer != null) {
            System.out.println("ID Customer: " + customer.getId());
            System.out.println("Nama Customer: " + customer.getNama());
            System.out.println("Telepon Customer: " + customer.getTelepon());
            System.out.println("Saldo Customer: " + customer.getSaldo());
            System.out.println("");
        } else {
            System.out.println("Customer tidak Ditemukan");
        }
    }

    public void viewDriver(String id) {
        Member driver = cekId(id);
        if (driver != null) {
            System.out.println("ID Driver: " + driver.getId());
            System.out.println("Nama Driver: " + driver.getNama());
            System.out.println("Telepon Driver: " + driver.getTelepon());
            System.out.println("Saldo Driver: " + driver.getSaldo());
            System.out.println("");
        } else {
            System.out.println("Driver tidak Ditemukan");
        }
    }

    public void topUpSaldo(String id, double saldo) {
        Member member = cekId(id);
        if (member != null) {
            member.setSaldo(member.getSaldo() + saldo);
        } else {
            System.out.println("Member tidak Ditemukan");
        }
    }

    public void addCustomer(String id, String nama, String telepon, double saldo) {
        Member customer = new Customer(id, nama, telepon, saldo);
        members.add(customer);
    }

    public void addDriver(String id, String nama, String telepon, String platNo, String motor, double saldo) {
        Member driver = new Driver(id, nama, telepon, platNo, motor, saldo);
        members.add(driver);
    }

    public Member cekId(String id){
        for (Member member : members){
            if (member.getId().equals(id)) {
                return  member;
            }
        }
        return null;
    }

    public void runThis(){
        addDriver("1", "Becky", "0811", "D 1 A", "Motor", 100000);
        addDriver("2", "Adrian", "0812", "B 15 A", "Motor", 50000);
        addDriver("3", "Begra", "0813", "J 45A LHO", "Motor", 0);

        addCustomer("4", "Eva", "0814", 100000);
        addCustomer("5", "Celia", "0815", 0);
        addCustomer("6", "Latjuba", "0816", 200000);
        addCustomer("7", "Lesmana", "0817", 0);

        topUpSaldo("1", 150000);
        topUpSaldo("3", 50000);
        topUpSaldo("4", 250000);
        topUpSaldo("5", 450000);
        topUpSaldo("6", 150000);
        topUpSaldo("9", 150000);

        transaksi("1", "4", 50000);
        transaksi("3", "5", 50000);
        transaksi("4", "5", 50000);
        transaksi("1", "2", 50000);

        viewDriver("1");
        viewDriver("3");
        viewDriver("4");
        
        viewCustomer("1");
        viewCustomer("4");
        viewCustomer("5");
        viewCustomer("8");
    }
}