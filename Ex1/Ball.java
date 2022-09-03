package Ex1;

public class Ball {
    public int size;
    public String brand;

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
