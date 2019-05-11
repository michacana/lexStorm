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
 * This class represents the primary key of the CONTRATO_ESTADOS table.
 */
public class ContratoEstadosPk implements Serializable
{
	protected long idContratoEstado;

	/** 
	 * This attribute represents whether the primitive attribute idContratoEstado is null.
	 */
	protected boolean idContratoEstadoNull;

	/** 
	 * Sets the value of idContratoEstado
	 */
	public void setIdContratoEstado(long idContratoEstado)
	{
		this.idContratoEstado = idContratoEstado;
	}

	/** 
	 * Gets the value of idContratoEstado
	 */
	public long getIdContratoEstado()
	{
		return idContratoEstado;
	}

	/**
	 * Method 'ContratoEstadosPk'
	 * 
	 */
	public ContratoEstadosPk()
	{
	}

	/**
	 * Method 'ContratoEstadosPk'
	 * 
	 * @param idContratoEstado
	 */
	public ContratoEstadosPk(final long idContratoEstado)
	{
		this.idContratoEstado = idContratoEstado;
	}

	/** 
	 * Sets the value of idContratoEstadoNull
	 */
	public void setIdContratoEstadoNull(boolean idContratoEstadoNull)
	{
		this.idContratoEstadoNull = idContratoEstadoNull;
	}

	/** 
	 * Gets the value of idContratoEstadoNull
	 */
	public boolean isIdContratoEstadoNull()
	{
		return idContratoEstadoNull;
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
		
		if (!(_other instanceof ContratoEstadosPk)) {
			return false;
		}
		
		final ContratoEstadosPk _cast = (ContratoEstadosPk) _other;
		if (idContratoEstado != _cast.idContratoEstado) {
			return false;
		}
		
		if (idContratoEstadoNull != _cast.idContratoEstadoNull) {
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
		_hashCode = 29 * _hashCode + (int) (idContratoEstado ^ (idContratoEstado >>> 32));
		_hashCode = 29 * _hashCode + (idContratoEstadoNull ? 1 : 0);
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
		ret.append( "com.Abogados.Lex.dto.ContratoEstadosPk: " );
		ret.append( "idContratoEstado=" + idContratoEstado );
		return ret.toString();
	}

}