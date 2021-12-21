package chapter4.ch01;

class Book extends Object {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }
}


public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만헤세");

        System.out.println(book); // -> chapter4.ch01.Book@1cd072a9 실제위치@메모리의 가상 위치(16진수)

        String str = new String("test");
        System.out.println(str.toString());

    }
}
