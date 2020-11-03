package customer.jhseok.handlers;

import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.sap.cds.services.cds.CdsService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;

import cds.gen.hrservice.HRservice_;
import cds.gen.hrservice.EmployeeSrv;
import cds.gen.hrservice.EmployeeSrv_;


@Component
@ServiceName(HRservice_.CDS_NAME)
public class HRserviceHandler implements EventHandler {


//@After : data가 조회된 후에 해당결과를 handling
// event : 조회event
// entity : HRservice.EmployeeSrv에 대하여

	@After(event = CdsService.EVENT_READ, entity = {EmployeeSrv_.CDS_NAME})
	public void highSalary(Stream<EmployeeSrv> Employees) {
        Employees.filter(b -> b.getName() != null && b.getSalary() != null)
        .filter(b -> b.getSalary() > 100)
        .forEach(b -> b.setName(b.getName() + " (High Salary)"));
	}

}