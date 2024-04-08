package insper.api.ingrediente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "ingrediente")
public interface IngredienteController {

    @PostMapping("/ingredientes")
    public ResponseEntity<IngredienteOut> create(
        @RequestBody(required = true) IngredienteIn in
    );

    @PutMapping("/ingredientes/{id}")
    public ResponseEntity<IngredienteOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) IngredienteIn in
    );

    @GetMapping("/ingredientes/{id}")
    public ResponseEntity<IngredienteOut> read(
        @PathVariable(required = true) String id
    );

    @GetMapping("/ingredientes")
    public ResponseEntity<IngredienteOut> readAll();
    
}