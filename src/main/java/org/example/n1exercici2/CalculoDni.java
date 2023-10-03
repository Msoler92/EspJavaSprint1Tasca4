package org.example.n1exercici2;

public class CalculoDni {
    private static char[] letterReference = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
    'S', 'Q', 'V', 'H', 'L', 'C', 'K'};


    public static char getLletra(int numDni) {
        return letterReference[numDni%23];
    }
}
