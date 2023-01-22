package OdulToreni.entity;

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
    @OneToMany(cascade = CascadeType.ALL)
    private List<Odul> odul;

    //bir filmin birden fazla oyuncusu vardır
    //bir oyuncunun birden fazla filmi vardır
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Oyuncu> oyuncuList;

    //birçok filmin bir yönetmeni vardır
    //bir yönetmenin birden çok filmi vardır
    @ManyToOne(cascade = CascadeType.ALL)
    private Yonetmen yonetmen;
            //filmDAo dan yönetirken kullandığım constructor
    public Film(String filmAdi, List<Kategori> kategoriList, List<Odul> odul, List<Oyuncu> oyuncuList, Yonetmen yonetmen) {
        this.filmAdi = filmAdi;
        this.kategoriList = kategoriList;
        this.odul = odul;
        this.oyuncuList = oyuncuList;
        this.yonetmen = yonetmen;
    }
            //YonetmenDao dan yönetirken kullandığım constructor
    public Film(String filmAdi, List<Kategori> kategoriList, List<Odul> odul, List<Oyuncu> oyuncuList) {
        this.filmAdi = filmAdi;
        this.kategoriList = kategoriList;
        this.odul = odul;
        this.oyuncuList = oyuncuList;
    }
            //OyuncuDao dan yönetirken kullandığım constructor

    public Film(String filmAdi, List<Odul> odul) {
        this.filmAdi = filmAdi;
        this.odul = odul;
    }

    public Film(String filmAdi) {
        this.filmAdi = filmAdi;
    }
}


