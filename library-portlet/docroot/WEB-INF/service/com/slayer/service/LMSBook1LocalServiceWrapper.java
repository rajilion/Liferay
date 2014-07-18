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

package com.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LMSBook1LocalService}.
 *
 * @author rajkumar.j
 * @see LMSBook1LocalService
 * @generated
 */
public class LMSBook1LocalServiceWrapper implements LMSBook1LocalService,
	ServiceWrapper<LMSBook1LocalService> {
	public LMSBook1LocalServiceWrapper(
		LMSBook1LocalService lmsBook1LocalService) {
		_lmsBook1LocalService = lmsBook1LocalService;
	}

	/**
	* Adds the l m s book1 to the database. Also notifies the appropriate model listeners.
	*
	* @param lmsBook1 the l m s book1
	* @return the l m s book1 that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.slayer.model.LMSBook1 addLMSBook1(
		com.slayer.model.LMSBook1 lmsBook1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.addLMSBook1(lmsBook1);
	}

	/**
	* Creates a new l m s book1 with the primary key. Does not add the l m s book1 to the database.
	*
	* @param bookId the primary key for the new l m s book1
	* @return the new l m s book1
	*/
	@Override
	public com.slayer.model.LMSBook1 createLMSBook1(long bookId) {
		return _lmsBook1LocalService.createLMSBook1(bookId);
	}

	/**
	* Deletes the l m s book1 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the l m s book1
	* @return the l m s book1 that was removed
	* @throws PortalException if a l m s book1 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.slayer.model.LMSBook1 deleteLMSBook1(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.deleteLMSBook1(bookId);
	}

	/**
	* Deletes the l m s book1 from the database. Also notifies the appropriate model listeners.
	*
	* @param lmsBook1 the l m s book1
	* @return the l m s book1 that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.slayer.model.LMSBook1 deleteLMSBook1(
		com.slayer.model.LMSBook1 lmsBook1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.deleteLMSBook1(lmsBook1);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lmsBook1LocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBook1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBook1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.slayer.model.LMSBook1 fetchLMSBook1(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.fetchLMSBook1(bookId);
	}

	/**
	* Returns the l m s book1 with the primary key.
	*
	* @param bookId the primary key of the l m s book1
	* @return the l m s book1
	* @throws PortalException if a l m s book1 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.slayer.model.LMSBook1 getLMSBook1(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.getLMSBook1(bookId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.slayer.model.LMSBook1> getLMSBook1s(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.getLMSBook1s(start, end);
	}

	/**
	* Returns the number of l m s book1s.
	*
	* @return the number of l m s book1s
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLMSBook1sCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.getLMSBook1sCount();
	}

	/**
	* Updates the l m s book1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lmsBook1 the l m s book1
	* @return the l m s book1 that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.slayer.model.LMSBook1 updateLMSBook1(
		com.slayer.model.LMSBook1 lmsBook1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook1LocalService.updateLMSBook1(lmsBook1);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lmsBook1LocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lmsBook1LocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lmsBook1LocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LMSBook1LocalService getWrappedLMSBook1LocalService() {
		return _lmsBook1LocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLMSBook1LocalService(
		LMSBook1LocalService lmsBook1LocalService) {
		_lmsBook1LocalService = lmsBook1LocalService;
	}

	@Override
	public LMSBook1LocalService getWrappedService() {
		return _lmsBook1LocalService;
	}

	@Override
	public void setWrappedService(LMSBook1LocalService lmsBook1LocalService) {
		_lmsBook1LocalService = lmsBook1LocalService;
	}

	private LMSBook1LocalService _lmsBook1LocalService;
}