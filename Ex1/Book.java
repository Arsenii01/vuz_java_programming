package Ex1;

public class Book {
    private String name;
    private int year;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void classics() {
        System.out.println("Книга " + name + " - настоящая классика в мире литературы");
    }
}
