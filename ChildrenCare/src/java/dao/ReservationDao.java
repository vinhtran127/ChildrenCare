/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Models.Reservation;
import Models.ReservationService;
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
 * @author vinh2
 */
public class ReservationDao {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<ReservationService> getUserReservationOnPage(int userID, int indexPage) throws Exception {
        String query = "WITH tempTable \n"
                + "AS \n"
                + "(SELECT ROW_NUMBER() OVER (ORDER BY rs.id) as rn, s.SalePrice, rs.CheckUpTime, rs.Dob, rs.ID, rs.IdReservation, rs.NumberOfPeople, rs.[Status], s.[Name] AS 'sName',\n"
                + "rs.IdService, r.Email, r.Phone, r.ReservationDate, r.TotalCost, r.[Name]  FROM ReservationService rs\n"
                + "JOIN Reservation r ON rs.IdReservation = r.ID\n"
                + "JOIN [Service] s ON rs.IdService = s.ID WHERE r.UserId = ?)\n"
                + "SELECT * FROM tempTable WHERE rn between  4*?-3 and 4*?";
        List<ReservationService> listRS = new ArrayList<>();
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, userID);
            ps.setInt(2, indexPage);
            ps.setInt(3, indexPage);
            rs = ps.executeQuery();
            while (rs.next()) {
                ReservationService o = new ReservationService();
                o.setId(rs.getInt("ID"));
                o.setCheckUpDate(rs.getDate("CheckUpTime"));
                o.setReservation(new Reservation(rs.getInt("IdReservation"),
                        rs.getDate("ReservationDate"),
                        rs.getString("Phone"),
                        rs.getString("Email"),
                        rs.getFloat("TotalCost"),
                        rs.getString("Name")));
                o.setNumberOfPeople(rs.getInt("NumberOfPeople"));
                o.setStatus(rs.getInt("Status"));
                o.setService(new Service(rs.getInt("IdService"), rs.getString("sName"), rs.getFloat("SalePrice")));
                listRS.add(o);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return listRS;
    }

    public int CountRecordReservationService(int userID) {
        try {
            String query = "SELECT COUNT(*) FROM  ReservationService rs\n"
                    + "JOIN  Reservation r ON rs.IdReservation = r.ID\n"
                    + "JOIN [Service] s ON rs.IdService = s.ID WHERE r.UserId = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
            e.getMessage();
        }
        return 0;
    }

    public int CountRecordReservationService_2() {
        try {
            String query = "SELECT COUNT(*) FROM  ReservationService rs\n"
                    + "JOIN  Reservation r ON rs.IdReservation = r.ID\n"
                    + "JOIN [Service] s ON rs.IdService = s.ID\n"
                    + "JOIN [Users] u ON u.Id= r.UserID ";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
            e.getMessage();
        }
        return 0;
    }

    public void cancelReservation(int rsID) {
        try {
            String query = "UPDATE ReservationService\n"
                    + "SET Status = 2\n"
                    + "WHERE ID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, rsID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void rejectReservation(int rsID) {
        try {
            String query = "UPDATE ReservationService\n"
                    + "SET Status = 3\n"
                    + "WHERE ID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, rsID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
        public void completeReservation(int rsID) {
        try {
            String query = "UPDATE ReservationService\n"
                    + "SET Status = 4\n"
                    + "WHERE ID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, rsID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void UpdateReservation(int rID, float totalCost) {
        try {
            String query = "UPDATE Reservation\n"
                    + "SET TotalCost = ?\n"
                    + "WHERE ID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setFloat(1, totalCost);
            ps.setInt(2, rID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void UpdateReservationService(int rID, int numberOfPeople, int serviceID, String checkUpDate) {
        try {
            String query = "UPDATE ReservationService\n"
                    + "SET NumberOfPeople =?, IdService = ? , CheckUpTime = ?\n"
                    + "WHERE IdReservation = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, numberOfPeople);
            ps.setInt(2, serviceID);
            ps.setString(3, checkUpDate);
            ps.setInt(4, rID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void InsertToReservation(int id, Float totalCost, String username, String sDate, String fullName, String mobile, String email) {
        String query = "INSERT INTO [dbo].[Reservation]\n"
                + "           ([UserId]\n"
                + "           ,[TotalCost]\n"
                + "           ,[Doctor]\n"
                + "           ,[ReservationDate]\n"
                + "           ,[Name]\n"
                + "           ,[Phone]\n"
                + "           ,[Email])\n"
                + "     VALUES(?,?,?,?,?,?,?)";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setFloat(2, totalCost);
            ps.setString(3, username);
            ps.setString(4, sDate);
            ps.setString(5, fullName);
            ps.setString(6, mobile);
            ps.setString(7, email);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getNewID() {
        String query = "SELECT MAX(id) as id FROM Reservation";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public void InserToReservationService(int newId, int serviceID, String checkUpDate, int NOP) {
        String query = "INSERT INTO [dbo].[ReservationService]\n"
                + "           ([IdReservation]\n"
                + "           ,[IdService]\n"
                + "           ,[Status]\n"
                + "           ,[CheckUpTime]\n"
                + "           ,[NumberOfPeople])\n"
                + "     VALUES (?,?,1,?,?)";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, newId);
            ps.setInt(2, serviceID);
            ps.setString(3, checkUpDate);
            ps.setInt(4, NOP);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<ReservationService> getReservationOnPage(int indexPage) throws Exception {
        String query = "WITH tempTable \n"
                + "AS \n"
                + "(SELECT ROW_NUMBER() OVER (ORDER BY rs.id) as rn, u.FullName as 'uFullname',u.image ,r.UserID, s.SalePrice, rs.CheckUpTime, rs.Dob, rs.ID, rs.IdReservation, rs.NumberOfPeople, rs.[Status], s.[Name] AS 'sName',\n"
                + "rs.IdService, r.Email, r.Phone, r.ReservationDate, r.TotalCost, r.[Name]  FROM ReservationService rs\n"
                + "JOIN Reservation r ON rs.IdReservation = r.ID\n"
                + "JOIN Users u ON u.id= r.UserID\n"
                + "JOIN [Service] s ON rs.IdService = s.ID)\n"
                + "SELECT * FROM tempTable WHERE rn between  4*?-3 and 4*?";
        List<ReservationService> listRS = new ArrayList<>();
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, indexPage);
            ps.setInt(2, indexPage);
            rs = ps.executeQuery();
            while (rs.next()) {
                ReservationService o = new ReservationService();
                o.setId(rs.getInt("ID"));
                o.setCheckUpDate(rs.getDate("CheckUpTime"));
                o.setReservation(new Reservation(rs.getInt("IdReservation"),
                        new User(rs.getInt("UserID"), rs.getString("uFullname"), rs.getString("image")),
                        rs.getDate("ReservationDate"),
                        rs.getString("Phone"),
                        rs.getString("Email"),
                        rs.getFloat("TotalCost"),
                        rs.getString("Name")));
                o.setNumberOfPeople(rs.getInt("NumberOfPeople"));
                o.setStatus(rs.getInt("Status"));
                o.setService(new Service(rs.getInt("IdService"), rs.getString("sName"), rs.getFloat("SalePrice")));
                listRS.add(o);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return listRS;
    }
}
