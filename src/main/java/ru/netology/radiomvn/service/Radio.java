package ru.netology.radiomvn.service;

public class Radio {
    public int currentNumberRadioStation;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {

        if (newCurrentNumberRadioStation >= 0) {
            if (newCurrentNumberRadioStation <= 9) {
                currentNumberRadioStation = newCurrentNumberRadioStation;
            }
        }

        if (newCurrentNumberRadioStation < 0) {
            newCurrentNumberRadioStation = 9;
            //return;
        }
        if (newCurrentNumberRadioStation > 9) {
            newCurrentNumberRadioStation = 0;
            // return;
        }

        currentNumberRadioStation = newCurrentNumberRadioStation;
    }


    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 10) {
            newCurrentVolume = 10;
        }

        if (newCurrentVolume > 0) {
            if (newCurrentVolume < 10) {
                currentVolume = newCurrentVolume;
            }
        }
        if (newCurrentVolume <= 0) {
            newCurrentVolume = 0;
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {                            //из задания
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } /*else currentVolume = 10;*/
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } /*else currentVolume = 0;*/
    }

  /*  public void nextNumberRadioStation() {
        if (currentNumberRadioStation >= 9) {
            currentNumberRadioStation = 0;
        } else currentNumberRadioStation = currentNumberRadioStation + 1;
    }*/

    public void nextNumberRadioStation() {
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
        } else currentNumberRadioStation = 0;
    }

    /*public void prevNumberRadioStation() {
        if (currentNumberRadioStation <= 0) {
            currentNumberRadioStation = 9;
        } else currentNumberRadioStation = currentNumberRadioStation - 1;
    }*/

    public void prevNumberRadioStation() {
        if (currentNumberRadioStation > 0) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
        } else currentNumberRadioStation = 9;
    }


}
