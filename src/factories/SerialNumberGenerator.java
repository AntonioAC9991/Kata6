package factories;

public class SerialNumberGenerator {
    private Integer SerialNumber;

    public SerialNumberGenerator() {
        this.SerialNumber = 0;
    }
    public Integer next() {
        return SerialNumber++;
    }
}
