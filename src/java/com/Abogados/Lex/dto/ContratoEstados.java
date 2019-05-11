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

public class ContratoEstados implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CONTRATO_ESTADO in the CONTRATO_ESTADOS table.
	 */
	protected long idContratoEstado;

	/** 
	 * This attribute maps to the column NOMBRE in the CONTRATO_ESTADOS table.
	 */
	protected String nombre;

	/**
	 * Method 'ContratoEstados'
	 * 
	 */
	public ContratoEstados()
	{
	}

	/**
	 * Method 'getIdContratoEstado'
	 * 
	 * @return long
	 */
	public long getIdContratoEstado()
	{
		return idContratoEstado;
	}

	/**
	 * Method 'setIdContratoEstado'
	 * 
	 * @param idContratoEstado
	 */
	public void setIdContratoEstado(long idContratoEstado)
	{
		this.idContratoEstado = idContratoEstado;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
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
		
		if (!(_other instanceof ContratoEstados)) {
			return false;
		}
		
		final ContratoEstados _cast = (ContratoEstados) _other;
		if (idContratoEstado != _cast.idContratoEstado) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
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
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ContratoEstadosPk
	 */
	public ContratoEstadosPk createPk()
	{
		return new ContratoEstadosPk(idContratoEstado);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.Abogados.Lex.dto.ContratoEstados: " );
		ret.append( "idContratoEstado=" + idContratoEstado );
		ret.append( ", nombre=" + nombre );
		return ret.toString();
	}

}