import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For  Updating Contact Name
    @Test
    public void testUpdateContactName() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Eve", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.updateContactName("Eve", "Eva");

        assertEquals(1, result);
        assertEquals("Eva", person.getName());
    }
}
