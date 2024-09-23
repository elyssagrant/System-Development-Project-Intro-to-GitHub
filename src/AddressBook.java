import java.util.ArrayList;
public class AddressBook {
    private ArrayList <BuddyInfo> buddy;


    public AddressBook() {
        this.buddy = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        this.buddy.add(buddy);
    }

    public void removeBuddy(int index) {
       if(index >= 0 && index <= buddy.size())
       {
           buddy.remove(index);
       }
    }

    public static void main (String[] args) {
        BuddyInfo buddy =  new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
