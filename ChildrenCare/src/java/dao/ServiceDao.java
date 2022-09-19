package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Models.CategoryService;
import Models.Service;

public class ServiceDao {

    DBContext bContext;

    public ServiceDao() {
        this.bContext = new DBContext();
    }
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    //list all category service
    public List<CategoryService> getCategoryService() {
        List<CategoryService> list = new ArrayList<CategoryService>();
        try {

            String querry = "SELECT * FROM dbo.CategoryService";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {
                CategoryService cs = new CategoryService();
                cs.setId(rs.getInt("ID"));
                cs.setName(rs.getString("CategoryName"));
                cs.setThumbnail(rs.getString("thumbnail"));
                cs.setShortDescription(rs.getString("ShortDescription"));
                list.add(cs);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return list;
    }

    public List<Service> getAllService() {
        List<Service> listS = new ArrayList<>();
        try {

            String query = "SELECT * FROM dbo.Service where status = 1";
            con = bContext.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Service s = new Service();
                s.setId(rs.getInt("ID"));
                s.setFullname(rs.getString("Name"));
                s.setSalePrice(rs.getFloat("SalePrice"));
                s.setStatus(rs.getInt("Status"));
                listS.add(s);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return listS;
    }

}
