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

public class Empresas implements Serializable
{
	/** 
	 * This attribute maps to the column ID_EMPRESA in the EMPRESAS table.
	 */
	protected long idEmpresa;

	/** 
	 * This attribute maps to the column NOMBRE in the EMPRESAS table.
	 */
	protected String nombre;

	/** 
	 * This attribute maps to the column RAZON_SOCIAL in the EMPRESAS table.
	 */
	protected String razonSocial;

	/** 
	 * This attribute maps to the column DIRECCION in the EMPRESAS table.
	 */
	protected String direccion;

	/** 
	 * This attribute maps to the column TELEFONO in the EMPRESAS table.
	 */
	protected long telefono;

	/** 
	 * This attribute represents whether the primitive attribute telefono is null.
	 */
	protected boolean telefonoNull = true;

	/** 
	 * This attribute maps to the column CREADO in the EMPRESAS table.
	 */
	protected Date creado;

	/** 
	 * This attribute maps to the column MODIFICADO in the EMPRESAS table.
	 */
	protected Date modificado;

	/** 
	 * This attribute maps to the column ID_COMUNA in the EMPRESAS table.
	 */
	protected long idComuna;

	/** 
	 * This attribute represents whether the primitive attribute idComuna is null.
	 */
	protected boolean idComunaNull = true;

	/**
	 * Method 'Empresas'
	 * 
	 */
	public Empresas()
	{
	}

	/**
	 * Method 'getIdEmpresa'
	 * 
	 * @return long
	 */
	public long getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'setIdEmpresa'
	 * 
	 * @param idEmpresa
	 */
	public void setIdEmpresa(long idEmpresa)
	{
		this.idEmpresa = idEmpresa;
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
	 * Method 'getRazonSocial'
	 * 
	 * @return String
	 */
	public String getRazonSocial()
	{
		return razonSocial;
	}

	/**
	 * Method 'setRazonSocial'
	 * 
	 * @param razonSocial
	 */
	public void setRazonSocial(String razonSocial)
	{
		this.razonSocial = razonSocial;
	}

	/**
	 * Method 'getDireccion'
	 * 
	 * @return String
	 */
	public String getDireccion()
	{
		return direccion;
	}

	/**
	 * Method 'setDireccion'
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	/**
	 * Method 'getTelefono'
	 * 
	 * @return long
	 */
	public long getTelefono()
	{
		return telefono;
	}

	/**
	 * Method 'setTelefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(long telefono)
	{
		this.telefono = telefono;
		this.telefonoNull = false;
	}

	/**
	 * Method 'setTelefonoNull'
	 * 
	 * @param value
	 */
	public void setTelefonoNull(boolean value)
	{
		this.telefonoNull = value;
	}

	/**
	 * Method 'isTelefonoNull'
	 * 
	 * @return boolean
	 */
	public boolean isTelefonoNull()
	{
		return telefonoNull;
	}

	/**
	 * Method 'getCreado'
	 * 
	 * @return Date
	 */
	public Date getCreado()
	{
		return creado;
	}

	/**
	 * Method 'setCreado'
	 * 
	 * @param creado
	 */
	public void setCreado(Date creado)
	{
		this.creado = creado;
	}

	/**
	 * Method 'getModificado'
	 * 
	 * @return Date
	 */
	public Date getModificado()
	{
		return modificado;
	}

	/**
	 * Method 'setModificado'
	 * 
	 * @param modificado
	 */
	public void setModificado(Date modificado)
	{
		this.modificado = modificado;
	}

	/**
	 * Method 'getIdComuna'
	 * 
	 * @return long
	 */
	public long getIdComuna()
	{
		return idComuna;
	}

	/**
	 * Method 'setIdComuna'
	 * 
	 * @param idComuna
	 */
	public void setIdComuna(long idComuna)
	{
		this.idComuna = idComuna;
		this.idComunaNull = false;
	}

	/**
	 * Method 'setIdComunaNull'
	 * 
	 * @param value
	 */
	public void setIdComunaNull(boolean value)
	{
		this.idComunaNull = value;
	}

	/**
	 * Method 'isIdComunaNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdComunaNull()
	{
		return idComunaNull;
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
		
		if (!(_other instanceof Empresas)) {
			return false;
		}
		
		final Empresas _cast = (Empresas) _other;
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (razonSocial == null ? _cast.razonSocial != razonSocial : !razonSocial.equals( _cast.razonSocial )) {
			return false;
		}
		
		if (direccion == null ? _cast.direccion != direccion : !direccion.equals( _cast.direccion )) {
			return false;
		}
		
		if (telefono != _cast.telefono) {
			return false;
		}
		
		if (telefonoNull != _cast.telefonoNull) {
			return false;
		}
		
		if (creado == null ? _cast.creado != creado : !creado.equals( _cast.creado )) {
			return false;
		}
		
		if (modificado == null ? _cast.modificado != modificado : !modificado.equals( _cast.modificado )) {
			return false;
		}
		
		if (idComuna != _cast.idComuna) {
			return false;
		}
		
		if (idComunaNull != _cast.idComunaNull) {
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
		_hashCode = 29 * _hashCode + (int) (idEmpresa ^ (idEmpresa >>> 32));
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		if (razonSocial != null) {
			_hashCode = 29 * _hashCode + razonSocial.hashCode();
		}
		
		if (direccion != null) {
			_hashCode = 29 * _hashCode + direccion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (telefono ^ (telefono >>> 32));
		_hashCode = 29 * _hashCode + (telefonoNull ? 1 : 0);
		if (creado != null) {
			_hashCode = 29 * _hashCode + creado.hashCode();
		}
		
		if (modificado != null) {
			_hashCode = 29 * _hashCode + modificado.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (idComuna ^ (idComuna >>> 32));
		_hashCode = 29 * _hashCode + (idComunaNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpresasPk
	 */
	public EmpresasPk createPk()
	{
		return new EmpresasPk(idEmpresa);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.Abogados.Lex.dto.Empresas: " );
		ret.append( "idEmpresa=" + idEmpresa );
		ret.append( ", nombre=" + nombre );
		ret.append( ", razonSocial=" + razonSocial );
		ret.append( ", direccion=" + direccion );
		ret.append( ", telefono=" + telefono );
		ret.append( ", creado=" + creado );
		ret.append( ", modificado=" + modificado );
		ret.append( ", idComuna=" + idComuna );
		return ret.toString();
	}

}