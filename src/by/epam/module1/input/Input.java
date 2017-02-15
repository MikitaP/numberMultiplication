package by.epam.module1.input;

import by.epam.module1.numbers.InputNumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;


public class Input {
    private static final String FILE_PATH;

    static {
        FILE_PATH = "data\\in_file.txt";
    }

    private static final int invalidNumber = 0;

    public static ArrayList<InputNumber> readFile() throws FileNotFoundException

    {
        Scanner sc = new Scanner( new File( FILE_PATH ) );
        ArrayList<InputNumber> list = new ArrayList<>();
        while (sc.hasNext()) {
            String currVal;
            try {
                currVal = sc.nextLine();
                if (abs( Integer.parseInt( currVal ) / 1000 ) > 1) {
                    list.add( new InputNumber( Integer.parseInt( currVal ) ) );
                } else {
                    list.add( new InputNumber( invalidNumber ) );
                }
            } catch (NumberFormatException e) {
                list.add( new InputNumber( invalidNumber ) );
            }
        }
        return list;
    }
}
