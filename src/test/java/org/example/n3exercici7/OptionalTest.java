package org.example.n3exercici7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class OptionalTest {
    @Test
    void optionalIsEmpty() {
        Optional<String> optional = Optional.empty();
        assertThat(optional).isEmpty();
    }
}
