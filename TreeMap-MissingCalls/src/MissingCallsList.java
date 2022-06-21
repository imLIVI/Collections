import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissingCallsList {

    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();
    private PhoneBook phoneBook;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss");

    public MissingCallsList(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addMissingCall(String phone) {
        missedCalls.put(LocalDateTime.now(), phone);
    }

    @Override
    public String toString() {
        String output = "";
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            String phone = entry.getValue();
            String time = dtf.format(entry.getKey());
            Contact contact = phoneBook.findContactsByPhone((phone));
            output += time.toString() + ": " + (contact == null ? phone : contact.getName()) + "\n";
        }
        return output;
    }
}
