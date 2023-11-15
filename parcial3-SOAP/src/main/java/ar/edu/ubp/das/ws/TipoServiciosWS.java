package ar.edu.ubp.das.ws;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.cxf.interceptor.Fault;

import ar.edu.ubp.das.beans.TipoServiciosBean;
import ar.edu.ubp.das.db.Dao;
import ar.edu.ubp.das.db.DaoFactory;


@WebService(targetNamespace = "http://ws.das.ubp.edu.ar/", portName = "TipoServiciosWSPort", serviceName = "TipoServiciosWSService")
@XmlSeeAlso({TipoServiciosBean.class})
public class TipoServiciosWS {
	
	@WebMethod(operationName = "getTipoServicios", action = "urn:getTipoServicios")
	@WebResult(name = "return")
	public List<TipoServiciosBean> getTipoServicios(){
		
		try(Dao<TipoServiciosBean, Void, Void> dao = DaoFactory.getDao("TipoServicios", "ar.edu.ubp.das")){
			return dao.select(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new Fault(e);
		}
		
	}
	
}
