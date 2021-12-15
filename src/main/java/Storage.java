public class Storage {
    private int unitsInStorage;
    public void addStorageUnits(int addedUnits) {
        if (addedUnits < 0) {
            throw new InvalidStorageUnitsSizeException();
        }
        unitsInStorage += addedUnits;
    }
    public void removeUnitsFromStorage(int removedUnits) {
        if (removedUnits < 0) {
            throw new InvalidStorageUnitsSizeException();
        }
        if (removedUnits > unitsInStorage) {
            throw new InvalidStorageUnitsSizeException();
        }
        unitsInStorage -= removedUnits;
    }
    public int getUnitsInStorage() {
        return unitsInStorage;
    }

    public void setUnitsInStorage(int unitsInStorage) {
        this.unitsInStorage = unitsInStorage;
    }
}
class InvalidStorageUnitsSizeException extends RuntimeException {}