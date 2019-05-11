/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.Abogados.Lex.dao;

import com.Abogados.Lex.dto.*;
import com.Abogados.Lex.exceptions.*;

public interface ContratoDetallesDao
{
	/** 
	 * Inserts a new row in the CONTRATO_DETALLES table.
	 */
	public ContratoDetallesPk insert(ContratoDetalles dto) throws ContratoDetallesDaoException;

	/** 
	 * Updates a single row in the CONTRATO_DETALLES table.
	 */
	public void update(ContratoDetallesPk pk, ContratoDetalles dto) throws ContratoDetallesDaoException;

	/** 
	 * Deletes a single row in the CONTRATO_DETALLES table.
	 */
	public void delete(ContratoDetallesPk pk) throws ContratoDetallesDaoException;

	/** 
	 * Returns the rows from the CONTRATO_DETALLES table that matches the specified primary-key value.
	 */
	public ContratoDetalles findByPrimaryKey(ContratoDetallesPk pk) throws ContratoDetallesDaoException;

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the criteria 'ID_DETALLE_CONTRATO = :idDetalleContrato'.
	 */
	public ContratoDetalles findByPrimaryKey(long idDetalleContrato) throws ContratoDetallesDaoException;

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the criteria ''.
	 */
	public ContratoDetalles[] findAll() throws ContratoDetallesDaoException;

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the criteria 'ID_DETALLE_CONTRATO = :idDetalleContrato'.
	 */
	public ContratoDetalles[] findWhereIdDetalleContratoEquals(long idDetalleContrato) throws ContratoDetallesDaoException;

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the criteria 'SERVICIO = :servicio'.
	 */
	public ContratoDetalles[] findWhereServicioEquals(String servicio) throws ContratoDetallesDaoException;

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the criteria 'MONTO = :monto'.
	 */
	public ContratoDetalles[] findWhereMontoEquals(long monto) throws ContratoDetallesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the specified arbitrary SQL statement
	 */
	public ContratoDetalles[] findByDynamicSelect(String sql, Object[] sqlParams) throws ContratoDetallesDaoException;

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the specified arbitrary SQL statement
	 */
	public ContratoDetalles[] findByDynamicWhere(String sql, Object[] sqlParams) throws ContratoDetallesDaoException;

}
