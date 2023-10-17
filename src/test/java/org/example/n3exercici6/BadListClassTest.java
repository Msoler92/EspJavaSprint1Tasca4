package org.example.n3exercici6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BadListClassTest {
    @Test
    void throwsArrayIndexOutOfBoundsException() {
        String[] array = {"A", "B"};
        BadListClass badList = new BadListClass(array);

        assertThatThrownBy(() -> badList.getElement(3)).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
