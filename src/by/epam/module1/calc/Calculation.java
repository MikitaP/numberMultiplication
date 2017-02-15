package by.epam.module1.calc;


import by.epam.module1.numbers.InputNumber;

import java.util.ArrayList;


public class Calculation {

    public static ArrayList<InputNumber> productNumbers(ArrayList<InputNumber> inputList) {
        ArrayList<InputNumber> listProduct = new ArrayList<>();
        for (InputNumber inputNumber : inputList) {
            listProduct.add( new InputNumber( (inputNumber.getInputValue() % 10) * (inputNumber.getInputValue() / 10 % 10) * (inputNumber.getInputValue() / 100 % 10) * (inputNumber.getInputValue() / 1000 % 10) ) );
        }
        return listProduct;
    }
}
