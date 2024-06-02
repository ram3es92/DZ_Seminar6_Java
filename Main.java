package DZ_Seminar6;

import DZ_Seminar6.Phonebook.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPhone("Иванов", 3456789);
        phoneBook.addPhone("Петров", 7654321);
        phoneBook.addPhone("Гущева", 5254555);
        phoneBook.addPhone("Иванов", 5785595);
        phoneBook.addPhone("Кузьменко", 1222333);
        phoneBook.addPhone("Черешнева", 5534595);
        phoneBook.addPhone("Гущева", 5555555);
        phoneBook.addPhone("Иванов", 9888777);

        System.out.println("Телефонная книга:");
        phoneBook.printAll();

        phoneBook.removePhone("Иванов", 3456789);

        System.out.println("\nПосле удаления номера:");
        phoneBook.printAll();
    }
}