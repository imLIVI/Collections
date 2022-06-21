import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Candidate> candidates = new TreeSet();

        Candidate candidate1 = new Candidate("Иванов Иван Иванович", "М", "23", 4, 3);
        candidates.add(candidate1);

        Candidate candidate2 = new Candidate("Петров Петр Петрович", "М", "21", 5, 5);
        candidates.add(candidate2);

        Candidate candidate3 = new Candidate("Кочевников Максим Олегович", "М", "25", 6, 5);
        candidates.add(candidate3);

        Candidate candidate4 = new Candidate("Могилевская Ева Романовна", "Ж", "26", 6, 7);
        candidates.add(candidate4);

        Candidate candidate5 = new Candidate("Колесникова Мария Александровна", "Ж", "20", 7, 4);
        candidates.add(candidate5);


        String[] columns = {"ФИО", "Релевантность", "Рэйтинг"};
        System.out.printf("%-45s %-20s %-5s \n", columns[0], columns[1], columns[2]);
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }
}
