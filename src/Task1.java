/*    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
   Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

 */


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(inputNumberDouble());
    }
    public static double inputNumberDouble(){

        while (true) {

            System.out.print("\n Введите дробное число: ");

            Scanner scanner = new Scanner(System.in);

            double numberDouble = 0;

            try {
                numberDouble = Double.valueOf(scanner.nextLine().trim().replace(",", ".").replace("/","."));
                return numberDouble;
            } catch (NumberFormatException message) {
                message.printStackTrace();
                System.out.println("Что-то пошло не так!!! Попробуйте еще раз:");
            }
        }
    }
}
