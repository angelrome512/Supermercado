package com.supermercado.myapp.repository;

import com.supermercado.myapp.domain.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Cliente entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    @Query("select c from Cliente c where c.documento like %:doc%")
    Page<Cliente> clientesPorDocumento(@Param("doc") String doc, Pageable pageable);
}
