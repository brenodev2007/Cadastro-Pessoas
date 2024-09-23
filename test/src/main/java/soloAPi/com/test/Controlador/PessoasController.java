package soloAPi.com.test.Controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import soloAPi.com.test.Serviços.PessoasServices;
import soloAPi.com.test.entidades.Pessoas;

@RestController
@RequestMapping ("/pessoas")
public class PessoasController {
    @Autowired
    PessoasServices pessoasServices;

    @GetMapping
    public List<Pessoas> getAllitens(){
        return pessoasServices.getAllPessoas();
    }

   @PostMapping
   public Pessoas criarPessoas(@RequestBody Pessoas pessoas){
    return pessoasServices.cadastrarPessoas(pessoas);
   }

}
