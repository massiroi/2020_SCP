package cds.gen.hrservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("HRservice")
public interface HRservice_ {
  String CDS_NAME = "HRservice";

  Class<DeptSrv_> DEPT_SRV = DeptSrv_.class;

  Class<EmployeeSrv_> EMPLOYEE_SRV = EmployeeSrv_.class;
}
