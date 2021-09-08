package com.gitlab.youssfbr.vendas.repositories;

import com.gitlab.youssfbr.vendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISellerRepository extends JpaRepository<Seller, Long> {
}
