public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String phone, String name) {
        this.name = name;
        this.phoneNumber = phone;
    }

    public String getName(String name) {
        return this.name;
    }

    public String getPhone() {
        return this.phoneNumber;
    }

    public void setPhone(String phone) {
        this.phoneNumber = phone;
    }

    @Override
    public String toString() {
        return name + ": " + phoneNumber;
    }
}
