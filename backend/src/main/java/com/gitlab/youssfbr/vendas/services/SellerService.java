package com.gitlab.youssfbr.vendas.services;

import com.gitlab.youssfbr.vendas.dto.SellerDTO;
import com.gitlab.youssfbr.vendas.entities.Seller;
import com.gitlab.youssfbr.vendas.repositories.ISellerRepository;
import com.gitlab.youssfbr.vendas.services.ISellerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SellerService implements ISellerService {

    private ISellerRepository sellerRepository;

    @Transactional(readOnly = true)
    @Override
    public List<SellerDTO> findAll() {
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
