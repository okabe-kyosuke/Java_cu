package logic;

public class Animal {
    // フィールド（変数）
    private String name;
    private Double length;
    private Integer speed;

    // setter（thisを使って値をセット）
    public void setName(String name) {
        this.name = name;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    // getter（値を返す）
    public String getName() {
        return name;
    }

    public Double getLength() {
        return length;
    }

    public Integer getSpeed() {
        return speed;
    }
}