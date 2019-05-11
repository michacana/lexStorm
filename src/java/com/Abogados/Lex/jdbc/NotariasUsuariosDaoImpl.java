/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.Abogados.Lex.jdbc;

import com.Abogados.Lex.dao.*;
import com.Abogados.Lex.factory.*;
import com.Abogados.Lex.dto.*;
import com.Abogados.Lex.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class NotariasUsuariosDaoImpl extends AbstractDAO implements NotariasUsuariosDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT ID_NOTARIA, ID_USUARIO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_NOTARIA, ID_USUARIO ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_NOTARIA = ?, ID_USUARIO = ? WHERE ID_NOTARIA = ? AND ID_USUARIO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_NOTARIA = ? AND ID_USUARIO = ?";

	/** 
	 * Index of column ID_NOTARIA
	 */
	protected static final int COLUMN_ID_NOTARIA = 1;

	/** 
	 * Index of column ID_USUARIO
	 */
	protected static final int COLUMN_ID_USUARIO = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column ID_NOTARIA
	 */
	protected static final int PK_COLUMN_ID_NOTARIA = 1;

	/** 
	 * Index of primary-key column ID_USUARIO
	 */
	protected static final int PK_COLUMN_ID_USUARIO = 2;

	/** 
	 * Inserts a new row in the NOTARIAS_USUARIOS table.
	 */
	public NotariasUsuariosPk insert(NotariasUsuarios dto) throws NotariasUsuariosDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setLong( index++, dto.getIdNotaria() );
			stmt.setLong( index++, dto.getIdUsuario() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NotariasUsuariosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the NOTARIAS_USUARIOS table.
	 */
	public void update(NotariasUsuariosPk pk, NotariasUsuarios dto) throws NotariasUsuariosDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setLong( index++, dto.getIdNotaria() );
			stmt.setLong( index++, dto.getIdUsuario() );
			stmt.setLong( 3, pk.getIdNotaria() );
			stmt.setLong( 4, pk.getIdUsuario() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NotariasUsuariosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the NOTARIAS_USUARIOS table.
	 */
	public void delete(NotariasUsuariosPk pk) throws NotariasUsuariosDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setLong( 1, pk.getIdNotaria() );
			stmt.setLong( 2, pk.getIdUsuario() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NotariasUsuariosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the NOTARIAS_USUARIOS table that matches the specified primary-key value.
	 */
	public NotariasUsuarios findByPrimaryKey(NotariasUsuariosPk pk) throws NotariasUsuariosDaoException
	{
		return findByPrimaryKey( pk.getIdNotaria(), pk.getIdUsuario() );
	}

	/** 
	 * Returns all rows from the NOTARIAS_USUARIOS table that match the criteria 'ID_NOTARIA = :idNotaria AND ID_USUARIO = :idUsuario'.
	 */
	public NotariasUsuarios findByPrimaryKey(long idNotaria, long idUsuario) throws NotariasUsuariosDaoException
	{
		NotariasUsuarios ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_NOTARIA = ? AND ID_USUARIO = ?", new Object[] {  new Long(idNotaria),  new Long(idUsuario) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the NOTARIAS_USUARIOS table that match the criteria ''.
	 */
	public NotariasUsuarios[] findAll() throws NotariasUsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_NOTARIA, ID_USUARIO", null );
	}

	/** 
	 * Returns all rows from the NOTARIAS_USUARIOS table that match the criteria 'ID_NOTARIA = :idNotaria'.
	 */
	public NotariasUsuarios[] findByNotarias(long idNotaria) throws NotariasUsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_NOTARIA = ?", new Object[] {  new Long(idNotaria) } );
	}

	/** 
	 * Returns all rows from the NOTARIAS_USUARIOS table that match the criteria 'ID_USUARIO = :idUsuario'.
	 */
	public NotariasUsuarios[] findByUsuarios(long idUsuario) throws NotariasUsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO = ?", new Object[] {  new Long(idUsuario) } );
	}

	/** 
	 * Returns all rows from the NOTARIAS_USUARIOS table that match the criteria 'ID_NOTARIA = :idNotaria'.
	 */
	public NotariasUsuarios[] findWhereIdNotariaEquals(long idNotaria) throws NotariasUsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_NOTARIA = ? ORDER BY ID_NOTARIA", new Object[] {  new Long(idNotaria) } );
	}

	/** 
	 * Returns all rows from the NOTARIAS_USUARIOS table that match the criteria 'ID_USUARIO = :idUsuario'.
	 */
	public NotariasUsuarios[] findWhereIdUsuarioEquals(long idUsuario) throws NotariasUsuariosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO = ? ORDER BY ID_USUARIO", new Object[] {  new Long(idUsuario) } );
	}

	/**
	 * Method 'NotariasUsuariosDaoImpl'
	 * 
	 */
	public NotariasUsuariosDaoImpl()
	{
	}

	/**
	 * Method 'NotariasUsuariosDaoImpl'
	 * 
	 * @param userConn
	 */
	public NotariasUsuariosDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "LEX.NOTARIAS_USUARIOS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected NotariasUsuarios fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			NotariasUsuarios dto = new NotariasUsuarios();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected NotariasUsuarios[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			NotariasUsuarios dto = new NotariasUsuarios();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		NotariasUsuarios ret[] = new NotariasUsuarios[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(NotariasUsuarios dto, ResultSet rs) throws SQLException
	{
		dto.setIdNotaria( rs.getLong( COLUMN_ID_NOTARIA ) );
		dto.setIdUsuario( rs.getLong( COLUMN_ID_USUARIO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(NotariasUsuarios dto)
	{
	}

	/** 
	 * Returns all rows from the NOTARIAS_USUARIOS table that match the specified arbitrary SQL statement
	 */
	public NotariasUsuarios[] findByDynamicSelect(String sql, Object[] sqlParams) throws NotariasUsuariosDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NotariasUsuariosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the NOTARIAS_USUARIOS table that match the specified arbitrary SQL statement
	 */
	public NotariasUsuarios[] findByDynamicWhere(String sql, Object[] sqlParams) throws NotariasUsuariosDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NotariasUsuariosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
