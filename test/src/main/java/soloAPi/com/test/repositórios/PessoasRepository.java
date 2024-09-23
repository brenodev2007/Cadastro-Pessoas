package soloAPi.com.test.repositórios;

import org.springframework.data.jpa.repository.JpaRepository;

import soloAPi.com.test.entidades.Pessoas;

public interface PessoasRepository extends JpaRepository<Pessoas, Long> {
    
}
