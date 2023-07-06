/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBcontext;
import Entity.Account;
import Entity.Category;
import Entity.Game;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anxem
 */
public class DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Game> getTrendingGame(){
        List<Game> list = new ArrayList<>();
        String query = "select top 8 * from game";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(); 
            while(rs.next()){   
                list.add(new Game(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
        } catch (Exception e) { 
            
        }
        return list;
    }
    public List<Category> getAllCategory(){
        List<Category> list = new ArrayList<>();
        String query = "select * from category";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(); 
            while(rs.next()){   
                list.add(new Category(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) { 
            
        }
        return list;
    }
    public List<Game> getGameSale(){
        List<Game> list = new ArrayList<>();
        String query = "SELECT TOP 2 *\n" +
                       "FROM game\n" +
                       "ORDER BY price;";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(); 
            while(rs.next()){   
                list.add(new Game(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
        } catch (Exception e) { 
            
        }
        return list;
    }
    public Game getNewGame(){
        String query = "SELECT TOP 1 *\n" +
                        "FROM game\n" +
                        "ORDER BY id desc";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery(); 
            while(rs.next()){   
                return new Game(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getInt(7));
            }
        } catch (Exception e) { 
            
        }
        return null;
}
    public List<Game> getGameByCate(String cid){
        List<Game> list = new ArrayList<>();
        String query = "select * from game\n" +
                        "where cateID = ?";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery(); 
            while(rs.next()){   
                list.add(new Game(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
        } catch (Exception e) { 
            
        }
        return list;
    }
    public List<Game> searchByName(String txtSeatch){
        List<Game> list = new ArrayList<>();
        String query = "select * from game\n" +
                        "where [name] like ?";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%"+txtSeatch+"%");
            rs = ps.executeQuery(); 
            while(rs.next()){   
                list.add(new Game(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
        } catch (Exception e) { 
            
        }
        return list;
    }
    public Account login(String user,String pass ){
        String query = "select * from account\n" +
                        "where username = ?\n" +
                        "and [password] =?";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery(); 
            while(rs.next()){   
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6));
            }
        } catch (Exception e) { 
        }
        return null;
    }
    public Account checkAccountExist(String user){
        String query = "select * from account\n" +
                        "where username = ?\n" ;
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery(); 
            while(rs.next()){   
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6));
            }
        } catch (Exception e) { 
        }
        return null;
    }
    public void signup(String fullname,String user, String email,String pass){
        String query = "insert into Account\n" +
                        "values(?,?,?,?,0)";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, fullname);
            ps.setString(2, user);
            ps.setString(3, email);
            ps.setString(4, pass);
            ps.executeUpdate(); 
            
        } catch (Exception e) { 
        }
        
    }
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Game> list = dao.getTrendingGame();
        List<Category> listC = dao.getAllCategory();
        for (Category game : listC) {
            System.out.println(game);
            
        }
    }
}
