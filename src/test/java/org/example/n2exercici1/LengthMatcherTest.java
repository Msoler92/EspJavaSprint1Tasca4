package org.example.n2exercici1;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LengthMatcherTest {
    public static Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher,
                "a String of length that", "length") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }

    //This test will fail
    @Test
    void mordorIsLength8() {
        assertThat("Mordor", length(is(8)));
    }

    //This test will succeed
    @Test
    void celebornIsLength8() {
        assertThat("Celeborn", length(is(8)));
    }

    //This test will succeed
    @Test
    void mordorIsLength6() {
        assertThat("Mordor", length(is(6)));
    }
}
