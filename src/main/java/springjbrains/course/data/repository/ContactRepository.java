package springjbrains.course.data.repository;

import org.springframework.data.repository.CrudRepository;
import springjbrains.course.core.model.jpa.ContactEntity;

import java.util.List;

/**
 * Created by NM.Rabotaev on 08.09.2017.
 */
public interface ContactRepository extends CrudRepository<ContactEntity, Integer>{
    List<ContactEntity> findByFirstName(String firstName);
    List<ContactEntity> findByFirstNameAndLastName(String firstName, String lastName);
}
