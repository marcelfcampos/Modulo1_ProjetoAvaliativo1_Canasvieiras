package br.com.labparadises.labbeach.services;

import br.com.labparadises.labbeach.models.Praia;
import br.com.labparadises.labbeach.repositories.PraiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Na camada  de Service precisamos importar um Repository da entidade (Praia)

@Service //Anotação de classe

public class PraiaServices {

    @Autowired
    private PraiaRepository repository;

    public void salvar(Praia praia) {
        repository.save(praia);
    }

    public void excluir(Praia praia) {
        repository.delete(praia);
    }

    public List<Praia>buscaTodos() {
        return (List<Praia>) repository.findAll();
    }

    public Praia buscarPorId(Long id) {
        return repository.findById(id).get();
    }


}
