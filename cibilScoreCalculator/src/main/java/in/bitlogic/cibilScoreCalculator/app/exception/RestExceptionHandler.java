package in.bitlogic.cibilScoreCalculator.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<Object> invalidPanNoException(InvalidPanNoException e)
	{
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
