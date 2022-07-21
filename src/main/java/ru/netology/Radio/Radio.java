package ru.netology.Radio;

public class Radio {
    private int amountPosition = 10;


    private int minCurrentNumberPosition = 0;
    private int maxCurrentNumberPosition = amountPosition - 1;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentNumberPosition = minCurrentNumberPosition;
    private int currentVolume = minVolume;

    public Radio(int amountPosition) {
        this.amountPosition = amountPosition;

    }

    public int getCurrentNumberPosition() {
        return currentNumberPosition;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
/*
    public int getMinCurrentNumberPosition() {
    return minCurrentNumberPosition;
    }
    public int getMaxCurrentNumberPosition() {
        return maxCurrentNumberPosition;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }

 */

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setCurrentNumberPosition(int newCurrentNumberPosition) {        // выставление радиостанции напрямую
        if (newCurrentNumberPosition < minCurrentNumberPosition) {
            return;
        }
        if (newCurrentNumberPosition > maxCurrentNumberPosition) {
            return;
        }
        currentNumberPosition = newCurrentNumberPosition;
    }


    public void nextCurrentNumberPosition() {        // нажатие на кнопку next
        if (currentNumberPosition == maxCurrentNumberPosition) {
            currentNumberPosition = minCurrentNumberPosition;
            return;
        }
        currentNumberPosition = currentNumberPosition + 1;
    }


    public void prevCurrentNumberPosition() {        // нажатие на кнопку prev

        if (currentNumberPosition == minCurrentNumberPosition) {
            currentNumberPosition = maxCurrentNumberPosition;
            return;
        }
        currentNumberPosition = currentNumberPosition - 1;
    }


    public void increaseVolume() {                            // увеличение громкости

        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }

    }

    public void decreaseVolume() {                            // уменьшение громкости

        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return;
        }

        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}

