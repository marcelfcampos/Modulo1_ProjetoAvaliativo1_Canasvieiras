package br.com.labparadises.labbeach.controllers;

import br.com.labparadises.labbeach.models.Praia;
import br.com.labparadises.labbeach.services.PraiaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                 //Anotação de classe
@RequestMapping("/praia")       //Endpoint -> caminho mapeado com String.
public class PraiaControllers {

    @Autowired
    PraiaServices services; //*Injetar Dependência do services.

    @PostMapping    //*@PostMapping: Cadastra praia
    public void cadastrar(@RequestBody Praia praia) {
        services.salvar(praia);
    }

    @PutMapping     //*@PostMapping: Atualiza praia
    public void atualizar(@RequestBody Praia praia){
        services.salvar(praia);
    }

    @DeleteMapping  //*@DeleteMapping: exclui praia
    public void exluir(@RequestBody Praia praia) {
        services.excluir(praia);
    }

    @GetMapping("/lista")   //@GetMapping: lista praias
    public List<Praia> listaTodos() {
        return services.buscaTodos();
    }

    //Qualquer valor que vier depois da barra ele vai considerar como sendo a variável id

    @GetMapping("/{id}")    //@GetMapping: busca por Id
    public Praia buscarPorId(@PathVariable Long id) {
        return services.buscarPorId(id);
    }

}
