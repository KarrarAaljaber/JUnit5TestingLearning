public class Room {
    private int occupantsInRoom;


    public void addOccupantsToRoom(int addedOccupants) {
        if (addedOccupants < 0) {
            throw new InvalidNumberOfOccupantsException();
        }
        occupantsInRoom += addedOccupants;
    }
    public void removeOccupantsFromRoom(int removedOccupants) {
        if (removedOccupants < 0) {
            throw new InvalidNumberOfOccupantsException();
        }
        if (removedOccupants > occupantsInRoom) {
            throw new InvalidNumberOfOccupantsException();
        }
        occupantsInRoom -= removedOccupants;
    }
    public int getOccupantsInRoom() {
        return occupantsInRoom;
    }
    public void setOccupantsInRoom(int Occupants){
        this.occupantsInRoom = Occupants;
    }
}
class InvalidNumberOfOccupantsException extends RuntimeException {}