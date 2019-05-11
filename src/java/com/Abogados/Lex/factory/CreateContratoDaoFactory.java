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

public class CreateContratoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return CreateContratoDao
	 */
	public static CreateContratoDao create()
	{
		return new CreateContratoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return CreateContratoDao
	 */
	public static CreateContratoDao create(Connection conn)
	{
		return new CreateContratoDaoImpl( conn );
	}

}