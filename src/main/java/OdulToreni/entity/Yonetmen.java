package OdulToreni.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Yonetmen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String yonetmenAdi;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Film> filmList;

    @OneToMany(cascade =  CascadeType.ALL)
    private List<Odul> odulList;

    public Yonetmen(String yonetmenAdi) {
        this.yonetmenAdi = yonetmenAdi;
    }

    public Yonetmen(String yonetmenAdi, List<Film> filmList) {
        this.yonetmenAdi = yonetmenAdi;
        this.filmList = filmList;
    }

    public Yonetmen(String yonetmenAdi, List<Film> filmList, List<Odul> odulList) {
        this.yonetmenAdi = yonetmenAdi;
        this.filmList = filmList;
        this.odulList = odulList;
    }
}
