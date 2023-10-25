package com.green.day19.ch7.starcraft;

import java.util.ArrayList;
import java.util.List;

class StarcraftGame {
    public static void main(String[] args) {
        Unit unit = new Marine();
        //마린 x:10, y:20으로 이동
        unit.move(10, 20);

        Unit unit2 = new Tank();
        unit2.move(10, 20);

        Tank t = new Tank();
        t.changeMode();
        t.changeMode();
        t.changeMode();

        List<Unit> units = new ArrayList();
        units.add(unit);
        units.add(unit2);
        units.add(new Marine());

        //배열, ArrayList
    }
}

class StarcraftGame2 {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());

        moveAll(units, 30, 50);

        Unit unit1 = units.get(units.size() - 1);
        //unit1.changeMode();
        Tank tank = (Tank)unit1;
        tank.changeMode();
        tank.changeMode();
        tank.changeMode();

    }
    public static void moveAll(List<Unit> list, int x, int y) {
        /*
        for(int i=0; i<list.size(); i++) {
            //Unit unit = list.get(i);
            //unit.move(x, y);
            list.get(i).move(x, y);
        }
        */
        for(Unit unit : list) {
            unit.move(x, y);
        }
    }
}

public abstract class Unit {
    protected int x;
    protected int y;

    public abstract void move(int x, int y);
    public void stop() {
        System.out.println("현재 위치에 정지");
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Marine extends Unit {
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("마린이 좌표 x:%d, y:%d로 이동\n", x, y);
    }
    public void steamPack() {
        System.out.println("스팀팩 시전!!!");
    }
}

class Tank extends Unit {
    private boolean siegeMode;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("탱크가 좌표 x:%d, y:%d로 이동\n", x, y);
    }
    // siegeMode = false는 시즈모드가 아닌거죠.
    // 이 상태에서 changeMode메소드가 호출이 되면 > 시즈모드가 되어야함
    // siegeMode = true; 들어가야되고 콘솔에는 "시즈모드가 되었습니다."

    // siegeMode = true; 는 시즈모드가 된거다.
    // 이 상태에서 changeMode메소드가 호출이 되면 > 시즈모드가 풀려야 한다.
    // sigeMode = false' 가 들어가야 되고 콘솔에는 "시즈모드가 풀렸습니다."

    public void changeMode2() {
        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈모드가 되었습니다." : "시즈모드가 풀렸습니다.");
    }

    public void changeMode() {
        if(siegeMode) { //true인 경우
            siegeMode = false;
            System.out.println("시즈모드가 풀렸습니다.");
        } else { //false인 경우
            siegeMode = true;
            System.out.println("시즈모드가 되었습니다.");
        }
    }

}
