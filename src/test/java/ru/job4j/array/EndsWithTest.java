package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 't', 'o'};
        char[] post = {'t', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'o', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotEndWithPrefixOneThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'t', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isFalse();
    }
}