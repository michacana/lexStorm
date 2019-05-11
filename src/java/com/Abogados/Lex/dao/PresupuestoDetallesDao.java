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

public interface PresupuestoDetallesDao
{
	/** 
	 * Inserts a new row in the PRESUPUESTO_DETALLES table.
	 */
	public PresupuestoDetallesPk insert(PresupuestoDetalles dto) throws PresupuestoDetallesDaoException;

	/** 
	 * Updates a single row in the PRESUPUESTO_DETALLES table.
	 */
	public void update(PresupuestoDetallesPk pk, PresupuestoDetalles dto) throws PresupuestoDetallesDaoException;

	/** 
	 * Deletes a single row in the PRESUPUESTO_DETALLES table.
	 */
	public void delete(PresupuestoDetallesPk pk) throws PresupuestoDetallesDaoException;

	/** 
	 * Returns the rows from the PRESUPUESTO_DETALLES table that matches the specified primary-key value.
	 */
	public PresupuestoDetalles findByPrimaryKey(PresupuestoDetallesPk pk) throws PresupuestoDetallesDaoException;

	/** 
	 * Returns all rows from the PRESUPUESTO_DETALLES table that match the criteria 'ID_DETALLE_PRESUPUESTO = :idDetallePresupuesto'.
	 */
	public PresupuestoDetalles findByPrimaryKey(long idDetallePresupuesto) throws PresupuestoDetallesDaoException;

	/** 
	 * Returns all rows from the PRESUPUESTO_DETALLES table that match the criteria ''.
	 */
	public PresupuestoDetalles[] findAll() throws PresupuestoDetallesDaoException;

	/** 
	 * Returns all rows from the PRESUPUESTO_DETALLES table that match the criteria 'ID_DETALLE_PRESUPUESTO = :idDetallePresupuesto'.
	 */
	public PresupuestoDetalles[] findWhereIdDetallePresupuestoEquals(long idDetallePresupuesto) throws PresupuestoDetallesDaoException;

	/** 
	 * Returns all rows from the PRESUPUESTO_DETALLES table that match the criteria 'SERVICIO = :servicio'.
	 */
	public PresupuestoDetalles[] findWhereServicioEquals(String servicio) throws PresupuestoDetallesDaoException;

	/** 
	 * Returns all rows from the PRESUPUESTO_DETALLES table that match the criteria 'MONTO = :monto'.
	 */
	public PresupuestoDetalles[] findWhereMontoEquals(long monto) throws PresupuestoDetallesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the PRESUPUESTO_DETALLES table that match the specified arbitrary SQL statement
	 */
	public PresupuestoDetalles[] findByDynamicSelect(String sql, Object[] sqlParams) throws PresupuestoDetallesDaoException;

	/** 
	 * Returns all rows from the PRESUPUESTO_DETALLES table that match the specified arbitrary SQL statement
	 */
	public PresupuestoDetalles[] findByDynamicWhere(String sql, Object[] sqlParams) throws PresupuestoDetallesDaoException;

}
