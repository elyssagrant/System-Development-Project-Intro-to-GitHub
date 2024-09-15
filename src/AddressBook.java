import java.util.ArrayList;
public class AddressBook {
    private ArrayList <BuddyInfo> buddy;


    public AddressBook() {
        this.buddy = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        this.buddy.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        for(int i = 0; i < this.buddy.size(); i++)
        {
            if (this.buddy.get(i) == buddy)
            {
                this.buddy.remove(i);
                return;
            }
        }
    }

    public static void main (String[] args) {
        BuddyInfo buddy =  new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
