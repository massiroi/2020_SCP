package cds.gen.my;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("my.Dept")
public interface Dept extends CdsData {
  String CREATE_DATE = "CREATE_DATE";

  String EMPLOYEE = "Employee";

  String ID = "ID";

  String NAME = "NAME";

  @CdsName(CREATE_DATE)
  LocalDate getCreateDate();

  @CdsName(CREATE_DATE)
  void setCreateDate(LocalDate createDate);

  @CdsName(EMPLOYEE)
  List<Employee> getEmployee();

  @CdsName(EMPLOYEE)
  void setEmployee(List<? extends Map<String, ?>> employee);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  @CdsName(NAME)
  String getName();

  @CdsName(NAME)
  void setName(String name);

  static Dept create() {
    return Struct.create(Dept.class);
  }
}
