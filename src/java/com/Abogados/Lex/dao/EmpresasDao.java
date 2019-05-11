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

public interface EmpresasDao
{
	/** 
	 * Inserts a new row in the EMPRESAS table.
	 */
	public EmpresasPk insert(Empresas dto) throws EmpresasDaoException;

	/** 
	 * Updates a single row in the EMPRESAS table.
	 */
	public void update(EmpresasPk pk, Empresas dto) throws EmpresasDaoException;

	/** 
	 * Deletes a single row in the EMPRESAS table.
	 */
	public void delete(EmpresasPk pk) throws EmpresasDaoException;

	/** 
	 * Returns the rows from the EMPRESAS table that matches the specified primary-key value.
	 */
	public Empresas findByPrimaryKey(EmpresasPk pk) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Empresas findByPrimaryKey(long idEmpresa) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria ''.
	 */
	public Empresas[] findAll() throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria 'ID_COMUNA = :idComuna'.
	 */
	public Empresas[] findByComuna(long idComuna) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Empresas[] findWhereIdEmpresaEquals(long idEmpresa) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Empresas[] findWhereNombreEquals(String nombre) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria 'RAZON_SOCIAL = :razonSocial'.
	 */
	public Empresas[] findWhereRazonSocialEquals(String razonSocial) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria 'DIRECCION = :direccion'.
	 */
	public Empresas[] findWhereDireccionEquals(String direccion) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria 'TELEFONO = :telefono'.
	 */
	public Empresas[] findWhereTelefonoEquals(long telefono) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria 'CREADO = :creado'.
	 */
	public Empresas[] findWhereCreadoEquals(Date creado) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria 'MODIFICADO = :modificado'.
	 */
	public Empresas[] findWhereModificadoEquals(Date modificado) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the criteria 'ID_COMUNA = :idComuna'.
	 */
	public Empresas[] findWhereIdComunaEquals(long idComuna) throws EmpresasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the EMPRESAS table that match the specified arbitrary SQL statement
	 */
	public Empresas[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpresasDaoException;

	/** 
	 * Returns all rows from the EMPRESAS table that match the specified arbitrary SQL statement
	 */
	public Empresas[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpresasDaoException;

}
