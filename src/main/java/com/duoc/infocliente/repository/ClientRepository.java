package com.duoc.infocliente.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.infocliente.model.Client;

@Repository

public interface ClientRepository extends JpaRepository<Client,Long>{

    
}
