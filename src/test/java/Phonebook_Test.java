import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For Getting  Contact
    @Test
    public void testGetContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Alice", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.getContact("Alice");

        assertEquals(1, result);
    }
}
