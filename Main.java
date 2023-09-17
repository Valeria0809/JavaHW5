public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBook.addContact("Иванов", "123 -456 -789");
        PhoneBook.addContact("Иванов", "333 -444 -777");
        PhoneBook.addContact("Сидоров", "456 -654 -789");
        PhoneBook.addContact("Петров", "542 -654 -789");
        PhoneBook.addContact("Петров", "555 -666 -888");
        PhoneBook.printContacts();
    }
}