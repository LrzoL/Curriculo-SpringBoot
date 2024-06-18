package controller;

import entity.Habilidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.HabilidadeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/habilidades")
public class HabilidadeController {
    @Autowired
    private HabilidadeService habilidadeService;

    @GetMapping
    public List<Habilidade> getAllHabilidades() {
        return habilidadeService.getAllHabilidades();
    }

    @GetMapping("/{id}")
    public Optional<Habilidade> getHabilidadeById(@PathVariable Long id) {
        return habilidadeService.getHabilidadeById(id);
    }

    @PostMapping
    public Habilidade createHabilidade(@RequestBody Habilidade habilidade) {
        return habilidadeService.createHabilidade(habilidade);
    }

    @DeleteMapping("/{id}")
    public void deleteHabilidade(@PathVariable Long id) {
        habilidadeService.deleteHabilidade(id);
    }
}
