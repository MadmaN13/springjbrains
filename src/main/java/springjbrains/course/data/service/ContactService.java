package springjbrains.course.data.service;

import springjbrains.course.core.model.jpa.ContactEntity;

import java.util.List;

/**
 * Created by NM.Rabotaev on 08.09.2017.
 */
public interface ContactService {


    List<ContactEntity> findAll();
    List<ContactEntity> findByFirstName(String firstName);
    List<ContactEntity> findByFirstNameAndLastName(String firstName, String lastName);

    ContactEntity save(ContactEntity e);

    void delete(ContactEntity contactEntity);
}
