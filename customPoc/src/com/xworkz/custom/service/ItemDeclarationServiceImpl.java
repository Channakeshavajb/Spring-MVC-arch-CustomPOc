package com.xworkz.custom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.xworkz.custom.dto.ItemDeclarationDTO;
import com.xworkz.custom.entity.ItemDeclarationEntity;
import com.xworkz.custom.exception.ServiceException;
import com.xworkz.custom.repository.ItemDeclarationRepositoryImpl;

@Service
public class ItemDeclarationServiceImpl implements ItemDeclarationService {

	@Autowired
	private ItemDeclarationRepositoryImpl itemDeclarationRepositoryImpl;

	@Override
	public void save(ItemDeclarationDTO dto) throws ServiceException {
		try {
			System.out.println("data shoulb be saved to database\t" + dto);

			if (dto != null) {
				System.out.println("should convert dto to entity");
				ItemDeclarationEntity entity = new ItemDeclarationEntity();
				System.out.println("should convert to entity\t" + entity);
				entity.setCustomerName(dto.getCustomerName());
				entity.setCustomerType(dto.getCustomerType());
				entity.setItemType(dto.getItemType());
				entity.setImportedFrom(dto.getImportedFrom());
				entity.setDateOfArrival(dto.getDateOfArrival());
				entity.setQuantity(dto.getQuantity());
				System.out.println("values copied into entity\t" + entity);
				itemDeclarationRepositoryImpl.save(entity);

			}
			System.out.println("starting to save data into db");
		} catch (Exception e) {
			System.err.println("exception thrown in service\t" + e.getMessage());
			throw new ServiceException("exception thrown in service\t"+e.getMessage());
		}

	}

}
