package springjbrains.course.exp;

import org.hibernate.Session;
import sun.misc.Unsafe;

import javax.persistence.EntityManager;
import java.sql.ResultSet;

/**
 * Created by NM.Rabotaev on 20.09.2017.
 */
public class AutoCloseableEntityHolderManager implements AutoCloseable {

    protected EntityManager em;

    public AutoCloseableEntityHolderManager(EntityManager em) {
        this.em = em;
    }

    @Override
    public void close() throws Exception {
        if (em != null && em.isOpen()) em.close();
    }

    //ACCESSORS
    protected EntityManager getEm() {
        return em;
    }

}
