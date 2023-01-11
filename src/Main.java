public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр "," Пушкин");
        Author dostoevsky = new Author("Фёдор "," Достоевский");
    Book monument = new Book("Памятник",pushkin,1873);
    Book whiteNights = new Book("Белые ночи",dostoevsky,1848);
        System.out.println("Книга " + monument.getName());
        System.out.println("Автор : " + pushkin.getName() + monument.getAuthor());
        System.out.println("Дата издания : " + monument.getPublishingYear());

        System.out.println("Книга : " + whiteNights.getName());
        System.out.println("Автор : " + dostoevsky.getName() + whiteNights.getAuthor());
        System.out.println("Дата издания : " + whiteNights.getPublishingYear());

        monument.setPublishingYear(2022);
        System.out.println("monument.getPublishingYear() = " + monument.getPublishingYear());
    }
}