package ru.netology.Radio;

public class Radio {
    public int currentNumberPosition;
    public int currentVolume;

    public int getCurrentNumberPosition() {
        return currentNumberPosition;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumberPosition(int newCurrentNumberPosition) {        // выставление радиостанции напрямую
        if (newCurrentNumberPosition <= 0) {
            return;
        }
        if (newCurrentNumberPosition >= 10) {
            return;
        }
        currentNumberPosition = newCurrentNumberPosition;
    }


    public void nextCurrentNumberPosition() {        // нажатие на кнопку next
        if (currentNumberPosition == 9) {
            currentNumberPosition = 0;
            return;
        }
        currentNumberPosition = currentNumberPosition + 1;
    }


    public void prevCurrentNumberPosition() {        // нажатие на кнопку prev

        if (currentNumberPosition == 0) {
            currentNumberPosition = 9;
            return;
        }
        currentNumberPosition = currentNumberPosition - 1;
    }


    public void increaseVolume() {                            // увеличение громкости
        if (currentVolume == 10) {
            return;
        }

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {                            // уменьшение громкости
        if (currentVolume == 0) {
            return;
        }

        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }
}

