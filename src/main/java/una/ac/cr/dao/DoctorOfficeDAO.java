package una.ac.cr.dao;

import una.ac.cr.exception.DAOException;
import una.ac.cr.model.DoctorOffice;

import java.util.List;

/**
 * DoctorOffice DAO
 */
public interface DoctorOfficeDAO {
    /**
     * Find the doctorOffice that match with the id
     *
     * @param id the identify of the office
     * @return the doctorOffice entity
     * @throws DAOException DAO Exception
     */
    public DoctorOffice findById (int id) throws DAOException;

    /**
     * Save a new doctorOffice in the database
     *
     * @param office is the entity of DoctorOffice
     * @return the updated student entity with the corresponding id
     * @throws DAOException DAO Exception
     */
    public DoctorOffice save(DoctorOffice office) throws DAOException;

    /**
     * Update a doctorOffice in the database
     *
     * @param office is the entity of doctorOffice
     * @return the udpated office entity
     * @throws DAOException DAO Exception
     */
    public DoctorOffice update(DoctorOffice office) throws DAOException;

    /**
     * Fina all the doctorOffice in the database
     *
     * @return a list of doctorOffices
     * @throws DAOException DAO Exception
     */
    public List<DoctorOffice> findAll() throws DAOException;

    /**
     * Delete a doctorOffice in the database
     *
     * @param id the identify of the doctorOffice
     * @return true if a success delete
     * @throws DAOException DAO Exception
     */
    public boolean delete(int id) throws DAOException;
}
