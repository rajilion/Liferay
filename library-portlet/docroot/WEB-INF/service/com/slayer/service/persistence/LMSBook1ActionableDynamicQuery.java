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

package com.slayer.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.slayer.model.LMSBook1;

import com.slayer.service.LMSBook1LocalServiceUtil;

/**
 * @author rajkumar.j
 * @generated
 */
public abstract class LMSBook1ActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public LMSBook1ActionableDynamicQuery() throws SystemException {
		setBaseLocalService(LMSBook1LocalServiceUtil.getService());
		setClass(LMSBook1.class);

		setClassLoader(com.slayer.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("bookId");
	}
}