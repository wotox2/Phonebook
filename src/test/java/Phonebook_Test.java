import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Phonebook_Test {


    // Test For  Get All Contact Hidden
    @Test
    public void testSetAllContactsHidden() {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(new Person("Olivia", "09123456789"));
        phonebook.addContact(new Person("Peter", "09876543210"));

        phonebook.setAllContactsHidden();

        for (Person contact : phonebook.getAllContacts()) {
            assertEquals(true, contact.isHidden());
        }
    }
}
