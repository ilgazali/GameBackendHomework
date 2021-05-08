package com.company.Adapters;

import com.company.Abstracts.Kampanya;

public class Yuzde60Kampanya extends Kampanya {


    @Override
    public void ekle() {
        System.out.println("Yüzde 60 indirimi uygulandı");
    }

    @Override
    public void sil() {
        System.out.println("Yüzde 60 indirimi silindi");
    }

    @Override
    public void guncelle() {
        System.out.println("Yüzde 60 indirimi güncellendi");
    }
}
