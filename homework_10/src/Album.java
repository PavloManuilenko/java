
public class Album {
    String name;
    Page[] pages = new Page[20];
    public void Album(String name){
        this.name=name;
    }
    public void setPhotoTitle (String title, int photoNum, int pageNum){
        if(pageNum < pages.length && pageNum > -1 && pages[photoNum] != null) {

            pages[pageNum].setPhotoTitle(title, photoNum);
        }
    }
}