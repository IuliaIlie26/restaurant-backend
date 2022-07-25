package com.ibm.restaurant;

import com.ibm.restaurant.comenzi.ComenziDTO;
import com.ibm.restaurant.domain.Comenzi;
import com.ibm.restaurant.domain.Livrator;
import com.ibm.restaurant.domain.Table;
import com.ibm.restaurant.livrator.LivratorDTO;
import com.ibm.restaurant.tables.TableDto;
import org.springframework.stereotype.Service;


//Update 25/07/2022 - 10:39

@Service
public class MapperService
{
    public Livrator mapToDomain(LivratorDTO dto) {
        Livrator pers1 = new Livrator();
        pers1.setNume(dto.Nume);
        return pers1;
    }

    public LivratorDTO mapFromDomain(Livrator pers1){
        LivratorDTO dto = new LivratorDTO();
        dto.Nume = pers1.getNume();
        dto.Status_Disponibilitate = pers1.getStatus_Disponibilitate();
        return dto;
    }

    public Comenzi mapToDomain(ComenziDTO dto) {
        Comenzi comand1 = new Comenzi();
        comand1.setStatus_Livrare(dto.Status_Livrare);
        return comand1;
    }

    public ComenziDTO mapFromDomain(Comenzi comand1){
        ComenziDTO dto = new ComenziDTO();
        dto.Status_Livrare = comand1.getStatus_Livrare();
        dto.ID_Livrator = comand1.getID_Livrator();
        return dto;
    }

}
