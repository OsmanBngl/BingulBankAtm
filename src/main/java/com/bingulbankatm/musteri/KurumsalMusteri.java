package com.bingulbankatm.musteri;

public class KurumsalMusteri extends Musteri {

    public KurumsalMusteri(String sirketAdi ,String tcKimlikNo, String adSoyad, int hesapBakiyesi, String musteriNo){
        super(tcKimlikNo,adSoyad,hesapBakiyesi,musteriNo);
        this.sirketAdi=sirketAdi;
    }

    public KurumsalMusteri(){

    }

    private String sirketAdi;

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }
}
