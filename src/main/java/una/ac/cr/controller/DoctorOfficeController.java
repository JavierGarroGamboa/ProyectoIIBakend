package una.ac.cr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import una.ac.cr.exception.DAOException;
import una.ac.cr.exception.ServiceException;
import una.ac.cr.model.DoctorOffice;
import una.ac.cr.service.DoctorOfficeService;
import una.ac.cr.service.DoctorOfficeServiceImpl;

import java.util.List;

@Controller
@RequestMapping(value = "/api/DoctorOffices")
public class DoctorOfficeController {
    private DoctorOfficeService doctorOfficeService = new DoctorOfficeServiceImpl();

    @GetMapping()
    @ResponseBody
    public List<DoctorOffice> findAll() {
        List<DoctorOffice> officeList = null;
        try {
            officeList = doctorOfficeService.findAll();
        } catch (DAOException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", ex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }
        return officeList;
    }

    @GetMapping("{id}")
    @ResponseBody
    public DoctorOffice findById(@PathVariable int id) {
        DoctorOffice office = null;
        try {
            office = doctorOfficeService.findById(id);
        } catch (DAOException bex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", bex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }

        return office;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public DoctorOffice save(@RequestBody DoctorOffice doctorOffice) {
        DoctorOffice officeSaved = null;
        try {
            officeSaved = doctorOfficeService.save(doctorOffice);
        } catch (DAOException bex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", bex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }
        return officeSaved;
    }
}
