package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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
        entity.setTitle("추가!!");
        entity.setCtnts("11월 02일 글 씀");
        entity.setWriter("홍길동");
        int row = BoardDao.insBoard(entity);

    }
}

class MyConnTest3 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(2);

        int row = BoardDao.delBoard(entity);
        System.out.println("row : " + row);
    }
}

class MyConnTest4 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(3);
        entity.setTitle("수정 제목");
        entity.setCtnts("수정 내용");
        entity.setWriter("수정자");

        int row = BoardDao.updBoard(entity);
        System.out.println("row : " + row);
    }
}

class MyConnTest5 {
    public static void main(String[] args) {
        List<BoardEntity> list = BoardDao.selBoardList();
        for(BoardEntity entity : list) {
            System.out.println(entity);
            //iboard: 값, title: 값, ctnts: 값, writer: 값, createdAt: 값
        }
    }
}

class MyConnTest6 {
    public static void main(String[] args) {
        BoardEntity result = BoardDao.selBoardById(4); //3은 pk값
        System.out.println(result);
    }
}













