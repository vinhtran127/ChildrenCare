/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Nguyen Minh Hoang
 */
public class Post {
    private int id;
    private String title;
    private String content;
    private String description;
    private String UpdateDate;
    private String thumbnailLink;
    private String Author;
    private CategoryPost category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(String UpdateDate) {
        this.UpdateDate = UpdateDate;
    }

    public String getThumbnailLink() {
        return thumbnailLink;
    }

    public void setThumbnailLink(String thumbnailLink) {
        this.thumbnailLink = thumbnailLink;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Post() {
    }

    public Post(int id, String title, String content, String description, String UpdateDate, String thumbnailLink, String Author, CategoryPost category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.description = description;
        this.UpdateDate = UpdateDate;
        this.thumbnailLink = thumbnailLink;
        this.Author = Author;
        this.category = category;
    }

    public CategoryPost getCategory() {
        return category;
    }

    public void setCategory(CategoryPost category) {
        this.category = category;
    }

    

    
    
    public String getDatePublic() throws ParseException {
        if(UpdateDate.length()<=7){
            return UpdateDate;
        }
        String s = new SimpleDateFormat("dd-MMM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(UpdateDate));
        StringBuilder str = new StringBuilder(s.substring(0,6));
        str = str.deleteCharAt(2);
        str = str.insert(2," ");
        return str.toString()   ;
    }
public String getDatePublic2() throws ParseException {
        if(UpdateDate.length()<=7){
            return UpdateDate;
        }
        String s = new SimpleDateFormat("dd-MMM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(UpdateDate));
        StringBuilder str = new StringBuilder(s);
        
        str = str.deleteCharAt(6);
        str = str.insert(6,", ");
        return str.toString()   ;
    }

   

   

    
}
