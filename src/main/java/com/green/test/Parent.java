package com.green.test;

public class Parent {
    private String pic;
    private Child sawInfo;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Child getSawInfo() {
        return sawInfo;
    }

    public void setSawInfo(Child sawInfo) {
        this.sawInfo = sawInfo;
    }
}


class Child {
    private Integer star;
    private String comment;

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}