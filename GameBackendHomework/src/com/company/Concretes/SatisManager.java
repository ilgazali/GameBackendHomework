package com.company.Concretes;

import com.company.Abstracts.Kampanya;
import com.company.Entities.Oyun;
import com.company.Entities.Oyuncu;

public class SatisManager  {

  private Kampanya kampanya;

    public SatisManager(Kampanya kampanya) {
        this.kampanya = kampanya;
    }

    public void satinAl(Oyuncu oyuncu, Oyun oyun){

        kampanya.ekle();
        System.out.println(oyun.getIsim()+" oyun'u satın alındı-->" + oyuncu.getIsim());

    }

}
