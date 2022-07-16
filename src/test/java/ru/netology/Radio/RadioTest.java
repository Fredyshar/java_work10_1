package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
@Test
    public void shouldSetAnyNumberPosition() {
    Radio radio = new Radio();
    radio.currentNumberPosition = 5;
    radio.setCurrentNumberPosition(15);

    int expected = 5;
    int actual = radio.getCurrentNumberPosition();

    Assertions.assertEquals(expected, actual);
}
    @Test
    public void shouldSetNextNumberPosition() {
        Radio radio = new Radio();
        radio.currentNumberPosition = 5;
        radio.nextCurrentNumberPosition();

        int expected = 6;
        int actual = radio.getCurrentNumberPosition();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevNumberPosition() {

        Radio radio = new Radio();
        radio.currentNumberPosition = 3;
        radio.prevCurrentNumberPosition();

        int expected = 2;
        int actual = radio.getCurrentNumberPosition();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeFor1() {

        Radio radio = new Radio();
        radio.currentVolume = 3;
        radio.increaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetDecreaseVolumeFor1() {

        Radio radio = new Radio();
        radio.currentVolume = 3;
        radio.decreaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
