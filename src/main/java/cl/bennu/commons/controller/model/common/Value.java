package cl.bennu.commons.controller.model.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Value implements Serializable {

    private Long id;
    private String value;

}
