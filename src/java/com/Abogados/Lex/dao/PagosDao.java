/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.Abogados.Lex.dao;

import java.util.Date;
import com.Abogados.Lex.dto.*;
import com.Abogados.Lex.exceptions.*;

public interface PagosDao
{
	/** 
	 * Inserts a new row in the PAGOS table.
	 */
	public PagosPk insert(Pagos dto) throws PagosDaoException;

	/** 
	 * Updates a single row in the PAGOS table.
	 */
	public void update(PagosPk pk, Pagos dto) throws PagosDaoException;

	/** 
	 * Deletes a single row in the PAGOS table.
	 */
	public void delete(PagosPk pk) throws PagosDaoException;

	/** 
	 * Returns the rows from the PAGOS table that matches the specified primary-key value.
	 */
	public Pagos findByPrimaryKey(PagosPk pk) throws PagosDaoException;

	/** 
	 * Returns all rows from the PAGOS table that match the criteria 'ID_PAGO = :idPago'.
	 */
	public Pagos findByPrimaryKey(long idPago) throws PagosDaoException;

	/** 
	 * Returns all rows from the PAGOS table that match the criteria ''.
	 */
	public Pagos[] findAll() throws PagosDaoException;

	/** 
	 * Returns all rows from the PAGOS table that match the criteria 'ID_CONTRATO = :idContrato'.
	 */
	public Pagos[] findByContratos(long idContrato) throws PagosDaoException;

	/** 
	 * Returns all rows from the PAGOS table that match the criteria 'ID_PAGO = :idPago'.
	 */
	public Pagos[] findWhereIdPagoEquals(long idPago) throws PagosDaoException;

	/** 
	 * Returns all rows from the PAGOS table that match the criteria 'FECHA_HORA = :fechaHora'.
	 */
	public Pagos[] findWhereFechaHoraEquals(Date fechaHora) throws PagosDaoException;

	/** 
	 * Returns all rows from the PAGOS table that match the criteria 'MONTO = :monto'.
	 */
	public Pagos[] findWhereMontoEquals(long monto) throws PagosDaoException;

	/** 
	 * Returns all rows from the PAGOS table that match the criteria 'CREADO = :creado'.
	 */
	public Pagos[] findWhereCreadoEquals(Date creado) throws PagosDaoException;

	/** 
	 * Returns all rows from the PAGOS table that match the criteria 'MODIFICADO = :modificado'.
	 */
	public Pagos[] findWhereModificadoEquals(Date modificado) throws PagosDaoException;

	/** 
	 * Returns all rows from the PAGOS table that match the criteria 'ID_CONTRATO = :idContrato'.
	 */
	public Pagos[] findWhereIdContratoEquals(long idContrato) throws PagosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the PAGOS table that match the specified arbitrary SQL statement
	 */
	public Pagos[] findByDynamicSelect(String sql, Object[] sqlParams) throws PagosDaoException;

	/** 
	 * Returns all rows from the PAGOS table that match the specified arbitrary SQL statement
	 */
	public Pagos[] findByDynamicWhere(String sql, Object[] sqlParams) throws PagosDaoException;

}
