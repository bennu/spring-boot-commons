package cl.bennu.commons.controller.base;

import cl.bennu.commons.controller.model.common.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@CrossOrigin
public abstract class BaseController {

    protected static ResponseEntity<?> ok() {
        return ResponseEntity.ok(HttpStatus.OK);
    }

    protected static ResponseEntity<?> ok(Object o) {
        if (o instanceof String
                || o instanceof Date
                || o instanceof Number
                || o instanceof Character
                || o instanceof Boolean) {
            Value value = new Value();
            value.setValue(o);

            return new ResponseEntity<>(value, HttpStatus.OK);
        }
        return new ResponseEntity<>(o, HttpStatus.OK);
    }

    public ResponseEntity<?> unauthorized(Exception e) {
        return new ResponseEntity<>(e, HttpStatus.UNAUTHORIZED);
    }

    public ResponseEntity<?> conflict(Exception e) {
        return new ResponseEntity<>(e, HttpStatus.CONFLICT);
    }

    public ResponseEntity<?> serverError(Exception e) {
        return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
