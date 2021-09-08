package com.gitlab.youssfbr.vendas.services;

import com.gitlab.youssfbr.vendas.dto.SellerDTO;

import java.util.List;

public interface ISellerService {

    List<SellerDTO> findAll();
}
