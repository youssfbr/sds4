package com.gitlab.youssfbr.vendas.controllers;

import com.gitlab.youssfbr.vendas.dto.SellerDTO;
import com.gitlab.youssfbr.vendas.services.ISellerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/sellers")
public class SellerController implements ISellerController {

    private ISellerService sellerService;

    @GetMapping
    @Override
    public ResponseEntity<List<SellerDTO>> findAll() {
        return ResponseEntity.ok(sellerService.findAll()) ;
    }
}
