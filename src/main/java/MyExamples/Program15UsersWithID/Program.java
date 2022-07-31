package MyExamples.Program15UsersWithID;

public class Program {
    public static void main(String[] args) {
        System.out.println(new Id().getId());
        System.out.println(new Id().getId());
        System.out.println(new Id().getId());

        Users alex = new Users("Бахрума", "Пропейлер");
        Users lex = new Users("Бахрума", "Пропейлер");
        System.out.println(alex);
        System.out.println(alex);
        System.out.println(lex);
        System.out.println(lex);
    }
}
