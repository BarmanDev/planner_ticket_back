package dev.plannerticket.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.plannerticket.Models.ListUs;
import dev.plannerticket.Services.ListUsService;
import io.micrometer.common.lang.NonNull;
 

@RestController
@RequestMapping(path = "${api-endpoint}/list_us")
public class ListUsController {
 

     ListUsService service;

    public ListUsController(ListUsService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<ListUs> index () {
        return service.getAll();
    }

    @PostMapping(path = "")
    public ResponseEntity<ListUs> create(@NonNull @RequestBody ListUs listUs) {
        ListUs newListUs = service.save(listUs);
        return ResponseEntity.status(201).body(newListUs);
    }
    
}





