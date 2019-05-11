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
import com.Abogados.Lex.dto.*;
import com.Abogados.Lex.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import oracle.jdbc.OracleTypes;

public class ReadContratoEstadoDaoImpl extends AbstractDAO implements ReadContratoEstadoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/**
	 * Method 'ReadContratoEstadoDaoImpl'
	 * 
	 */
	public ReadContratoEstadoDaoImpl()
	{
	}

	/**
	 * Method 'ReadContratoEstadoDaoImpl'
	 * 
	 * @param userConn
	 */
	public ReadContratoEstadoDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/**
	 * Method 'execute'
	 * 
	 * @param param
	 * @throws ReadContratoEstadoDaoException
	 */
	public void execute(ReadContratoEstadoParam param) throws ReadContratoEstadoDaoException
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
			_stmt = _conn.prepareCall( "{call LEX.PKG_CONTRATOS.READ_CONTRATO_ESTADO(?, ?)}" );
		
			_stmt.setLong( 1, param.getVCestado() );
			_stmt.registerOutParameter(2, OracleTypes.CURSOR);
			_stmt.execute();
			// Fetch refcursor type
			ResultSet resultSetCursorContrato = (ResultSet) _stmt.getObject(2);
			while (resultSetCursorContrato.next()) {
				ReadContratoEstadoParam.CursorContrato dto = param.createCursorContrato();
				param.getCursorContratoList().add( dto );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ReadContratoEstadoDaoException( "Exception: " + _e.getMessage(), _e );
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
