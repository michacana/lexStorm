/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.Abogados.Lex.dto;

import com.Abogados.Lex.dao.*;
import com.Abogados.Lex.factory.*;
import com.Abogados.Lex.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class Causas implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CAUSA in the CAUSAS table.
	 */
	protected long idCausa;

	/** 
	 * This attribute maps to the column ROL in the CAUSAS table.
	 */
	protected String rol;

	/** 
	 * This attribute maps to the column FECHA in the CAUSAS table.
	 */
	protected Date fecha;

	/** 
	 * This attribute maps to the column CARATULA in the CAUSAS table.
	 */
	protected Date caratula;

	/** 
	 * This attribute maps to the column ID_CONTRATO in the CAUSAS table.
	 */
	protected long idContrato;

	/** 
	 * This attribute maps to the column ID_TRIBUNAL in the CAUSAS table.
	 */
	protected long idTribunal;

	/**
	 * Method 'Causas'
	 * 
	 */
	public Causas()
	{
	}

	/**
	 * Method 'getIdCausa'
	 * 
	 * @return long
	 */
	public long getIdCausa()
	{
		return idCausa;
	}

	/**
	 * Method 'setIdCausa'
	 * 
	 * @param idCausa
	 */
	public void setIdCausa(long idCausa)
	{
		this.idCausa = idCausa;
	}

	/**
	 * Method 'getRol'
	 * 
	 * @return String
	 */
	public String getRol()
	{
		return rol;
	}

	/**
	 * Method 'setRol'
	 * 
	 * @param rol
	 */
	public void setRol(String rol)
	{
		this.rol = rol;
	}

	/**
	 * Method 'getFecha'
	 * 
	 * @return Date
	 */
	public Date getFecha()
	{
		return fecha;
	}

	/**
	 * Method 'setFecha'
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	/**
	 * Method 'getCaratula'
	 * 
	 * @return Date
	 */
	public Date getCaratula()
	{
		return caratula;
	}

	/**
	 * Method 'setCaratula'
	 * 
	 * @param caratula
	 */
	public void setCaratula(Date caratula)
	{
		this.caratula = caratula;
	}

	/**
	 * Method 'getIdContrato'
	 * 
	 * @return long
	 */
	public long getIdContrato()
	{
		return idContrato;
	}

	/**
	 * Method 'setIdContrato'
	 * 
	 * @param idContrato
	 */
	public void setIdContrato(long idContrato)
	{
		this.idContrato = idContrato;
	}

	/**
	 * Method 'getIdTribunal'
	 * 
	 * @return long
	 */
	public long getIdTribunal()
	{
		return idTribunal;
	}

	/**
	 * Method 'setIdTribunal'
	 * 
	 * @param idTribunal
	 */
	public void setIdTribunal(long idTribunal)
	{
		this.idTribunal = idTribunal;
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
		
		if (!(_other instanceof Causas)) {
			return false;
		}
		
		final Causas _cast = (Causas) _other;
		if (idCausa != _cast.idCausa) {
			return false;
		}
		
		if (rol == null ? _cast.rol != rol : !rol.equals( _cast.rol )) {
			return false;
		}
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
			return false;
		}
		
		if (caratula == null ? _cast.caratula != caratula : !caratula.equals( _cast.caratula )) {
			return false;
		}
		
		if (idContrato != _cast.idContrato) {
			return false;
		}
		
		if (idTribunal != _cast.idTribunal) {
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
		if (rol != null) {
			_hashCode = 29 * _hashCode + rol.hashCode();
		}
		
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		if (caratula != null) {
			_hashCode = 29 * _hashCode + caratula.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (idContrato ^ (idContrato >>> 32));
		_hashCode = 29 * _hashCode + (int) (idTribunal ^ (idTribunal >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CausasPk
	 */
	public CausasPk createPk()
	{
		return new CausasPk(idCausa);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.Abogados.Lex.dto.Causas: " );
		ret.append( "idCausa=" + idCausa );
		ret.append( ", rol=" + rol );
		ret.append( ", fecha=" + fecha );
		ret.append( ", caratula=" + caratula );
		ret.append( ", idContrato=" + idContrato );
		ret.append( ", idTribunal=" + idTribunal );
		return ret.toString();
	}

}