package ru.netology.radiomvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberRadioStation() {
        Radio numbStation = new Radio();
        numbStation.setCurrentNumberRadioStation(5);

        int expected = 5;
        int actual = numbStation.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetNumberRadioStationNegative() {
        Radio numbStation = new Radio();
        numbStation.setCurrentNumberRadioStation(-15);

        int expected = 9;
        int actual = numbStation.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetNumberRadioStationPositive() {
        Radio numbStation = new Radio();
        numbStation.setCurrentNumberRadioStation(17);

        int expected = 0;
        int actual = numbStation.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        int expected = 7;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumePositive() {
        Radio volume = new Radio();

        volume.setCurrentVolume(15);

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeNegative() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-30);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeCloseToTheMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(9);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeCloseToTheMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetNumberRadioStationAboveMax() {
        Radio numbStation = new Radio();

        numbStation.setCurrentNumberRadioStation(10);
        //numbStation.currentNumberRadioStation = 10;
       // numbStation.nextNumberRadioStation();

        int expected = 0;
        int actual = numbStation.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetNumberRadioStationAboveMin() {
        Radio numbStation = new Radio();

        numbStation.setCurrentNumberRadioStation(-1);
        //numbStation.currentNumberRadioStation = -1;
       // numbStation.prevNumberRadioStation();

        int expected = 9;
        int actual = numbStation.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetNumberRadioStationCloseToTheMin() {
        Radio numbStation = new Radio();

        numbStation.setCurrentNumberRadioStation(1);
        numbStation.prevNumberRadioStation();

        int expected = 0;
        int actual = numbStation.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetNumberRadioStationCloseToTheMax() {
        Radio numbStation = new Radio();

        numbStation.setCurrentNumberRadioStation(8);
        numbStation.nextNumberRadioStation();

        int expected = 9;
        int actual = numbStation.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetNumberRadioStationMax() {
        Radio numbStation = new Radio();

        numbStation.setCurrentNumberRadioStation(9);
        numbStation.nextNumberRadioStation();

        int expected = 0;
        int actual = numbStation.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetNumberRadioStationMin() {
        Radio numbStation = new Radio();

        numbStation.setCurrentNumberRadioStation(0);
        numbStation.prevNumberRadioStation();

        int expected = 9;
        int actual = numbStation.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);

    }
}
