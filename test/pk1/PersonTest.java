package pk1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private static final String NAME = "Bob";
    private static final String NAME_INITIAL = "B";
    private static final String TWO_NAME = "Bob Hope";
    private static final String TWO_NAME_INITIAL = "BH";
    private static final String THREE_NAME = "Bob John Hope";
    private static final String THREE_NAME_INITIAL = "BJH";
    private static final String TWO_SPACE_NAME = "Bob  Hope";
    private static final String TWO_SPACE_INITIAL = "BH";


    @BeforeEach
    void setUp() {
    }

    @Test
    void testCreatePersonWithName(){
        Person person = new Person(NAME);
        assertNotNull(person);
    }

    @Test
    void testGetInitialFromSinglePersonName(){
        Person person = new Person(NAME);
        assertEquals(NAME_INITIAL,person.getInitials());
    }
    @Test
    void testGetInitialFromTwoNamePersonName(){
        Person person = new Person(TWO_NAME);
        assertEquals(TWO_NAME_INITIAL,person.getInitials());
    }
    @Test
    void testGetInitialFromThreeNamePersonName(){
        Person person = new Person(THREE_NAME);
        assertEquals(THREE_NAME_INITIAL,person.getInitials());
    }
    @Test
    void testGetInitialFromTTwoSpacePersonName(){
        Person person = new Person(TWO_SPACE_NAME);
        assertEquals(TWO_SPACE_INITIAL,person.getInitials());
    }

    @Test
    void testNullName(){
        assertThrows(NullPointerException.class, () ->{
            Person person = new Person(null);
        });
    }

}