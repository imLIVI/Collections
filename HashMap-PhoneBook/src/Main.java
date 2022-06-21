import java.util.List;

public class Main {
    public static final String GROUP_WORK = "Friends";
    public static final String GROUP_OF_FRIENDS = "Job";
    public static final String GROUP_FAMILY = "Family";

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        //Fill groups
        fillGroups(phoneBook, GROUP_FAMILY, GROUP_OF_FRIENDS, GROUP_WORK);

        //Fill contacts
        Contact person1 = new Contact("+79171590501", "Nikita");
        phoneBook.addContactToGroups(person1, GROUP_OF_FRIENDS, GROUP_WORK);

        Contact person2 = new Contact("+79171650506", "Anna");
        phoneBook.addContactToGroups(person2, GROUP_OF_FRIENDS, GROUP_FAMILY);

        Contact person3 = new Contact("+79171456705", "Oleg");
        phoneBook.addContactToGroups(person3, GROUP_OF_FRIENDS, GROUP_FAMILY);

        Contact person4 = new Contact("+79145623503", "Maria");
        phoneBook.addContactToGroups(person4, GROUP_WORK);

        Contact person5 = new Contact("+79145624567", "Eugenia");
        phoneBook.addContactToGroups(person5, GROUP_OF_FRIENDS);

        //Searching contacts by group
        System.out.println("Поиск контактов из группы \"Family\": ");
        List<Contact> family = phoneBook.findContactsByGroup("Family");
        for (Contact contact : family) {
            System.out.println(contact);
        }

        //Searching contact by phone number
        System.out.println("Ищем маму по номеру: \n" + phoneBook.findContactsByPhone("+79145624567"));

    }

    private static void fillGroups(PhoneBook phoneBook, String... groups) {
        for (String group : groups) {
            phoneBook.addGroup(group);
        }
    }
}
