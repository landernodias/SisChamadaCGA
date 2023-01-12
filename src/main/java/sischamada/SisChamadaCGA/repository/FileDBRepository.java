package sischamada.SisChamadaCGA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sischamada.SisChamadaCGA.entity.FileCsv;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface FileDBRepository extends JpaRepository<FileCsv, UUID> {

    Optional<FileCsv> findById(UUID id);
}
