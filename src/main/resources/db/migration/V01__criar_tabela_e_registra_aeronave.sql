CREATE TABLE aeronave (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	numero VARCHAR(20) NOT NULL,
	capacidade INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO aeronave (numero, capacidade) VALUES (1, 55);
INSERT INTO aeronave (numero, capacidade) VALUES (2, 60);
INSERT INTO aeronave (numero, capacidade) VALUES (3, 70);
INSERT INTO aeronave (numero, capacidade) VALUES (4, 55);
INSERT INTO aeronave (numero, capacidade) VALUES (5, 80);
INSERT INTO aeronave (numero, capacidade) VALUES (6, 90);
