package se.lexicon.util;

import se.lexicon.data_access.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService{

    Scanner scanner = new Scanner(System.in);

    @Override
    public String getString() {
        return "";
    }

    @Override
    public int getInt() {
        return 0;
    }
}
