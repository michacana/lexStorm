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

public interface EmpresaClientesDao
{
	/** 
	 * Inserts a new row in the EMPRESA_CLIENTES table.
	 */
	public EmpresaClientesPk insert(EmpresaClientes dto) throws EmpresaClientesDaoException;

	/** 
	 * Updates a single row in the EMPRESA_CLIENTES table.
	 */
	public void update(EmpresaClientesPk pk, EmpresaClientes dto) throws EmpresaClientesDaoException;

	/** 
	 * Deletes a single row in the EMPRESA_CLIENTES table.
	 */
	public void delete(EmpresaClientesPk pk) throws EmpresaClientesDaoException;

	/** 
	 * Returns the rows from the EMPRESA_CLIENTES table that matches the specified primary-key value.
	 */
	public EmpresaClientes findByPrimaryKey(EmpresaClientesPk pk) throws EmpresaClientesDaoException;

	/** 
	 * Returns all rows from the EMPRESA_CLIENTES table that match the criteria 'ID_EMPRESA = :idEmpresa AND ID_USUARIO = :idUsuario'.
	 */
	public EmpresaClientes findByPrimaryKey(long idEmpresa, long idUsuario) throws EmpresaClientesDaoException;

	/** 
	 * Returns all rows from the EMPRESA_CLIENTES table that match the criteria ''.
	 */
	public EmpresaClientes[] findAll() throws EmpresaClientesDaoException;

	/** 
	 * Returns all rows from the EMPRESA_CLIENTES table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public EmpresaClientes[] findByEmpresas(long idEmpresa) throws EmpresaClientesDaoException;

	/** 
	 * Returns all rows from the EMPRESA_CLIENTES table that match the criteria 'ID_USUARIO = :idUsuario'.
	 */
	public EmpresaClientes[] findByUsuarios(long idUsuario) throws EmpresaClientesDaoException;

	/** 
	 * Returns all rows from the EMPRESA_CLIENTES table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public EmpresaClientes[] findWhereIdEmpresaEquals(long idEmpresa) throws EmpresaClientesDaoException;

	/** 
	 * Returns all rows from the EMPRESA_CLIENTES table that match the criteria 'ID_USUARIO = :idUsuario'.
	 */
	public EmpresaClientes[] findWhereIdUsuarioEquals(long idUsuario) throws EmpresaClientesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the EMPRESA_CLIENTES table that match the specified arbitrary SQL statement
	 */
	public EmpresaClientes[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpresaClientesDaoException;

	/** 
	 * Returns all rows from the EMPRESA_CLIENTES table that match the specified arbitrary SQL statement
	 */
	public EmpresaClientes[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpresaClientesDaoException;

}
