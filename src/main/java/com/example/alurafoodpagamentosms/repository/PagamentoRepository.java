package com.example.alurafoodpagamentosms.repository;

import com.example.alurafoodpagamentosms.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
