
public class Main {

    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package pack = new Package();
        pack.addGift(book);
        System.out.println(pack.totalWeight());
    }
}
