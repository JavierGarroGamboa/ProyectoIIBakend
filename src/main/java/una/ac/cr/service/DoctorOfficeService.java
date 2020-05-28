package una.ac.cr.service;

import una.ac.cr.exception.DAOException;
import una.ac.cr.exception.ServiceException;
import una.ac.cr.model.DoctorOffice;

import java.util.List;

/**
 * Office Service
 * Manage the services for doctorOffice
 */
public interface DoctorOfficeService {
    /**
     * Find All medicalOffice
     *
     * @return a list of doctorOffice
     * @throws DAOException DAO Exception
     * @throws ServiceException Service Exception
     */
    public List<DoctorOffice> findAll() throws DAOException, ServiceException;

    /**
     * Find doctorOffice by id
     *
     * @param id the identify of the doctorOffice
     * @return the doctorOffice found
     * @throws DAOException DAO Exception
     * @throws ServiceException Service Exception
     */
    public DoctorOffice findById(int id) throws DAOException, ServiceException;

    /**
     * Save doctorOffice in the databse
     *
     * @param office the doctorOffice entity with the information to save
     * @return the saved doctorOffice entity
     * @throws DAOException DAO Exception
     * @throws ServiceException Service Exception
     */
    public DoctorOffice save(DoctorOffice office) throws DAOException, ServiceException;

}
