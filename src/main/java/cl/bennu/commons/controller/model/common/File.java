package cl.bennu.commons.controller.model.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class File implements Serializable {

    private String data;
    private String name;
    private String contentType;

}
