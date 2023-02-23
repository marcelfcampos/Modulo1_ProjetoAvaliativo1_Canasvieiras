package br.com.labparadises.labbeach.controllers;

import br.com.labparadises.labbeach.models.Praia;
import br.com.labparadises.labbeach.services.PraiaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/praia")
public class PraiaControllers {

    @Autowired
    PraiaServices services;

    @PostMapping
    public void cadastrar(@RequestBody Praia praia) {
        services.salvar(praia);
    }

    @PutMapping
    public void atualizar(@RequestBody Praia praia){
        services.salvar(praia);
    }

    @DeleteMapping
    public void exluir(@RequestBody Praia praia) {
        services.excluir(praia);
    }

    @GetMapping("/lista")
    public List<Praia> listaTodos() {
        return services.buscaTodos();
    }

    //Qualquer valor que vier depois da barra ele vai considerar como sendo a variável id

    @GetMapping("/{id}")
    public Praia buscarPorId(@PathVariable Long id) {
        return services.buscarPorId(id);
    }

}
