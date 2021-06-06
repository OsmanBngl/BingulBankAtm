package com.bingulbankatm.neyapmakistersiniz;

import com.bingulbankatm.islemler.AtmIslemleri;
import com.bingulbankatm.musteri.BireyselMusteri;
import com.bingulbankatm.musteri.KurumsalMusteri;
import com.bingulbankatm.musteri.Musteri;
import com.bingulbankatm.musteri.MusteriDao;

import java.util.*;

public class AnaSayfa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MusteriDao.musteriEkle(new KurumsalMusteri("Testinium","2030292873","OSMAN",100,"12"));
        MusteriDao.musteriEkle(new KurumsalMusteri("microsoft","232132131","bill",200,"13"));
        MusteriDao.musteriEkle(new KurumsalMusteri("google","34234324","ELON",100,"14"));
        MusteriDao.musteriEkle(new BireyselMusteri("kadıköy","123456789","Merve",300,"15"));
        MusteriDao.musteriEkle(new BireyselMusteri("üsküdar","256789054","Şeyma Subaşı",400,"16"));

        System.out.println("Lütfen Müşteri Numarınızı Giriniz :");
        String m = scanner.nextLine();

        Musteri msn = MusteriDao.getMusteri(m);
        AtmIslemleri islemler = new AtmIslemleri(msn);
        getMusteriDescription(msn);



        System.out.println("Lütfen yapıcağınız işlemi seçiniz : " + " " + "Para Çek: 1" + " " + "Para Yatır: 2");
        int islem = scanner.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Çekmek istediğiniz Tutarı Giriniz");
                islemler.paraCek(scanner.nextInt());

                break;
            case 2:
                System.out.println("Yatırmak İstediğiniz Tutarı Giriniz");
                islemler.paraYatir(scanner.nextInt());

        }


    }
        private static void getMusteriDescription(BireyselMusteri bireyselMusteri) {
            System.out.println(bireyselMusteri.getAdSoyad() + " " + bireyselMusteri.getTcKimlikNo() + " " + bireyselMusteri.getEvAdresi() + " " + bireyselMusteri.getTcKimlikNo() + " " + bireyselMusteri.getHesapBakiyesi());
        }

        private static void getMusteriDescription(KurumsalMusteri kurumsalMusteri) {
        System.out.println(kurumsalMusteri.getAdSoyad() + " " + kurumsalMusteri.getTcKimlikNo() + " " + kurumsalMusteri.getSirketAdi() + " " + kurumsalMusteri.getHesapBakiyesi());
        }

        private static void getMusteriDescription(Musteri musteri){
            System.out.println(musteri.getAdSoyad() + " " + musteri.getTcKimlikNo()  + " " + musteri.getHesapBakiyesi());
        }



}

