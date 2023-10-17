package org.example.n3exercici5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

public class MapTest {
    @Test
    void mapContainsKey() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Pere", "JAVA");

        assertThat(map).containsKey("Pere");
    }

}
