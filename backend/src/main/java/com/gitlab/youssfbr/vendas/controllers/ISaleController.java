package com.gitlab.youssfbr.vendas.controllers;

import com.gitlab.youssfbr.vendas.dto.SaleDTO;
import com.gitlab.youssfbr.vendas.dto.SaleSuccessDTO;
import com.gitlab.youssfbr.vendas.dto.SaleSumDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ISaleController {

    ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable);
    ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller();
    ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller();

}
