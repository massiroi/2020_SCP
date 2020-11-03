package cds.gen.hrservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("HRservice.EmployeeSrv")
public interface EmployeeSrv_ extends StructuredType<EmployeeSrv_> {
  String CDS_NAME = "HRservice.EmployeeSrv";

  ElementRef<Integer> SALARY();

  ElementRef<Integer> Dept_ID();

  DeptSrv_ Dept();

  DeptSrv_ Dept(Function<DeptSrv_, CqnPredicate> filter);

  ElementRef<Integer> ID();

  ElementRef<String> NAME();
}
