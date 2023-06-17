package com.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.model.Store;
import com.store.repository.IStoreRepository;


@Service
public class StoreServiceImpl implements IStoreService {

	@Autowired
	private IStoreRepository istoreRepository;
	
	
	 @Override
	    public Store saveStoreDetails(Store strobj) {
	        // Check if the store already exists
	        Optional<Store> optional = istoreRepository.findById(strobj.getStrId());
	        Store addstrobj=null;
	        if (optional.isPresent()) {
	            System.out.println("Store Details already exist...");
	            return null;
	        }
	        else
			{		
				addstrobj = this.istoreRepository.save(strobj);
			}

	        // Save the store details
	        return addstrobj;
	    }
	
	
//	@Override
//	public Store saveStoreDetails(Store strobj) 
//	{
//		Optional<Store> optional = this.istoreservice.getStoreById(strobj);
//		Store adduobj = null;
//		
//		if(optional.isPresent())
//		{
//			System.out.println("Store Details already exists ...");
//		}
//		else
//		{		
//			adduobj = this.istoreservice.saveStoreDetails(strobj);
//		}
//		return adduobj;
//		prodRepo.save(product);
//		return "Product id : "+product.getProdId()+" is saved successfully...";
//	}

	   @Override
	    public Store updateStoreDetails(Store strobj, int strId) {
	        // Check if the store exists
	        Optional<Store> optional = istoreRepository.findById(strId);
	        if (optional.isPresent()) {
	            // Set the ID of the updated store
	            strobj.setStrId(strId);
	            // Save the updated store details
	            return istoreRepository.save(strobj);
	        } else {
	            System.out.println("Store not found...");
	            return null;
	        }
	    }

	    @Override
	    public Store getStoreById(int strId) {
	        // Retrieve store details by ID
	        Optional<Store> optional = istoreRepository.findById(strId);
	        return optional.orElse(null);
	    }

	    @Override
	    public List<Store> getAllStores() {
	        // Retrieve all stores
	        return istoreRepository.findAll();
	    }

	    @Override
	    public boolean delStore(int strId) {
	        // Check if the store exists
	        Optional<Store> optional = istoreRepository.findById(strId);
	        if (optional.isPresent()) {
	            // Delete the store
	        	istoreRepository.deleteById(strId);
	            return true;
	        } else {
	            System.out.println("Store not found...");
	            return false;
	        }
	    }
}