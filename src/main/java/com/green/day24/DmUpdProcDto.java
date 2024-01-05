package com.green.day24;

import java.util.HashMap;
import java.util.Map;

public class DmUpdProcDto {
    private int idm;
    private Map<String, String> msgMap = new HashMap();

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    public Map<String, String> getMsgMap() {
        return msgMap;
    }

    public void setMsgMap(Map<String, String> msgMap) {
        this.msgMap = msgMap;
    }
}
