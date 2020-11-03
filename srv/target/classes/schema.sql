DROP VIEW IF EXISTS CatalogService_Books;
DROP VIEW IF EXISTS HRservice_DeptSrv;
DROP VIEW IF EXISTS HRservice_EmployeeSrv;

DROP TABLE IF EXISTS my_Dept;
DROP TABLE IF EXISTS my_Employee;
DROP TABLE IF EXISTS my_bookshop_Books;

CREATE TABLE my_Dept (
  ID INTEGER NOT NULL,
  NAME NVARCHAR(5000),
  CREATE_DATE DATE,
  PRIMARY KEY(ID)
);

CREATE TABLE my_Employee (
  ID INTEGER NOT NULL,
  NAME NVARCHAR(5000),
  SALARY INTEGER,
  Dept_ID INTEGER,
  PRIMARY KEY(ID)
);

CREATE TABLE my_bookshop_Books (
  ID INTEGER NOT NULL,
  title NVARCHAR(5000),
  stock INTEGER,
  PRIMARY KEY(ID)
);

CREATE VIEW CatalogService_Books AS SELECT
  Books_0.ID,
  Books_0.title,
  Books_0.stock
FROM my_bookshop_Books AS Books_0;

CREATE VIEW HRservice_DeptSrv AS SELECT
  Dept_0.ID,
  Dept_0.NAME,
  Dept_0.CREATE_DATE
FROM my_Dept AS Dept_0;

CREATE VIEW HRservice_EmployeeSrv AS SELECT
  Employee_0.ID,
  Employee_0.NAME,
  Employee_0.SALARY,
  Employee_0.Dept_ID
FROM my_Employee AS Employee_0;

