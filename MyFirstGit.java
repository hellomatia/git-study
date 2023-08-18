public class MyFirstGit {
    public static void main(String[] args) {
        System.out.println("Hello matia!");
        System.out.println("Bye matia...");

        String[] name = {"이지표", "matia"};
        int age = 25;

        Bye bye = new Bye();
        Hello hello = new Hello();

        bye.printBye();
        hello.printHello();

        for (int i = 0; i < 3; i++) {
            System.out.println("HaHa");
        }
    }
}
