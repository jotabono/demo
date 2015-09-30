package demo.Service;

import demo.Model.Specialty;
import demo.Repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by jotabono on 23/09/15.
 */
@Service
@Transactional
// Gestión de transacciones de bases de datos.

public class SpecialtyService {
    @Autowired
    private SpecialtyRepository specialtyRepository;

    public void testSpecialty(){
        Specialty specialty = new Specialty();
        specialty.setName("Spring");

        specialtyRepository.save(specialty);
    }

}
