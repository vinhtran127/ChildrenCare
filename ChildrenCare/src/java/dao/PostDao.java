package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Models.CategoryPost;
import Models.Post;


public class PostDao {

    DBContext bContext;

    public PostDao() {
        this.bContext = new DBContext();
    }
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
//count total of posts
    public int getTotalPost() {
        int result = 0;
        try {
            String querry = "SELECT COUNT(dbo.Posts.ID)AS totalPosts FROM dbo.Posts";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            rs = ps.executeQuery();
            rs.next();
            result = Integer.parseInt(rs.getString("totalPosts"));
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return result;
    }
    //count total post by category
    public int getTotalPostByCategory(int id) {
        int result = 0;
        try {
            String querry = "SELECT COUNT(dbo.Posts.ID)AS totalPosts FROM dbo.Posts WHERE CategoryId = ?; ";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            result = Integer.parseInt(rs.getString("totalPosts"));
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return result;
    }
    //list three latest posts

    public List<Post> getPosts() {
        List<Post> listPost = new ArrayList<Post>();
        try {

            String querry = "SELECT TOP 3 cp.ID AS categoryId,p.id,cp.PostName,p.Title,p.Content,p.[Description],p.UpdateDate,p.ThumbnailLink,p.Author FROM dbo.Posts\n" +
"AS p INNER JOIN dbo.CategoryPost AS cp ON cp.ID = p.CategoryId ORDER BY p.UpdateDate desc";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setAuthor(rs.getString("Author"));
                p.setCategory(new CategoryPost(rs.getInt("categoryId"), rs.getString("PostName")));
                p.setContent(rs.getString("Content"));
                p.setDescription(rs.getString("Description"));
                p.setThumbnailLink(rs.getString("ThumbnailLink"));
                p.setTitle(rs.getString("Title"));
                p.setUpdateDate(rs.getString("UpdateDate"));
                listPost.add(p);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return listPost;
    }

//list 6 posts by pagination
    public List<Post> getAllPosts(int pageNumber) {
        List<Post> listPost = new ArrayList<Post>();
        try {

            String querry = "SELECT  cp.ID AS categoryId,p.id,cp.PostName,p.Title,p.Content,p.[Description],p.UpdateDate,p.ThumbnailLink,p.Author \n"
                    + "FROM dbo.Posts AS p INNER JOIN dbo.CategoryPost AS cp ON cp.ID = p.CategoryId \n"
                    + "ORDER BY p.UpdateDate DESC OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setInt(1, pageNumber*6);
            rs = ps.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setAuthor(rs.getString("Author"));
                p.setCategory(new CategoryPost(rs.getInt("categoryId"), rs.getString("PostName")));
                p.setContent(rs.getString("Content"));
                p.setDescription(rs.getString("Description"));
                p.setThumbnailLink(rs.getString("ThumbnailLink"));
                p.setTitle(rs.getString("Title"));
                p.setUpdateDate(rs.getString("UpdateDate"));
                listPost.add(p);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return listPost;
    }

    //list all category of post
    public List<CategoryPost> getCategoryPost() {
        List<CategoryPost> listCategoryPost = new ArrayList<CategoryPost>();
        try {

            String querry = "SELECT * FROM dbo.CategoryPost";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {
                CategoryPost p = new CategoryPost();
                p.setId(rs.getInt("ID"));
                p.setName(rs.getString("PostName"));
                listCategoryPost.add(p);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return listCategoryPost;
    }
//get post by id

    public Post getPost(int index) {
        Post p = new Post();
        try {

            String querry = "SELECT cp.ID AS categoryId,p.id, cp.PostName,p.Title,p.Content,p.[Description],p.UpdateDate,p.ThumbnailLink,p.Author\n"
                    + "FROM dbo.Posts AS p INNER JOIN dbo.CategoryPost AS cp ON cp.ID = p.CategoryId WHERE p.ID=?\n"
                    + "ORDER BY p.UpdateDate DESC ";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setInt(1, index);
            rs = ps.executeQuery();
            rs.next();

            p.setId(rs.getInt("id"));
            p.setAuthor(rs.getString("Author"));
            p.setCategory(new CategoryPost(rs.getInt("categoryId"), rs.getString("PostName")));
            p.setContent(rs.getString("Content"));
            p.setDescription(rs.getString("Description"));
            p.setThumbnailLink(rs.getString("ThumbnailLink"));
            p.setTitle(rs.getString("Title"));
            p.setUpdateDate(rs.getString("UpdateDate"));

        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return p;
    }

    //get prev-next post
    public List<Post> getPreNextPost(int index) {
        List<Post> listPost = new ArrayList<Post>();
        try {

            String querry = "SELECT p.id ,p.Title,p.ThumbnailLink FROM dbo.Posts AS p WHERE p.ID = ? OR p.ID = ?;";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setInt(1, index - 1);
            ps.setInt(2, index + 1);
            rs = ps.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setThumbnailLink(rs.getString("ThumbnailLink"));
                p.setTitle(rs.getString("Title"));
                listPost.add(p);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return listPost;
    }
// get posts by title
    public List<Post> getPostsByTitle(String txt) {
        List<Post> listPost = new ArrayList<Post>();
        try {

            String querry = "SELECT top 6 cp.ID AS categoryId,p.id, cp.PostName,p.Title,p.Content,p.[Description],p.UpdateDate,p.ThumbnailLink,p.Author\n" +
"FROM dbo.Posts AS p INNER JOIN dbo.CategoryPost AS cp ON cp.ID = p.CategoryId WHERE p.Title LIKE ? ";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setString(1,"%"+ txt+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setAuthor(rs.getString("Author"));
                p.setCategory(new CategoryPost(rs.getInt("categoryId"), rs.getString("PostName")));
                p.setContent(rs.getString("Content"));
                p.setDescription(rs.getString("Description"));
                p.setThumbnailLink(rs.getString("ThumbnailLink"));
                p.setTitle(rs.getString("Title"));
                p.setUpdateDate(rs.getString("UpdateDate"));
                listPost.add(p);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return listPost;
    }
    //get posts by category
     public List<Post> getPostsByCategory(int pageNumber, int categoryId) {
        List<Post> listPost = new ArrayList<Post>();
        try {

            String querry = "SELECT  cp.ID AS categoryId,p.id,cp.PostName,p.Title,p.Content,p.[Description],p.UpdateDate,p.ThumbnailLink,p.Author \n"
                    + "FROM dbo.Posts AS p INNER JOIN dbo.CategoryPost AS cp ON cp.ID = p.CategoryId WHERE cp.ID = ? \n"
                    + "ORDER BY p.UpdateDate DESC OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setInt(1, categoryId);
            ps.setInt(2, pageNumber*6 );
            rs = ps.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setAuthor(rs.getString("Author"));
                p.setCategory(new CategoryPost(rs.getInt("categoryId"), rs.getString("PostName")));
                p.setContent(rs.getString("Content"));
                p.setDescription(rs.getString("Description"));
                p.setThumbnailLink(rs.getString("ThumbnailLink"));
                p.setTitle(rs.getString("Title"));
                p.setUpdateDate(rs.getString("UpdateDate"));
                listPost.add(p);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return listPost;
    }
      
}
