package demo.Repository;

import demo.Model.Specialty;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by jotabono on 23/09/15.
 */
//Es la interface que representa el Repository que nos permitirá interactuar con las entidades para que sean persistentes en la base de datos.

public interface SpecialtyRepository extends PagingAndSortingRepository<Specialty,Long> {


}
