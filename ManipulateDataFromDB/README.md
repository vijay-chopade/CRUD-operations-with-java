# CRUD Operations

Hello Mr/Mrs. .............

About Project :
* > Technology : Java, Spring, JDBC, Spring-Boot 
* >> Type : This is a MVN { MAVEN } project { Inthis project i cover all types of CRUD operations }
* >>> CRUD (Create, Read, Update, Delete) is an acronym for ways one can operate on stored data.

Steps to run project :
  1. open cmd and create a new directory ==> $ mkdir crud
  2. ==> $ cd crud
  3. ==> $ git init
  4. ==> $ git clone <SVN URL (clone url)>
  5. ==> $ cd CRUD-Operations
  6. Now you see the " ManipulateDataFromDB " folder
  7. Open your file/computer/fileManager then go to serch-bar anst " ManipulateDataFromDB " this name
  8. after opned the address right click on " ManipulateDataFromDB " this folder and open your favorite IDE {Eclipse / VS Code / etc}
  9. Create a DataBase :
        * > i.    Open MYSQL shall/workbench/
        * > ii.   $ create schema demodb;
        * > iii.  $ use demodb;
        * > iv.   $ create table students(id int(5) auto_increment,fname varchar(20),lname varchar(30),marks int(3),city varchar(30),check(marks between 0 and 100),primary key (id));
        * > v.    $ alter table students auto_increment=435;
        * > vi.   $ insert into students (fname,lname,marks,city) values('vijay','chopade',70,'pune');
        
10. Now run the porgram in reguler form
11. goto the Browser and enter this URL " http://localhost:8080/getData " 
12. Tip :::::::: if you want to work on {Create, Update, Delete} then you need rest api Ex:- POSTMAN || Vijay Chopade
13. > - - - R - - - U - - - N - - - I - - - N - - - G 
