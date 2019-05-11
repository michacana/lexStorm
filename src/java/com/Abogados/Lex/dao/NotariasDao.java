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

public interface NotariasDao
{
	/** 
	 * Inserts a new row in the NOTARIAS table.
	 */
	public NotariasPk insert(Notarias dto) throws NotariasDaoException;

	/** 
	 * Updates a single row in the NOTARIAS table.
	 */
	public void update(NotariasPk pk, Notarias dto) throws NotariasDaoException;

	/** 
	 * Deletes a single row in the NOTARIAS table.
	 */
	public void delete(NotariasPk pk) throws NotariasDaoException;

	/** 
	 * Returns the rows from the NOTARIAS table that matches the specified primary-key value.
	 */
	public Notarias findByPrimaryKey(NotariasPk pk) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria 'ID_NOTARIA = :idNotaria'.
	 */
	public Notarias findByPrimaryKey(long idNotaria) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria ''.
	 */
	public Notarias[] findAll() throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria 'ID_COMUNA = :idComuna'.
	 */
	public Notarias[] findByComuna(long idComuna) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria 'ID_NOTARIA = :idNotaria'.
	 */
	public Notarias[] findWhereIdNotariaEquals(long idNotaria) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Notarias[] findWhereNombreEquals(String nombre) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria 'RAZON_SOCIAL = :razonSocial'.
	 */
	public Notarias[] findWhereRazonSocialEquals(String razonSocial) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria 'DIRECCION = :direccion'.
	 */
	public Notarias[] findWhereDireccionEquals(String direccion) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria 'TELEFONO = :telefono'.
	 */
	public Notarias[] findWhereTelefonoEquals(long telefono) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria 'ID_COMUNA = :idComuna'.
	 */
	public Notarias[] findWhereIdComunaEquals(long idComuna) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria 'CREADO = :creado'.
	 */
	public Notarias[] findWhereCreadoEquals(Date creado) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the criteria 'MODIFICADO = :modificado'.
	 */
	public Notarias[] findWhereModificadoEquals(Date modificado) throws NotariasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the NOTARIAS table that match the specified arbitrary SQL statement
	 */
	public Notarias[] findByDynamicSelect(String sql, Object[] sqlParams) throws NotariasDaoException;

	/** 
	 * Returns all rows from the NOTARIAS table that match the specified arbitrary SQL statement
	 */
	public Notarias[] findByDynamicWhere(String sql, Object[] sqlParams) throws NotariasDaoException;

}
