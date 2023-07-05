/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBcontext;
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
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Game> list = dao.getTrendingGame();
        List<Category> listC = dao.getAllCategory();
        for (Category game : listC) {
            System.out.println(game);
            
        }
    }
}
