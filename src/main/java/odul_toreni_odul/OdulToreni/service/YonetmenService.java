package odul_toreni_odul.OdulToreni.service;

import odul_toreni_odul.OdulToreni.entity.*;
import odul_toreni_odul.OdulToreni.repository.YonetmenDao;

import java.util.Arrays;
import java.util.List;

public class YonetmenService {
    public static void main(String[] args) {
        save();
    }
    static YonetmenDao yonetmenDao=new YonetmenDao();

    public static void save(){
        Film film1=new Film("Yenilmezler 1");
        Film film2=new Film("Yenilmezler Sonsuzluk Savaşı");

        Odul odul1=new Odul("En iyi Aksiyon Yönetmeni Ödülü",film1);
        Odul odul2=new Odul("En iyi Macera Yönetmeni Ödülü",film2);
        List<Odul> odulList=Arrays.asList(odul1,odul2);

        Yonetmen yonetmen1=new Yonetmen("Joss Whedon",odulList);
        try{
            yonetmenDao.save(yonetmen1);
            System.out.println(yonetmen1.getYonetmenAdi()+" successfully saved to database(yonetmenSErvice)");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
