package sischamada.SisChamadaCGA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sischamada.SisChamadaCGA.Service.FileCsvService;


import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping(value = "file")
@RestController
//@Slf4j
//@CrossOrigin("*")
public class FileCsvController {

    @Autowired
    private FileCsvService fileCsvService;

    @PostMapping
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        String uploadFile = fileCsvService.uploadFile(file);
        return ResponseEntity.status(HttpStatus.OK).body(uploadFile);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> downloadFile(@PathVariable UUID id) {
        byte[] imagDate = fileCsvService.getFile(id);
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("file/csv"))
                .body(imagDate);
    }


}
