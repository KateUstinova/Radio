package ru.netology.radio;

public class Radio {
    //станции
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation ) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int nextStation() {
        if (currentStation < maxStation){
            currentStation = currentStation +1;
        } else {
            currentStation = minStation;
        }
        return 0;
    }

    public int prevStation() {
        if (currentStation > minStation){
            currentStation = currentStation -1;
        } else {
            currentStation = maxStation;
        }
        return 0;
    }

    //громкость
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume =  currentVolume - 1;
        }
    }
}
