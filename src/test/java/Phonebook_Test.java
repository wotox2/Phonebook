import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {

    @Test
    public void testAddContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("John", "09123456789");

        phonebook.addContact(person);

        assertEquals(1, phonebook.getAllContacts().size());
    }

    @Test
    public void testGetPhoneNumber() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Alice", "09123456789");
        phonebook.addContact(person);

        String result = phonebook.getPhoneNumber("Alice");

        assertEquals("09123456789", result);
    }

    @Test
    public void testGetContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Alice", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.getContact("Alice");

        assertEquals(1, result);
    }

    @Test
    public void testGetContactNotFound() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Bob", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.getContact("Charlie");

        assertEquals(0, result);
    }

    @Test
    public void testUpdateContactName() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Eve", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.updateContactName("Eve", "Eva");

        assertEquals(1, result);
        assertEquals("Eva", person.getName());
    }

    @Test
    public void testUpdateContactNameNotFound() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Frank", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.updateContactName("George", "Gina");

        assertEquals(0, result);
    }

    @Test
    public void testUpdateContactPhoneNumber() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Hank", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.updateContactPhoneNumber("Hank", "09876543210");

        assertEquals(1, result);
        assertEquals("09876543210", person.getPhone());
    }

    @Test
    public void testDeleteContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Katie", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.deleteContact("Katie");

        assertEquals(1, result);
        assertEquals(0, phonebook.getAllContacts().size());
    }

    @Test
    public void testDeleteContactNotFound() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Leo", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.deleteContact("Lucas");

        assertEquals(0, result);
        assertEquals(1, phonebook.getAllContacts().size());
    }

    @Test
    public void testGetAllContacts() {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(new Person("Mia", "09123456789"));
        phonebook.addContact(new Person("Nathan", "09876543210"));

        ArrayList<Person> result = phonebook.getAllContacts();

        assertEquals(2, result.size());
    }

    @Test
    public void testSetAllContactsHidden() {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(new Person("Olivia", "09123456789"));
        phonebook.addContact(new Person("Peter", "09876543210"));

        phonebook.setAllContactsHidden();

        for (Person contact : phonebook.getAllContacts()) {
            assertEquals(true, contact.isHidden());
        }
    }

    @Test
    public void testSetAllContactsUnHidden() {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(new Person("Quinn", "09123456789"));
        phonebook.addContact(new Person("Rachel", "09876543210"));

        phonebook.setAllContactsUnHidden();

        for (Person contact : phonebook.getAllContacts()) {
            assertEquals(false, contact.isHidden());
        }
    }
}
