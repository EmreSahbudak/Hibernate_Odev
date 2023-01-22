package odul_toreni_odul.OdulToreni.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Odul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String odulAdi;

    @ManyToOne(cascade = CascadeType.ALL)
    private Film film;

    @ManyToOne(cascade = CascadeType.ALL)
    private Yonetmen yonetmen;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oyuncu_id",referencedColumnName = "id")
    private Oyuncu oyuncu;

    public Odul(String odulAdi) {
        this.odulAdi = odulAdi;
    }

    public Odul(String odulAdi, Film film, Yonetmen yonetmen, Oyuncu oyuncu) {
        this.odulAdi = odulAdi;
        this.film = film;
        this.yonetmen = yonetmen;
        this.oyuncu = oyuncu;
    }

    public Odul(String odulAdi, Yonetmen yonetmen, Oyuncu oyuncu) {
        this.odulAdi = odulAdi;
        this.yonetmen = yonetmen;
        this.oyuncu = oyuncu;
    }

    public Odul(String odulAdi, Film film, Yonetmen yonetmen) {
        this.odulAdi = odulAdi;
        this.film = film;
        this.yonetmen = yonetmen;
    }

    public Odul(String odulAdi, Film film) {
        this.odulAdi = odulAdi;
        this.film = film;
    }

    public Odul(String odulAdi, Film film, Oyuncu oyuncu) {
        this.odulAdi = odulAdi;
        this.film = film;
        this.oyuncu = oyuncu;
    }

    public Odul(String odulAdi, Yonetmen yonetmen) {
        this.odulAdi = odulAdi;
        this.yonetmen = yonetmen;
    }
}
