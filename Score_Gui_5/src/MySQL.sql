create table score (
name varchar(20),
kor int,
eng int,
mat int,
tot int,
ave int
);

insert into score (kor,eng,mat,tot,ave) values "("+kor+","+eng+","+mat+","+tot+","+ave+")";

delete from score where	