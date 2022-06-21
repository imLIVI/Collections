import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputStr = "";
        Set<Student> listOfStudents = new HashSet<>();

        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");

        while (true) {
            /*
             * For testing:
             * Иванов Петр Николаевич, 1243-Б, 31231343
             * Петрова Татьяна Михайловна, 1243-Б, 43221343
             * Петрова Татьяна Михайловна, 1243-Б, 43221343
             * Петрова Татьяна Михайловна, 1243-Б, 43221355
             * */
            inputStr = input.nextLine();
            //Check "end"
            if (inputStr.equals("end")) {
                //Print the list of students
                for (Student st : listOfStudents) {
                    System.out.println(st.toString());
                }
                break;
            }

            String[] infoAboutStudent = inputStr.split(", ");

            while (infoAboutStudent.length <= 2) {
                System.out.println("Ошибка! Введенные данные некорректны! " +
                        "Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
                inputStr = input.nextLine();
                infoAboutStudent = inputStr.split(", ");
            }

            //Create student
            Student student = new Student(infoAboutStudent[0], infoAboutStudent[1], infoAboutStudent[2]);

            //Check for duplicates ID
            if (listOfStudents.contains(student)) {
                System.out.println("Ошибка! Студент с таким номером студенческого билета уже существует");
            } else {
                //Add student to set
                listOfStudents.add(student);
            }

            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
        }
    }
}
