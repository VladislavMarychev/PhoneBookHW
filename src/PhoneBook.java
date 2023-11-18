import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhoneBook {
    public static void main(String[] args) {
        // Создание и заполнение телефонной книги
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", new ArrayList<String>(List.of("111111111", "222222222")));
        phoneBook.put("Петров", new ArrayList<String>(List.of("333333333")));
        phoneBook.put("Сидоров", new ArrayList<String>(List.of("444444444", "555555555")));
        phoneBook.put("Иванова", new ArrayList<String>(List.of("666666666")));
        phoneBook.put("Смирнов", new ArrayList<String>(List.of("777777777", "888888888", "999999999")));

        // Вывод телефонной книги на экран
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            List<String> phones = entry.getValue();
            System.out.println(name + ": " + phones);
        }

        // Отсортировка телефонной книги по убыванию числа телефонов
        List<Map.Entry<String, List<String>>> sortedPhoneBook = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(sortedPhoneBook, new Comparator<Map.Entry<String, List<String>>>() {
            public int compare(Map.Entry<String, List<String>> entry1, Map.Entry<String, List<String>> entry2) {
                return entry2.getValue().size() - entry1.getValue().size();
            }
        });

        System.out.println("Отсортированная телефонная книга:");
        for (Map.Entry<String, List<String>> entry : sortedPhoneBook) {
            String name = entry.getKey();
            List<String> phones = entry.getValue();
            System.out.println(name + ": " + phones);
        }
    }
}