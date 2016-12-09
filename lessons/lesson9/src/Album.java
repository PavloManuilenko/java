
public class Album {
    String name;
    Page[] pages = new Page[10];

    public void setPhotoTitle(String title, int photoNum, int pageNum){
        if (pageNum < pages.length && pageNum > -1 && pages[pageNum] != null) {
            pages[pageNum].setPhotoTitle(title, photoNum);
        }
    }

}
