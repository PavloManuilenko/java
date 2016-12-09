
public class Page {
    int pageNum;
    Photo[] photos;
    boolean notFull = true;

    public Page(int pageNum, Photo[] photos) {
        this.pageNum = pageNum;
        this.photos = new Photo[10];
    }

    public void addPhoto(Photo photo) {
        for (int i = 0; i < photos.length && photos[i] == null; i++) {
            photos[i] = photo;
            if (i == photos.length-1) notFull = false;
            break;
        }
    }

    public void setPhotoTitle(String title, int photoNum){
        if (photoNum < photos.length && photoNum > -1 && photos[photoNum] != null) {
            photos[photoNum].setTitle(title);
        }
    }
}

