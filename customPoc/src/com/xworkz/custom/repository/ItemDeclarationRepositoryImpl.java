package com.xworkz.custom.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.custom.entity.ItemDeclarationEntity;
import com.xworkz.custom.exception.RepoException;

@Repository
public class ItemDeclarationRepositoryImpl implements ItemDeclarationRepository {

	public ItemDeclarationRepositoryImpl() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	@Override
	public void save(ItemDeclarationEntity entity) throws RepoException {
		System.out.println();
		try {
			throw new UnsupportedOperationException();

		} catch (Exception e) {
			System.err.println("Exception in dao\t" + e);
			
			throw new RepoException("exception in dao"+e.getMessage());

		}

	}

}
