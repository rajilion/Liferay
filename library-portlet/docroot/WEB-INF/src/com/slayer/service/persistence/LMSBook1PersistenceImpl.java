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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.slayer.NoSuchBook1Exception;

import com.slayer.model.LMSBook1;
import com.slayer.model.impl.LMSBook1Impl;
import com.slayer.model.impl.LMSBook1ModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the l m s book1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author rajkumar.j
 * @see LMSBook1Persistence
 * @see LMSBook1Util
 * @generated
 */
public class LMSBook1PersistenceImpl extends BasePersistenceImpl<LMSBook1>
	implements LMSBook1Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LMSBook1Util} to access the l m s book1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LMSBook1Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
			LMSBook1ModelImpl.FINDER_CACHE_ENABLED, LMSBook1Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
			LMSBook1ModelImpl.FINDER_CACHE_ENABLED, LMSBook1Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
			LMSBook1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LMSBook1PersistenceImpl() {
		setModelClass(LMSBook1.class);
	}

	/**
	 * Caches the l m s book1 in the entity cache if it is enabled.
	 *
	 * @param lmsBook1 the l m s book1
	 */
	@Override
	public void cacheResult(LMSBook1 lmsBook1) {
		EntityCacheUtil.putResult(LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
			LMSBook1Impl.class, lmsBook1.getPrimaryKey(), lmsBook1);

		lmsBook1.resetOriginalValues();
	}

	/**
	 * Caches the l m s book1s in the entity cache if it is enabled.
	 *
	 * @param lmsBook1s the l m s book1s
	 */
	@Override
	public void cacheResult(List<LMSBook1> lmsBook1s) {
		for (LMSBook1 lmsBook1 : lmsBook1s) {
			if (EntityCacheUtil.getResult(
						LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
						LMSBook1Impl.class, lmsBook1.getPrimaryKey()) == null) {
				cacheResult(lmsBook1);
			}
			else {
				lmsBook1.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all l m s book1s.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LMSBook1Impl.class.getName());
		}

		EntityCacheUtil.clearCache(LMSBook1Impl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the l m s book1.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LMSBook1 lmsBook1) {
		EntityCacheUtil.removeResult(LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
			LMSBook1Impl.class, lmsBook1.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LMSBook1> lmsBook1s) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LMSBook1 lmsBook1 : lmsBook1s) {
			EntityCacheUtil.removeResult(LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
				LMSBook1Impl.class, lmsBook1.getPrimaryKey());
		}
	}

	/**
	 * Creates a new l m s book1 with the primary key. Does not add the l m s book1 to the database.
	 *
	 * @param bookId the primary key for the new l m s book1
	 * @return the new l m s book1
	 */
	@Override
	public LMSBook1 create(long bookId) {
		LMSBook1 lmsBook1 = new LMSBook1Impl();

		lmsBook1.setNew(true);
		lmsBook1.setPrimaryKey(bookId);

		return lmsBook1;
	}

	/**
	 * Removes the l m s book1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookId the primary key of the l m s book1
	 * @return the l m s book1 that was removed
	 * @throws com.slayer.NoSuchBook1Exception if a l m s book1 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LMSBook1 remove(long bookId)
		throws NoSuchBook1Exception, SystemException {
		return remove((Serializable)bookId);
	}

	/**
	 * Removes the l m s book1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the l m s book1
	 * @return the l m s book1 that was removed
	 * @throws com.slayer.NoSuchBook1Exception if a l m s book1 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LMSBook1 remove(Serializable primaryKey)
		throws NoSuchBook1Exception, SystemException {
		Session session = null;

		try {
			session = openSession();

			LMSBook1 lmsBook1 = (LMSBook1)session.get(LMSBook1Impl.class,
					primaryKey);

			if (lmsBook1 == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBook1Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lmsBook1);
		}
		catch (NoSuchBook1Exception nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected LMSBook1 removeImpl(LMSBook1 lmsBook1) throws SystemException {
		lmsBook1 = toUnwrappedModel(lmsBook1);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lmsBook1)) {
				lmsBook1 = (LMSBook1)session.get(LMSBook1Impl.class,
						lmsBook1.getPrimaryKeyObj());
			}

			if (lmsBook1 != null) {
				session.delete(lmsBook1);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lmsBook1 != null) {
			clearCache(lmsBook1);
		}

		return lmsBook1;
	}

	@Override
	public LMSBook1 updateImpl(com.slayer.model.LMSBook1 lmsBook1)
		throws SystemException {
		lmsBook1 = toUnwrappedModel(lmsBook1);

		boolean isNew = lmsBook1.isNew();

		Session session = null;

		try {
			session = openSession();

			if (lmsBook1.isNew()) {
				session.save(lmsBook1);

				lmsBook1.setNew(false);
			}
			else {
				session.merge(lmsBook1);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
			LMSBook1Impl.class, lmsBook1.getPrimaryKey(), lmsBook1);

		return lmsBook1;
	}

	protected LMSBook1 toUnwrappedModel(LMSBook1 lmsBook1) {
		if (lmsBook1 instanceof LMSBook1Impl) {
			return lmsBook1;
		}

		LMSBook1Impl lmsBook1Impl = new LMSBook1Impl();

		lmsBook1Impl.setNew(lmsBook1.isNew());
		lmsBook1Impl.setPrimaryKey(lmsBook1.getPrimaryKey());

		lmsBook1Impl.setBookId(lmsBook1.getBookId());
		lmsBook1Impl.setBookTitle(lmsBook1.getBookTitle());
		lmsBook1Impl.setAuthor(lmsBook1.getAuthor());
		lmsBook1Impl.setCreateDate(lmsBook1.getCreateDate());

		return lmsBook1Impl;
	}

	/**
	 * Returns the l m s book1 with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the l m s book1
	 * @return the l m s book1
	 * @throws com.slayer.NoSuchBook1Exception if a l m s book1 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LMSBook1 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBook1Exception, SystemException {
		LMSBook1 lmsBook1 = fetchByPrimaryKey(primaryKey);

		if (lmsBook1 == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBook1Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lmsBook1;
	}

	/**
	 * Returns the l m s book1 with the primary key or throws a {@link com.slayer.NoSuchBook1Exception} if it could not be found.
	 *
	 * @param bookId the primary key of the l m s book1
	 * @return the l m s book1
	 * @throws com.slayer.NoSuchBook1Exception if a l m s book1 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LMSBook1 findByPrimaryKey(long bookId)
		throws NoSuchBook1Exception, SystemException {
		return findByPrimaryKey((Serializable)bookId);
	}

	/**
	 * Returns the l m s book1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the l m s book1
	 * @return the l m s book1, or <code>null</code> if a l m s book1 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LMSBook1 fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LMSBook1 lmsBook1 = (LMSBook1)EntityCacheUtil.getResult(LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
				LMSBook1Impl.class, primaryKey);

		if (lmsBook1 == _nullLMSBook1) {
			return null;
		}

		if (lmsBook1 == null) {
			Session session = null;

			try {
				session = openSession();

				lmsBook1 = (LMSBook1)session.get(LMSBook1Impl.class, primaryKey);

				if (lmsBook1 != null) {
					cacheResult(lmsBook1);
				}
				else {
					EntityCacheUtil.putResult(LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
						LMSBook1Impl.class, primaryKey, _nullLMSBook1);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LMSBook1ModelImpl.ENTITY_CACHE_ENABLED,
					LMSBook1Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lmsBook1;
	}

	/**
	 * Returns the l m s book1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookId the primary key of the l m s book1
	 * @return the l m s book1, or <code>null</code> if a l m s book1 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LMSBook1 fetchByPrimaryKey(long bookId) throws SystemException {
		return fetchByPrimaryKey((Serializable)bookId);
	}

	/**
	 * Returns all the l m s book1s.
	 *
	 * @return the l m s book1s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LMSBook1> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<LMSBook1> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<LMSBook1> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<LMSBook1> list = (List<LMSBook1>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LMSBOOK1);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LMSBOOK1;

				if (pagination) {
					sql = sql.concat(LMSBook1ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LMSBook1>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LMSBook1>(list);
				}
				else {
					list = (List<LMSBook1>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the l m s book1s from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LMSBook1 lmsBook1 : findAll()) {
			remove(lmsBook1);
		}
	}

	/**
	 * Returns the number of l m s book1s.
	 *
	 * @return the number of l m s book1s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LMSBOOK1);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the l m s book1 persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.slayer.model.LMSBook1")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LMSBook1>> listenersList = new ArrayList<ModelListener<LMSBook1>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LMSBook1>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(LMSBook1Impl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LMSBOOK1 = "SELECT lmsBook1 FROM LMSBook1 lmsBook1";
	private static final String _SQL_COUNT_LMSBOOK1 = "SELECT COUNT(lmsBook1) FROM LMSBook1 lmsBook1";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lmsBook1.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LMSBook1 exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LMSBook1PersistenceImpl.class);
	private static LMSBook1 _nullLMSBook1 = new LMSBook1Impl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LMSBook1> toCacheModel() {
				return _nullLMSBook1CacheModel;
			}
		};

	private static CacheModel<LMSBook1> _nullLMSBook1CacheModel = new CacheModel<LMSBook1>() {
			@Override
			public LMSBook1 toEntityModel() {
				return _nullLMSBook1;
			}
		};
}