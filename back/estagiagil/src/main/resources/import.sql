INSERT INTO coordenadores(id, nome, email, area) VALUES (2017202502, 'Frodo', 'anel@gmail.com', 'hobbit');
INSERT INTO coordenadores(id, nome, email, area) VALUES (2017202501, 'Sam', 'lembas@gmail.com', 'hobbit');

INSERT INTO alunos(id, nome, email, estagiando, periodo, status_aluno) VALUES (2020111052, 'Wes', 'wessan@gmail.com', false, 5, 'Buscando estágio');
INSERT INTO alunos(id, nome, email, estagiando, periodo, status_aluno, coordenador_id) VALUES (2020111051, 'Sew', 'wessew@gmail.com', true, 5, 'Buscando estágio', 2017202502);

INSERT INTO vagas(id, requisito, descricao) VALUES (1, 'OO, C#, .NET,Scrum','ESTÁGIO EM DESENVOLVIMENTO DE SOFTWARE - AVANADE');
INSERT INTO vagas(id, requisito, descricao) VALUES (2, 'Scrum, Kanban, SQL Server, Pacote Office, Quinto período ou superior.','ESTÁGIO EM GESTÃO DE PROJETOS - AVANADE');
