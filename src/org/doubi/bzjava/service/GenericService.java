package org.doubi.bzjava.service;

import org.doubi.bzjava.dao.impl.GenericDAOImpl;
import org.doubi.bzjava.model.GenericModel;

public interface GenericService<T extends GenericModel> {

	T update(T t);

	T delete(T t);

	T query(T t);

	T save(T t);

}
