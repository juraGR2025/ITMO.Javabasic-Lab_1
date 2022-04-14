package lesson6;

import java.util.Scanner;

public class AbstractClassesMain implements IBankName{
    @Override
    public String getBankName() {
        return bankName;
    }
    static String firstName = null;
    static String lastName = null;
    static String bankName = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        if (scanner.hasNext()){
            firstName = scanner.next();
        }
        System.out.println("Введите фамилию:");
        if (scanner.hasNext()){
            lastName = scanner.next();
        }
        System.out.println("Введите название банка:");
        if (scanner.hasNext()){
            bankName = scanner.next();
        }
        AbstractClient client = new AbstractClient(firstName, lastName, bankName);
        System.out.println(client.getAll());

        BankEmployee bemp = new BankEmployee(firstName, lastName, bankName);
        System.out.println(bemp.getAll());

        System.out.println("Новый банк!");
        bemp.setBankName("money network");
        System.out.println(bemp.bankName);

        }
}
