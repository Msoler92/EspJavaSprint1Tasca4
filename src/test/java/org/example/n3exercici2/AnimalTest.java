package org.example.n3exercici2;


import org.example.n3exercici1.Animal;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AnimalTest {
    @Test
    void equalObjectValueTest () {
        org.example.n3exercici1.Animal a1 = new org.example.n3exercici1.Animal("Cat", 25);
        org.example.n3exercici1.Animal a2 = a1;
        org.example.n3exercici1.Animal a3 = new Animal("Cat", 25);

        assertThat(a1).isEqualTo(a2);
        assertThat(a1).isNotEqualTo(a3);
    }
}
