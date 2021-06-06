package com.bingulbankatm.musteri;

import java.util.HashMap;

public  class MusteriDao {
    private static HashMap<String, Musteri> musteriMap=new HashMap<>();

    public static void musteriEkle(Musteri musteri){
        musteriMap.put(musteri.getMusteriNo(),musteri);
    }

    public static Musteri getMusteri(String musteriNo){
        return musteriMap.get(musteriNo);
    }
}
