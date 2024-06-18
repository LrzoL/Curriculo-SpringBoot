package service;

import entity.Experiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ExperienciaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    public List<Experiencia> getAllExperiencias() {
        return experienciaRepository.findAll();
    }

    public Optional<Experiencia> getExperienciaById(Long id) {
        return experienciaRepository.findById(id);
    }

    public Experiencia createExperiencia(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    public Experiencia updateExperiencia(Long id, Experiencia experienciaDetails) {


        Experiencia experiencia = new Experiencia();
        return experienciaRepository.save(experiencia);
    }

    public void deleteExperiencia(Long id) {
        experienciaRepository.deleteById(id);
    }
}
