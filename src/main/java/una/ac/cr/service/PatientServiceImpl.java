package una.ac.cr.service;

import una.ac.cr.dao.PatientDAO;
import una.ac.cr.dao.PatientDAOImpl;
import una.ac.cr.exception.DAOException;
import una.ac.cr.exception.ServiceException;
import una.ac.cr.model.Patient;

import java.util.List;

/**
 * The patient service implementation
 */
public class PatientServiceImpl implements PatientService {
    private PatientDAO patientDAO;
    List<Patient> listPatient = null;

    /**
     * Find All patient
     *
     * @return a list of patient
     * @throws DAOException     DAO Exception
     * @throws ServiceException Service Exception
     */
    @Override
    public List<Patient> findAll() throws DAOException, ServiceException {
        List<Patient> listPatient = null;
        patientDAO = new PatientDAOImpl();
        listPatient = patientDAO.findAll();
        return listPatient;
    }

    /**
     * Find patient by id
     *
     * @param id the identify of the patient
     * @return the patient found
     * @throws DAOException     DAO Exception
     * @throws ServiceException Service Exception
     */
    @Override
    public Patient findById(int id) throws DAOException, ServiceException {
        Patient patient = null;
        patientDAO = new PatientDAOImpl();
        patient = patientDAO.findById(id);

        return patient;
    }

    /**
     * Save patient in the databse
     *
     * @param patient the patient entity with the information to save
     * @return the saved patient entity
     * @throws DAOException     DAO Exception
     * @throws ServiceException Service Exception
     */
    @Override
    public Patient save(Patient patient) throws DAOException, ServiceException {
        Patient patientSaved;
        patientDAO = new PatientDAOImpl();
        patientSaved = patientDAO.save(patient);
        return patientSaved;
    }

    /**
     * Update a patient in the database
     *
     * @param patient the patient entity with the information to save
     * @return the Update patient entity
     * @throws DAOException     DAO Exception
     * @throws ServiceException Service Exception
     */

    public Patient update(Patient patient) throws DAOException, ServiceException {
        Patient patientUpdate;
        patientDAO = new PatientDAOImpl();
        patientUpdate = patientDAO.update(patient);
        return patientUpdate;
    }

    /**
     * Delete a patient in the database
     *
     * @param id the identify of the patient
     * @return true if a success delete
     * @throws DAOException DAO Exception
     * @throws ServiceException Service Exception
     */
    public boolean delete(int id) throws DAOException, ServiceException {
        boolean isDeleted;
        patientDAO = new PatientDAOImpl();
        isDeleted = patientDAO.delete(id);
        return isDeleted;
    }
}
