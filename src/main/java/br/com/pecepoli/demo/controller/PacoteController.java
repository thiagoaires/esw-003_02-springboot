package br.com.pecepoli.demo.controller;

import br.com.pecepoli.demo.domain.Pacote;
import br.com.pecepoli.demo.services.PacoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacoteController {

    private PacoteService service;

    public PacoteController(PacoteService service) {
        this.service = service;
    }

    @GetMapping(path ="/pacotes/**")
    public List<Pacote> getPacotes(){
        return this.service.getPacotes();
    }
}
