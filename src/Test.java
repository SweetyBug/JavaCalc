import Core.Models.*;
import Core.Presenters.Presenter;
import Core.View.View;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        View view = new View();
        double lastResult = 0.0;
        boolean program = true;
        while (program) {
            if (lastResult == 0.0) {
                int choiceUser = view.choice();
                if (choiceUser == 1) {
                    choiceUser = view.choiceMenu();
                    switch (choiceUser) {
                        case 1:
                            Presenter<Sum> pSum = new Presenter<>(new Sum(), new View());
                            pSum.buttonClickComplex();
                            break;
                        case 2:
                            Presenter<Substation> pSub = new Presenter<>(new Substation(), new View());
                            pSub.buttonClickComplex();
                            break;
                        case 3:
                            Presenter<Division> pDiv = new Presenter<>(new Division(), new View());
                            pDiv.buttonClickComplex();
                            break;
                        case 4:
                            Presenter<Multiplication> pMul = new Presenter<>(new Multiplication(), new View());
                            pMul.buttonClickComplex();
                            break;
                        case 5:
                            lastResult = view.zeroingOut();
                            break;
                        case 6:
                            program = false;
                            break;
                    }
                } else if (choiceUser == 2) {
                    double number = view.getValue("Введите число: ");
                    switch (choiceUser) {
                        case 1:
                            Presenter<Sum> pSum = new Presenter<>(new Sum(), new View());
                            lastResult = pSum.buttonClick(number);
                            break;
                        case 2:
                            Presenter<Substation> pSub = new Presenter<>(new Substation(), new View());
                            lastResult = pSub.buttonClick(number);
                            break;
                        case 3:
                            Presenter<Division> pDiv = new Presenter<>(new Division(), new View());
                            lastResult = pDiv.buttonClick(number);
                            break;
                        case 4:
                            Presenter<Multiplication> pMul = new Presenter<>(new Multiplication(), new View());
                            lastResult = pMul.buttonClick(number);
                            break;
                        case 5:
                            lastResult = view.zeroingOut();
                            break;
                        case 6:
                            program = false;
                            break;
                    }
                } else {
                    return;
                }
            } else {
                int choiceUser = view.choiceMenu();
                switch (choiceUser) {
                    case 1:
                        Presenter<Sum> pSum = new Presenter<>(new Sum(), new View());
                        lastResult = pSum.buttonClick(lastResult);
                        break;
                    case 2:
                        Presenter<Substation> pSub = new Presenter<>(new Substation(), new View());
                        lastResult = pSub.buttonClick(lastResult);
                        break;
                    case 3:
                        Presenter<Division> pDiv = new Presenter<>(new Division(), new View());
                        lastResult = pDiv.buttonClick(lastResult);
                        break;
                    case 4:
                        Presenter<Multiplication> pMul = new Presenter<>(new Multiplication(), new View());
                        lastResult = pMul.buttonClick(lastResult);
                        break;
                    case 5:
                        lastResult = view.zeroingOut();
                        break;
                    case 6:
                        program = false;
                        break;
                }
            }
        }
    }
}
