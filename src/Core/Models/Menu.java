package Core.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private List<String> menu = new ArrayList<>(Arrays.asList("+", "-", "/", "*", "AC", "Exit"));

    public void getMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i+1 + ". " + menu.get(i));
        }
    }
}
