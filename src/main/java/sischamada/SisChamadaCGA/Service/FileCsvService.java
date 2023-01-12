package sischamada.SisChamadaCGA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sischamada.SisChamadaCGA.entity.FileCsv;
import sischamada.SisChamadaCGA.repository.FileDBRepository;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

@Service
public class FileCsvService {

    @Autowired
    private FileDBRepository fileDBRepository;

    public String uploadFile(MultipartFile file) throws IOException {
        FileCsv fileCsv = fileDBRepository.save(FileCsv.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .data(file.getBytes()).build());

        if(fileCsv != null) {
            return "Upload Realizado com sucesso: " + file.getOriginalFilename();
        }
        return null;
    }

    public byte[] getFile(UUID id){
        Optional<FileCsv> dbFileData = fileDBRepository.findById(id);
        byte[] file = dbFileData.get().getData();
        return file;
    }
}
