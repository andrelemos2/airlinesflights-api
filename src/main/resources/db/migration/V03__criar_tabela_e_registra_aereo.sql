CREATE TABLE aereo (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	codigo_segmento BIGINT(20) NOT NULL,
	cia_aerea VARCHAR(20) NOT NULL,
	FOREIGN KEY (codigo_segmento) REFERENCES segmento(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO aereo (codigo_segmento, cia_aerea) VALUES (1, 'LATAM');
INSERT INTO aereo (codigo_segmento, cia_aerea) VALUES (2, 'GOL');
INSERT INTO aereo (codigo_segmento, cia_aerea) VALUES (3, 'AZUL');
INSERT INTO aereo (codigo_segmento, cia_aerea) VALUES (4, 'AVIANCA');
INSERT INTO aereo (codigo_segmento, cia_aerea) VALUES (5, 'PASSAREDO');