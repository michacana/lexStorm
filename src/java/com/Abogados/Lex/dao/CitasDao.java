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

public interface CitasDao
{
	/** 
	 * Inserts a new row in the CITAS table.
	 */
	public CitasPk insert(Citas dto) throws CitasDaoException;

	/** 
	 * Updates a single row in the CITAS table.
	 */
	public void update(CitasPk pk, Citas dto) throws CitasDaoException;

	/** 
	 * Deletes a single row in the CITAS table.
	 */
	public void delete(CitasPk pk) throws CitasDaoException;

	/** 
	 * Returns the rows from the CITAS table that matches the specified primary-key value.
	 */
	public Citas findByPrimaryKey(CitasPk pk) throws CitasDaoException;

	/** 
	 * Returns all rows from the CITAS table that match the criteria 'ID_CITA = :idCita'.
	 */
	public Citas findByPrimaryKey(long idCita) throws CitasDaoException;

	/** 
	 * Returns all rows from the CITAS table that match the criteria ''.
	 */
	public Citas[] findAll() throws CitasDaoException;

	/** 
	 * Returns all rows from the CITAS table that match the criteria 'ID_ESTADO_CITA = :idEstadoCita'.
	 */
	public Citas[] findByCitaEstados(long idEstadoCita) throws CitasDaoException;

	/** 
	 * Returns all rows from the CITAS table that match the criteria 'ID_NOTARIA = :idNotaria'.
	 */
	public Citas[] findByNotarias(long idNotaria) throws CitasDaoException;

	/** 
	 * Returns all rows from the CITAS table that match the criteria 'ID_CITA = :idCita'.
	 */
	public Citas[] findWhereIdCitaEquals(long idCita) throws CitasDaoException;

	/** 
	 * Returns all rows from the CITAS table that match the criteria 'FECHA_HORA = :fechaHora'.
	 */
	public Citas[] findWhereFechaHoraEquals(Date fechaHora) throws CitasDaoException;

	/** 
	 * Returns all rows from the CITAS table that match the criteria 'ID_NOTARIA = :idNotaria'.
	 */
	public Citas[] findWhereIdNotariaEquals(long idNotaria) throws CitasDaoException;

	/** 
	 * Returns all rows from the CITAS table that match the criteria 'ID_ESTADO_CITA = :idEstadoCita'.
	 */
	public Citas[] findWhereIdEstadoCitaEquals(long idEstadoCita) throws CitasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the CITAS table that match the specified arbitrary SQL statement
	 */
	public Citas[] findByDynamicSelect(String sql, Object[] sqlParams) throws CitasDaoException;

	/** 
	 * Returns all rows from the CITAS table that match the specified arbitrary SQL statement
	 */
	public Citas[] findByDynamicWhere(String sql, Object[] sqlParams) throws CitasDaoException;

}
