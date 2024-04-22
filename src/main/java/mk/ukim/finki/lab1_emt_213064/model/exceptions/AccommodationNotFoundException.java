package mk.ukim.finki.lab1_emt_213064.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class AccommodationNotFoundException extends RuntimeException{
    public AccommodationNotFoundException(Long id) {
        super(String.format("Accommodation with id %d was not found", id));
    }
}
