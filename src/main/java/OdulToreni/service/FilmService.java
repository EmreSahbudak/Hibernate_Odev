package OdulToreni.service;

import OdulToreni.entity.*;
import OdulToreni.repository.FilmDao;

import java.util.Arrays;
import java.util.List;

public class FilmService {
    public static void main(String[] args) {
        save();
    }
    static FilmDao filmDao=new FilmDao();


    public static void save(){
        Kategori kategori1=new Kategori("Bilim Kurgu");
        Kategori kategori2=new Kategori("Aksiyon");
        List<Kategori> kategoriList=Arrays.asList(kategori1,kategori2);

        Odul odul1=new Odul("En iyi Film OSCAR'ı");
        Odul odul2=new Odul("En iyi Bilim Kurgu Film OSCAR'ı");
        List<Odul> odulList=Arrays.asList(odul1,odul2);

        Oyuncu oyuncu1=new Oyuncu("Michael Jordan");
        Oyuncu oyuncu2=new Oyuncu("Chadwick Boseman");
        List<Oyuncu> oyuncuList=Arrays.asList(oyuncu1,oyuncu2);

        Yonetmen yonetmen1=new Yonetmen("Ryan Coogler");

        Film film1=new Film("Black Panter",kategoriList,odulList,oyuncuList,yonetmen1);
        try{
           filmDao.save(film1);
            System.out.println(film1.getFilmAdi()+" successfully saved to database(FilmDao)");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
