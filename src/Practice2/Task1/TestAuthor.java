package Practice2.Task1;

public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Anton", "anton@mail.ru", 'm');
        System.out.println(author);
        author.setEmail("antoon@mail.ru");
        System.out.println(author);
    }
}
