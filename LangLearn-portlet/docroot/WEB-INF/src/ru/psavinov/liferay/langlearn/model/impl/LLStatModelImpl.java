/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package ru.psavinov.liferay.langlearn.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import ru.psavinov.liferay.langlearn.model.LLStat;
import ru.psavinov.liferay.langlearn.model.LLStatModel;
import ru.psavinov.liferay.langlearn.model.LLStatSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the LLStat service. Represents a row in the &quot;LangLearn_LLStat&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ru.psavinov.liferay.langlearn.model.LLStatModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LLStatImpl}.
 * </p>
 *
 * @author Pavel Savinov
 * @see LLStatImpl
 * @see ru.psavinov.liferay.langlearn.model.LLStat
 * @see ru.psavinov.liferay.langlearn.model.LLStatModel
 * @generated
 */
@JSON(strict = true)
public class LLStatModelImpl extends BaseModelImpl<LLStat>
	implements LLStatModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a LangLearnStatistics model instance should use the {@link ru.psavinov.liferay.langlearn.model.LLStat} interface instead.
	 */
	public static final String TABLE_NAME = "LangLearn_LLStat";
	public static final Object[][] TABLE_COLUMNS = {
			{ "statId", Types.BIGINT },
			{ "statType", Types.INTEGER },
			{ "statString", Types.VARCHAR },
			{ "statInt", Types.INTEGER },
			{ "statLong", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table LangLearn_LLStat (statId LONG not null primary key,statType INTEGER,statString VARCHAR(75) null,statInt INTEGER,statLong LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table LangLearn_LLStat";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.ru.psavinov.liferay.langlearn.model.LLStat"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.ru.psavinov.liferay.langlearn.model.LLStat"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.ru.psavinov.liferay.langlearn.model.LLStat"),
			true);
	public static long CREATEDATE_COLUMN_BITMASK = 1L;
	public static long STATTYPE_COLUMN_BITMASK = 2L;
	public static long USERID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static LLStat toModel(LLStatSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		LLStat model = new LLStatImpl();

		model.setStatId(soapModel.getStatId());
		model.setStatType(soapModel.getStatType());
		model.setStatString(soapModel.getStatString());
		model.setStatInt(soapModel.getStatInt());
		model.setStatLong(soapModel.getStatLong());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<LLStat> toModels(LLStatSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<LLStat> models = new ArrayList<LLStat>(soapModels.length);

		for (LLStatSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.ru.psavinov.liferay.langlearn.model.LLStat"));

	public LLStatModelImpl() {
	}

	public long getPrimaryKey() {
		return _statId;
	}

	public void setPrimaryKey(long primaryKey) {
		setStatId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_statId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return LLStat.class;
	}

	public String getModelClassName() {
		return LLStat.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statId", getStatId());
		attributes.put("statType", getStatType());
		attributes.put("statString", getStatString());
		attributes.put("statInt", getStatInt());
		attributes.put("statLong", getStatLong());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long statId = (Long)attributes.get("statId");

		if (statId != null) {
			setStatId(statId);
		}

		Integer statType = (Integer)attributes.get("statType");

		if (statType != null) {
			setStatType(statType);
		}

		String statString = (String)attributes.get("statString");

		if (statString != null) {
			setStatString(statString);
		}

		Integer statInt = (Integer)attributes.get("statInt");

		if (statInt != null) {
			setStatInt(statInt);
		}

		Long statLong = (Long)attributes.get("statLong");

		if (statLong != null) {
			setStatLong(statLong);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@JSON
	public long getStatId() {
		return _statId;
	}

	public void setStatId(long statId) {
		_statId = statId;
	}

	@JSON
	public int getStatType() {
		return _statType;
	}

	public void setStatType(int statType) {
		_columnBitmask |= STATTYPE_COLUMN_BITMASK;

		if (!_setOriginalStatType) {
			_setOriginalStatType = true;

			_originalStatType = _statType;
		}

		_statType = statType;
	}

	public int getOriginalStatType() {
		return _originalStatType;
	}

	@JSON
	public String getStatString() {
		if (_statString == null) {
			return StringPool.BLANK;
		}
		else {
			return _statString;
		}
	}

	public void setStatString(String statString) {
		_statString = statString;
	}

	@JSON
	public int getStatInt() {
		return _statInt;
	}

	public void setStatInt(int statInt) {
		_statInt = statInt;
	}

	@JSON
	public long getStatLong() {
		return _statLong;
	}

	public void setStatLong(long statLong) {
		_statLong = statLong;
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_columnBitmask |= CREATEDATE_COLUMN_BITMASK;

		if (_originalCreateDate == null) {
			_originalCreateDate = _createDate;
		}

		_createDate = createDate;
	}

	public Date getOriginalCreateDate() {
		return _originalCreateDate;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			LLStat.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LLStat toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (LLStat)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		LLStatImpl llStatImpl = new LLStatImpl();

		llStatImpl.setStatId(getStatId());
		llStatImpl.setStatType(getStatType());
		llStatImpl.setStatString(getStatString());
		llStatImpl.setStatInt(getStatInt());
		llStatImpl.setStatLong(getStatLong());
		llStatImpl.setCompanyId(getCompanyId());
		llStatImpl.setUserId(getUserId());
		llStatImpl.setUserName(getUserName());
		llStatImpl.setCreateDate(getCreateDate());
		llStatImpl.setModifiedDate(getModifiedDate());

		llStatImpl.resetOriginalValues();

		return llStatImpl;
	}

	public int compareTo(LLStat llStat) {
		long primaryKey = llStat.getPrimaryKey();

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
		if (obj == null) {
			return false;
		}

		LLStat llStat = null;

		try {
			llStat = (LLStat)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = llStat.getPrimaryKey();

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
	public void resetOriginalValues() {
		LLStatModelImpl llStatModelImpl = this;

		llStatModelImpl._originalStatType = llStatModelImpl._statType;

		llStatModelImpl._setOriginalStatType = false;

		llStatModelImpl._originalUserId = llStatModelImpl._userId;

		llStatModelImpl._setOriginalUserId = false;

		llStatModelImpl._originalCreateDate = llStatModelImpl._createDate;

		llStatModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LLStat> toCacheModel() {
		LLStatCacheModel llStatCacheModel = new LLStatCacheModel();

		llStatCacheModel.statId = getStatId();

		llStatCacheModel.statType = getStatType();

		llStatCacheModel.statString = getStatString();

		String statString = llStatCacheModel.statString;

		if ((statString != null) && (statString.length() == 0)) {
			llStatCacheModel.statString = null;
		}

		llStatCacheModel.statInt = getStatInt();

		llStatCacheModel.statLong = getStatLong();

		llStatCacheModel.companyId = getCompanyId();

		llStatCacheModel.userId = getUserId();

		llStatCacheModel.userName = getUserName();

		String userName = llStatCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			llStatCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			llStatCacheModel.createDate = createDate.getTime();
		}
		else {
			llStatCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			llStatCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			llStatCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return llStatCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{statId=");
		sb.append(getStatId());
		sb.append(", statType=");
		sb.append(getStatType());
		sb.append(", statString=");
		sb.append(getStatString());
		sb.append(", statInt=");
		sb.append(getStatInt());
		sb.append(", statLong=");
		sb.append(getStatLong());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("ru.psavinov.liferay.langlearn.model.LLStat");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>statId</column-name><column-value><![CDATA[");
		sb.append(getStatId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statType</column-name><column-value><![CDATA[");
		sb.append(getStatType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statString</column-name><column-value><![CDATA[");
		sb.append(getStatString());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statInt</column-name><column-value><![CDATA[");
		sb.append(getStatInt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statLong</column-name><column-value><![CDATA[");
		sb.append(getStatLong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LLStat.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			LLStat.class
		};
	private long _statId;
	private int _statType;
	private int _originalStatType;
	private boolean _setOriginalStatType;
	private String _statString;
	private int _statInt;
	private long _statLong;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _originalCreateDate;
	private Date _modifiedDate;
	private long _columnBitmask;
	private LLStat _escapedModelProxy;
}