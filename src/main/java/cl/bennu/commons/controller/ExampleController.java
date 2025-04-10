package cl.bennu.commons.controller;

import cl.bennu.commons.controller.base.BaseController;
import cl.bennu.commons.domain.base.BaseDomain;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/example", produces = MediaType.APPLICATION_JSON_VALUE)
public class ExampleController extends BaseController {

    @GetMapping
    public List<BaseDomain> getAll() {
        return null;
    }

    @GetMapping("/{id}")
    public BaseDomain getById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public void save(@RequestHeader(value = "Authorization", required = false) String token, @RequestBody BaseDomain baseDomain) {

    }

    @DeleteMapping("/{id}")
    public void delete(@RequestHeader(value = "Authorization", required = false) String token, @PathVariable Long id) {

    }

}
