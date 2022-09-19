package Models;
public class CategoryService {
    private int id;
    private String name;
    private String thumbnail;
    private String shortDescription;

    public CategoryService() {
    }

    public CategoryService(int id, String name, String thumbnail, String shortDescription) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.shortDescription = shortDescription;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
    
    
}
