package OdulToreni.repository;

import OdulToreni.entity.Film;
import OdulToreni.entity.Yonetmen;
import OdulToreni.utils.HibernateUtil;
import org.hibernate.Session;

public class YonetmenDao {
    public void save(Yonetmen yonetmen){
        Session session= HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(yonetmen);
            session.getTransaction().commit();
            System.out.println("Save Success yonetmenDao");
            session.close();
        }catch (Exception e){
            System.out.println(e.getMessage()+"HATA yonetmenDao SAVE");
        }
    }
}
