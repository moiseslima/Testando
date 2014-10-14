CREATE TABLE bairro
(
  codigo serial NOT NULL,
   nome character varying(40),
  CONSTRAINT chave_pk_bairro PRIMARY KEY (codigo)
)