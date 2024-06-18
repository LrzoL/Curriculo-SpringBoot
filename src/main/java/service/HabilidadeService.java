package service;


import entity.Habilidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.HabilidadeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class HabilidadeService {
    @Autowired
    private HabilidadeRepository habilidadeRepository;

    public List<Habilidade> getAllHabilidades() {
        return habilidadeRepository.findAll();
    }

    public Optional<Habilidade> getHabilidadeById(Long id) {
        return habilidadeRepository.findById(id);
    }

    public Habilidade createHabilidade(Habilidade habilidade) {
        return habilidadeRepository.save(habilidade);
    }

    public void deleteHabilidade(Long id) {
        habilidadeRepository.deleteById(id);
    }
}
