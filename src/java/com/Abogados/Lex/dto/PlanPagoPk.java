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
 * This class represents the primary key of the PLAN_PAGO table.
 */
public class PlanPagoPk implements Serializable
{
	protected long idPlanPago;

	/** 
	 * This attribute represents whether the primitive attribute idPlanPago is null.
	 */
	protected boolean idPlanPagoNull;

	/** 
	 * Sets the value of idPlanPago
	 */
	public void setIdPlanPago(long idPlanPago)
	{
		this.idPlanPago = idPlanPago;
	}

	/** 
	 * Gets the value of idPlanPago
	 */
	public long getIdPlanPago()
	{
		return idPlanPago;
	}

	/**
	 * Method 'PlanPagoPk'
	 * 
	 */
	public PlanPagoPk()
	{
	}

	/**
	 * Method 'PlanPagoPk'
	 * 
	 * @param idPlanPago
	 */
	public PlanPagoPk(final long idPlanPago)
	{
		this.idPlanPago = idPlanPago;
	}

	/** 
	 * Sets the value of idPlanPagoNull
	 */
	public void setIdPlanPagoNull(boolean idPlanPagoNull)
	{
		this.idPlanPagoNull = idPlanPagoNull;
	}

	/** 
	 * Gets the value of idPlanPagoNull
	 */
	public boolean isIdPlanPagoNull()
	{
		return idPlanPagoNull;
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
		
		if (!(_other instanceof PlanPagoPk)) {
			return false;
		}
		
		final PlanPagoPk _cast = (PlanPagoPk) _other;
		if (idPlanPago != _cast.idPlanPago) {
			return false;
		}
		
		if (idPlanPagoNull != _cast.idPlanPagoNull) {
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
		_hashCode = 29 * _hashCode + (int) (idPlanPago ^ (idPlanPago >>> 32));
		_hashCode = 29 * _hashCode + (idPlanPagoNull ? 1 : 0);
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
		ret.append( "com.Abogados.Lex.dto.PlanPagoPk: " );
		ret.append( "idPlanPago=" + idPlanPago );
		return ret.toString();
	}

}
