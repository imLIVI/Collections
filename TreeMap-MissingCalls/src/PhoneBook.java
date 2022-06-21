import java.util.*;

public class PhoneBook {
    private Map<String, Contact> book = new HashMap<>();

    public boolean addContact(Contact contact) {
        if (book.containsKey(contact.getPhone())) {
            return false;
        }
        book.put(contact.getPhone(), contact);
        return true;
    }

    public Contact findContactsByPhone(String phone) {
        return book.get(phone);
    }
}
