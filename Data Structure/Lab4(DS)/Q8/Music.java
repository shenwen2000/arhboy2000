package Q8;
public class Music {
    
    private String title;
    private String fileName;

    public Music(String title, String fileName) {
        this.title = title;
        this.fileName = fileName;
    }

    public String getTitle() {
        return title;
    }

    public String getFileName() {
        return fileName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String toString(){
        return title +" --> " ;
    }
}
