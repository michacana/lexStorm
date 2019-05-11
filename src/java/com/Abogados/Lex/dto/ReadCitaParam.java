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

public class ReadCitaParam implements Serializable
{
	protected long vIdCita;

	/** 
	 * This attribute represents whether the primitive attribute vIdCita is null.
	 */
	protected boolean vIdCitaNull = true;

	protected List CursorCitaList = new ArrayList();

	/** 
	 * This attribute represents whether the primitive attribute CursorCitaList is null.
	 */
	protected boolean CursorCitaListNull = true;

	/**
	 * Method 'ReadCitaParam'
	 * 
	 */
	public ReadCitaParam()
	{
	}

	/**
	 * Method 'getVIdCita'
	 * 
	 * @return long
	 */
	public long getVIdCita()
	{
		return vIdCita;
	}

	/**
	 * Method 'setVIdCita'
	 * 
	 * @param vIdCita
	 */
	public void setVIdCita(long vIdCita)
	{
		this.vIdCita = vIdCita;
	}

	/** 
	 * Sets the value of vIdCitaNull
	 */
	public void setVIdCitaNull(boolean vIdCitaNull)
	{
		this.vIdCitaNull = vIdCitaNull;
	}

	/** 
	 * Gets the value of vIdCitaNull
	 */
	public boolean isVIdCitaNull()
	{
		return vIdCitaNull;
	}

	/**
	 * Method 'getCursorCitaList'
	 * 
	 * @return List
	 */
	public List getCursorCitaList()
	{
		return CursorCitaList;
	}

	/**
	 * Method 'setCursorCitaList'
	 * 
	 * @param CursorCitaList
	 */
	public void setCursorCitaList(List CursorCitaList)
	{
		this.CursorCitaList = CursorCitaList;
	}

	/** 
	 * Sets the value of CursorCitaListNull
	 */
	public void setCursorCitaListNull(boolean CursorCitaListNull)
	{
		this.CursorCitaListNull = CursorCitaListNull;
	}

	/** 
	 * Gets the value of CursorCitaListNull
	 */
	public boolean isCursorCitaListNull()
	{
		return CursorCitaListNull;
	}

	/**
	 * Method 'createCursorCita'
	 * 
	 * @return ReadCitaParam.CursorCita
	 */
	public ReadCitaParam.CursorCita createCursorCita()
	{
		return new ReadCitaParam.CursorCita();
	}

	public class CursorCita implements Serializable
	{
		/**
		 * Method 'CursorCita'
		 * 
		 */
		public CursorCita()
		{
		}

	}
}
