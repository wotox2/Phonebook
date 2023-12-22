import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For Getting  Contact Not Found
    @Test
    public void testGetContactNotFound() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Bob", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.getContact("Charlie");

        assertEquals(0, result);
    }
}
