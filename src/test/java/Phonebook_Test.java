import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For  Delete Contact
    @Test
    public void testDeleteContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Katie", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.deleteContact("Katie");

        assertEquals(1, result);
        assertEquals(0, phonebook.getAllContacts().size());
    }
}
