package cds.gen.my;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;

@CdsName("my.Employee")
public interface Employee extends CdsData {
  String SALARY = "SALARY";

  String DEPT_ID = "Dept_ID";

  String DEPT = "Dept";

  String ID = "ID";

  String NAME = "NAME";

  @CdsName(SALARY)
  Integer getSalary();

  @CdsName(SALARY)
  void setSalary(Integer salary);

  @CdsName(DEPT_ID)
  Integer getDeptId();

  @CdsName(DEPT_ID)
  void setDeptId(Integer deptId);

  @CdsName(DEPT)
  Dept getDept();

  @CdsName(DEPT)
  void setDept(Map<String, ?> dept);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  @CdsName(NAME)
  String getName();

  @CdsName(NAME)
  void setName(String name);

  static Employee create() {
    return Struct.create(Employee.class);
  }
}
