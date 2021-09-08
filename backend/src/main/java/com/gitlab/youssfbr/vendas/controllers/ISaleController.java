package com.gitlab.youssfbr.vendas.controllers;

import com.gitlab.youssfbr.vendas.dto.SaleDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface ISaleController {

    ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable);
}
