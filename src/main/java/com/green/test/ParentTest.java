package com.green.test;

public class ParentTest {
    public static void main(String[] args) {
        Parent p = new Parent();


/*
        {
            "pic": null,
            "swaInfo": null
        }
*/

        Parent p2 = new Parent();
        Child c2 = new Child();
        p2.setSawInfo(c2);

        /*
        {
            "pic": null,
            "swaInfo": {
                "star": null,
                "comment": null
            }
        }
*/
    }
}
