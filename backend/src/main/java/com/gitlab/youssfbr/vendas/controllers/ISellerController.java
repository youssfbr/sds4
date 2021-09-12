package com.gitlab.youssfbr.vendas.controllers;

import com.gitlab.youssfbr.vendas.dto.SellerDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ISellerController {

    ResponseEntity<List<SellerDTO>> findAll();

}
