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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LMSBook1}.
 * </p>
 *
 * @author rajkumar.j
 * @see LMSBook1
 * @generated
 */
public class LMSBook1Wrapper implements LMSBook1, ModelWrapper<LMSBook1> {
	public LMSBook1Wrapper(LMSBook1 lmsBook1) {
		_lmsBook1 = lmsBook1;
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

	/**
	* Returns the primary key of this l m s book1.
	*
	* @return the primary key of this l m s book1
	*/
	@Override
	public long getPrimaryKey() {
		return _lmsBook1.getPrimaryKey();
	}

	/**
	* Sets the primary key of this l m s book1.
	*
	* @param primaryKey the primary key of this l m s book1
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lmsBook1.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the book ID of this l m s book1.
	*
	* @return the book ID of this l m s book1
	*/
	@Override
	public long getBookId() {
		return _lmsBook1.getBookId();
	}

	/**
	* Sets the book ID of this l m s book1.
	*
	* @param bookId the book ID of this l m s book1
	*/
	@Override
	public void setBookId(long bookId) {
		_lmsBook1.setBookId(bookId);
	}

	/**
	* Returns the book title of this l m s book1.
	*
	* @return the book title of this l m s book1
	*/
	@Override
	public java.lang.String getBookTitle() {
		return _lmsBook1.getBookTitle();
	}

	/**
	* Sets the book title of this l m s book1.
	*
	* @param bookTitle the book title of this l m s book1
	*/
	@Override
	public void setBookTitle(java.lang.String bookTitle) {
		_lmsBook1.setBookTitle(bookTitle);
	}

	/**
	* Returns the author of this l m s book1.
	*
	* @return the author of this l m s book1
	*/
	@Override
	public java.lang.String getAuthor() {
		return _lmsBook1.getAuthor();
	}

	/**
	* Sets the author of this l m s book1.
	*
	* @param author the author of this l m s book1
	*/
	@Override
	public void setAuthor(java.lang.String author) {
		_lmsBook1.setAuthor(author);
	}

	/**
	* Returns the create date of this l m s book1.
	*
	* @return the create date of this l m s book1
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _lmsBook1.getCreateDate();
	}

	/**
	* Sets the create date of this l m s book1.
	*
	* @param createDate the create date of this l m s book1
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_lmsBook1.setCreateDate(createDate);
	}

	@Override
	public boolean isNew() {
		return _lmsBook1.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lmsBook1.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lmsBook1.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lmsBook1.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lmsBook1.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lmsBook1.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lmsBook1.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lmsBook1.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lmsBook1.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lmsBook1.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lmsBook1.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LMSBook1Wrapper((LMSBook1)_lmsBook1.clone());
	}

	@Override
	public int compareTo(com.slayer.model.LMSBook1 lmsBook1) {
		return _lmsBook1.compareTo(lmsBook1);
	}

	@Override
	public int hashCode() {
		return _lmsBook1.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.slayer.model.LMSBook1> toCacheModel() {
		return _lmsBook1.toCacheModel();
	}

	@Override
	public com.slayer.model.LMSBook1 toEscapedModel() {
		return new LMSBook1Wrapper(_lmsBook1.toEscapedModel());
	}

	@Override
	public com.slayer.model.LMSBook1 toUnescapedModel() {
		return new LMSBook1Wrapper(_lmsBook1.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lmsBook1.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lmsBook1.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lmsBook1.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LMSBook1Wrapper)) {
			return false;
		}

		LMSBook1Wrapper lmsBook1Wrapper = (LMSBook1Wrapper)obj;

		if (Validator.equals(_lmsBook1, lmsBook1Wrapper._lmsBook1)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LMSBook1 getWrappedLMSBook1() {
		return _lmsBook1;
	}

	@Override
	public LMSBook1 getWrappedModel() {
		return _lmsBook1;
	}

	@Override
	public void resetOriginalValues() {
		_lmsBook1.resetOriginalValues();
	}

	private LMSBook1 _lmsBook1;
}