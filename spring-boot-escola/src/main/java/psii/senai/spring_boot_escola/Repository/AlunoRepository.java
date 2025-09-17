package psii.senai.spring_boot_escola.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import psii.senai.spring_boot_escola.Model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
