package mk.ukim.finki.lab1_emt_213064.model.exceptions;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(Long id) {
        super(String.format("User with id %d not found", id));
    }
}
