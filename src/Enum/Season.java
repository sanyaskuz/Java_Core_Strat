package Enum;

public enum Season {
    SUMMER(35), WINTER(-10), SPRING(20), AUTUMN(-5);
    private int temperature;



    Season(int temperature) {
        this.temperature = temperature;

    }
    public int getTemperature() {
        return temperature;
    }
}
