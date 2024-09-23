package soloAPi.com.test.Serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soloAPi.com.test.entidades.Pessoas;
import soloAPi.com.test.repositórios.PessoasRepository;

@Service
public class PessoasServices {
    public static Object getPessoaById;
    @Autowired
    private PessoasRepository pessoasRepository; //injeção de dependencia


    public List<Pessoas> getAllPessoas(){
        return pessoasRepository.findAll();
    }


    public Optional<Pessoas> getPessoaById(Long id){
        return pessoasRepository.findById(id); //pesquisas por ID
    }

    public Pessoas cadastrarPessoas(Pessoas pessoas){
        return pessoasRepository.save(pessoas);
    }

    
    public void deleteItem(Long id) {
        pessoasRepository.deleteById(id);
    }

}
