/**
 * Created by Yuliya on 22.11.2014.
 */
/*Задание 4.1: Заполните массив String[] names именами и создайте массив String[] greetings с приветствиями.
Например, если names = {"Иван", "Петр"}, то greetings = {"Привет, Иван", "Привет, Петр"}.*/

public class Massiv1 {
    public static void main(String[] args) {
        String names[]={"Иван", "Петр", "Александр","Алексей"};
        for(int i = 0; i < 4; i++){
            System.out.println("Привет, "+names[i] + "!");
        }
    }
}
