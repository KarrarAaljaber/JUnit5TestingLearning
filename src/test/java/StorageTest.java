import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StorageTest {

    private Storage storage = new Storage();

    @Test
    public void test_add_storage_units(){
        int addedUnits = 3;
        int expectedCurrentNumberOfUnits= storage.getUnitsInStorage() + addedUnits;
        storage.addStorageUnits(addedUnits);
        int actualCurrentNumberOfUnits = storage.getUnitsInStorage();
        assertEquals(expectedCurrentNumberOfUnits, actualCurrentNumberOfUnits);
    }

    @Test
    public void test_remove_storage_units(){
        storage.setUnitsInStorage(10);
        int removedUnits = 3;
        int expectedCurrentNumberOfUnits= storage.getUnitsInStorage() - removedUnits;
        storage.removeUnitsFromStorage(removedUnits);
        int actualCurrentNumberOfUnits = storage.getUnitsInStorage();
        assertEquals(expectedCurrentNumberOfUnits, actualCurrentNumberOfUnits);
    }
    @Test
    public void test_adding_negative_number_of_units(){
        Throwable exception = assertThrows(InvalidStorageUnitsSizeException.class, () -> storage.addStorageUnits(-10));
        assertEquals("InvalidStorageUnitsSizeException", exception.toString());
    }

    @Test
    public void test_removing_number_of_units_more_than_units_in_storage(){
        Throwable exception = assertThrows(InvalidStorageUnitsSizeException.class, () -> storage.removeUnitsFromStorage(40));
        assertEquals("InvalidStorageUnitsSizeException", exception.toString());
    }
    @Test
    public void test_removing_negative_number_of_units(){
        Throwable exception = assertThrows(InvalidStorageUnitsSizeException.class, () -> storage.removeUnitsFromStorage(-3));
        assertEquals("InvalidStorageUnitsSizeException", exception.toString());
    }
}


