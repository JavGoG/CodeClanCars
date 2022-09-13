package carComponents;

public class Tyres {
    private final int  size;
    private final String season;

    public int getSize() {
        return size;
    }

    public String getSeason() {
        return season;
    }

    public Tyres(int size, String season) {
        this.size = size;
        this.season = season;
    }
}
