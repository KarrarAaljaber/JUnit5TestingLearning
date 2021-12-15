import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoomTest {

    private Room room = new Room();

    @Test
    public void test_add_occupants_to_room(){
        int addedOccupants = 3;
        int expectedCurrentOccupants= room.getOccupantsInRoom() + addedOccupants;
        room.addOccupantsToRoom(addedOccupants);
        int actualCurrentOccupants = room.getOccupantsInRoom();
        assertEquals(expectedCurrentOccupants, actualCurrentOccupants);
    }

    @Test
    public void test_remove_occupants_from_room(){
        room.setOccupantsInRoom(10);
        int removedOccupants = 3;
        int expectedCurrentOccupants= room.getOccupantsInRoom() - removedOccupants;
        room.removeOccupantsFromRoom(removedOccupants);
        int actualCurrentOccupants = room.getOccupantsInRoom();
        assertEquals(expectedCurrentOccupants, actualCurrentOccupants);
    }
    @Test
    public void test_adding_negative_occupants(){
        Throwable exception = assertThrows(InvalidNumberOfOccupantsException.class, () -> room.addOccupantsToRoom(-10));
        assertEquals("InvalidNumberOfOccupantsException", exception.toString());
    }

    @Test
    public void test_removing_number_of_occupants_more_than_occupants_in_room(){
        Throwable exception = assertThrows(InvalidNumberOfOccupantsException.class, () -> room.removeOccupantsFromRoom(40));
        assertEquals("InvalidNumberOfOccupantsException", exception.toString());
    }
    @Test
    public void test_removing_negative_number_of_occupants(){
        Throwable exception = assertThrows(InvalidNumberOfOccupantsException.class, () -> room.removeOccupantsFromRoom(-3));
        assertEquals("InvalidNumberOfOccupantsException", exception.toString());
    }
}
