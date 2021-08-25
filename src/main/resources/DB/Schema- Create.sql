CREATE DATABASE newsapi;
SET MODE PostgreSQL;

\c newsapi
CREATE TABLE  employees (
 id serial PRIMARY KEY,
name VARCHAR,
position VARCHAR,
role VARCHAR,
address VARCHAR
);
CREATE TABLE  news (
 id serial PRIMARY KEY,
 title VARCHAR,
 content VARCHAR,
 depaertmentid INT
);
CREATE TABLE  departments (
 id serial PRIMARY KEY,
 department VARCHAR,
 description VARCHAR,
 number_employees INT
);
/