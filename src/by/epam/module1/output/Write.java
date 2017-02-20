package by.epam.module1.output;


import by.epam.module1.numbers.InputNumber;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Write {
    private static final String FILE_PATH;

    static {
        FILE_PATH = "data\\out_result.txt";
    }

    private static final String OUTPUT_TEXT = "Product of numbers multiplication = ";

    public static void writeFile(ArrayList<InputNumber> listResult) {
        String textToWrite = "";
        for (InputNumber inputNumber : listResult) {
            textToWrite += new StringBuilder().append( OUTPUT_TEXT ).append( inputNumber.getInputValue() ).append( "\n" ).toString();
        }
        File file = new File( FILE_PATH );
        boolean isCreated = true;
        if (file.exists()) {
            isCreated = false;
        }
        FileWriter fr = null;
        try {
            fr = new FileWriter( file );
            fr.write( textToWrite );
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                if (isCreated) {
                    System.out.println( "File was created" );
                } else {
                    System.out.println( "File was overwritten" );
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
