package by.epam.module1.main;

import by.epam.module1.input.Input;
import by.epam.module1.calc.Calculation;
import by.epam.module1.numbers.InputNumber;
import by.epam.module1.output.Print;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<InputNumber> inputList = Input.readFile();
        Print.writeFile( Calculation.productNumbers( inputList ) );
    }
}
