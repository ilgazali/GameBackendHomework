package com.company.Concretes;

import com.company.Abstracts.IGamerCheckService;
import com.company.Entities.Oyuncu;

public class OyuncuManager {

    private IGamerCheckService gamerCheckService;

    public OyuncuManager(IGamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }

    public void kayitOl(Oyuncu oyuncu) throws Exception {

        if (gamerCheckService.checkIfRealPerson(oyuncu)){

            System.out.println("kayıt başarılı-->" + oyuncu.getIsim());
        }else{
            System.out.println("kayıt başarısız");
        }
    }

    public void bilgiGuncelle(Oyuncu oyuncu){
        System.out.println("bilgiler güncellendi-->" + oyuncu.getIsim());
    }
    public void kayitSil(Oyuncu oyuncu){
        System.out.println("kayıt silindi-->" + oyuncu.getIsim());
    }

}
