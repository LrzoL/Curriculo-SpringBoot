package service;

import entity.Educacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EducacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EducacaoService {
    @Autowired
    private EducacaoRepository educacaoRepository;

    public List<Educacao> getAllEducacoes() {
        return educacaoRepository.findAll();
    }

    public Optional<Educacao> getEducacaoById(Long id) {
        return educacaoRepository.findById(id);
    }

    public Educacao createEducacao(Educacao educacao) {
        return educacaoRepository.save(educacao);
    }

    public void deleteEducacao(Long id) {
        educacaoRepository.deleteById(id);
    }
}
