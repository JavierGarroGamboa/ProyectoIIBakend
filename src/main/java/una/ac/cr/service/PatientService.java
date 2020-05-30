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
     * Save patient in the database
     *
     * @param patient the patient entity with the information to save
     * @return the saved patient entity
     * @throws DAOException     DAO Exception
     * @throws ServiceException Service Exception
     */
    public Patient save(Patient patient) throws DAOException, ServiceException;

    /**
     * Update a patient in the database
     *
     * @param patient the patient entity with the information to save
     * @return the update patient entity
     * @throws DAOException     DAO Exception
     * @throws ServiceException Service Exception
     */
    public Patient update(Patient patient) throws DAOException, ServiceException;

    /**
     * Delete a patient in the database
     *
     * @param id the identify of the patient
     * @return true if a success delete
     * @throws DAOException DAO Exception
     * @throws ServiceException Service Exception
     */
    public boolean delete(int id) throws DAOException, ServiceException;
}
