package OdulToreni.service;

import OdulToreni.entity.*;
import OdulToreni.repository.OyuncuDao;

import java.util.Arrays;
import java.util.List;

public class OyuncuService {
    public static void main(String[] args) {
        save();

    }
    static OyuncuDao oyuncuDao=new OyuncuDao();

    public static void save(){
        Odul odul1=new Odul("En Maceracı Film");
        Odul odul2=new Odul("En Sürükeyici Film");
        List<Odul>odulList=Arrays.asList(odul1,odul2);

        Film film1=new Film("Jumanji: Vahşi Orman");
        List<Film> filmList= Arrays.asList(film1);

        Oyuncu oyuncu1=new Oyuncu("Dwayne Johnson",filmList,odulList);
        try{
            oyuncuDao.save(oyuncu1);
            System.out.println(film1.getFilmAdi()+" successfully saved to database(OyuncuDao)");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
