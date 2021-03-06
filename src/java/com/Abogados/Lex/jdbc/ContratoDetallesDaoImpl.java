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

public class ContratoDetallesDaoImpl extends AbstractDAO implements ContratoDetallesDao
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
	protected final String SQL_SELECT = "SELECT ID_DETALLE_CONTRATO, SERVICIO, MONTO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_DETALLE_CONTRATO, SERVICIO, MONTO ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_DETALLE_CONTRATO = ?, SERVICIO = ?, MONTO = ? WHERE ID_DETALLE_CONTRATO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_DETALLE_CONTRATO = ?";

	/** 
	 * Index of column ID_DETALLE_CONTRATO
	 */
	protected static final int COLUMN_ID_DETALLE_CONTRATO = 1;

	/** 
	 * Index of column SERVICIO
	 */
	protected static final int COLUMN_SERVICIO = 2;

	/** 
	 * Index of column MONTO
	 */
	protected static final int COLUMN_MONTO = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column ID_DETALLE_CONTRATO
	 */
	protected static final int PK_COLUMN_ID_DETALLE_CONTRATO = 1;

	/** 
	 * Inserts a new row in the CONTRATO_DETALLES table.
	 */
	public ContratoDetallesPk insert(ContratoDetalles dto) throws ContratoDetallesDaoException
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
			stmt.setLong( index++, dto.getIdDetalleContrato() );
			stmt.setString( index++, dto.getServicio() );
			stmt.setLong( index++, dto.getMonto() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ContratoDetallesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the CONTRATO_DETALLES table.
	 */
	public void update(ContratoDetallesPk pk, ContratoDetalles dto) throws ContratoDetallesDaoException
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
			stmt.setLong( index++, dto.getIdDetalleContrato() );
			stmt.setString( index++, dto.getServicio() );
			stmt.setLong( index++, dto.getMonto() );
			stmt.setLong( 4, pk.getIdDetalleContrato() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ContratoDetallesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the CONTRATO_DETALLES table.
	 */
	public void delete(ContratoDetallesPk pk) throws ContratoDetallesDaoException
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
			stmt.setLong( 1, pk.getIdDetalleContrato() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ContratoDetallesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the CONTRATO_DETALLES table that matches the specified primary-key value.
	 */
	public ContratoDetalles findByPrimaryKey(ContratoDetallesPk pk) throws ContratoDetallesDaoException
	{
		return findByPrimaryKey( pk.getIdDetalleContrato() );
	}

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the criteria 'ID_DETALLE_CONTRATO = :idDetalleContrato'.
	 */
	public ContratoDetalles findByPrimaryKey(long idDetalleContrato) throws ContratoDetallesDaoException
	{
		ContratoDetalles ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_DETALLE_CONTRATO = ?", new Object[] {  new Long(idDetalleContrato) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the criteria ''.
	 */
	public ContratoDetalles[] findAll() throws ContratoDetallesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_DETALLE_CONTRATO", null );
	}

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the criteria 'ID_DETALLE_CONTRATO = :idDetalleContrato'.
	 */
	public ContratoDetalles[] findWhereIdDetalleContratoEquals(long idDetalleContrato) throws ContratoDetallesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_DETALLE_CONTRATO = ? ORDER BY ID_DETALLE_CONTRATO", new Object[] {  new Long(idDetalleContrato) } );
	}

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the criteria 'SERVICIO = :servicio'.
	 */
	public ContratoDetalles[] findWhereServicioEquals(String servicio) throws ContratoDetallesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SERVICIO = ? ORDER BY SERVICIO", new Object[] { servicio } );
	}

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the criteria 'MONTO = :monto'.
	 */
	public ContratoDetalles[] findWhereMontoEquals(long monto) throws ContratoDetallesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MONTO = ? ORDER BY MONTO", new Object[] {  new Long(monto) } );
	}

	/**
	 * Method 'ContratoDetallesDaoImpl'
	 * 
	 */
	public ContratoDetallesDaoImpl()
	{
	}

	/**
	 * Method 'ContratoDetallesDaoImpl'
	 * 
	 * @param userConn
	 */
	public ContratoDetallesDaoImpl(final java.sql.Connection userConn)
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
		return "LEX.CONTRATO_DETALLES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ContratoDetalles fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ContratoDetalles dto = new ContratoDetalles();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ContratoDetalles[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ContratoDetalles dto = new ContratoDetalles();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ContratoDetalles ret[] = new ContratoDetalles[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ContratoDetalles dto, ResultSet rs) throws SQLException
	{
		dto.setIdDetalleContrato( rs.getLong( COLUMN_ID_DETALLE_CONTRATO ) );
		dto.setServicio( rs.getString( COLUMN_SERVICIO ) );
		dto.setMonto( rs.getLong( COLUMN_MONTO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ContratoDetalles dto)
	{
	}

	/** 
	 * Returns all rows from the CONTRATO_DETALLES table that match the specified arbitrary SQL statement
	 */
	public ContratoDetalles[] findByDynamicSelect(String sql, Object[] sqlParams) throws ContratoDetallesDaoException
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
			throw new ContratoDetallesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the CONTRATO_DETALLES table that match the specified arbitrary SQL statement
	 */
	public ContratoDetalles[] findByDynamicWhere(String sql, Object[] sqlParams) throws ContratoDetallesDaoException
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
			throw new ContratoDetallesDaoException( "Exception: " + _e.getMessage(), _e );
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
