package com.gitlab.youssfbr.vendas.services;

import com.gitlab.youssfbr.vendas.dto.SaleDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISaleService {

    Page<SaleDTO> findAll(Pageable pageable);
}
