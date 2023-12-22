import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For Adding Contact 
    @Test
    public void testAddContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("John", "09123456789");

        phonebook.addContact(person);

        assertEquals(1, phonebook.getAllContacts().size());
    }
}
