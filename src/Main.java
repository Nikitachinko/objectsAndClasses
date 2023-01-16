public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр "," Пушкин");
        Author dostoevsky = new Author("Фёдор "," Достоевский");
        Book monument = new Book("Памятник",pushkin,1873);
        Book whiteNights1 = new Book("Белые ночи",dostoevsky,1848);
        Book whiteNights2 = new Book("Белые ночи",dostoevsky,1848);
        System.out.println(monument);
        System.out.println(whiteNights1);

        System.out.println(monument.equals(whiteNights1));
        System.out.println(whiteNights1.equals(whiteNights2));

        System.out.println(monument.hashCode());
        System.out.println(whiteNights1.hashCode());
        System.out.println(whiteNights2.hashCode());

    }
}