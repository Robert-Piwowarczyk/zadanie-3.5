class Test {
    public static void main(String[] args) {
        Televisor televisor = new Televisor("off");
        televisor.showStatus();

        televisor.turnOn();
        televisor.showStatus();

        televisor.turnOff();
        televisor.showStatus();
    }
}
