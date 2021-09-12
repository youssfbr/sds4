package com.gitlab.youssfbr.vendas.services;

import com.gitlab.youssfbr.vendas.dto.SaleDTO;
import com.gitlab.youssfbr.vendas.dto.SaleSuccessDTO;
import com.gitlab.youssfbr.vendas.dto.SaleSumDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISaleService {

    Page<SaleDTO> findAll(Pageable pageable);
    List<SaleSumDTO> amountGroupedBySeller();
    List<SaleSuccessDTO> successGroupedBySeller();

}
