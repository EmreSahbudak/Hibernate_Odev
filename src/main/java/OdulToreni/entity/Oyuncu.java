package OdulToreni.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Oyuncu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String oyuncuAdi;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Film> filmList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Odul> odulList;

    public Oyuncu(String oyuncuAdi, List<Film> filmList) {
        this.oyuncuAdi = oyuncuAdi;
        this.filmList = filmList;
    }

    public Oyuncu(String oyuncuAdi, List<Film> filmList, List<Odul> odulList) {
        this.oyuncuAdi = oyuncuAdi;
        this.filmList = filmList;
        this.odulList = odulList;
    }

    public Oyuncu(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }
}
