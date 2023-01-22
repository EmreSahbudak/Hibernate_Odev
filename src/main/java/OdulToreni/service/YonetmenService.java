package OdulToreni.service;

import OdulToreni.entity.*;
import OdulToreni.repository.YonetmenDao;
import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.List;

public class YonetmenService {
    public static void main(String[] args) {
        save();
    }
    static YonetmenDao yonetmenDao=new YonetmenDao();

    public static void save(){
        Odul odul1=new Odul("En iyi Aksiyon Ödülü");
        Odul odul2=new Odul("En iyi Macera Ödülü");
        List<Odul> odulList=Arrays.asList(odul1,odul2);

        Film film1=new Film("Yenilmezler 1");
        List<Film> filmList= Arrays.asList(film1);
        Yonetmen yonetmen1=new Yonetmen("Joss Whedon",filmList,odulList);
        try{
            yonetmenDao.save(yonetmen1);
            System.out.println(film1.getFilmAdi()+" successfully saved to database(yonetmenDao)");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
