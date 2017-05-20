package com.cloudsea.branch.repository;

import org.springframework.context.annotation.Import;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cloudsea.branch.model.Branch;
import com.cloudsea.commons.config.CloudSeaMongoConfiguration;

@RepositoryRestResource
@Import(value = { CloudSeaMongoConfiguration.class })
public interface BranchRepository extends PagingAndSortingRepository<Branch, String> {

}
