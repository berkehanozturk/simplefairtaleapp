package com.sagancompany.myapplication;

public class Manzara {

    private int imageID;
    private String baslik;
    private String tanim;

    Manzara(String Baslik,String tanim1,int imageID1){

        baslik=Baslik;
        tanim=tanim1;
        imageID=imageID1;


    }

    public int getImageID() {
        return imageID;
    }

    public String getBaslik() {
        return baslik;
    }

    public String getTanim() {
        return tanim;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }


}
