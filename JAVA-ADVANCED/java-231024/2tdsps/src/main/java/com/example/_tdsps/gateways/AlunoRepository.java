package com.example._tdsps.gateways;

import com.example._tdsps.domains.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
