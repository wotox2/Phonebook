import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For  Updating Contact Phone Number
    @Test
    public void testUpdateContactPhoneNumber() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Hank", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.updateContactPhoneNumber("Hank", "09876543210");

        assertEquals(1, result);
        assertEquals("09876543210", person.getPhone());
    }
}
