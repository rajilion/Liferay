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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.slayer.service.ClpSerializer;
import com.slayer.service.LMSBook1LocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rajkumar.j
 */
public class LMSBook1Clp extends BaseModelImpl<LMSBook1> implements LMSBook1 {
	public LMSBook1Clp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LMSBook1.class;
	}

	@Override
	public String getModelClassName() {
		return LMSBook1.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _bookId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBookId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookId", getBookId());
		attributes.put("bookTitle", getBookTitle());
		attributes.put("author", getAuthor());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		String bookTitle = (String)attributes.get("bookTitle");

		if (bookTitle != null) {
			setBookTitle(bookTitle);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	@Override
	public long getBookId() {
		return _bookId;
	}

	@Override
	public void setBookId(long bookId) {
		_bookId = bookId;

		if (_lmsBook1RemoteModel != null) {
			try {
				Class<?> clazz = _lmsBook1RemoteModel.getClass();

				Method method = clazz.getMethod("setBookId", long.class);

				method.invoke(_lmsBook1RemoteModel, bookId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBookTitle() {
		return _bookTitle;
	}

	@Override
	public void setBookTitle(String bookTitle) {
		_bookTitle = bookTitle;

		if (_lmsBook1RemoteModel != null) {
			try {
				Class<?> clazz = _lmsBook1RemoteModel.getClass();

				Method method = clazz.getMethod("setBookTitle", String.class);

				method.invoke(_lmsBook1RemoteModel, bookTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAuthor() {
		return _author;
	}

	@Override
	public void setAuthor(String author) {
		_author = author;

		if (_lmsBook1RemoteModel != null) {
			try {
				Class<?> clazz = _lmsBook1RemoteModel.getClass();

				Method method = clazz.getMethod("setAuthor", String.class);

				method.invoke(_lmsBook1RemoteModel, author);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_lmsBook1RemoteModel != null) {
			try {
				Class<?> clazz = _lmsBook1RemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_lmsBook1RemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLMSBook1RemoteModel() {
		return _lmsBook1RemoteModel;
	}

	public void setLMSBook1RemoteModel(BaseModel<?> lmsBook1RemoteModel) {
		_lmsBook1RemoteModel = lmsBook1RemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _lmsBook1RemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_lmsBook1RemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LMSBook1LocalServiceUtil.addLMSBook1(this);
		}
		else {
			LMSBook1LocalServiceUtil.updateLMSBook1(this);
		}
	}

	@Override
	public LMSBook1 toEscapedModel() {
		return (LMSBook1)ProxyUtil.newProxyInstance(LMSBook1.class.getClassLoader(),
			new Class[] { LMSBook1.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LMSBook1Clp clone = new LMSBook1Clp();

		clone.setBookId(getBookId());
		clone.setBookTitle(getBookTitle());
		clone.setAuthor(getAuthor());
		clone.setCreateDate(getCreateDate());

		return clone;
	}

	@Override
	public int compareTo(LMSBook1 lmsBook1) {
		long primaryKey = lmsBook1.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LMSBook1Clp)) {
			return false;
		}

		LMSBook1Clp lmsBook1 = (LMSBook1Clp)obj;

		long primaryKey = lmsBook1.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{bookId=");
		sb.append(getBookId());
		sb.append(", bookTitle=");
		sb.append(getBookTitle());
		sb.append(", author=");
		sb.append(getAuthor());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.slayer.model.LMSBook1");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>bookId</column-name><column-value><![CDATA[");
		sb.append(getBookId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bookTitle</column-name><column-value><![CDATA[");
		sb.append(getBookTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>author</column-name><column-value><![CDATA[");
		sb.append(getAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _bookId;
	private String _bookTitle;
	private String _author;
	private Date _createDate;
	private BaseModel<?> _lmsBook1RemoteModel;
}