package com.company.Adapters;

import com.company.Abstracts.Kampanya;

public class Yuzde20Kampanya extends Kampanya {


    @Override
    public void ekle() {
        System.out.println("Yüzde 20 indirimi uygulandı");
    }

    @Override
    public void sil() {
        System.out.println("Yüzde 20 indirimi silindi");
    }

    @Override
    public void guncelle() {
        System.out.println("Yüzde 20 indirimi güncellendi");
    }
}
