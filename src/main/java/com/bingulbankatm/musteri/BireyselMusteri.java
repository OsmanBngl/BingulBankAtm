package com.bingulbankatm.musteri;

public class BireyselMusteri extends Musteri{

    public BireyselMusteri(String evAdresi,String tcKimlikNo, String adSoyad, int hesapBakiyesi, String musteriNo){
       super(tcKimlikNo,adSoyad,hesapBakiyesi,musteriNo);
        this.evAdresi=evAdresi;
    }
    public BireyselMusteri(){

    }
   private String evAdresi;

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }
}
