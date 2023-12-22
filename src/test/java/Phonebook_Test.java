import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For Getting  Contact
    @Test
    public void testGetPhoneNumber() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Alice", "09123456789");
        phonebook.addContact(person);

        String result = phonebook.getPhoneNumber("Alice");

        assertEquals("09123456789", result);
    }
}
