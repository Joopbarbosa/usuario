package com.joaobarbosa.usuario.Infrastructure.repository;

import com.joaobarbosa.primeiroCRUD.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone,Long> {
}
