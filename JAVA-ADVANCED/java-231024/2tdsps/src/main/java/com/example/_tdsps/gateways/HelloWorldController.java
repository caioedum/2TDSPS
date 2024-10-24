package com.example._tdsps.gateways;

import com.example._tdsps.domains.Aluno;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
@RequiredArgsConstructor
public class HelloWorldController {

    private final AlunoRepository alunoRepository;

    @GetMapping
    public Aluno helloWorlds() {
        Aluno aluno = new Aluno();
        aluno.setNome("hello word");
        return alunoRepository.save(aluno);
    }

}
