/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBcontext;
import Entity.Game;
import Entity.Student;
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
        String query = "select  top 8 * from game";
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
    
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Game> list = dao.getTrendingGame();
        for (Game game : list) {
            System.out.println(game);
            
        }
    }
}
