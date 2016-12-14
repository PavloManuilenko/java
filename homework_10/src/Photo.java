
public class Photo {
    String title;
    String url;
    public Photo(String title) {
        this.title = title;
    }
    public Photo(String title, String url) {
        this.title = title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Photo) {
            Photo photo = (Photo)obj;
            if (this.title != null && photo.title != null) {
                return photo.title.equals(((Photo) obj).title);
            }
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash  = 1;
        hash += this.title.hashCode();
        hash += this.url.hashCode();
        return hash;
    }
}
