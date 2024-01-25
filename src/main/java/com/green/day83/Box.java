package com.green.day83;

public class Box {

    private Object item;//타입오브젝트면 아무타입 다들어감

    public void selItem(Object item){
        this.item = item;
    }


    public Object getItem(){
        return this.item;
    }

}
