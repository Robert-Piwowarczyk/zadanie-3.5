class Televisor {
    String swich;

    Televisor(String s) {
        swich = s;
    }

    void showStatus() {
        System.out.println("Status telewizora: " + swich);
    }

    void turnOn() {
        swich = "on";
    }

    void turnOff() {
        swich = "off";
    }
}
