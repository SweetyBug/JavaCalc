package Client.View;
import Core.Models.*;
import Core.Presenters.Presenter;

public class Program {
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
                        case 1 -> {
                            Presenter<Sum> pSum = new Presenter<>(new Sum(), new View());
                            pSum.buttonClickComplex();
                        }
                        case 2 -> {
                            Presenter<Substation> pSub = new Presenter<>(new Substation(), new View());
                            pSub.buttonClickComplex();
                        }
                        case 3 -> {
                            Presenter<Division> pDiv = new Presenter<>(new Division(), new View());
                            pDiv.buttonClickComplex();
                        }
                        case 4 -> {
                            Presenter<Multiplication> pMul = new Presenter<>(new Multiplication(), new View());
                            pMul.buttonClickComplex();
                        }
                        case 5 -> lastResult = view.zeroingOut();
                        case 6 -> program = false;
                    }
                } else if (choiceUser == 2) {
                    double number = view.getValue("Введите число: ");
                    switch (choiceUser) {
                        case 1 -> {
                            Presenter<Sum> pSum = new Presenter<>(new Sum(), new View());
                            lastResult = pSum.buttonClick(number);
                        }
                        case 2 -> {
                            Presenter<Substation> pSub = new Presenter<>(new Substation(), new View());
                            lastResult = pSub.buttonClick(number);
                        }
                        case 3 -> {
                            Presenter<Division> pDiv = new Presenter<>(new Division(), new View());
                            lastResult = pDiv.buttonClick(number);
                        }
                        case 4 -> {
                            Presenter<Multiplication> pMul = new Presenter<>(new Multiplication(), new View());
                            lastResult = pMul.buttonClick(number);
                        }
                        case 5 -> lastResult = view.zeroingOut();
                        case 6 -> program = false;
                    }
                } else {
                    return;
                }
            } else {
                int choiceUser = view.choiceMenu();
                switch (choiceUser) {
                    case 1 -> {
                        Presenter<Sum> pSum = new Presenter<>(new Sum(), new View());
                        lastResult = pSum.buttonClick(lastResult);
                    }
                    case 2 -> {
                        Presenter<Substation> pSub = new Presenter<>(new Substation(), new View());
                        lastResult = pSub.buttonClick(lastResult);
                    }
                    case 3 -> {
                        Presenter<Division> pDiv = new Presenter<>(new Division(), new View());
                        lastResult = pDiv.buttonClick(lastResult);
                    }
                    case 4 -> {
                        Presenter<Multiplication> pMul = new Presenter<>(new Multiplication(), new View());
                        lastResult = pMul.buttonClick(lastResult);
                    }
                    case 5 -> lastResult = view.zeroingOut();
                    case 6 -> program = false;
                }
            }
        }
    }
}
