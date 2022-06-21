import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userInput = -1;

        List<String> taskList = new ArrayList<>();

        while (userInput != 0) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");

            // Проверка на то, что User ввел значение типа int
            while (!input.hasNextInt()) {
                System.out.println("ОШИБКА! Введёна несуществующая задача для планирования!");
                input.nextLine();
            }
            userInput = Integer.parseInt(input.nextLine());

            switch (userInput) {
                case 1:
                    System.out.println("Введите задачу для планирования:");
                    String task = input.nextLine();
                    taskList.add(task);
                    break;
                case 2:
                    printTaskList(taskList);
                    break;
                case 3:
                    System.out.println("Введите номер задачи для удаления:");
                    int removeTask = Integer.parseInt(input.nextLine());
                    if (removeTask >= taskList.size()) {
                        System.out.println("ОШИБКА! Введен некорректный номер задчи для удаления!");
                        break;
                    }
                    taskList.remove(removeTask - 1);
                    printTaskList(taskList);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ОШИБКА! Введёна несуществующая задача для планирования!");
            }
        }
    }

    public static void printTaskList(List<String> taskList) {
        for (int i = 0; i < taskList.size(); i++) {
            String taskFromList = taskList.get(i);
            System.out.println(i + 1 + ". " + taskFromList);
        }
    }
}
