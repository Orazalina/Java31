package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void changeTheRadioStation() {
        Radio radio = new Radio();
        assertEquals(7, radio.changeTheNumberOfTheRadioStation(7));
    }

    @Test
    void radioStationNumberIsWrong() {
        Radio radio = new Radio();
        assertEquals(5, radio.changeTheNumberOfTheRadioStation(15));
    }

    @Test
    void changeTheStationByButtonNextAfterNine() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberRadioStation(10);
        radio.changeTheStationByNextButton();
        assertEquals(0, radio.getCurrentNumberRadioStation());
    }

    @Test
    void changeTheStationByButtonPrevAfterNull() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberRadioStation(0);
        radio.changeTheStationByPrevButton();
        assertEquals(10, radio.getCurrentNumberRadioStation());
    }

    @Test
    void changeTheStationByButtonNext() {
        Radio radio = new Radio();
        radio.changeTheStationByNextButton();
        assertEquals(6, radio.getCurrentNumberRadioStation());
    }

    @Test
    void changeTheStationByPrevButton() {
        Radio radio = new Radio();
        radio.changeTheStationByPrevButton();
        assertEquals(4, radio.getCurrentNumberRadioStation());
    }

    @Test
    void changeTheRadioStationb() {
        Radio radio = new Radio();
        assertEquals(5, radio.changeTheNumberOfTheRadioStation(-2));
    }

    @Test
    void volumeAboveMax() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void volumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void volumeIncrease() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void volumeDecrease() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

}