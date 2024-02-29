package dev.plannerticket.Services;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;



@Service
public class FileStorageService {
    private final String uploadDir = "src/main/resources/static/images/";
    //private final String uploadDir = "resources/static/images/";

    public String storeFile(MultipartFile file) {
        // Genera un nombre de archivo único para evitar conflictos
        @SuppressWarnings("null")
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Path path = Paths.get(uploadDir, fileName);

        // Copia el archivo al directorio de destino
        try (InputStream inputStream = file.getInputStream()) {
            Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException("No se ha podido almacenar el archivo" + fileName + ". Intentarlo de nuevo.");
        }
        return fileName;
    }

    
}
