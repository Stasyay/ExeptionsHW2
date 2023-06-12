/*  4.Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception {

        System.out.println(inputString());
    }
    public static String inputString() throws Exception {

            System.out.print("\n Введите что-нибудь: ");

            Scanner scanner = new Scanner(System.in);

            String string = "";
            string = scanner.nextLine();

                if(string.isEmpty()){
                    throw new Exception("\n Пустую строку вводить нельзя!");
                }
                if(string.trim().isEmpty()){
                    throw new Exception("\n Пробелы нельзя ;)");
                }

        return string;
    }
}


