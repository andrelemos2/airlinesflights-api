CREATE TABLE segmento (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	codigo_aeronave BIGINT(20) NOT NULL,
	voo VARCHAR(10) NOT NULL,
	origem VARCHAR(20) NOT NULL,
	destino VARCHAR(20) NOT NULL,
	data_partida TIMESTAMP NOT NULL,
	data_chegada TIMESTAMP NOT NULL,
	piloto VARCHAR(20) NOT NULL,
	status VARCHAR(20) NOT NULL,
	FOREIGN KEY (codigo_aeronave) REFERENCES aeronave(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (1, '5250', 'SÃO PAULO', 'SALVADOR', now(), now()+1, 'Andre', 'ATRASADO');
INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (2, '3024', 'SALVADOR', 'SÃO PAULO', now()+2, now()+5, 'Cassio', 'NO_HORARIO');
INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (3, '2580', 'SÃO PAULO', 'MIAMI', now()+5, now()+10, 'Andrea', 'NO_HORARIO');
INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (4, '6666', 'SÃO PAULO', 'SALVADOR', now()+10, now()+12, 'Lais', 'NO_HORARIO');
INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (5, '3547', 'GOIANIA', 'SALVADOR', now()+12, now()+14, 'Gustavo', 'CANCELADO');
INSERT INTO segmento (codigo_aeronave, voo, origem, destino, data_partida, data_chegada, piloto, status) VALUES (6, '9087', 'RIO DE JANEIRO', 'ROMA', now()+15, now()+20, 'Ramon', 'NO_HORARIO');
