package cds.gen.hrservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("HRservice.DeptSrv")
public interface DeptSrv_ extends StructuredType<DeptSrv_> {
  String CDS_NAME = "HRservice.DeptSrv";

  ElementRef<LocalDate> CREATE_DATE();

  EmployeeSrv_ Employee();

  EmployeeSrv_ Employee(Function<EmployeeSrv_, CqnPredicate> filter);

  ElementRef<Integer> ID();

  ElementRef<String> NAME();
}
