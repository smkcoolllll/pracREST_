package com.store.service;

import java.util.List;

import com.store.model.Store;

public interface IStoreService {

	Store saveStoreDetails(Store strobj);

	Store updateStoreDetails(Store strobj, int strId);

	Store getStoreById(int strId);

	List<Store> getAllStores();

	boolean delStore(int strId);

}
