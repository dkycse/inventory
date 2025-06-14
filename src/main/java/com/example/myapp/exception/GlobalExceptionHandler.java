// package com.example.myapp.exception;

// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.MethodArgumentNotValidException;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.bind.annotation.RestControllerAdvice;

// @RestControllerAdvice
// public class GlobalExceptionHandler {

//     // Handles validation errors like @NotNull, @Min etc.
//     @ExceptionHandler(MethodArgumentNotValidException.class)
//     public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
//         Map<String, String> errors = new HashMap<>();
//         ex.getBindingResult().getFieldErrors().forEach(error ->
//             errors.put(error.getField(), error.getDefaultMessage())
//         );
//         return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//     }

//     // Handles all other exceptions
//     @ExceptionHandler(Exception.class)
//     public ResponseEntity<Map<String, String>> handleGlobalException(Exception ex) {
//         Map<String, String> response = new HashMap<>();
//         response.put("message", "An error occurred");
//         response.put("error", ex.getMessage());
//         return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//     }
// }
