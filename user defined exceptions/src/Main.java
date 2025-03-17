class InvalidNumException extends Exception {
    public InvalidNumException(String message) {
        super(message);
    }
}
class UserDefinedException {
    static void checkNum(int Num) throws InvalidNumException{
        if (Num > 100) {
            throw new InvalidNumException("Num must be 100 or above.");
        }
    }
}