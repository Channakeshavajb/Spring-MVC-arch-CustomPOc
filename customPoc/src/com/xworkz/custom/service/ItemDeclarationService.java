package com.xworkz.custom.service;

import com.xworkz.custom.dto.ItemDeclarationDTO;
import com.xworkz.custom.exception.ServiceException;

public interface ItemDeclarationService {

	public void save(ItemDeclarationDTO dto) throws ServiceException;
}
