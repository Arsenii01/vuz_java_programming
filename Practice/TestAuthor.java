package Practice;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Сергей Есенин", "cMeRTb@mail.ru", 'M');
        System.out.println(author1.getEmail());
        System.out.println(author1.getName());
        System.out.println(author1.getGender());
        author1.setEmail("samoubiistvo@yandex.ru");
        System.out.println(author1.getEmail());
        System.out.println(author1);
    }
}
