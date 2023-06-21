package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenSumEvenNumbersFromThreeToFiveThenFour() {
        int start = 3;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 3;
        int finish = 3;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneHundredTwentyFourThenZero() {
        int start = 1;
        int finish = 124;
        int result = Counter.sumByEven(start, finish);
        int expected = 3906;
        assertThat(result).isEqualTo(expected);
    }
}