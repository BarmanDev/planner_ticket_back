package dev.plannerticket.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import dev.plannerticket.Services.FileStorageService;


@RestController
@RequestMapping(path = "${api-endpoint}")

public class ImageController {
        @Autowired
        private FileStorageService fileStorageService;

    @PostMapping(path = "/images")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        // Utiliza FileStorageService para guardar la imagen
        String fileName = fileStorageService.storeFile(file);
        // Respuesta con el nombre del archivo
        return ResponseEntity.status(HttpStatus.CREATED).body("Archivo subido con éxito: " + fileName);
    }

}
