CREATE TABLE segmento (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	codigo_aeronave BIGINT(20) NOT NULL,
	voo VARCHAR(10) NOT NULL,
	origem VARCHAR(20) NOT NULL,
	destino VARCHAR(20) NOT NULL,
	data_partida DATE NOT NULL,
	data_chegada DATE NOT NULL,
	piloto VARCHAR(20) NOT NULL,
	status VARCHAR(20) NOT NULL,
	FOREIGN KEY (codigo_aeronave) REFERENCES aeronave(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (1, '5250', 'SÃO PAULO', 'SALVADOR', '2017-09-01', '2017-09-01', 'Andre', 'ATRASADO');
INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (2, '3024', 'SALVADO', 'SÃO PAULO', '2017-09-01', '2017-09-01', 'Cassio', 'NO_HORARIO');
INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (3, '2580', 'SÃO PAULO', 'MIAMI', '2017-09-30', '2017-09-30', 'Andrea', 'NO_HORARIO');
INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (4, '6666', 'SÃO PAULO', 'SALVADOR', '2017-09-01', '2017-09-01', 'Lais', 'NO_HORARIO');
INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (5, '3547', 'GOIANIA', 'SALVADOR', '2017-11-15', '2017-11-15', 'Gustavo', 'CANCELADO');
INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (6, '9087', 'RIO DE JANEIRO', 'ROMA', '2017-12-20', '2017-12-20', 'Ramon', 'NO_HORARIO');
