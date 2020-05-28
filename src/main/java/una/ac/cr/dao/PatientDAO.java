package una.ac.cr.dao;

import una.ac.cr.exception.DAOException;
import una.ac.cr.model.Patient;

import java.util.List;

/**
 * Patient DAO
 */
public interface PatientDAO {
    /**
     * Find the patient that match with the id
     *
     * @param id the identify of the patient
     * @return the patient entity
     * @throws DAOException DAO Exception
     */
    public Patient findById(int id) throws DAOException;

    /**
     * Save a new patient in the database
     *
     * @param patient is the entity of patient
     * @return the updated patient entity with the corresponding id
     * @throws DAOException DAO Exception
     */
    public Patient save(Patient patient) throws DAOException;

    /**
     * Update a patient in the database
     *
     * @param patient is the entity of patient
     * @return the udpated patient entity
     * @throws DAOException DAO Exception
     */
    public Patient update(Patient patient) throws DAOException;

    /**
     * Fina all the patient in the database
     *
     * @return a list of patient
     * @throws DAOException DAO Exception
     */
    public List<Patient> findAll() throws DAOException;

    /**
     * Delete a patient in the database
     *
     * @param id the identify of the patient
     * @return true if a success delete
     * @throws DAOException DAO Exception
     */
    public boolean delete(int id) throws DAOException;
}
