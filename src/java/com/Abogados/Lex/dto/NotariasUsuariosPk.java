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
 * This class represents the primary key of the NOTARIAS_USUARIOS table.
 */
public class NotariasUsuariosPk implements Serializable
{
	protected long idNotaria;

	protected long idUsuario;

	/** 
	 * This attribute represents whether the primitive attribute idNotaria is null.
	 */
	protected boolean idNotariaNull;

	/** 
	 * This attribute represents whether the primitive attribute idUsuario is null.
	 */
	protected boolean idUsuarioNull;

	/** 
	 * Sets the value of idNotaria
	 */
	public void setIdNotaria(long idNotaria)
	{
		this.idNotaria = idNotaria;
	}

	/** 
	 * Gets the value of idNotaria
	 */
	public long getIdNotaria()
	{
		return idNotaria;
	}

	/** 
	 * Sets the value of idUsuario
	 */
	public void setIdUsuario(long idUsuario)
	{
		this.idUsuario = idUsuario;
	}

	/** 
	 * Gets the value of idUsuario
	 */
	public long getIdUsuario()
	{
		return idUsuario;
	}

	/**
	 * Method 'NotariasUsuariosPk'
	 * 
	 */
	public NotariasUsuariosPk()
	{
	}

	/**
	 * Method 'NotariasUsuariosPk'
	 * 
	 * @param idNotaria
	 * @param idUsuario
	 */
	public NotariasUsuariosPk(final long idNotaria, final long idUsuario)
	{
		this.idNotaria = idNotaria;
		this.idUsuario = idUsuario;
	}

	/** 
	 * Sets the value of idNotariaNull
	 */
	public void setIdNotariaNull(boolean idNotariaNull)
	{
		this.idNotariaNull = idNotariaNull;
	}

	/** 
	 * Gets the value of idNotariaNull
	 */
	public boolean isIdNotariaNull()
	{
		return idNotariaNull;
	}

	/** 
	 * Sets the value of idUsuarioNull
	 */
	public void setIdUsuarioNull(boolean idUsuarioNull)
	{
		this.idUsuarioNull = idUsuarioNull;
	}

	/** 
	 * Gets the value of idUsuarioNull
	 */
	public boolean isIdUsuarioNull()
	{
		return idUsuarioNull;
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
		
		if (!(_other instanceof NotariasUsuariosPk)) {
			return false;
		}
		
		final NotariasUsuariosPk _cast = (NotariasUsuariosPk) _other;
		if (idNotaria != _cast.idNotaria) {
			return false;
		}
		
		if (idUsuario != _cast.idUsuario) {
			return false;
		}
		
		if (idNotariaNull != _cast.idNotariaNull) {
			return false;
		}
		
		if (idUsuarioNull != _cast.idUsuarioNull) {
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
		_hashCode = 29 * _hashCode + (int) (idNotaria ^ (idNotaria >>> 32));
		_hashCode = 29 * _hashCode + (int) (idUsuario ^ (idUsuario >>> 32));
		_hashCode = 29 * _hashCode + (idNotariaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idUsuarioNull ? 1 : 0);
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
		ret.append( "com.Abogados.Lex.dto.NotariasUsuariosPk: " );
		ret.append( "idNotaria=" + idNotaria );
		ret.append( ", idUsuario=" + idUsuario );
		return ret.toString();
	}

}