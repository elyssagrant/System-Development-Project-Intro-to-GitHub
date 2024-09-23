public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;


    public BuddyInfo() {
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Samantha", "123 Somewhere St.", "555-123-4567");

        System.out.println("Hello " + buddy.getName());

    }
}
