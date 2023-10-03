package org.example.n1exercici2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoDniTest {
    @ParameterizedTest
    @ValueSource(ints = {23000000, 23000023, 23000046, 23000069, 23232323, 23002300, 46460046, 23000138, 23462346, 46002369})
    void calculEsCorrecteLletraT(int numDni) {
        assertEquals('T', CalculoDni.getLletra(numDni));
    }


}
