/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.Abogados.Lex.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class ReadSolicitudTiposParam implements Serializable
{
	protected long vId;

	/** 
	 * This attribute represents whether the primitive attribute vId is null.
	 */
	protected boolean vIdNull = true;

	protected List CursorSolicitudTipoList = new ArrayList();

	/** 
	 * This attribute represents whether the primitive attribute CursorSolicitudTipoList is null.
	 */
	protected boolean CursorSolicitudTipoListNull = true;

	/**
	 * Method 'ReadSolicitudTiposParam'
	 * 
	 */
	public ReadSolicitudTiposParam()
	{
	}

	/**
	 * Method 'getVId'
	 * 
	 * @return long
	 */
	public long getVId()
	{
		return vId;
	}

	/**
	 * Method 'setVId'
	 * 
	 * @param vId
	 */
	public void setVId(long vId)
	{
		this.vId = vId;
	}

	/** 
	 * Sets the value of vIdNull
	 */
	public void setVIdNull(boolean vIdNull)
	{
		this.vIdNull = vIdNull;
	}

	/** 
	 * Gets the value of vIdNull
	 */
	public boolean isVIdNull()
	{
		return vIdNull;
	}

	/**
	 * Method 'getCursorSolicitudTipoList'
	 * 
	 * @return List
	 */
	public List getCursorSolicitudTipoList()
	{
		return CursorSolicitudTipoList;
	}

	/**
	 * Method 'setCursorSolicitudTipoList'
	 * 
	 * @param CursorSolicitudTipoList
	 */
	public void setCursorSolicitudTipoList(List CursorSolicitudTipoList)
	{
		this.CursorSolicitudTipoList = CursorSolicitudTipoList;
	}

	/** 
	 * Sets the value of CursorSolicitudTipoListNull
	 */
	public void setCursorSolicitudTipoListNull(boolean CursorSolicitudTipoListNull)
	{
		this.CursorSolicitudTipoListNull = CursorSolicitudTipoListNull;
	}

	/** 
	 * Gets the value of CursorSolicitudTipoListNull
	 */
	public boolean isCursorSolicitudTipoListNull()
	{
		return CursorSolicitudTipoListNull;
	}

	/**
	 * Method 'createCursorSolicitudTipo'
	 * 
	 * @return ReadSolicitudTiposParam.CursorSolicitudTipo
	 */
	public ReadSolicitudTiposParam.CursorSolicitudTipo createCursorSolicitudTipo()
	{
		return new ReadSolicitudTiposParam.CursorSolicitudTipo();
	}

	public class CursorSolicitudTipo implements Serializable
	{
		/**
		 * Method 'CursorSolicitudTipo'
		 * 
		 */
		public CursorSolicitudTipo()
		{
		}

	}
}
