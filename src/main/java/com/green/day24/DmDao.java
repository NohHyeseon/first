package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class DmDao {

    public static void main(String[] args) {
        DmDao dao = new DmDao();

        DmUpdProcDto dto = new DmUpdProcDto();
        dto.setIdm(1);

        int affectedRows = dao.updDm(dto);
        System.out.println("affectedRows : " + affectedRows);
    }

    public int updDm(DmUpdProcDto dto) {
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Map<String, String> map = new HashMap();
        String sql = "SELECT msg, created_at AS createdAt " +
                " FROM t_dm_msg" +
                " WHERE idm = ? " +
                " ORDER BY seq DESC" +
                " LIMIT 1";
        try {
            con = MyConnGreengram3.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dto.getIdm());
            rs = ps.executeQuery();
            while(rs.next()) {
                map.put("msg", rs.getString("msg"));
                map.put("createdAt", rs.getString("createdAt"));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        dto.setMsgMap(map);

        String sql2 = "UPDATE t_dm SET ";

        for(Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getKey().equals("msg")) {
                sql2 += String.format(" last_msg = '%s'", entry.getValue());
            }

            if(entry.getKey().equals("createdAt")) {
                sql2 += String.format(", last_msg_at = '%s'", entry.getValue());
            }
        }
        sql2 += " WHERE idm = ?";
        System.out.println(sql2);
        try {
            ps = con.prepareStatement(sql2);
            ps.setInt(1, dto.getIdm());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
