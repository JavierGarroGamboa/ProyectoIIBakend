package una.ac.cr.dao;

import org.hibernate.Session;
import una.ac.cr.exception.DAOException;
import una.ac.cr.model.DoctorOffice;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The DAO implementation of doctorOffice
 */
public class DoctorOfficeDAOImpl implements DoctorOfficeDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     * Default constructor
     *
     * @throws DAOException DAO Exception
     */
    public DoctorOfficeDAOImpl() throws DAOException {
    }


    /**
     * Find the doctorOffice that match with the id
     *
     * @param id the identify of the doctorOffice
     * @return the office entity
     * @throws DAOException DAO Exception
     */
    @Override
    public DoctorOffice findById(int id) throws DAOException {
        DoctorOffice student;
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<DoctorOffice> query = builder.createQuery(DoctorOffice.class);
        Root<DoctorOffice> root = query.from(DoctorOffice.class);
        query.select(root).where(builder.equal(root.get("id"), id));
        Query q=session.createQuery(query);
        student= (DoctorOffice) q.getSingleResult();

        return student;
    }

    /**
     * Save a new doctorOffice in the database
     *
     * @param office is the entity of doctorOffice
     * @return the updated office entity with the corresponding id
     * @throws DAOException DAO Exception
     */
    @Override
    public DoctorOffice save(DoctorOffice office) throws DAOException {
        session.beginTransaction();
        session.save(office);
        session.getTransaction().commit();

        return office;
    }

    /**
     * Update a doctorOffice in the database
     *
     * @param office is the entity of doctorOffice
     * @return the udpated office entity
     * @throws DAOException DAO Exception
     */
    @Override
    public DoctorOffice update(DoctorOffice office) throws DAOException {
        session.beginTransaction();
        session.update(office);
        session.getTransaction().commit();

        return office;
    }

    /**
     * Fina all the doctorOffice in the database
     *
     * @return a list of doctorOffice
     * @throws DAOException DAO Exception
     */
    @Override
    public List<DoctorOffice> findAll() throws DAOException {
        List<DoctorOffice> officeList;

        officeList = session.createQuery("from DoctorOffice", DoctorOffice.class).list();

        return officeList;
    }

    /**
     * Delete a doctorOffice in the database
     *
     * @param id the identify of the doctorOffice
     * @return true if a success delete
     * @throws DAOException DAO Exception
     */
    @Override
    public boolean delete(int id) throws DAOException {
        boolean isDeleted;
        DoctorOffice office;

        session.beginTransaction();
        office = session.get(DoctorOffice.class, id);
        session.delete(office);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }
}