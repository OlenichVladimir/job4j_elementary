package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap0to2() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 0;
        int dest = input.length - 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {3, 2, 1, 4, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 0;
        int dest = input.length - 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1, 5, 6};
        assertThat(result).containsExactly(expected);
    }
}