package Core.Presenters;

import Core.Models.CalcModel;
import Core.Models.Complex;
import Core.Models.Model;
import Client.View.View;

public class Presenter<T extends CalcModel>{
    View view;
    Model model;

    public Presenter(T m, View v){
        this.model = m;
        this.view = v;
    }

    public void buttonClickComplex(){
        double real1 = view.getValue("Введите число 'a': ");
        double image1 = view.getValue("Введите мнимое 'b': ");
        Complex complex1 = new Complex(real1, image1);
        System.out.println();
        System.out.println("Введите данные второго числа");
        double real2 = view.getValue("Введите число 'a': ");
        double image2 = view.getValue("Введите мнимое 'b': ");
        Complex complex2 = new Complex(real2, image2);
        String result = model.resultForComplex(complex1, complex2) + "i";
        view.print(result, "Результат: ");
        System.out.println("------------------------------\n");
    }

    public double buttonClick(double n){
        double y = view.getValue("b: ");
        System.out.println();
        model.setX(n);
        model.setY(y);
        double result = model.result();
        view.print(String.valueOf(result), "Результат: ");
        return result;
    }

}
