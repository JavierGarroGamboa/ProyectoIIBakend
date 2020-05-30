package una.ac.cr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import una.ac.cr.exception.DAOException;
import una.ac.cr.exception.ServiceException;
import una.ac.cr.model.Patient;
import una.ac.cr.service.PatientService;
import una.ac.cr.service.PatientServiceImpl;

import java.util.List;

@Controller
@RequestMapping(value = "/api/patients")
public class PatientController {
    private PatientService patientService = new PatientServiceImpl();

    @GetMapping()
    @ResponseBody
    public List<Patient> findAll() {
        List<Patient> patientList = null;
        try {
            patientList = patientService.findAll();
        } catch (DAOException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", ex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }
        return patientList;
    }

    @GetMapping("{id}")
    @ResponseBody
    public Patient findById(@PathVariable int id) {
        Patient patient = null;
        try {
            patient = patientService.findById(id);
        } catch (DAOException bex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,"Error importante - Capa DAO", bex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }

        return patient;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Patient save(@RequestBody Patient patient) {
        Patient patientSaved = null;
        try {
            patientSaved = patientService.save(patient);
        } catch (DAOException bex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", bex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }
        return patientSaved;
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Patient update(@RequestBody Patient patient) {
        Patient patientSaved = null;
        try {
            patientSaved = patientService.update(patient);
        } catch (DAOException bex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa DAO", bex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }
        return patientSaved;
    }

    @DeleteMapping("id_patient")
    @ResponseBody
    public boolean delete(@RequestParam int id) {
        boolean isDeleted;
        try {
            isDeleted = patientService.delete(id);
        } catch (DAOException bex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,"Error importante - Capa DAO", bex);
        } catch (ServiceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Error importante - Capa Service", ex);
        }

        return isDeleted;
    }
}
