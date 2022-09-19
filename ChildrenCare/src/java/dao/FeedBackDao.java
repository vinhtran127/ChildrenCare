/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Models.Feedback;
import Models.Service;
import Models.User;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Minh Hoang
 */
public class FeedBackDao {
    DBContext bContext;
    public FeedBackDao() {
        this.bContext = new DBContext();
    }
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    //list four feedback by pagination
      public List<Feedback> getFeedsBack(int indexPage,String sort) {
          List<Feedback> list= new ArrayList<Feedback>();
        try {
           
            String querry = "WITH t as(SELECT ROW_NUMBER() OVER (ORDER BY "+sort+") as rn,f.ID, u.FullName AS UserName,sr.[Name] AS ServiceName,u.[Image] ,f.[Description],u.PhoneNumber,u.Email,f.RatedStar FROM dbo.Feedback AS f \n" +
"				LEFT JOIN  dbo.Users AS u ON u.ID = f.UserId\n" +
"				LEFT JOIN dbo.[Service] AS sr ON sr.ID = f.IdService )\n" +
"				SELECT * FROM t WHERE rn between (?-1)*4+1 and ?*4 ";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
             //ps.setString(1, sort);
            ps.setInt(1, indexPage);
            ps.setInt(2, indexPage);
           
            rs = ps.executeQuery();
            while (rs.next()) {
               Feedback cs = new Feedback();
               cs.setContent(rs.getString("Description"));
               cs.setUser(new User(rs.getString("Email"),rs.getString("UserName"),rs.getString("PhoneNumber"),rs.getString("Image")));
               cs.setId(rs.getInt("Id"));
               cs.setService(new Service(rs.getString("ServiceName")));
               cs.setRatedStar(rs.getInt("RatedStar"));
               list.add(cs);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return list;
    }
      public int getCountAllFeedsBack() {
        try {
            String querry = "SELECT COUNT(1) FROM dbo.Feedback";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return 0;
    }
      
}
