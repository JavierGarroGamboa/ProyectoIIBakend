package una.ac.cr.service;

import una.ac.cr.exception.DAOException;
import una.ac.cr.exception.ServiceException;
import una.ac.cr.model.Patient;

import java.util.List;

/**
 * Patient Service
 * Manage the services for patient
 */
public interface PatientService {

    /**
     * Find All patient
     *
     * @return a list of patient
     * @throws DAOException     DAO Exception
     * @throws ServiceException Service Exception
     */
    public List<Patient> findAll() throws DAOException, ServiceException;

    /**
     * Find patient by id
     *
     * @param id the identify of the patient
     * @return the patient found
     * @throws DAOException     DAO Exception
     * @throws ServiceException Service Exception
     */
    public Patient findById(int id) throws DAOException, ServiceException;

    /**
     * Save client in the database
     *
     * @param patient the patient entity with the information to save
     * @return the saved patient entity
     * @throws DAOException     DAO Exception
     * @throws ServiceException Service Exception
     */
    public Patient save(Patient patient) throws DAOException, ServiceException;
}
