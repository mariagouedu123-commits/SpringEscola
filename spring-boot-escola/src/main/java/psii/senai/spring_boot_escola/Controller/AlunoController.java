package psii.senai.spring_boot_escola.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import psii.senai.spring_boot_escola.Model.Aluno;
import psii.senai.spring_boot_escola.Repository.AlunoRepository;

@Controller
public class AlunoController {

    private final AlunoRepository repository;

    public AlunoController(AlunoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/alunos")
    public String index(Model model) {
        model.addAttribute("alunos", repository.findAll());
        model.addAttribute("aluno", new Aluno());
        return "alunos";
    }

    @PostMapping("/alunos/salvar")
    public String salvar(@ModelAttribute Aluno aluno) {
        repository.save(aluno);
        return "redirect:/alunos";
    }
}