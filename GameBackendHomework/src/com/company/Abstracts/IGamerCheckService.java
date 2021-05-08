package com.company.Abstracts;

import com.company.Entities.Oyuncu;

public interface IGamerCheckService {



    boolean checkIfRealPerson(Oyuncu oyuncu) throws Exception;

}
