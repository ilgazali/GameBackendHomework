package com.company;

import com.company.Adapters.MernisCheckAdapter;
import com.company.Adapters.Yuzde20Kampanya;
import com.company.Concretes.OyuncuManager;
import com.company.Concretes.SatisManager;
import com.company.Entities.Oyun;
import com.company.Entities.Oyuncu;

public class Main {

    public static void main(String[] args) throws Exception {

        Oyuncu oyuncu = new Oyuncu("Muhammet Ali","Ilgaz",1997,"21139660514");
        OyuncuManager oyuncuManager = new OyuncuManager(new MernisCheckAdapter());
        oyuncuManager.kayitOl(oyuncu);

        Oyun oyun1 = new Oyun("GTA 5");

        SatisManager satisManager = new SatisManager(new Yuzde20Kampanya());
        satisManager.satinAl(oyuncu,oyun1);


    }
}
