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

public class Contratos implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CONTRATO in the CONTRATOS table.
	 */
	protected long idContrato;

	/** 
	 * This attribute maps to the column FECHA_INICIO in the CONTRATOS table.
	 */
	protected Date fechaInicio;

	/** 
	 * This attribute maps to the column FECHA_TERMINO in the CONTRATOS table.
	 */
	protected Date fechaTermino;

	/** 
	 * This attribute maps to the column ID_CONTRATO_ESTADO in the CONTRATOS table.
	 */
	protected long idContratoEstado;

	/** 
	 * This attribute maps to the column ID_DETALLE_CONTRATO in the CONTRATOS table.
	 */
	protected long idDetalleContrato;

	/** 
	 * This attribute maps to the column ID_PRESUPUESTO in the CONTRATOS table.
	 */
	protected long idPresupuesto;

	/** 
	 * This attribute represents whether the primitive attribute idPresupuesto is null.
	 */
	protected boolean idPresupuestoNull = true;

	/** 
	 * This attribute maps to the column ID_ABOGADO in the CONTRATOS table.
	 */
	protected long idAbogado;

	/** 
	 * This attribute represents whether the primitive attribute idAbogado is null.
	 */
	protected boolean idAbogadoNull = true;

	/** 
	 * This attribute maps to the column ID_PLAN_PAGO in the CONTRATOS table.
	 */
	protected long idPlanPago;

	/** 
	 * This attribute represents whether the primitive attribute idPlanPago is null.
	 */
	protected boolean idPlanPagoNull = true;

	/** 
	 * This attribute maps to the column CREADO in the CONTRATOS table.
	 */
	protected Date creado;

	/** 
	 * This attribute maps to the column MODIFICADO in the CONTRATOS table.
	 */
	protected Date modificado;

	/** 
	 * This attribute maps to the column APROBADO_ABOGADO in the CONTRATOS table.
	 */
	protected int aprobadoAbogado;

	/** 
	 * This attribute maps to the column APROBADO_CLIENTE in the CONTRATOS table.
	 */
	protected int aprobadoCliente;

	/** 
	 * This attribute maps to the column ID_FORMA_PAGO in the CONTRATOS table.
	 */
	protected long idFormaPago;

	/**
	 * Method 'Contratos'
	 * 
	 */
	public Contratos()
	{
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
	 * Method 'getFechaInicio'
	 * 
	 * @return Date
	 */
	public Date getFechaInicio()
	{
		return fechaInicio;
	}

	/**
	 * Method 'setFechaInicio'
	 * 
	 * @param fechaInicio
	 */
	public void setFechaInicio(Date fechaInicio)
	{
		this.fechaInicio = fechaInicio;
	}

	/**
	 * Method 'getFechaTermino'
	 * 
	 * @return Date
	 */
	public Date getFechaTermino()
	{
		return fechaTermino;
	}

	/**
	 * Method 'setFechaTermino'
	 * 
	 * @param fechaTermino
	 */
	public void setFechaTermino(Date fechaTermino)
	{
		this.fechaTermino = fechaTermino;
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
	 * Method 'getIdDetalleContrato'
	 * 
	 * @return long
	 */
	public long getIdDetalleContrato()
	{
		return idDetalleContrato;
	}

	/**
	 * Method 'setIdDetalleContrato'
	 * 
	 * @param idDetalleContrato
	 */
	public void setIdDetalleContrato(long idDetalleContrato)
	{
		this.idDetalleContrato = idDetalleContrato;
	}

	/**
	 * Method 'getIdPresupuesto'
	 * 
	 * @return long
	 */
	public long getIdPresupuesto()
	{
		return idPresupuesto;
	}

	/**
	 * Method 'setIdPresupuesto'
	 * 
	 * @param idPresupuesto
	 */
	public void setIdPresupuesto(long idPresupuesto)
	{
		this.idPresupuesto = idPresupuesto;
		this.idPresupuestoNull = false;
	}

	/**
	 * Method 'setIdPresupuestoNull'
	 * 
	 * @param value
	 */
	public void setIdPresupuestoNull(boolean value)
	{
		this.idPresupuestoNull = value;
	}

	/**
	 * Method 'isIdPresupuestoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdPresupuestoNull()
	{
		return idPresupuestoNull;
	}

	/**
	 * Method 'getIdAbogado'
	 * 
	 * @return long
	 */
	public long getIdAbogado()
	{
		return idAbogado;
	}

	/**
	 * Method 'setIdAbogado'
	 * 
	 * @param idAbogado
	 */
	public void setIdAbogado(long idAbogado)
	{
		this.idAbogado = idAbogado;
		this.idAbogadoNull = false;
	}

	/**
	 * Method 'setIdAbogadoNull'
	 * 
	 * @param value
	 */
	public void setIdAbogadoNull(boolean value)
	{
		this.idAbogadoNull = value;
	}

	/**
	 * Method 'isIdAbogadoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdAbogadoNull()
	{
		return idAbogadoNull;
	}

	/**
	 * Method 'getIdPlanPago'
	 * 
	 * @return long
	 */
	public long getIdPlanPago()
	{
		return idPlanPago;
	}

	/**
	 * Method 'setIdPlanPago'
	 * 
	 * @param idPlanPago
	 */
	public void setIdPlanPago(long idPlanPago)
	{
		this.idPlanPago = idPlanPago;
		this.idPlanPagoNull = false;
	}

	/**
	 * Method 'setIdPlanPagoNull'
	 * 
	 * @param value
	 */
	public void setIdPlanPagoNull(boolean value)
	{
		this.idPlanPagoNull = value;
	}

	/**
	 * Method 'isIdPlanPagoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdPlanPagoNull()
	{
		return idPlanPagoNull;
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
	 * Method 'getAprobadoAbogado'
	 * 
	 * @return int
	 */
	public int getAprobadoAbogado()
	{
		return aprobadoAbogado;
	}

	/**
	 * Method 'setAprobadoAbogado'
	 * 
	 * @param aprobadoAbogado
	 */
	public void setAprobadoAbogado(int aprobadoAbogado)
	{
		this.aprobadoAbogado = aprobadoAbogado;
	}

	/**
	 * Method 'getAprobadoCliente'
	 * 
	 * @return int
	 */
	public int getAprobadoCliente()
	{
		return aprobadoCliente;
	}

	/**
	 * Method 'setAprobadoCliente'
	 * 
	 * @param aprobadoCliente
	 */
	public void setAprobadoCliente(int aprobadoCliente)
	{
		this.aprobadoCliente = aprobadoCliente;
	}

	/**
	 * Method 'getIdFormaPago'
	 * 
	 * @return long
	 */
	public long getIdFormaPago()
	{
		return idFormaPago;
	}

	/**
	 * Method 'setIdFormaPago'
	 * 
	 * @param idFormaPago
	 */
	public void setIdFormaPago(long idFormaPago)
	{
		this.idFormaPago = idFormaPago;
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
		
		if (!(_other instanceof Contratos)) {
			return false;
		}
		
		final Contratos _cast = (Contratos) _other;
		if (idContrato != _cast.idContrato) {
			return false;
		}
		
		if (fechaInicio == null ? _cast.fechaInicio != fechaInicio : !fechaInicio.equals( _cast.fechaInicio )) {
			return false;
		}
		
		if (fechaTermino == null ? _cast.fechaTermino != fechaTermino : !fechaTermino.equals( _cast.fechaTermino )) {
			return false;
		}
		
		if (idContratoEstado != _cast.idContratoEstado) {
			return false;
		}
		
		if (idDetalleContrato != _cast.idDetalleContrato) {
			return false;
		}
		
		if (idPresupuesto != _cast.idPresupuesto) {
			return false;
		}
		
		if (idPresupuestoNull != _cast.idPresupuestoNull) {
			return false;
		}
		
		if (idAbogado != _cast.idAbogado) {
			return false;
		}
		
		if (idAbogadoNull != _cast.idAbogadoNull) {
			return false;
		}
		
		if (idPlanPago != _cast.idPlanPago) {
			return false;
		}
		
		if (idPlanPagoNull != _cast.idPlanPagoNull) {
			return false;
		}
		
		if (creado == null ? _cast.creado != creado : !creado.equals( _cast.creado )) {
			return false;
		}
		
		if (modificado == null ? _cast.modificado != modificado : !modificado.equals( _cast.modificado )) {
			return false;
		}
		
		if (aprobadoAbogado != _cast.aprobadoAbogado) {
			return false;
		}
		
		if (aprobadoCliente != _cast.aprobadoCliente) {
			return false;
		}
		
		if (idFormaPago != _cast.idFormaPago) {
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
		_hashCode = 29 * _hashCode + (int) (idContrato ^ (idContrato >>> 32));
		if (fechaInicio != null) {
			_hashCode = 29 * _hashCode + fechaInicio.hashCode();
		}
		
		if (fechaTermino != null) {
			_hashCode = 29 * _hashCode + fechaTermino.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (idContratoEstado ^ (idContratoEstado >>> 32));
		_hashCode = 29 * _hashCode + (int) (idDetalleContrato ^ (idDetalleContrato >>> 32));
		_hashCode = 29 * _hashCode + (int) (idPresupuesto ^ (idPresupuesto >>> 32));
		_hashCode = 29 * _hashCode + (idPresupuestoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (idAbogado ^ (idAbogado >>> 32));
		_hashCode = 29 * _hashCode + (idAbogadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (idPlanPago ^ (idPlanPago >>> 32));
		_hashCode = 29 * _hashCode + (idPlanPagoNull ? 1 : 0);
		if (creado != null) {
			_hashCode = 29 * _hashCode + creado.hashCode();
		}
		
		if (modificado != null) {
			_hashCode = 29 * _hashCode + modificado.hashCode();
		}
		
		_hashCode = 29 * _hashCode + aprobadoAbogado;
		_hashCode = 29 * _hashCode + aprobadoCliente;
		_hashCode = 29 * _hashCode + (int) (idFormaPago ^ (idFormaPago >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ContratosPk
	 */
	public ContratosPk createPk()
	{
		return new ContratosPk(idContrato);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.Abogados.Lex.dto.Contratos: " );
		ret.append( "idContrato=" + idContrato );
		ret.append( ", fechaInicio=" + fechaInicio );
		ret.append( ", fechaTermino=" + fechaTermino );
		ret.append( ", idContratoEstado=" + idContratoEstado );
		ret.append( ", idDetalleContrato=" + idDetalleContrato );
		ret.append( ", idPresupuesto=" + idPresupuesto );
		ret.append( ", idAbogado=" + idAbogado );
		ret.append( ", idPlanPago=" + idPlanPago );
		ret.append( ", creado=" + creado );
		ret.append( ", modificado=" + modificado );
		ret.append( ", aprobadoAbogado=" + aprobadoAbogado );
		ret.append( ", aprobadoCliente=" + aprobadoCliente );
		ret.append( ", idFormaPago=" + idFormaPago );
		return ret.toString();
	}

}
