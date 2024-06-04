package br.com.pecepoli.demo.services;

import br.com.pecepoli.demo.domain.Pacote;
import br.com.pecepoli.demo.repository.PacoteRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PacoteService {

    private PacoteRepository repository;

    PacoteService(PacoteRepository repository){
        this.repository = repository;
    }

    public List<Pacote> getPacotes() {
        return this.repository.obterTodos();
    }
}
