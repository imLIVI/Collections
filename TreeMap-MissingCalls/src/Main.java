import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        //Fill contacts
        Contact person1 = new Contact("+79171590501", "Nikita");
        phoneBook.addContact(person1);

        Contact person2 = new Contact("+79171650506", "Anna");
        phoneBook.addContact(person2);

        Contact person3 = new Contact("+79171456705", "Oleg");
        phoneBook.addContact(person3);

        Contact person4 = new Contact("+79145623503", "Maria");
        phoneBook.addContact(person4);

        Contact person5 = new Contact("+79145624567", "Eugenia");
        phoneBook.addContact(person5);

        //Add missed calls
        MissingCallsList missingCallsList = new MissingCallsList(phoneBook);

        Scanner input = new Scanner(System.in);
        String userInput;

        while(true){
            System.out.println("Введите номер пропущенного звонка (для выхода введите \"end\"): ");

            userInput = input.nextLine();

            if(userInput.equals("end")){
                System.out.println(missingCallsList);
                break;
            }

            missingCallsList.addMissingCall(userInput);
        }
    }
}
