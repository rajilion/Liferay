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

import com.liferay.portal.service.persistence.BasePersistence;

import com.slayer.model.LMSBook1;

/**
 * The persistence interface for the l m s book1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author rajkumar.j
 * @see LMSBook1PersistenceImpl
 * @see LMSBook1Util
 * @generated
 */
public interface LMSBook1Persistence extends BasePersistence<LMSBook1> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LMSBook1Util} to access the l m s book1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the l m s book1 in the entity cache if it is enabled.
	*
	* @param lmsBook1 the l m s book1
	*/
	public void cacheResult(com.slayer.model.LMSBook1 lmsBook1);

	/**
	* Caches the l m s book1s in the entity cache if it is enabled.
	*
	* @param lmsBook1s the l m s book1s
	*/
	public void cacheResult(java.util.List<com.slayer.model.LMSBook1> lmsBook1s);

	/**
	* Creates a new l m s book1 with the primary key. Does not add the l m s book1 to the database.
	*
	* @param bookId the primary key for the new l m s book1
	* @return the new l m s book1
	*/
	public com.slayer.model.LMSBook1 create(long bookId);

	/**
	* Removes the l m s book1 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the l m s book1
	* @return the l m s book1 that was removed
	* @throws com.slayer.NoSuchBook1Exception if a l m s book1 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.slayer.model.LMSBook1 remove(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchBook1Exception;

	public com.slayer.model.LMSBook1 updateImpl(
		com.slayer.model.LMSBook1 lmsBook1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the l m s book1 with the primary key or throws a {@link com.slayer.NoSuchBook1Exception} if it could not be found.
	*
	* @param bookId the primary key of the l m s book1
	* @return the l m s book1
	* @throws com.slayer.NoSuchBook1Exception if a l m s book1 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.slayer.model.LMSBook1 findByPrimaryKey(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchBook1Exception;

	/**
	* Returns the l m s book1 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookId the primary key of the l m s book1
	* @return the l m s book1, or <code>null</code> if a l m s book1 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.slayer.model.LMSBook1 fetchByPrimaryKey(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the l m s book1s.
	*
	* @return the l m s book1s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.slayer.model.LMSBook1> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the l m s book1s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBook1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of l m s book1s
	* @param end the upper bound of the range of l m s book1s (not inclusive)
	* @return the range of l m s book1s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.slayer.model.LMSBook1> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the l m s book1s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBook1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of l m s book1s
	* @param end the upper bound of the range of l m s book1s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of l m s book1s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.slayer.model.LMSBook1> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the l m s book1s from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of l m s book1s.
	*
	* @return the number of l m s book1s
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}