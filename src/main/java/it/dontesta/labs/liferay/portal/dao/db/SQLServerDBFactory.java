package it.dontesta.labs.liferay.portal.dao.db;

import com.liferay.portal.kernel.dao.db.BaseDBFactory;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBType;

/**
 * @author Antonio Musarra
 */
 public class SQLServerDBFactory extends BaseDBFactory {

 	@Override
 	public DB doCreate(int dbMajorVersion, int dbMinorVersion) {
 		return new SQLServerDB(dbMajorVersion, dbMinorVersion);
 	}

 	@Override
 	public DBType getDBType() {
 		return DBType.SQLSERVER;
 	}

 }
