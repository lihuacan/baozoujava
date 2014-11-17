package org.doubi.bzjava.service.impl;

import org.doubi.bzjava.dao.GenericDAO;
import org.doubi.bzjava.model.GenericModel;
import org.doubi.bzjava.service.GenericService;

public class GenericServiceImpl<T extends GenericModel, E extends GenericDAO> implements GenericService<T> {
	private E e;

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	@Override
	public T save(T t) {
		e.insert();
		return null;
	}

	@Override
	public T update(T t) {
		e.update();
		return null;
	}

	@Override
	public T delete(T t) {
		e.delete();
		return null;
	}

	@Override
	public T query(T t) {
		e.query();
		return null;
	}

}
