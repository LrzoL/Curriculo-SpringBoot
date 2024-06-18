package repository;

import entity.Educacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacaoRepository extends JpaRepository<Educacao, Long> {
}
