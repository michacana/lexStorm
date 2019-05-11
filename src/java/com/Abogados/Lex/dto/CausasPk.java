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

/** 
 * This class represents the primary key of the CAUSAS table.
 */
public class CausasPk implements Serializable
{
	protected long idCausa;

	/** 
	 * This attribute represents whether the primitive attribute idCausa is null.
	 */
	protected boolean idCausaNull;

	/** 
	 * Sets the value of idCausa
	 */
	public void setIdCausa(long idCausa)
	{
		this.idCausa = idCausa;
	}

	/** 
	 * Gets the value of idCausa
	 */
	public long getIdCausa()
	{
		return idCausa;
	}

	/**
	 * Method 'CausasPk'
	 * 
	 */
	public CausasPk()
	{
	}

	/**
	 * Method 'CausasPk'
	 * 
	 * @param idCausa
	 */
	public CausasPk(final long idCausa)
	{
		this.idCausa = idCausa;
	}

	/** 
	 * Sets the value of idCausaNull
	 */
	public void setIdCausaNull(boolean idCausaNull)
	{
		this.idCausaNull = idCausaNull;
	}

	/** 
	 * Gets the value of idCausaNull
	 */
	public boolean isIdCausaNull()
	{
		return idCausaNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof CausasPk)) {
			return false;
		}
		
		final CausasPk _cast = (CausasPk) _other;
		if (idCausa != _cast.idCausa) {
			return false;
		}
		
		if (idCausaNull != _cast.idCausaNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + (int) (idCausa ^ (idCausa >>> 32));
		_hashCode = 29 * _hashCode + (idCausaNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.Abogados.Lex.dto.CausasPk: " );
		ret.append( "idCausa=" + idCausa );
		return ret.toString();
	}

}
