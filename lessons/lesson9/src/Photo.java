
public class Photo {
    String name;
    String url;

    public Photo(String name) {
        this.name = name;
    }

    public Photo(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void setTitle(String name) {
        this.name = name;
    }
}
