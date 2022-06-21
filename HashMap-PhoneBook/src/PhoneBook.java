import java.util.*;

public class PhoneBook {
    private Map<String, List<Contact>> book = new HashMap<>();

    public boolean addGroup(String groupName) {
        if (book.containsKey(groupName))
            return false;
        book.put(groupName, new ArrayList<>());
        return true;
    }

    public boolean addContactToGroups(Contact contact, String... groupNames) {
        for (String groupName : groupNames) {
            if (!book.containsKey(groupName))
                return false;
            book.get(groupName).add(contact);
        }
        return true;
    }

    public List<Contact> findContactsByGroup(String groupName) {
        return book.get(groupName);
    }

    public Contact findContactsByPhone(String phone) {
        for (List<Contact> groupContacts : book.values()) {
            for (Contact contact : groupContacts) {
                if (contact.getPhone().equals(phone)) {
                    return contact;
                }
            }
        }
        return null;
    }
}
