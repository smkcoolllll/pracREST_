package com.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.model.Store;
import com.store.service.IStoreService;

@RestController
@RequestMapping("api/store")
public class StoreController {
	
	@Autowired
	private IStoreService istoreservice;
	private ResponseEntity<?> responseEntity;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveUserHandler(@RequestBody Store strobj)
	{
		Store newUser = this.istoreservice.saveStoreDetails(strobj);
		responseEntity = new ResponseEntity<>(newUser,HttpStatus.CREATED);
		return responseEntity;
	}
	   @PutMapping("/update/{strId}")
	    public ResponseEntity<Store> updateStoreDetails(@RequestBody Store strobj, @PathVariable int strId) {
	        Store updatedStore = istoreservice.updateStoreDetails(strobj, strId);
	        if (updatedStore != null) {
	            return new ResponseEntity<>(updatedStore, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @GetMapping("/{strId}")
	    public ResponseEntity<Store> getStoreById(@PathVariable int strId) {
	        Store store = istoreservice.getStoreById(strId);
	        if (store != null) {
	            return new ResponseEntity<>(store, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @GetMapping("/allstore")
	    public ResponseEntity<List<Store>> getAllStores() {
	        List<Store> stores = istoreservice.getAllStores();
	        return new ResponseEntity<>(stores, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{strId}")
	    public ResponseEntity<Void> deleteStore(@PathVariable int strId) {
	        boolean isDeleted = istoreservice.delStore(strId);
	        if (isDeleted) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	
	
}
