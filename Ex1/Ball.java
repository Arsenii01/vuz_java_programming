package Ex1;

public class Ball {
    private int size;
    private String brand;

    public Ball(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public Ball(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                '}';
    }


}
