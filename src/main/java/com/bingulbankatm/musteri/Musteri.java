package com.bingulbankatm.musteri;

public class Musteri  {

   private String tcKimlikNo;

    public Musteri(String tcKimlikNo, String adSoyad, int hesapBakiyesi, String musteriNo) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
        this.musteriNo = musteriNo;
    }
    public Musteri(){

    }

    private String adSoyad;
   private int hesapBakiyesi;
   private String musteriNo;



    public String getTcKimlikNo() {
        return this.tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return this.adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getHesapBakiyesi() {
        return this.hesapBakiyesi;
    }

    public void setHesapBakiyesi(int hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public String getMusteriNo() {
        return this.musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }


}
