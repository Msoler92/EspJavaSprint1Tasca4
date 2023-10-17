package org.example.n3exercici1;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class AnimalTest {
    @Test
    void equalObjectValueTest () {
        Animal a1 = new Animal("Cat", 25);
        Animal a2 = new Animal("Cat", 25);
        Animal a3 = new Animal("Dog", 25);

        assertThat(a1).usingRecursiveComparison().isEqualTo(a2);
        assertThat(a1).usingRecursiveComparison().isNotEqualTo(a3);
    }
}
