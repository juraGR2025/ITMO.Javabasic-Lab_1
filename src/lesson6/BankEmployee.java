package lesson6;
//В класс Работник банка добавьте:
//●	наследование класса Человек;
//●	реализация функции для вывода информации;
//●	строковое поле «название банка»;
//●	конструктор для установки всех значений;
public class BankEmployee extends AbstractHuman{
    String bankName;
        public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String getAll() {
        return "Работник банка: " + getFirstName() + " " + getLastName() + "\nработает в банке " + bankName;
    }

    public BankEmployee(String firstName, String lastName, String bankName) {
            super(firstName, lastName);
            this.bankName = bankName;
    }
}
