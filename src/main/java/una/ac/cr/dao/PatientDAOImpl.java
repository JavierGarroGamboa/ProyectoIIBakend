package una.ac.cr.dao;

import org.hibernate.Session;
import una.ac.cr.exception.DAOException;
import una.ac.cr.model.Patient;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The DAO implementation of patient
 */
public class PatientDAOImpl implements PatientDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     * Default constructor
     *
     * @throws DAOException DAO Exception
     */
    public PatientDAOImpl() throws DAOException {
    }


    /**
     * Find the patient that match with the id
     *
     * @param id the identify of the patient
     * @return the patient entity
     * @throws DAOException DAO Exception
     */
    @Override
    public Patient findById(int id) throws DAOException {
        Patient patient;
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Patient> query = builder.createQuery(Patient.class);
        Root<Patient> root = query.from(Patient.class);
        query.select(root).where(builder.equal(root.get("id"), id));
        Query q = session.createQuery(query);
        patient = (Patient) q.getSingleResult();

        return patient;
    }

    /**
     * Save a new patient in the database
     *
     * @param patient is the entity of patient
     * @return the updated patient entity with the corresponding id
     * @throws DAOException DAO Exception
     */
    @Override
    public Patient save(Patient patient) throws DAOException {
        session.beginTransaction();
        session.save(patient);
        session.getTransaction().commit();

        return patient;
    }

    /**
     * Update a patient in the database
     *
     * @param patient is the entity of patient
     * @return the udpated patient entity
     * @throws DAOException DAO Exception
     */
    @Override
    public Patient update(Patient patient) throws DAOException {
        session.beginTransaction();
        session.update(patient);
        session.getTransaction().commit();

        return patient;
    }

    /**
     * Fina all the patient in the database
     *
     * @return a list of patient
     * @throws DAOException DAO Exception
     */
    @Override
    public List<Patient> findAll() throws DAOException {
        List<Patient> patientList;

        patientList = session.createQuery("from Patient", Patient.class).list();

        return patientList;
    }

    /**
     * Delete a patient in the database
     *
     * @param id the identify of the patient
     * @return true if a success delete
     * @throws DAOException DAO Exception
     */
    @Override
    public boolean delete(int id) throws DAOException {
        boolean isDeleted;
        Patient patient;

        session.beginTransaction();
        patient = session.get(Patient.class, id);
        session.delete(patient);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }


}
