package odul_toreni_odul.OdulToreni.repository;

import odul_toreni_odul.OdulToreni.entity.Film;
import odul_toreni_odul.OdulToreni.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class FilmDao {
    public void save(Film film){
        Session session= HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(film);
            session.getTransaction().commit();
            System.out.println("Save Success filmDao");
            session.close();
        }catch (Exception e){
            System.out.println(e.getMessage()+"HATA filmDao SAVE");
        }
    }
    public List<Film> getAll(){





        return null;
    }

}
