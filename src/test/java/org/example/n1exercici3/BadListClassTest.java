package org.example.n1exercici3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BadListClassTest {
    @Test
    void throwsIndexOutOfBoundsException() {
        String[] array = {"A", "B"};
        BadListClass badList = new BadListClass(array);
        Exception e = assertThrows(IndexOutOfBoundsException.class, () -> badList.get(3));
    }
}
