package una.ac.cr.service;

import una.ac.cr.dao.DoctorOfficeDAO;
import una.ac.cr.dao.DoctorOfficeDAOImpl;
import una.ac.cr.exception.DAOException;
import una.ac.cr.exception.ServiceException;
import una.ac.cr.model.DoctorOffice;

import java.util.List;

/**
 * The doctorOffice service implementation
 */
public class DoctorOfficeServiceImpl implements DoctorOfficeService {
    private DoctorOfficeDAO doctorOfficeDAO;
    List<DoctorOffice> officeList = null;

    /**
     * Find All doctorOffice
     *
     * @return a list of doctorOffice
     * @throws DAOException DAO Exception
     * @throws ServiceException Service Exception
     */
    @Override
    public List<DoctorOffice> findAll() throws DAOException, ServiceException {
        List<DoctorOffice> officeList = null;
        doctorOfficeDAO = new DoctorOfficeDAOImpl();
        officeList = doctorOfficeDAO.findAll();
        return officeList;
    }

    /**
     * Find office by id
     *
     * @param id the identify of the doctorOffice
     * @return the doctorOffice found
     * @throws DAOException DAO Exception
     * @throws ServiceException Service Exception
     */
    @Override
    public DoctorOffice findById(int id) throws DAOException, ServiceException {
        DoctorOffice office = null;
        doctorOfficeDAO = new DoctorOfficeDAOImpl();
        office = doctorOfficeDAO.findById(id);

        return office;
    }

    /**
     * Save doctorOffice in the databse
     *
     * @param office the doctorOffice entity with the information to save
     * @return the saved doctorOffice entity
     * @throws DAOException DAO Exception
     * @throws ServiceException Service Exception
     */
    @Override
    public DoctorOffice save(DoctorOffice office) throws DAOException, ServiceException {
        DoctorOffice officeSaved;
        doctorOfficeDAO = new DoctorOfficeDAOImpl();
        officeSaved = doctorOfficeDAO.save(office);
        return officeSaved;
    }

    /**
     * Update a patient in the database
     *
     *
     * @param office@return the Update patient entity
     * @throws DAOException     DAO Exception
     * @throws ServiceException Service Exception
     */

    public DoctorOffice update(DoctorOffice office) throws DAOException, ServiceException {
        DoctorOffice doctorOfficeUpdate;
        doctorOfficeDAO = new DoctorOfficeDAOImpl();
        doctorOfficeUpdate = doctorOfficeDAO.update(office);
        return doctorOfficeUpdate;
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
        doctorOfficeDAO = new DoctorOfficeDAOImpl();
        isDeleted = doctorOfficeDAO.delete(id);
        return isDeleted;
    }
}
