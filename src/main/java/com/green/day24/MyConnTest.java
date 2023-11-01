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
        entity.setTitle("이스라엘, 빵 구하려 줄 선 난민에 폭탄…“최소 200명 사상”");
        entity.setCtnts("이스라엘군이 가자지구 북부의 난민캠프를 공습해 수십 명이 숨진 것을 비롯해 사상자 수백 명이 발생했다고 가자지구의 팔레스타인 보건부가 밝혔다.\n" +
                "가자지구 보건부는 31일 이스라엘군이 가자시티 북쪽에 있는 자발리아 난민촌에 여러 발의 폭탄을 투하해 50명이 숨지고 150명이 다쳤다며, 시간이 지나면 사상자 숫자가 더 늘어날 것으로 보인다고 밝혔다. 외신들은 현지 의료진은 사망자가 100명이 넘는다고 전했다고 보도했다.");
        entity.setWriter("이스라엘");
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
        BoardEntity result = BoardDao.selBoardById(3); //3은 pk값
        System.out.println(result);
    }
}













