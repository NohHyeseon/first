package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        //MyConn에 있는 getConn메소드 호출하시고 메소드가 리턴해주는 값 담아보세요.
        Connection conn =  MyConn.getConn();
        String sql = "INSERT INTO country (country_id, country) " +
                "VALUES (110, '경현나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


class MyConnTest2 {
    public static void main(String[] args) {

        //title : 처음 작성
        //ctnts : 처음 작성하는 내용입니다.
        //wirter : 홍길동
        //DB에 insert 해주세요.

        BoardEntity entity = new BoardEntity();
        entity.setTitle("오늘 Insert배움");
        entity.setCtnts("java를 통해 board테이블에 값 넣어봄");
        entity.setWriter("신난다");
        int row = BoardDao.insBoard(entity);

    }
}