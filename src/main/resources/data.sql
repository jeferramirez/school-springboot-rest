
--colegio
insert into colegios values (1, 'cra 24d 42a 33 ', SYSDATE , 'El colegio del Olimpo',  SYSDATE);

--estudiantes
insert into Estudiante values (1, SYSDATE, 'Afrodita', SYSDATE);
insert into Estudiante values (2, SYSDATE, 'Apolo', SYSDATE);
insert into Estudiante values (3, SYSDATE, 'Ares', SYSDATE);
insert into Estudiante values (4, SYSDATE, 'Artemisa', SYSDATE);
insert into Estudiante values (5, SYSDATE, 'Atenea', SYSDATE);
insert into Estudiante values (6, SYSDATE,'Dionisio', SYSDATE);
insert into Estudiante values (7, SYSDATE, 'Hefesto', SYSDATE);
insert into Estudiante values (8, SYSDATE, 'Hera', SYSDATE);
insert into Estudiante values (9, SYSDATE, 'Hermes', SYSDATE);
insert into Estudiante values (10, SYSDATE, 'Hades', SYSDATE);
insert into Estudiante values (11,SYSDATE, 'Poseidon', SYSDATE);
insert into Estudiante values (12, SYSDATE, 'Zeus', SYSDATE);

--profesores
insert into profesor values (1, SYSDATE, 'Némesis', SYSDATE);
insert into profesor values (2, SYSDATE, 'Príapo', SYSDATE);
insert into profesor values (3, SYSDATE, 'Iris', SYSDATE);


--cursos
insert into cursos values (1, SYSDATE, '10', 'A', SYSDATE, 1);
insert into cursos values (2, SYSDATE, '10', 'B', SYSDATE, 1);
insert into cursos values (3, SYSDATE, '11', 'A', SYSDATE, 1);
insert into cursos values (4, SYSDATE, '11', 'B', SYSDATE, 1);


--asignaturas
insert into Asignaturas values (1,SYSDATE, 'Matemáticas',SYSDATE, 1,1);
insert into Asignaturas values (2,SYSDATE, 'Matemáticas',SYSDATE, 2,1);
insert into Asignaturas values (3,SYSDATE, 'Matemáticas',SYSDATE, 3,1);
insert into Asignaturas values (4,SYSDATE,'Matemáticas',SYSDATE,4,1);
insert into Asignaturas values (5,SYSDATE,'Español',SYSDATE,1,2);
insert into Asignaturas values (6,SYSDATE,'Español',SYSDATE,2,2);
insert into Asignaturas values (7,SYSDATE, 'Ingles Básico',SYSDATE, 1,3);
insert into Asignaturas values (8,SYSDATE, 'Ingles Avanzado',SYSDATE,2,3);
insert into Asignaturas values (9,SYSDATE,'Pre Icfes',SYSDATE,3,1);
insert into Asignaturas values (10,SYSDATE,'Pre Icfes',SYSDATE,4,1);



--estudiantes_asignaturas
insert into Estudiante_asignaturas values(1,1);
insert into Estudiante_asignaturas values(1,2);
insert into Estudiante_asignaturas values(1,3);
insert into Estudiante_asignaturas values(5,1);
insert into Estudiante_asignaturas values(5,2);
insert into Estudiante_asignaturas values(5,3);
insert into Estudiante_asignaturas values(7,1);
insert into Estudiante_asignaturas values(7,2);
insert into Estudiante_asignaturas values(7,3);

insert into Estudiante_asignaturas values(2,4);
insert into Estudiante_asignaturas values(2,5);
insert into Estudiante_asignaturas values(2,6);
insert into Estudiante_asignaturas values(6,4);
insert into Estudiante_asignaturas values(6,5);
insert into Estudiante_asignaturas values(6,6);
insert into Estudiante_asignaturas values(8,4);
insert into Estudiante_asignaturas values(8,5);
insert into Estudiante_asignaturas values(8,6);

insert into Estudiante_asignaturas values(3,7);
insert into Estudiante_asignaturas values(3,8);
insert into Estudiante_asignaturas values(9,7);
insert into Estudiante_asignaturas values(9,8);

insert into Estudiante_asignaturas values(4,9);
insert into Estudiante_asignaturas values(4,10);
insert into Estudiante_asignaturas values(4,11);
insert into Estudiante_asignaturas values(4,12);
insert into Estudiante_asignaturas values(10,9);
insert into Estudiante_asignaturas values(10,10);
insert into Estudiante_asignaturas values(10,11);
insert into Estudiante_asignaturas values(10,12);


