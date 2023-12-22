import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For  Get All Contact
    @Test
    public void testGetAllContacts() {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(new Person("Mia", "09123456789"));
        phonebook.addContact(new Person("Nathan", "09876543210"));

        ArrayList<Person> result = phonebook.getAllContacts();

        assertEquals(2, result.size());
    }
}
