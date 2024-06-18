package controller;

import entity.Experiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ExperienciaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/experiencias")
public class ExperienciaController {

    @Autowired
    private ExperienciaService experienciaService;

    @GetMapping
    public List<Experiencia> listarExperiencias() {
        return experienciaService.getAllExperiencias();
    }

    // Endpoint para obter uma experiência por ID
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Experiencia>> obterExperienciaPorId(@PathVariable(value = "id") Long experienciaId) {
        Optional<Experiencia> experiencia = experienciaService.getExperienciaById(experienciaId);
        return ResponseEntity.ok().body(experiencia);
    }

    @PostMapping
    public ResponseEntity<Experiencia> criarExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia novaExperiencia = experienciaService.createExperiencia(experiencia);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaExperiencia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Experiencia> atualizarExperiencia(@PathVariable(value = "id") Long experienciaId,
                                                            @RequestBody Experiencia experienciaDetails) {
        Experiencia experienciaAtualizada = experienciaService.updateExperiencia(experienciaId, experienciaDetails);
        return ResponseEntity.ok().body(experienciaAtualizada);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarExperiencia(@PathVariable(value = "id") Long experienciaId) {
        experienciaService.deleteExperiencia(experienciaId);
        return ResponseEntity.noContent().build();
    }
}
