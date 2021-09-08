package com.gitlab.youssfbr.vendas.controllers;

import com.gitlab.youssfbr.vendas.dto.SaleDTO;
import com.gitlab.youssfbr.vendas.services.ISaleService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/sales")
public class SaleController implements ISaleController {

    private ISaleService saleService;

    @GetMapping
    @Override
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(saleService.findAll(pageable)) ;
    }
}
