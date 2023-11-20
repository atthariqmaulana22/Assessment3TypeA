public class Customer extends Member {
    private String telepon;

    public Customer(String id, String nama, String telepon, Double saldo) {
        super(id, nama, telepon, saldo);
        this.telepon = telepon;
    }

    @Override
    public String getTelepon() {
        return telepon;
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
