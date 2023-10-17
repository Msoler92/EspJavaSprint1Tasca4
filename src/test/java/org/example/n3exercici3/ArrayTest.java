package org.example.n3exercici3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
public class ArrayTest {
    int[] array1 = {1, 2 ,3, 4, 3};
    int[] array2 = {1, 2 ,3, 4, 3};
    @Test
    void arraysAreEqual() {
        assertThat(array1).containsExactly(array2);
    }
}
