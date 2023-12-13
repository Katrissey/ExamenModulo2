DROP TABLE IF EXISTS TB_PRODUCTOS;

CREATE TABLE TB_PRODUCTOS (
	id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
 	nombre varchar(20) not null,
 	tipo ENUM('Alimentación','Electrónica','Ropa') NOT NULL,
 	precio decimal (5,2) NOT NULL,
 	cantidadStock INTEGER NOT NULL
);

SELECT * FROM TB_PRODUCTOS
