/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.Abogados.Lex.jdbc;

import com.Abogados.Lex.dao.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import com.Abogados.Lex.dto.*;
import com.Abogados.Lex.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class CreateCitasDaoImpl extends AbstractDAO implements CreateCitasDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/**
	 * Method 'CreateCitasDaoImpl'
	 * 
	 */
	public CreateCitasDaoImpl()
	{
	}

	/**
	 * Method 'CreateCitasDaoImpl'
	 * 
	 * @param userConn
	 */
	public CreateCitasDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/**
	 * Method 'execute'
	 * 
	 * @param param
	 * @throws CreateCitasDaoException
	 */
	public void execute(CreateCitasParam param) throws CreateCitasDaoException
	{
		// declare variables
		final boolean _isConnSupplied = (userConn != null);
		Connection _conn = null;
		CallableStatement _stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			_conn = _isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// create a CallableStatement
			_stmt = _conn.prepareCall( "{call LEX.PKG_CITAS.CREATE_CITAS(?, ?, ?, ?, ?)}" );
		
			_stmt.setLong( 1, param.getVIdCita() );
			_stmt.setDate(2, param.getVFechaHora()==null ? null : new java.sql.Date( param.getVFechaHora().getTime() ) );
			_stmt.setLong( 3, param.getVIdNotaria() );
			_stmt.setLong( 4, param.getVIdEstadoCita() );
			_stmt.registerOutParameter( 5, java.sql.Types.NUMERIC);
			_stmt.execute();
			param.setVSalida( _stmt.getInt( 5 ) );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CreateCitasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(_stmt);
			if (!_isConnSupplied) {
				ResourceManager.close(_conn);
			}
		
		}
		
	}

}
