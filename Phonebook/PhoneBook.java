package DZ_Seminar6.Phonebook;

import DZ_Seminar6.User.User;
import java.util.*;

public class PhoneBook {
    private final Map<String, User> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addPhone(String name, long phoneNumber) {
        User user = phoneBook.get(name);
        if (user == null) {
            user = new User(name);
            phoneBook.put(name, user);
        }
        user.addPhoneNumber(phoneNumber);
    }

    public void removePhone(String name, long phoneNumber) {
        User user = phoneBook.get(name);
        if (user != null) {
            // Явно приводим объект к типу List<Long>
            List<Long> phoneNumbers = (List<Long>) user.getPhoneNumbers();
            phoneNumbers.remove(phoneNumber);
    
            // Если список номеров стал пустым, удаляем пользователя из телефонной книги
            if (phoneNumbers.isEmpty()) {
                phoneBook.remove(name);
            }
        }
    }

    public void printAll() {
        List<Map.Entry<String, User>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(sortedEntries, (Map.Entry<String, User> entry1, Map.Entry<String, User> entry2) -> entry2.getValue().getPhoneNumbers().size() - entry1.getValue().getPhoneNumbers().size());

        for (Map.Entry<String, User> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getPhoneNumbers());
        }
    }
}