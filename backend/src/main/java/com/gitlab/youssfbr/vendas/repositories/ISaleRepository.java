package com.gitlab.youssfbr.vendas.repositories;

import com.gitlab.youssfbr.vendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISaleRepository extends JpaRepository<Sale, Long> {
}
