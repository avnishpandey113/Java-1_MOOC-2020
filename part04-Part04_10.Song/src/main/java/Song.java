
public class Song {

    private String name;
    private int lengthInSeconds;

    public Song(String name, int length) {
        this.name = name;
        this.lengthInSeconds = length;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.lengthInSeconds;
    }

}
