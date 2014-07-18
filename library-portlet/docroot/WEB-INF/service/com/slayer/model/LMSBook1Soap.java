/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.slayer.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author rajkumar.j
 * @generated
 */
public class LMSBook1Soap implements Serializable {
	public static LMSBook1Soap toSoapModel(LMSBook1 model) {
		LMSBook1Soap soapModel = new LMSBook1Soap();

		soapModel.setBookId(model.getBookId());
		soapModel.setBookTitle(model.getBookTitle());
		soapModel.setAuthor(model.getAuthor());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static LMSBook1Soap[] toSoapModels(LMSBook1[] models) {
		LMSBook1Soap[] soapModels = new LMSBook1Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LMSBook1Soap[][] toSoapModels(LMSBook1[][] models) {
		LMSBook1Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LMSBook1Soap[models.length][models[0].length];
		}
		else {
			soapModels = new LMSBook1Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LMSBook1Soap[] toSoapModels(List<LMSBook1> models) {
		List<LMSBook1Soap> soapModels = new ArrayList<LMSBook1Soap>(models.size());

		for (LMSBook1 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LMSBook1Soap[soapModels.size()]);
	}

	public LMSBook1Soap() {
	}

	public long getPrimaryKey() {
		return _bookId;
	}

	public void setPrimaryKey(long pk) {
		setBookId(pk);
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public String getBookTitle() {
		return _bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		_bookTitle = bookTitle;
	}

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _bookId;
	private String _bookTitle;
	private String _author;
	private Date _createDate;
}