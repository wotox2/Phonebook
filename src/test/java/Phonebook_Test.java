import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For  Get All Contact Hidden
    @Test
    public void testSetAllContactsUnHidden() {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(new Person("Quinn", "09123456789"));
        phonebook.addContact(new Person("Rachel", "09876543210"));

        phonebook.setAllContactsUnHidden();

        for (Person contact : phonebook.getAllContacts()) {
            assertEquals(false, contact.isHidden());
        }
    }
}
