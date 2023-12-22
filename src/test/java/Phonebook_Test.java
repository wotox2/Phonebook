import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For  Delete Contact Not Found
    @Test
    public void testDeleteContactNotFound() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Leo", "09123456789");
        phonebook.addContact(person);

        int result = phonebook.deleteContact("Lucas");

        assertEquals(0, result);
        assertEquals(1, phonebook.getAllContacts().size());
    }
}
