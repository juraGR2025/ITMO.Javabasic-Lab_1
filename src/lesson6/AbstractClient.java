package lesson6;
//В класс Клиент добавьте:
//●	наследование класса Человек;
//●	реализация функции для вывода информации;
//●	строковое поле «название банка»;
//●	конструктор для установки всех значений;
public class AbstractClient extends AbstractHuman{
    private String bankName;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String getAll() {
        String firstName = super.getFirstName();
        String lastName = super.getLastName();
        String s =  firstName + " " + lastName + " клиент банка " + bankName + "!";
        return s;
    }

    public AbstractClient(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }
}
