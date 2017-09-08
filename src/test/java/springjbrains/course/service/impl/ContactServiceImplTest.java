package springjbrains.course.service.impl;

import org.junit.Test;
import springjbrains.course.TestConstants;
import springjbrains.course.context.AbstractClassPathXmlApplicationContextTest;
import springjbrains.course.core.model.jpa.ContactEntity;
import springjbrains.course.data.service.ContactService;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by NM.Rabotaev on 08.09.2017.
 */
public class ContactServiceImplTest extends AbstractClassPathXmlApplicationContextTest {

    private final static String contactServiceBeanName = "jpaContactService";
    private final static String firstName = "Example_FirstName";
    private final static String lastName = "Example_LastName";
    private ContactService service;


    public ContactServiceImplTest(String contextFileName) {
        super(contextFileName);
        service = getContext().getBean(contactServiceBeanName, ContactService.class);

    }

    @Test
    public void findAll() throws Exception {
        List<ContactEntity> entities = service.findAll();
        printEntitiesIfAny(entities);
    }

    @Test
    public void findByFirstName() throws Exception {
        List<ContactEntity> entities = service.findByFirstName(firstName);
        printEntitiesIfAny(entities);
    }

    @Test
    public void findByFirstNameAndLastName() throws Exception {
        List<ContactEntity> entities = service.findByFirstNameAndLastName(firstName, lastName);
        printEntitiesIfAny(entities);
    }

    private void printEntitiesIfAny(List<ContactEntity> entities) {
        assertNotEquals(0,entities.size());
        entities.forEach(e-> getLogger().info(e.toString()));
    }

    public static void main(String [] args) throws Exception {
        ContactServiceImplTest test = new ContactServiceImplTest(TestConstants.DATA_CONTEXT);
        test.findAll();
        test.findByFirstName();
        test.findByFirstNameAndLastName();
    }

}