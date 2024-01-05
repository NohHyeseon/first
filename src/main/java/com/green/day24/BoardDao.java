package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) { //title, ctnts, writer, hits
        int result = 0;
        /*
        String sql = "INSERT INTO board(title, ctnts, writer) " +
                     "VALUES (?, ?, ?)";
         */
        String sql = "INSERT INTO board " +
                     "SET title = ? " +
                     ", ctnts = ? " +
                     ", writer = ? ";
        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConnGreengram3.getConn();
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
    // 검색, 페이징
    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, created_at FROM board";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");

                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);

                list.add(entity);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }

    public static BoardEntity selBoardById(int iboard) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT iboard, title, writer, ctnts, created_at, updated_at " +
                     " FROM board WHERE iboard = ?";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, iboard);
            rs = ps.executeQuery();

            if(rs.next()) {
                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setUpdatedAt(rs.getString("updated_at"));
                return entity;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);
        }
        return null;
    }


    public static int updBoard(BoardEntity entity) {
        int result = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE board " +
                "SET title = ? " +
                ", ctnts = ? " +
                ", writer = ? " +
                ", updated_at = now() " +
                "WHERE iboard = ?";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }


    public static int delBoard(BoardEntity entity) {
        int result = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM board WHERE iboard = ?";

        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }
}
