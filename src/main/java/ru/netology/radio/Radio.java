package ru.netology.radio;

public class Radio {
    //станции
    private int minStation = 0;
    private int amountStation = 10;
    private int currentStation;
    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }
    public int getCurrentStation() {

        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (amountStation -1 < newCurrentStation ) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public void nextStation() {
        if (currentStation < amountStation -1){
            currentStation = currentStation +1;
        }else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation){
            currentStation = currentStation -1;
        } else {
            currentStation = amountStation -1;
        }
    }

    //громкость
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
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
