package ar.edu.ubp.das.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.edu.ubp.das.beans.TipoServiciosBean;
import ar.edu.ubp.das.db.Dao;

public class MSSQLTipoServiciosDao extends Dao<TipoServiciosBean, Void, Void>{



	@Override
	public TipoServiciosBean delete(Void arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoServiciosBean insert(Void arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoServiciosBean make(ResultSet result) throws SQLException {
		TipoServiciosBean tipoServicios= new TipoServiciosBean();
		tipoServicios.setTipoServicio(result.getString("tipoServicio"));
		tipoServicios.setCodTipoServicio(result.getString("codTipoServicio"));
		return tipoServicios;
	}

	@Override
	public List<TipoServiciosBean> select(Void arg0) throws SQLException {
		this.connect();
		this.setProcedure("dbo.get_tipos_servicios");
		return this.executeQuery();
	}


	@Override
	public TipoServiciosBean update(Void arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean valid(Void arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
