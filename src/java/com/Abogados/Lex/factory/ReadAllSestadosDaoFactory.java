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

public class ReadAllSestadosDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ReadAllSestadosDao
	 */
	public static ReadAllSestadosDao create()
	{
		return new ReadAllSestadosDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ReadAllSestadosDao
	 */
	public static ReadAllSestadosDao create(Connection conn)
	{
		return new ReadAllSestadosDaoImpl( conn );
	}

}
