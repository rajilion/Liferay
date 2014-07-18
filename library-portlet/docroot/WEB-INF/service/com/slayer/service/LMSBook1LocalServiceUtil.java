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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LMSBook1. This utility wraps
 * {@link com.slayer.service.impl.LMSBook1LocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author rajkumar.j
 * @see LMSBook1LocalService
 * @see com.slayer.service.base.LMSBook1LocalServiceBaseImpl
 * @see com.slayer.service.impl.LMSBook1LocalServiceImpl
 * @generated
 */
public class LMSBook1LocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.slayer.service.impl.LMSBook1LocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the l m s book1 to the database. Also notifies the appropriate model listeners.
	*
	* @param lmsBook1 the l m s book1
	* @return the l m s book1 that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook1 addLMSBook1(
		com.slayer.model.LMSBook1 lmsBook1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLMSBook1(lmsBook1);
	}

	/**
	* Creates a new l m s book1 with the primary key. Does not add the l m s book1 to the database.
	*
	* @param bookId the primary key for the new l m s book1
	* @return the new l m s book1
	*/
	public static com.slayer.model.LMSBook1 createLMSBook1(long bookId) {
		return getService().createLMSBook1(bookId);
	}

	/**
	* Deletes the l m s book1 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the l m s book1
	* @return the l m s book1 that was removed
	* @throws PortalException if a l m s book1 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook1 deleteLMSBook1(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLMSBook1(bookId);
	}

	/**
	* Deletes the l m s book1 from the database. Also notifies the appropriate model listeners.
	*
	* @param lmsBook1 the l m s book1
	* @return the l m s book1 that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook1 deleteLMSBook1(
		com.slayer.model.LMSBook1 lmsBook1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLMSBook1(lmsBook1);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.slayer.model.LMSBook1 fetchLMSBook1(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLMSBook1(bookId);
	}

	/**
	* Returns the l m s book1 with the primary key.
	*
	* @param bookId the primary key of the l m s book1
	* @return the l m s book1
	* @throws PortalException if a l m s book1 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook1 getLMSBook1(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLMSBook1(bookId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.slayer.model.LMSBook1> getLMSBook1s(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLMSBook1s(start, end);
	}

	/**
	* Returns the number of l m s book1s.
	*
	* @return the number of l m s book1s
	* @throws SystemException if a system exception occurred
	*/
	public static int getLMSBook1sCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLMSBook1sCount();
	}

	/**
	* Updates the l m s book1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lmsBook1 the l m s book1
	* @return the l m s book1 that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook1 updateLMSBook1(
		com.slayer.model.LMSBook1 lmsBook1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLMSBook1(lmsBook1);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static LMSBook1LocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LMSBook1LocalService.class.getName());

			if (invokableLocalService instanceof LMSBook1LocalService) {
				_service = (LMSBook1LocalService)invokableLocalService;
			}
			else {
				_service = new LMSBook1LocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(LMSBook1LocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LMSBook1LocalService service) {
	}

	private static LMSBook1LocalService _service;
}