package src.BackEnd.Java.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Parser {

    public static String myNewFunction(String question) throws IOException {
        System.out.println(question);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return in.readLine();
    }
}
