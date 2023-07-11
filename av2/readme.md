***DIVISÃO DE PASTAS***
controle - Responsável pela inserção dos dados recebidos na label no banco de dados
dominio - responsável pelas conexões do BD e do script 
view - Responsável pela amostragem das telas do sistema

*******************************************************************************************

SCRIPTS PARA CRIAÇÃO DO BANCO

-- Database: escola

-- DROP DATABASE escola;

CREATE DATABASE escola
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;
 ==============================================================================================

CRIAÇÃO DA TABELA ALUNO
 
 -- Table: public.aluno

-- DROP TABLE public.aluno;

CREATE TABLE public.aluno
(
  nome character varying(255),
  turma integer,
  idade integer,
  media integer,
  id_aluno integer NOT NULL DEFAULT nextval('aluno_id_aluno_seq'::regclass),
  CONSTRAINT id_aluno PRIMARY KEY (id_aluno)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.aluno
  OWNER TO postgres;

