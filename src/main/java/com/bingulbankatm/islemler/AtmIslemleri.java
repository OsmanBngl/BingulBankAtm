package com.bingulbankatm.islemler;


import com.bingulbankatm.musteri.KurumsalMusteri;
import com.bingulbankatm.musteri.Musteri;

public class AtmIslemleri implements AtmIslem {

    private Musteri musteri;
    public AtmIslemleri(Musteri musteri){
     this.musteri=musteri;
    }
    public void paraCek(int x){

        if((musteri.getHesapBakiyesi()>x)) {
            System.out.println("Hesabınızda kalan para:" + (musteri.getHesapBakiyesi()-x) + "tl");
        }

        if((x>musteri.getHesapBakiyesi()) ){
            System.out.println("Yeterli Bakiyeniz yok");
        }

        }


    public void paraYatir(int y){
        System.out.println("Hesabınızdaki para :" + (musteri.getHesapBakiyesi()+y));

    }


}
