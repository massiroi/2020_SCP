namespace my;
entity Dept{
    key ID : Integer;
    NAME : String;
    CREATE_DATE : Date;
    Employee : Association to many Employee on Employee.Dept = $self;
}

entity Employee{
    key ID : Integer;
    NAME : String;
    SALARY : Integer;
    Dept : Association to Dept;
}