package odul_toreni_odul.OdulToreni.service;

import odul_toreni_odul.OdulToreni.entity.Film;
import odul_toreni_odul.OdulToreni.entity.Odul;
import odul_toreni_odul.OdulToreni.entity.Oyuncu;
import odul_toreni_odul.OdulToreni.entity.Yonetmen;
import odul_toreni_odul.OdulToreni.repository.OyuncuDao;

import java.util.Arrays;
import java.util.List;

public class OyuncuService {
    public static void main(String[] args) {
        save();

    }
    static OyuncuDao oyuncuDao=new OyuncuDao();

    public static void save(){
        Film film1=new Film("Jumanji: Vahşi Orman");
        Film film2=new Film("Black Man");

        Odul odul1=new Odul("En iyi Erkek oyuncu ödülü",film1);
        Odul odul2=new Odul("En iyi Aksiyon Filmi oyuncusu Ödülü",film2);
        List<Odul>odulList=Arrays.asList(odul1,odul2);

        Oyuncu oyuncu1=new Oyuncu("Dwayne Johnson",odulList);
        try{
            oyuncuDao.save(oyuncu1);
            System.out.println(oyuncu1.getOyuncuAdi()+" successfully saved to database(OyuncuSErvice");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
