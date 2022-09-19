/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Models.Function;
import Models.HistoryEdit;
import Models.Role;
import Models.User;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao {

    DBContext bContext;

    public UserDao() {
        this.bContext = new DBContext();
    }
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public User loginAccount(String email, String password) {
        // User u = new User();
        String query = "select u.*,r.[name] from [dbo].[Users] as u inner "
                + "join roles  as r on r.id = u.roleid  where u.email = ? and u.[password] = ?";
        try {
            con = new DBContext().getConnection();//mo ket noi voi sql
            ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                // add a user
                u.setId(rs.getInt("ID"));
                u.setUsername(rs.getString("UserName"));
                u.setEmail(rs.getString("Email"));
                u.setPassword(rs.getString("Password"));
                u.setFullName(rs.getString("FullName"));
                u.setGender(rs.getBoolean("Gender"));
                u.setMobile(rs.getString("PhoneNumber"));
                u.setRole(new Role(rs.getInt("RoleId"), rs.getString("name")));
                u.setStatus(rs.getInt("Status"));
                u.setDob(rs.getString("Dob"));
                return u;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public User getCustomerDetail(int id) {
        User u = new User();
        try {

            String querry = "SELECT r.ID AS 'RoleId',u.id,u.Gender,u.FullName,u.Email,u.PhoneNumber,u.UserName,u.[Password],r.[Name]\n"
                    + "		,u.[Status],u.[Address],u.[Image] FROM dbo.Users AS u,roles as r  WHERE u.ID = ? and r.ID = u.RoleId";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                u.setImage(rs.getString("Image"));
                u.setAddress(rs.getString("Address"));
                u.setEmail(rs.getString("Email"));
                u.setGender(rs.getBoolean("Gender"));
                u.setId(rs.getInt("ID"));
                u.setFullName(rs.getString("FullName"));
                u.setMobile(rs.getString("PhoneNumber"));
                u.setUsername(rs.getString("UserName"));
                u.setPassword(rs.getString("Password"));
                u.setStatus(rs.getInt("Status"));
                u.setRole(new Role(rs.getInt("RoleId"), rs.getString("Name")));

                //u.setDob(rs.getString("Dob"));
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return u;
    }

    public List<User> getCustomersToPaging(int pageNumber, int RoleId, int gender, int status) {
        List<User> listCustomer = new ArrayList<User>();
        try {
            String querry = "";
            if (gender == -1 && status == 0 && RoleId == 0) {
                querry = "SELECT DISTINCT(u.ID), u.Image,u.ID, u.FullName,u.Gender,u.Email,u.PhoneNumber,u.[Status],u.RoleId\n"
                        + "		FROM dbo.Users AS u,Roles as r \n"
                        + "		ORDER BY u.ID desc OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY ;";
            } else if (gender == -1 && status != 0 && RoleId == 0) {
                querry = "SELECT DISTINCT(u.ID), u.Image,u.ID, u.FullName,u.Gender,u.Email,u.PhoneNumber,u.[Status],u.RoleId\n"
                        + "		FROM dbo.Users AS u,Roles as r WHERE  u.[Status] = ? \n"
                        + "		ORDER BY u.ID asc OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY ;";
            } else if (gender == -1 && status == 0 && RoleId != 0) {
                querry = "SELECT DISTINCT(u.ID), u.Image,u.ID, u.FullName,u.Gender,u.Email,u.PhoneNumber,u.[Status],u.RoleId\n"
                        + "		FROM dbo.Users AS u,Roles as r WHERE u.RoleId = ? \n"
                        + "		ORDER BY u.ID asc OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY ;";
            } else if (gender != -1 && status == 0 && RoleId == 0) {
                querry = "SELECT DISTINCT(u.ID), u.Image,u.ID, u.FullName,u.Gender,u.Email,u.PhoneNumber,u.[Status],u.RoleId\n"
                        + "		FROM dbo.Users AS u,Roles as r WHERE  u.Gender = ?  \n"
                        + "		ORDER BY u.ID asc OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY ;";
            } else if (gender != -1 && status != 0 && RoleId == 0) {
                querry = "SELECT DISTINCT(u.ID), u.Image,u.ID, u.FullName,u.Gender,u.Email,u.PhoneNumber,u.[Status],u.RoleId\n"
                        + "		FROM dbo.Users AS u,Roles as r WHERE  u.Gender = ? AND u.[Status] =? \n"
                        + "		ORDER BY u.ID asc OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY ;";
            } else if (gender != -1 && status != 0 && RoleId != 0) {
                querry = "SELECT DISTINCT(u.ID), u.Image,u.ID, u.FullName,u.Gender,u.Email,u.PhoneNumber,u.[Status],u.RoleId\n"
                        + "		FROM dbo.Users AS u,Roles as r WHERE u.RoleId = ?  AND u.Gender = ? AND u.[Status] =? \n"
                        + "		ORDER BY u.ID asc OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY ;";
            } else if (gender != -1 && status == 0 && RoleId != 0) {
                querry = "SELECT DISTINCT(u.ID), u.Image,u.ID, u.FullName,u.Gender,u.Email,u.PhoneNumber,u.[Status],u.RoleId\n"
                        + "		FROM dbo.Users AS u,Roles as r WHERE u.RoleId = ?  AND u.Gender = ?  \n"
                        + "		ORDER BY u.ID asc OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY ;";
            } else if (gender == -1 && status != 0 && RoleId != 0) {
                querry = "SELECT DISTINCT(u.ID), u.Image,u.ID, u.FullName,u.Gender,u.Email,u.PhoneNumber,u.[Status],u.RoleId\n"
                        + "	  FROM dbo.Users AS u,Roles as r WHERE u.[Status] = ? AND u.RoleId=?	ORDER BY u.ID desc OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY";
            }

            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            if (gender == -1 && status == 0 && RoleId == 0) {
                ps.setInt(1, pageNumber);
            } else if (gender == -1 && status != 0 && RoleId == 0) {
                ps.setInt(1, status);
                ps.setInt(2, pageNumber);
            } else if (gender == -1 && status == 0 && RoleId != 0) {
                ps.setInt(1, RoleId);
                ps.setInt(2, pageNumber);
            } else if (gender != -1 && status == 0 && RoleId == 0) {
                ps.setInt(1, gender);
                ps.setInt(2, pageNumber);
            } else if (gender != -1 && status != 0 && RoleId == 0) {
                ps.setInt(1, gender);
                ps.setInt(2, status);
                ps.setInt(3, pageNumber);
            } else if (gender != -1 && status != 0 && RoleId != 0) {
                ps.setInt(1, RoleId);
                ps.setInt(2, gender);
                ps.setInt(3, status);
                ps.setInt(4, pageNumber);
            } else if (gender != -1 && status == 0 && RoleId != 0) {
                ps.setInt(1, RoleId);
                ps.setInt(2, gender);
                ps.setInt(3, pageNumber);
            } else if (gender == -1 && status != 0 && RoleId != 0) {
                ps.setInt(1, status);
                ps.setInt(2, RoleId);
                ps.setInt(3, pageNumber);
            }

            rs = ps.executeQuery();
            while (rs.next()) {
                String name = "";
                int idCheck = 0;
                try {
                    idCheck = rs.getInt("RoleId");
                } catch (SQLException ex) {
                    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (idCheck == 1) {
                    name = "Admin";
                } else if (idCheck == 2) {
                    name = "Manager";
                } else if (idCheck == 3) {
                    name = "Customer";
                } else {
                    name = "Staff";
                }
                User u = new User();
                //u.setAddress(rs.getString("Address"));
                u.setEmail(rs.getString("Email"));
                u.setId(rs.getInt("ID"));
                u.setFullName(rs.getString("FullName"));
                u.setMobile(rs.getString("PhoneNumber"));
                //u.setUsername(rs.getString("UserName"));
                //u.setPassword(rs.getString("Password"));
                u.setRole(new Role(rs.getInt("RoleId"), name));
                u.setStatus(rs.getInt("Status"));
                //u.setDob(rs.getString("Dob"));
                u.setGender(rs.getBoolean("Gender"));
                u.setImage(rs.getString("Image"));
                listCustomer.add(u);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return listCustomer;
    }

    //count total of customers
    public int getTotalCustomer() {
        int result = 0;
        try {
            String querry = "SELECT COUNT(ID) as total FROM dbo.Users WHERE RoleId = 2";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            rs = ps.executeQuery();
            rs.next();
            result = Integer.parseInt(rs.getString("total"));
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return result;
    }

    //update customer
    public void getEditCustomer(int id, User u) {

        try {
            String querry = "UPDATE dbo.Users SET Gender = ?,FullName = ?,Email = ?,PhoneNumber = ?,UserName = ?,[Password] = ?,[Status]=?,[Address]=?,[Image]=?, Dob=GETDATE(),RoleId=? WHERE ID =?";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setBoolean(1, u.isGender());
            ps.setString(2, u.getFullName());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getMobile());
            ps.setString(5, u.getUsername());
            ps.setString(6, u.getPassword());
            ps.setInt(7, u.getStatus());
            ps.setString(8, u.getAddress());
            ps.setString(9, "./images/users/" + u.getImage());
            ps.setInt(10, u.getRole().getId());
            ps.setInt(11, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }

    }

    public void getAddCustomer(User u, int roleId) {

        try {
            String querry = "INSERT INTO dbo.Users\n"
                    + "		VALUES\n"
                    + "		(   ?,    -- FullName - nvarchar(100)\n"
                    + "		    ?,    -- PhoneNumber - varchar(50)\n"
                    + "		    ?,    -- UserName - varchar(100)\n"
                    + "		    ?,    -- Email - varchar(100)\n"
                    + "		    ?,    -- Password - varchar(100)\n"
                    + "		    ?,    -- RoleId - int\n"
                    + "		    ?,    -- Status - int\n"
                    + "		    DEFAULT, -- Dob - datetime\n"
                    + "		    ?,    -- Gender - bit\n"
                    + "		    ?,    -- Address - nvarchar(100)\n"
                    + "		    ?     -- Image - nvarchar(200)\n"
                    + "		    )";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setInt(8, u.isGender() == true ? 1 : 0);
            ps.setString(1, u.getFullName());
            ps.setString(4, u.getEmail());
            ps.setString(2, u.getMobile());
            ps.setString(3, u.getUsername());
            ps.setString(5, u.getPassword());
            ps.setInt(7, u.getStatus());
            ps.setString(9, u.getAddress());
            ps.setString(10, "./images/users/" + u.getImage());
            ps.setInt(6, u.getRole().getId());
            ps.executeUpdate();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }

    }

    public List<Role> getAllRole() {
        List<Role> listRole = new ArrayList<Role>();
        try {

            String querry = "SELECT * FROM dbo.Roles;";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {
                Role r = new Role();
                r.setId(rs.getInt("ID"));
                r.setName(rs.getString("Name"));
                listRole.add(r);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return listRole;
    }

    public List<HistoryEdit> getHistoryUserEdit() {
        List<HistoryEdit> list = new ArrayList<HistoryEdit>();
        try {

            String querry = "SELECT TOP 6 h.ID,u.FullName,u.[Image],h.dob,u.ID AS userId,u.Dob AS userDate FROM dbo.HistoryEdit AS h \n"
                    + "LEFT JOIN dbo.Users AS u ON u.ID = h.IdAccount WHERE h.FunctionID =  1 ORDER BY id DESC;";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {
                HistoryEdit h = new HistoryEdit();
                h.setId(rs.getInt("Id"));
                h.setDob(rs.getDate("dob"));
                h.setUser(new User(rs.getInt("userId"), rs.getString("FullName"), rs.getString("userDate"), rs.getString("Image")));
                list.add(h);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return list;

    }

    public void getDeleteCustomer(int id) {

        try {
            String querry = "UPDATE dbo.Users SET [Status] = 4 WHERE ID = ?;";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }

    }

    public void InsertHistoryUpdateUser(int id) {

        try {
            String querry = "INSERT INTO dbo.HistoryEdit\n"
                    + "VALUES\n"
                    + "(   1,   -- FunctionID - int\n"
                    + "    ?,   -- IdAccount - int\n"
                    + "    DEFAULT -- dob - datetime\n"
                    + "    )";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
    }

    public boolean doesExistImgNameBlog(String tempNameGenerate) {
        try {

            String querry = "SELECT * FROM dbo.Users where Image = ?;";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setString(1, tempNameGenerate);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return false;
    }

    public List<User> getAllUser() {
        List<User> listU = new ArrayList();
        String query = "SELECT u.Gender,u.FullName,u.Email,u.PhoneNumber,u.UserName,u.[Password],r.[Name]\n"
                + "		,u.[Status],u.[Address],u.[Image] FROM dbo.Users AS u,roles as r  WHERE r.ID = u.RoleId";

        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setImage(rs.getString("Image"));
                u.setAddress(rs.getString("Address"));
                u.setEmail(rs.getString("Email"));
                u.setGender(rs.getBoolean("Gender"));
                u.setId(rs.getInt("ID"));
                u.setFullName(rs.getString("FullName"));
                u.setMobile(rs.getString("PhoneNumber"));
                u.setUsername(rs.getString("UserName"));
                u.setPassword(rs.getString("Password"));
                u.setStatus(rs.getInt("Status"));
                u.setRole(new Role(rs.getInt("RoleId"), rs.getString("name")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listU;
    }

    public User getAnUser(String email, String pass) {
        String query = "SELECT u.ID,u.Gender,u.FullName,u.Email,u.PhoneNumber,u.UserName,u.[Password],r.[Name],\n"
                + "u.RoleId,u.[Status],u.[Address],u.[Image], u.Dob FROM dbo.Users AS u,roles as r WHERE u.email = ? and u.password = ? and r.ID = u.RoleId";

        try {
            con = bContext.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setImage(rs.getString("Image"));
                u.setAddress(rs.getString("Address"));
                u.setEmail(rs.getString("Email"));
                u.setGender(rs.getBoolean("Gender"));
                u.setId(rs.getInt("ID"));
                u.setFullName(rs.getString("FullName"));
                u.setMobile(rs.getString("PhoneNumber"));
                u.setUsername(rs.getString("UserName"));
                u.setPassword(rs.getString("Password"));
                u.setStatus(rs.getInt("Status"));
                u.setRole(new Role(rs.getInt("RoleId"), rs.getString("name")));
                u.setDob(rs.getString("Dob"));
                return u;
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public User searchUserByEmail(String email) throws ClassNotFoundException, Exception {
        String query = "SELECT u.Gender,u.FullName,u.Email,u.PhoneNumber,u.UserName,u.[Password],r.[Name]\n"
                + "		,u.[Status],u.[Address],u.[Image] FROM dbo.Users AS u,roles as r  WHERE u.email = ? and r.ID = u.RoleId";
        try {
            con = bContext.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setImage(rs.getString("Image"));
                u.setAddress(rs.getString("Address"));
                u.setEmail(rs.getString("Email"));
                u.setGender(rs.getBoolean("Gender"));
                u.setId(rs.getInt("ID"));
                u.setFullName(rs.getString("FullName"));
                u.setMobile(rs.getString("PhoneNumber"));
                u.setUsername(rs.getString("UserName"));
                u.setPassword(rs.getString("Password"));
                u.setStatus(rs.getInt("Status"));
                u.setRole(new Role(rs.getInt("RoleId"), rs.getString("name")));
                u.setImage(rs.getString("Image"));

                return u;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public void addUser(String fullname, String phoneNumber, String username, String email, String password) throws ClassNotFoundException, Exception {
        String query = "insert into dbo.Users(fullname,Phonenumber,username,email,password,RoleId) values(?,?,?,?,?,4)";
        try {
            con = bContext.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, fullname);
            ps.setString(2, phoneNumber);
            ps.setString(3, username);
            ps.setString(4, email);
            ps.setString(5, password);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void setNewPassword(String email, String pass) throws ClassNotFoundException, Exception {
        String query = "UPDATE dbo.Users set [password] = ? where [email] = ?";

        try {
            con = bContext.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, pass);
            ps.setString(2, email);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public int getTotalCustomer(int RoleId, int gender, int status) {
        int result = 0;
        String querry = "";
        try {
            if (gender == -1 && status == 0 && RoleId == 0) {
                querry = "SELECT COUNT(ID) as total FROM dbo.Users";
            } else if (gender == -1 && status != 0 && RoleId == 0) {
                querry = "SELECT COUNT(ID) as total FROM dbo.Users WHERE Status = ?";
            } else if (gender == -1 && status == 0 && RoleId != 0) {
                querry = "SELECT COUNT(ID) as total FROM dbo.Users WHERE RoleId = ?";
            } else if (gender != -1 && status == 0 && RoleId == 0) {
                querry = "SELECT COUNT(ID) as total FROM dbo.Users WHERE Gender = ?";
            } else if (gender != -1 && status != 0 && RoleId == 0) {
                querry = "SELECT COUNT(ID) as total FROM dbo.Users WHERE Gender = ? AND Status = ?";
            } else if (gender != -1 && status != 0 && RoleId != 0) {
                querry = "SELECT COUNT(ID) as total FROM dbo.Users WHERE RoleId = ? AND Gender = ? AND Status = ? ";
            } else if (gender != -1 && status == 0 && RoleId != 0) {
                querry = "SELECT COUNT(ID) as total FROM dbo.Users WHERE Gender = ?  AND RoleId = ?";
            } else if (gender == -1 && status != 0 && RoleId != 0) {
                querry = "SELECT COUNT(ID) as total FROM dbo.Users WHERE Status = ?  AND RoleId = ?";
            }
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            if (gender == -1 && status != 0 && RoleId == 0) {
                ps.setInt(1, status);
            } else if (gender == -1 && status == 0 && RoleId != 0) {
                ps.setInt(1, RoleId);
            } else if (gender != -1 && status == 0 && RoleId == 0) {
                ps.setInt(1, gender);
            } else if (gender != -1 && status != 0 && RoleId == 0) {
                ps.setInt(1, gender);
                ps.setInt(2, status);
            } else if (gender != -1 && status != 0 && RoleId != 0) {
                ps.setInt(1, RoleId);
                ps.setInt(2, gender);
                ps.setInt(3, status);
            } else if (gender != -1 && status == 0 && RoleId != 0) {
                ps.setInt(1, RoleId);
                ps.setInt(2, gender);
            } else if (gender == -1 && status != 0 && RoleId != 0) {
                ps.setInt(1, status);
                ps.setInt(2, RoleId);
            }
            rs = ps.executeQuery();
            rs.next();
            result = Integer.parseInt(rs.getString(1));
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return result;
    }

    public void getAddCustomer(User u) {

        try {
            String querry = "INSERT INTO dbo.Users\n"
                    + "		VALUES\n"
                    + "		(   ?,    -- FullName - nvarchar(100)\n"
                    + "		    ?,    -- PhoneNumber - varchar(50)\n"
                    + "		    ?,    -- UserName - varchar(100)\n"
                    + "		    ?,    -- Email - varchar(100)\n"
                    + "		    ?,    -- Password - varchar(100)\n"
                    + "		    ?,    -- RoleId - int\n"
                    + "		    ?,    -- Status - int\n"
                    + "		    DEFAULT, -- Dob - datetime\n"
                    + "		    ?,    -- Gender - bit\n"
                    + "		    ?,    -- Address - nvarchar(100)\n"
                    + "		    ?     -- Image - nvarchar(200)\n"
                    + "		    )";
            con = bContext.getConnection();
            ps = con.prepareStatement(querry);

            ps.setString(1, u.getFullName());
            ps.setString(2, u.getMobile());
            ps.setString(3, u.getUsername());
            ps.setString(4, u.getEmail());
            ps.setString(5, u.getPassword());
            ps.setInt(6, u.getRole().getId());
            ps.setInt(7, u.getStatus());
            ps.setInt(8, u.isGender() == true ? 1 : 0);
            ps.setString(9, u.getAddress());
            ps.setString(10, "./images/users/" + u.getImage());

            ps.executeUpdate();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }

    }

    public List<User> searchCustomer(String text) {
        List<User> listCustomer = new ArrayList<User>();
        try {
            String querry = "SELECT TOP 5  u.Image,u.ID, u.FullName,u.Gender,u.Email,u.PhoneNumber,u.[Status],u.RoleId\n"
                    + "	FROM dbo.Users AS u,Roles as r WHERE u.Email LIKE ? OR u.PhoneNumber LIKE ? OR u.FullName LIKE ?";

            con = bContext.getConnection();
            ps = con.prepareStatement(querry);
            ps.setString(1, "%" + text + "%");
            ps.setString(2, "%" + text + "%");
            ps.setString(3, "%" + text + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = "";
                int idCheck = 0;
                try {
                    idCheck = rs.getInt("RoleId");
                } catch (SQLException ex) {
                    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (idCheck == 1) {
                    name = "Admin";
                } else if (idCheck == 2) {
                    name = "Manager";
                } else if (idCheck == 3) {
                    name = "Customer";
                } else {
                    name = "Guest";
                }
                User u = new User();
                //u.setAddress(rs.getString("Address"));
                u.setEmail(rs.getString("Email"));
                u.setId(rs.getInt("ID"));
                u.setFullName(rs.getString("FullName"));
                u.setMobile(rs.getString("PhoneNumber"));
                //u.setUsername(rs.getString("UserName"));
                //u.setPassword(rs.getString("Password"));
                u.setRole(new Role(rs.getInt("RoleId"), name));
                u.setStatus(rs.getInt("Status"));
                //u.setDob(rs.getString("Dob"));
                u.setGender(rs.getBoolean("Gender"));
                u.setImage(rs.getString("Image"));
                listCustomer.add(u);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            bContext.closeResources(con, ps, rs);
        }
        return listCustomer;
    }

    //count total of customers
    //count total of customers
    public List<User> getAllDoc() {
        List<User> ListDoc = new ArrayList<>();
        String query = "select *  from Users where RoleId = 5";
        try {
            con = new DBContext().getConnection();//mo ket noi voi sql
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("ID"));
                u.setUsername(rs.getString("UserName"));
                u.setEmail(rs.getString("Email"));
                u.setFullName(rs.getString("FullName"));
                u.setMobile(rs.getString("PhoneNumber"));
                u.setStatus(rs.getInt("Status"));
                u.setImage(rs.getString("Image"));
                ListDoc.add(u);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return ListDoc;
    }

    public User getDocByID(int doctorID) {
        List<User> ListDoc = new ArrayList<>();
        String query = "select * from Users where id = ?";
        try {
            con = new DBContext().getConnection();//mo ket noi voi sql
            ps = con.prepareStatement(query);
            ps.setInt(1, doctorID);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("ID"));
                u.setUsername(rs.getString("UserName"));
                u.setEmail(rs.getString("Email"));
                u.setFullName(rs.getString("FullName"));
                u.setMobile(rs.getString("PhoneNumber"));
                u.setStatus(rs.getInt("Status"));
                u.setImage(rs.getString("Image"));
                return u;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public List<User> getNext3Doctor(int amount) {
        List<User> ListDoc = new ArrayList<>();
        String query = "SELECT * FROM Users WHERE RoleId =5 \n"
                + "ORDER BY ID \n"
                + "OFFSET ? ROWS \n"
                + "FETCH NEXT 3 ROWS ONLY ";
        try {
            con = new DBContext().getConnection();//mo ket noi voi sql
            ps = con.prepareStatement(query);
            ps.setInt(1, amount);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("ID"));
                u.setUsername(rs.getString("UserName"));
                u.setEmail(rs.getString("Email"));
                u.setFullName(rs.getString("FullName"));
                u.setMobile(rs.getString("PhoneNumber"));
                u.setStatus(rs.getInt("Status"));
                u.setImage(rs.getString("Image"));
                ListDoc.add(u);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return ListDoc;
    }

    public List<User> getDoctorByName(String doctorName) {
        List<User> ListDoc = new ArrayList<>();
        String query = "SELECT * FROM Users where RoleId =5 and FullName LIKE ?";
        try {
            con = new DBContext().getConnection();//mo ket noi voi sql
            ps = con.prepareStatement(query);
            String txtSearch = "%" + doctorName + "%";
            ps.setString(1, txtSearch);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("ID"));
                u.setUsername(rs.getString("UserName"));
                u.setEmail(rs.getString("Email"));
                u.setFullName(rs.getString("FullName"));
                u.setMobile(rs.getString("PhoneNumber"));
                u.setStatus(rs.getInt("Status"));
                u.setImage(rs.getString("Image"));
                ListDoc.add(u);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return ListDoc;
    }
}
