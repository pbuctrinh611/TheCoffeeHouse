package com.example.coffehouse;

public class Model_Noti {
    private int img_noti;
    private String title;
    private int img_noti1;
    private String tv_noti1;
    private int img_noti2;
    private String tv_noti2;
    private int img_noti3;
    private String tv_noti3;
    private String tv_bottom;


    public Model_Noti(int img_noti, String title, int img_noti1, String tv_noti1, int img_noti2, String tv_noti2, int img_noti3, String tv_noti3, String tv_bottom) {
        this.img_noti = img_noti;
        this.title = title;
        this.img_noti1 = img_noti1;
        this.tv_noti1 = tv_noti1;
        this.img_noti2 = img_noti2;
        this.tv_noti2 = tv_noti2;
        this.img_noti3 = img_noti3;
        this.tv_noti3 = tv_noti3;
        this.tv_bottom = tv_bottom;
    }

    public int getImg_noti() {
        return img_noti;
    }

    public void setImg_noti(int img_noti) {
        this.img_noti = img_noti;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg_noti1() {
        return img_noti1;
    }

    public void setImg_noti1(int img_noti1) {
        this.img_noti1 = img_noti1;
    }

    public String getTv_noti1() {
        return tv_noti1;
    }

    public void setTv_noti1(String tv_noti1) {
        this.tv_noti1 = tv_noti1;
    }

    public int getImg_noti2() {
        return img_noti2;
    }

    public void setImg_noti2(int img_noti2) {
        this.img_noti2 = img_noti2;
    }

    public String getTv_noti2() {
        return tv_noti2;
    }

    public void setTv_noti2(String tv_noti2) {
        this.tv_noti2 = tv_noti2;
    }

    public int getImg_noti3() {
        return img_noti3;
    }

    public void setImg_noti3(int img_noti3) {
        this.img_noti3 = img_noti3;
    }

    public String getTv_noti3() {
        return tv_noti3;
    }

    public void setTv_noti3(String tv_noti3) {
        this.tv_noti3 = tv_noti3;
    }

    public String getTv_bottom() {
        return tv_bottom;
    }

    public void setTv_bottom(String tv_bottom) {
        this.tv_bottom = tv_bottom;
    }
}
