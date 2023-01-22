package odul_toreni_odul.OdulToreni.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String filmAdi;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Kategori> kategoriList;

    //bir filmin birden fazla ödülü vardır
    //bir ödülün bir filmi vardır
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "film")
    private List<Odul> odulList;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Oyuncu> oyuncuList;

    public Film(String filmAdi) {
        this.filmAdi = filmAdi;
    }

    public Film(String filmAdi, List<Kategori> kategoriList) {
        this.filmAdi = filmAdi;
        this.kategoriList = kategoriList;
    }

    public Film(String filmAdi, List<Kategori> kategoriList, List<Odul> odulList) {
        this.filmAdi = filmAdi;
        this.kategoriList = kategoriList;
        this.odulList = odulList;
    }

    public Film(String filmAdi, List<Kategori> kategoriList, List<Odul> odulList, List<Oyuncu> oyuncuList) {
        this.filmAdi = filmAdi;
        this.kategoriList = kategoriList;
        this.odulList = odulList;
        this.oyuncuList = oyuncuList;
    }
}


