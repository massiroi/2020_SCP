using { my} from '../db/dept-emp';
service HRservice{
    entity DeptSrv as projection on my.Dept;
    entity EmployeeSrv as select from my.Employee{*};
}