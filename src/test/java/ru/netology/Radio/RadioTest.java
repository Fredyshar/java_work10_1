package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
@ParameterizedTest
@CsvFileSource(files = "src/test/resources/data1.csv")
    public void shouldSetAnyNumberPosition(int currentNumberPositionNow, int numberSelectedStation, int expected) {
    Radio radio = new Radio();
    radio.currentNumberPosition = currentNumberPositionNow;
    radio.setCurrentNumberPosition(numberSelectedStation);

//    int expected = 5;
    int actual = radio.getCurrentNumberPosition();

    Assertions.assertEquals(expected, actual);
}
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data2.csv")
    public void shouldSetNextNumberPosition(int currentNumberPositionNow, int expected) {
        Radio radio = new Radio();
        radio.currentNumberPosition = currentNumberPositionNow;
        radio.nextCurrentNumberPosition();

//        int expected = 6;
        int actual = radio.getCurrentNumberPosition();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data3.csv")
    public void shouldSetPrevNumberPosition(int currentNumberPositionNow, int expected) {

        Radio radio = new Radio();
        radio.currentNumberPosition = currentNumberPositionNow;
        radio.prevCurrentNumberPosition();

//        int expected = 2;
        int actual = radio.getCurrentNumberPosition();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data4.csv")
    public void shouldSetIncreaseVolumeFor1(int currentVolumeNow, int expected) {

        Radio radio = new Radio();
        radio.currentVolume = currentVolumeNow;
        radio.increaseVolume();

//        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data5.csv")
    public void shouldSetDecreaseVolumeFor1(int currentVolumeNow, int expected) {

        Radio radio = new Radio();
        radio.currentVolume = currentVolumeNow;
        radio.decreaseVolume();

//        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
