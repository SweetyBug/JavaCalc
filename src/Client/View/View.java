package Client.View;

import Core.Models.Menu;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title){
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public void print(String data, String title){
        System.out.printf("%s %s", title, data);
        System.out.println();
    }

    //Меню выбора действия
    public int choiceMenu(){
        Menu menu = new Menu();
        menu.getMenu();
        System.out.println("---------------------------");
        System.out.println("Действие: ");
        int user = in.nextInt();
        return user;
    }
    //Меню выбора чисел
    public int choice() {
        System.out.println("1. Комлексные числа");
        System.out.println("2. Рациональные числа");
        System.out.println("---------------------------");
        System.out.println("Выбор: ");
        int user = in.nextInt();
        return user;
    }

    //Обнулению имеющегося результата
    public double zeroingOut() {
        return 0.0;
    }

}
