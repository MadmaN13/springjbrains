package springjbrains.course.service.impl;

import org.junit.Test;
import springjbrains.course.TestConstants;
import springjbrains.course.context.AbstractClassPathXmlApplicationContextTest;
import springjbrains.course.core.model.jpa.ContactEntity;
import springjbrains.course.data.service.ContactService;
import sun.misc.Unsafe;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by NM.Rabotaev on 08.09.2017.
 */
public class ContactServiceImplTest extends AbstractClassPathXmlApplicationContextTest {

    private final static String contactServiceBeanName = "jpaContactService";

    private final static String create_firstName = "Create_FirstName";
    private final static String create_lastName = "Create_LastName";

    private final static String read_firstName = "Example_FirstName";
    private final static String read_lastName = "Example_LastName";
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
        List<ContactEntity> entities = service.findByFirstName(read_firstName);
        printEntitiesIfAny(entities);
    }

    @Test
    public void findByFirstNameAndLastName() throws Exception {
        List<ContactEntity> entities = service.findByFirstNameAndLastName(read_firstName, read_lastName);
        printEntitiesIfAny(entities);
    }

    @Test
    public void save() {
        ContactEntity e = new ContactEntity();
        e.setBirthDate(new Date());
        e.setId(3);
        e.setFirstName("Lisa");
        e.setLastName("Ann");
        getLogger().info("Saved: " + service.save(e));
    }

    @Test
    public void update() {
        List<ContactEntity> marshaBatch = service.findByFirstName("Marsha");
        if (!marshaBatch.isEmpty()) {
            ContactEntity marsha = marshaBatch.get(0);
            marsha.setFirstName("Lisa");
            marsha.setLastName("Ann");
            ContactEntity lisa = service.save(marsha);
            getLogger().info("Updated: " + lisa);
        }
    }

    @Test
    public void delete() {
        List<ContactEntity> entityBatch = service.findByFirstName("Lisa");
        if (!entityBatch.isEmpty()) {
            ContactEntity lisa = entityBatch.get(0);
            service.delete(lisa);
        }
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
//        test.save();
//        test.update();
    }

}