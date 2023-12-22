import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For  Updating Contact Name not found
    @Test
    public void testUpdateContactNameNotFound() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Frank", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.updateContactName("George", "Gina");

        assertEquals(0, result);
    }
}
