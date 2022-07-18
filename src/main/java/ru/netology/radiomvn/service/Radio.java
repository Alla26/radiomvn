package ru.netology.radiomvn.service;

public class Radio {

    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = 9;
    private int currentNumberRadioStation = minNumberRadioStation;

    // private int maxcurrentVolume;
    //  private int mincurrentVolume;
    private int currentVolume;

    public Radio(int size) {
        maxNumberRadioStation = size - 1;

    }

    public Radio(/*int minNumberRadioStation, int maxNumberRadioStation*/) {
       /* this.maxNumberRadioStation = maxNumberRadioStation;
        this.minNumberRadioStation = minNumberRadioStation;
        this.currentNumberRadioStation = minNumberRadioStation;*/

    }


    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {

        if (newCurrentNumberRadioStation >= minNumberRadioStation) {
            if (newCurrentNumberRadioStation <= maxNumberRadioStation) {
                currentNumberRadioStation = newCurrentNumberRadioStation;
            }
        }

        if (newCurrentNumberRadioStation < minNumberRadioStation) {
            newCurrentNumberRadioStation = maxNumberRadioStation;
            //return;
        }
        if (newCurrentNumberRadioStation > maxNumberRadioStation) {
            newCurrentNumberRadioStation = minNumberRadioStation;
            return;
        }

        currentNumberRadioStation = newCurrentNumberRadioStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 100) {
            newCurrentVolume = 100;
        }

        if (newCurrentVolume > 0) {
            if (newCurrentVolume < 100) {
                currentVolume = newCurrentVolume;
            }
        }
        if (newCurrentVolume <= 0) {
            newCurrentVolume = 0;
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } /*else currentVolume = 100;*/
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } /*else currentVolume = 0;*/
    }

    public void nextNumberRadioStation() {
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
        } else currentNumberRadioStation = 0;
    }


    public void prevNumberRadioStation() {
        if (currentNumberRadioStation > 0) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
        } else currentNumberRadioStation = 9;
    }


}
