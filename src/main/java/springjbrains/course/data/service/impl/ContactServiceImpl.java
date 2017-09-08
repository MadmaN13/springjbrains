package springjbrains.course.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springjbrains.course.core.model.jpa.ContactEntity;
import springjbrains.course.data.repository.ContactRepository;
import springjbrains.course.data.service.ContactService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NM.Rabotaev on 08.09.2017.
 */
@Service("jpaContactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<ContactEntity> findAll() {
        List<ContactEntity> result = new ArrayList<>();
        Iterable<ContactEntity> source = contactRepository.findAll();
        source.forEach(result::add);
        return result;
    }

    @Override
    public List<ContactEntity> findByFirstName(String firstName) {
        return contactRepository.findByFirstName(firstName);
    }

    @Override
    public List<ContactEntity> findByFirstNameAndLastName(String firstName, String lastName) {
        return contactRepository.findByFirstNameAndLastName(firstName, lastName);
    }
}
