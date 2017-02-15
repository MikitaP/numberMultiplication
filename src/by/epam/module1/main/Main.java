package by.epam.module1.main;

import by.epam.module1.input.Input;
import by.epam.module1.calc.Calculation;
import by.epam.module1.numbers.InputNumber;
import by.epam.module1.output.Write;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<InputNumber> inputList = Input.readFile();
        Write.writeFile( Calculation.productNumbers( inputList ) );
    }
}
