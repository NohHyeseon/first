package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

//data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) { //title, ctnts, writer
        int result = 0;
        String sql = String.format("INSERT INTO board(title, ctnts, writer) " +
                                   "VALUES " +
                                   "('%s', '%s', '%s')"
                , entity.getTitle(), entity.getCtnts(), entity.getWriter());
        System.out.println(sql);
        try {
            Connection con = MyConn.getConn();
            PreparedStatement ps = con.prepareStatement(sql);
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return result;
    }
}
