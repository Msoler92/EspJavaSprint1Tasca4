package org.example.n3exercici4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MultiObjectArrayListTest {
    @Test
    void listContains() {
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>(List.of("This", "is", "a", "String", "List"));
        list.add("Hello!");
        list.add("Hello!");
        list.add(1);
        list.add(new ArrayList<>(List.of("A", "B")));
        list.add(strings);

        assertThat(list).contains(1, "Hello!", "Hello!", new ArrayList<>(List.of("A", "B")), strings);
        assertThat(list).containsOnlyOnce(1);
        assertThat(list).doesNotContain("Good bye!");
    }
}
