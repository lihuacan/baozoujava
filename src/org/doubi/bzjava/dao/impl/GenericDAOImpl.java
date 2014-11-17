package org.doubi.bzjava.dao.impl;

import org.doubi.bzjava.dao.GenericDAO;
import org.doubi.bzjava.model.GenericModel;

public class GenericDAOImpl<T extends GenericModel> implements GenericDAO {

	@Override
	public int insert() {
		System.out.println("has inserted ");
		return 0;
	}

	@Override
	public T update() {
		System.out.println("has updated ");
		return null;
	}

	@Override
	public T query() {
		System.out.println("has queried ");
		return null;
	}

	@Override
	public int delete() {
		System.out.println("has deleted ");
		return 0;
	}

}
