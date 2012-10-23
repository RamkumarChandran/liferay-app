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

package ru.psavinov.liferay.langlearn.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LLWord service. Represents a row in the &quot;LangLearn_LLWord&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ru.psavinov.liferay.langlearn.model.impl.LLWordModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ru.psavinov.liferay.langlearn.model.impl.LLWordImpl}.
 * </p>
 *
 * @author Pavel Savinov
 * @see LLWord
 * @see ru.psavinov.liferay.langlearn.model.impl.LLWordImpl
 * @see ru.psavinov.liferay.langlearn.model.impl.LLWordModelImpl
 * @generated
 */
public interface LLWordModel extends AuditedModel, BaseModel<LLWord> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a LangLeardWord model instance should use the {@link LLWord} interface instead.
	 */

	/**
	 * Returns the primary key of this LangLeardWord.
	 *
	 * @return the primary key of this LangLeardWord
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this LangLeardWord.
	 *
	 * @param primaryKey the primary key of this LangLeardWord
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the word ID of this LangLeardWord.
	 *
	 * @return the word ID of this LangLeardWord
	 */
	public long getWordId();

	/**
	 * Sets the word ID of this LangLeardWord.
	 *
	 * @param wordId the word ID of this LangLeardWord
	 */
	public void setWordId(long wordId);

	/**
	 * Returns the locale of this LangLeardWord.
	 *
	 * @return the locale of this LangLeardWord
	 */
	@AutoEscape
	public String getLocale();

	/**
	 * Sets the locale of this LangLeardWord.
	 *
	 * @param locale the locale of this LangLeardWord
	 */
	public void setLocale(String locale);

	/**
	 * Returns the word of this LangLeardWord.
	 *
	 * @return the word of this LangLeardWord
	 */
	@AutoEscape
	public String getWord();

	/**
	 * Sets the word of this LangLeardWord.
	 *
	 * @param word the word of this LangLeardWord
	 */
	public void setWord(String word);

	/**
	 * Returns the company ID of this LangLeardWord.
	 *
	 * @return the company ID of this LangLeardWord
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this LangLeardWord.
	 *
	 * @param companyId the company ID of this LangLeardWord
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this LangLeardWord.
	 *
	 * @return the user ID of this LangLeardWord
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this LangLeardWord.
	 *
	 * @param userId the user ID of this LangLeardWord
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this LangLeardWord.
	 *
	 * @return the user uuid of this LangLeardWord
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this LangLeardWord.
	 *
	 * @param userUuid the user uuid of this LangLeardWord
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this LangLeardWord.
	 *
	 * @return the user name of this LangLeardWord
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this LangLeardWord.
	 *
	 * @param userName the user name of this LangLeardWord
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this LangLeardWord.
	 *
	 * @return the create date of this LangLeardWord
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this LangLeardWord.
	 *
	 * @param createDate the create date of this LangLeardWord
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this LangLeardWord.
	 *
	 * @return the modified date of this LangLeardWord
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this LangLeardWord.
	 *
	 * @param modifiedDate the modified date of this LangLeardWord
	 */
	public void setModifiedDate(Date modifiedDate);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(LLWord llWord);

	public int hashCode();

	public CacheModel<LLWord> toCacheModel();

	public LLWord toEscapedModel();

	public String toString();

	public String toXmlString();
}