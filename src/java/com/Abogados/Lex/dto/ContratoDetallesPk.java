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
 * This class represents the primary key of the CONTRATO_DETALLES table.
 */
public class ContratoDetallesPk implements Serializable
{
	protected long idDetalleContrato;

	/** 
	 * This attribute represents whether the primitive attribute idDetalleContrato is null.
	 */
	protected boolean idDetalleContratoNull;

	/** 
	 * Sets the value of idDetalleContrato
	 */
	public void setIdDetalleContrato(long idDetalleContrato)
	{
		this.idDetalleContrato = idDetalleContrato;
	}

	/** 
	 * Gets the value of idDetalleContrato
	 */
	public long getIdDetalleContrato()
	{
		return idDetalleContrato;
	}

	/**
	 * Method 'ContratoDetallesPk'
	 * 
	 */
	public ContratoDetallesPk()
	{
	}

	/**
	 * Method 'ContratoDetallesPk'
	 * 
	 * @param idDetalleContrato
	 */
	public ContratoDetallesPk(final long idDetalleContrato)
	{
		this.idDetalleContrato = idDetalleContrato;
	}

	/** 
	 * Sets the value of idDetalleContratoNull
	 */
	public void setIdDetalleContratoNull(boolean idDetalleContratoNull)
	{
		this.idDetalleContratoNull = idDetalleContratoNull;
	}

	/** 
	 * Gets the value of idDetalleContratoNull
	 */
	public boolean isIdDetalleContratoNull()
	{
		return idDetalleContratoNull;
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
		
		if (!(_other instanceof ContratoDetallesPk)) {
			return false;
		}
		
		final ContratoDetallesPk _cast = (ContratoDetallesPk) _other;
		if (idDetalleContrato != _cast.idDetalleContrato) {
			return false;
		}
		
		if (idDetalleContratoNull != _cast.idDetalleContratoNull) {
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
		_hashCode = 29 * _hashCode + (int) (idDetalleContrato ^ (idDetalleContrato >>> 32));
		_hashCode = 29 * _hashCode + (idDetalleContratoNull ? 1 : 0);
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
		ret.append( "com.Abogados.Lex.dto.ContratoDetallesPk: " );
		ret.append( "idDetalleContrato=" + idDetalleContrato );
		return ret.toString();
	}

}
