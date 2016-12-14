
public class Album {
    String name;
    Page[] pages = new Page[20];
    public void Album(String name){
        this.name = name;
    }
    public void setPhotoTitle (String title, int photoNum, int pageNum){
        if(pageNum < pages.length && pageNum > -1 && pages[photoNum] != null) {
            pages[pageNum].setPhotoTitle(title, photoNum);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Album) {
            Album album = (Album)obj;
            if (this.name != null && album.name != null) {
                return album.name.equals(this.name);
            }
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash *= name.hashCode();
        return hash;
    }
}