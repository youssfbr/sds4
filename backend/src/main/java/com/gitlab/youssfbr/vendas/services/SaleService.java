package com.gitlab.youssfbr.vendas.services;

import com.gitlab.youssfbr.vendas.dto.SaleDTO;
import com.gitlab.youssfbr.vendas.dto.SaleSuccessDTO;
import com.gitlab.youssfbr.vendas.dto.SaleSumDTO;
import com.gitlab.youssfbr.vendas.entities.Sale;
import com.gitlab.youssfbr.vendas.repositories.ISaleRepository;

import com.gitlab.youssfbr.vendas.repositories.ISellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class SaleService implements ISaleService {

    private ISaleRepository saleRepository;
    private ISellerRepository sellerRepository;

    @Transactional(readOnly = true)
    @Override
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    @Override
    public List<SaleSumDTO> amountGroupedBySeller() {
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    @Override
    public List<SaleSuccessDTO> successGroupedBySeller() {
        return saleRepository.successGroupedBySeller();
    }

}
