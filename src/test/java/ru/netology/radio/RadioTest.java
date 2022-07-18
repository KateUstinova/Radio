package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //станции
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMoreMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(12);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-2);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldNextMaxStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    public void shouldNextMinStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMinStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevLessMinStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(-2);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevMaxStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevMoreMaxStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(15);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //громкость
    @Test
    public void shouldIncreaseVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseMinVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseMaxVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseMoreMaxVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(20);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseLessMinVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(-5);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.decreaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseLessMinVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(-2);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
