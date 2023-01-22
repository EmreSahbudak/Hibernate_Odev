package OdulToreni.repository;

import OdulToreni.entity.Film;
import OdulToreni.utils.HibernateUtil;
import org.hibernate.Session;

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

}
