package com.xaltome.smartcity.traffic.dbservice.repository;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.xaltome.smartcity.traffic.dbservice.model.Commune;

public interface CommuneRepository extends PagingAndSortingRepository<Commune, Long> {
	
	@Transactional
	Commune findByName(String name);
	
	@Transactional
	Commune findByLegacyId(Long legacyId);
	
	@Transactional
	Page<Commune> findAll(Pageable pageable);

}
