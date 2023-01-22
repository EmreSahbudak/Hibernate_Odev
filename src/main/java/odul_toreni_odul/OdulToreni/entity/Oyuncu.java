package odul_toreni_odul.OdulToreni.entity;

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

    //bir oyuncunun birden fazla ödülü vardır
    //ama bir ödül bir oyuncuya verilir.
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "oyuncu")
    private List<Odul> odulList;

    public Oyuncu(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public Oyuncu(String oyuncuAdi, List<Odul> odulList) {
        this.oyuncuAdi = oyuncuAdi;
        this.odulList = odulList;
    }
}
