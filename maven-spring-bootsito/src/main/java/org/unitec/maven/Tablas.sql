CREATE TABLE tarjeta(id_tarjeta integer auto_increment PRIMARY KEY,nombre varchar(120),diaCorte integer);
 
CREATE TABLE gastos(id_gastos integer auto_increment PRIMARY KEY,id_tarjeta integer,
                     fecha date, concepto varchar(500), cantidad float,foreign key (id_tarjeta)references tarjeta(id_tarjeta) );
select * from tarjeta;
select * from gastos;
describe tarjeta;
describe gastos;