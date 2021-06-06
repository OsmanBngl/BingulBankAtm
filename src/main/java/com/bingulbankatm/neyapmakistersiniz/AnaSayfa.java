package com.bingulbankatm.neyapmakistersiniz;

import com.bingulbankatm.islemler.AtmIslemleri;
import com.bingulbankatm.musteri.BireyselMusteri;
import com.bingulbankatm.musteri.KurumsalMusteri;
import com.bingulbankatm.musteri.Musteri;
import com.bingulbankatm.musteri.MusteriDao;

import java.util.*;

public class AnaSayfa {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        KurumsalMusteri kurumsalMusteri =new KurumsalMusteri();
        BireyselMusteri bireyselMusteri=new BireyselMusteri();
        Musteri musterim=new Musteri();
        AtmIslemleri islemler=new AtmIslemleri(kurumsalMusteri);



        kurumsalMusteri.setMusteriNo("12");
        kurumsalMusteri.setHesapBakiyesi(300);
        kurumsalMusteri.setTcKimlikNo("23213213213");
        kurumsalMusteri.setAdSoyad("Osman");
        kurumsalMusteri.setSirketAdi("apple");

        kurumsalMusteri.setMusteriNo("13");
        kurumsalMusteri.setHesapBakiyesi(200);
        kurumsalMusteri.setTcKimlikNo("232133432413");
        kurumsalMusteri.setAdSoyad("EMRE");
        kurumsalMusteri.setSirketAdi("google");

        bireyselMusteri.setMusteriNo("14");
        bireyselMusteri.setHesapBakiyesi(250);
        bireyselMusteri.setTcKimlikNo("123213213");
        bireyselMusteri.setEvAdresi("Kadıköy");
        bireyselMusteri.setAdSoyad("Ayşe");

        bireyselMusteri.setMusteriNo("15");
        bireyselMusteri.setHesapBakiyesi(150);
        bireyselMusteri.setTcKimlikNo("127213213");
        bireyselMusteri.setEvAdresi("Üsküdar");
        bireyselMusteri.setAdSoyad("Merve");


        kurumsalMusteri.setMusteriNo("16");
        kurumsalMusteri.setHesapBakiyesi(100);
        kurumsalMusteri.setTcKimlikNo("213454213");
        kurumsalMusteri.setAdSoyad("Bill Gates");
        kurumsalMusteri.setSirketAdi("Microsoft");




        MusteriDao.musteriEkle(kurumsalMusteri);

        MusteriDao.musteriEkle(bireyselMusteri);




        System.out.println("Lütfen Müşteri Numarınızı Giriniz :" );
        String m =scanner.nextLine();


        System.out.println(kurumsalMusteri.getAdSoyad() + " " + kurumsalMusteri.getTcKimlikNo() + " " +  kurumsalMusteri.getSirketAdi() + " " +  kurumsalMusteri.getHesapBakiyesi());
        System.out.println(bireyselMusteri.getAdSoyad() + " " +  bireyselMusteri.getTcKimlikNo() + " " +  bireyselMusteri.getEvAdresi() + " " +  bireyselMusteri.getTcKimlikNo() + " " +  bireyselMusteri.getHesapBakiyesi());

        System.out.println("Lütfen yapıcağınız işlemi seçiniz : " + " " +"Para Çek: 1"  + " " + "Para Yatır: 2");
        int islem= scanner.nextInt();

        switch (islem)
        {
            case 1:
                System.out.println("Çekmek istediğiniz Tutarı Giriniz");
                islemler.paraCek(scanner.nextInt());

              break;
            case 2:
                System.out.println("Yatırmak İstediğiniz Tutarı Giriniz");
                islemler.paraYatir(scanner.nextInt());

        }



          }



    }

