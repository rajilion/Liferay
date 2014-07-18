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

package com.slayer.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.slayer.model.LMSBook1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LMSBook1 in entity cache.
 *
 * @author rajkumar.j
 * @see LMSBook1
 * @generated
 */
public class LMSBook1CacheModel implements CacheModel<LMSBook1>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{bookId=");
		sb.append(bookId);
		sb.append(", bookTitle=");
		sb.append(bookTitle);
		sb.append(", author=");
		sb.append(author);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LMSBook1 toEntityModel() {
		LMSBook1Impl lmsBook1Impl = new LMSBook1Impl();

		lmsBook1Impl.setBookId(bookId);

		if (bookTitle == null) {
			lmsBook1Impl.setBookTitle(StringPool.BLANK);
		}
		else {
			lmsBook1Impl.setBookTitle(bookTitle);
		}

		if (author == null) {
			lmsBook1Impl.setAuthor(StringPool.BLANK);
		}
		else {
			lmsBook1Impl.setAuthor(author);
		}

		if (createDate == Long.MIN_VALUE) {
			lmsBook1Impl.setCreateDate(null);
		}
		else {
			lmsBook1Impl.setCreateDate(new Date(createDate));
		}

		lmsBook1Impl.resetOriginalValues();

		return lmsBook1Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bookId = objectInput.readLong();
		bookTitle = objectInput.readUTF();
		author = objectInput.readUTF();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(bookId);

		if (bookTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bookTitle);
		}

		if (author == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(author);
		}

		objectOutput.writeLong(createDate);
	}

	public long bookId;
	public String bookTitle;
	public String author;
	public long createDate;
}