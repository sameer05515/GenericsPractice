package com.p.generics;

import com.p.generics.dao.IDaoMarker;
import com.p.generics.pojo.IPojoMarker;

public class ExportImport<T1 extends IPojoMarker, T2 extends IDaoMarker> {

	T1 pojo;
	T2 dao;

	public ExportImport(T1 pojo, T2 dao) {
		this.pojo = pojo;
		this.dao = dao;
	}
}
