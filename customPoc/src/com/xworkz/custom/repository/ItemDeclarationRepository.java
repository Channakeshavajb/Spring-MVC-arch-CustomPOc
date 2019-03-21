package com.xworkz.custom.repository;

import com.xworkz.custom.entity.ItemDeclarationEntity;
import com.xworkz.custom.exception.RepoException;

public interface ItemDeclarationRepository {

	public void save(ItemDeclarationEntity entity) throws RepoException;
}
