package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

//data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) { //title, ctnts, writer
        int result = 0;
        String sql = "INSERT INTO board(title, ctnts, writer) " +
                     "VALUES " +
                     "(?, ?, ?)";
        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }
}
