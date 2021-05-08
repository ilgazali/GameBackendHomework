package com.company.Adapters;

import com.company.Abstracts.IGamerCheckService;
import com.company.Entities.Oyuncu;
import com.company.QIJKPSPublicSoap;

public class MernisCheckAdapter implements IGamerCheckService {
    @Override
    public boolean checkIfRealPerson(Oyuncu oyuncu) throws Exception {

        QIJKPSPublicSoap client = new QIJKPSPublicSoap();


        return client.TCKimlikNoDogrula(Long.parseLong(oyuncu.getTcNo()),oyuncu.getIsim().toUpperCase()
                ,oyuncu.getSoyIsim().toUpperCase(),oyuncu.getDogumYili());
    }
}
