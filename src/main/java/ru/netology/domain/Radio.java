package ru.netology.domain;

public class Radio {

    int currentNumberRadioStation = 5;
    int minNumberRadioStation = 0;
    int maxNumberRadioStation = 9;
    int currentVolume = 5;
    int volumeMin = 0;
    int volumeMax = 10;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int currentNumberRadioStation) {
        this.currentNumberRadioStation = currentNumberRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int changeTheNumberOfTheRadioStation(int intendedStation) {
        if (intendedStation <= 9 && intendedStation >= 0) {
            currentNumberRadioStation = intendedStation;
        }
        return currentNumberRadioStation;
    }

    public void changeTheStationByNextButton() {
        if (currentNumberRadioStation == maxNumberRadioStation) {
            currentNumberRadioStation = 0;
        } else {
            currentNumberRadioStation += 1;
        }
    }

    public void changeTheStationByPrevButton() {
        if (currentNumberRadioStation == minNumberRadioStation) {
            currentNumberRadioStation = 9;
        } else {
            currentNumberRadioStation -= 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume == volumeMax) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == volumeMin) {
            return;
        } else {
            currentVolume -= 1;

        }
    }

}
