/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.Abogados.Lex.factory;

import java.sql.Connection;
import com.Abogados.Lex.dao.*;
import com.Abogados.Lex.jdbc.*;

public class EmpresaClientesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EmpresaClientesDao
	 */
	public static EmpresaClientesDao create()
	{
		return new EmpresaClientesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EmpresaClientesDao
	 */
	public static EmpresaClientesDao create(Connection conn)
	{
		return new EmpresaClientesDaoImpl( conn );
	}

}