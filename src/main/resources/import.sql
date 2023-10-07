-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

INSERT INTO produto (nome, descricao, qtdNoEstoque, preco, valor)
VALUES
    ('Narguilé MasterBlend Luxo', 'O Narguilé MasterBlend Luxo é a escolha suprema para os conhecedores de shisha. Com um design elegante e uma construção de alta qualidade, este narguilé oferece uma experiência de fumar única e refinada. Sua elegância é incomparável, tornando-o um item de destaque em qualquer reunião.', 10, 199.99, 249.99),
    ('Tabaco Exótico Sahara Nights', 'O Tabaco Exótico Sahara Nights transportará seus sentidos para as misteriosas noites do deserto. Com um blend de sabores intensos e aromas intrigantes, este tabaco premium oferece uma experiência de fumar incomparável. Deixe-se levar por uma jornada sensorial única sob o céu estrelado.', 20, 29.99, 49.99),
    ('Carvão Golden Flames', 'O Carvão Golden Flames é a escolha número um dos apreciadores de hookah que buscam uma queima consistente e de longa duração. Feito com carvão natural de alta qualidade, ele proporciona o calor perfeito para a sua sessão de fumo. Dê vida às suas essências favoritas com a chama dourada deste carvão de excelência.', 50, 9.99, 19.99),
    ('Mangueira Diamond Crush', 'A Mangueira Diamond Crush é um verdadeiro diamante entre as mangueiras de hookah. Com seu design luxuoso e ponta brilhante, ela combina estilo e funcionalidade. Desfrute de fumaça suave e refrescante enquanto adiciona um toque de glamour à sua sessão de narguilé.', 30, 24.99, 39.99),
    ('Bowl Fusion Rainbow', 'O Bowl Fusion Rainbow é a peça central perfeita para sua sessão de hookah. Sua construção de cerâmica de alta qualidade permite que você desfrute de sabores puros e intensos. Além disso, seu visual arco-íris adiciona um toque de cor e alegria à sua experiência de fumar.', 25, 14.99, 29.99);


INSERT INTO pessoa(cpf, email, nome, senha)
VALUES
  ('123.456.789-01', 'jacare@example.com', 'jacare', 'senha1'),
  ('987.654.321-09', 'bene@example.com', 'bene', 'senha2'),
  ('456.789.012-34', 'labosta@example.com', 'labosta', 'senha3'),
  ('234.567.890-12', 'gih@example.com', 'gih', 'senha4');

INSERT INTO endereco(numero, cep, cidade, estado, nome, bairro, logradouro, complemento) VALUES
    (123, '12345-678', 'São Paulo', 'SP', 'Endereço 1', 'Centro', 'Rua Principal', 'Apartamento 101'),
    (456, '54321-876', 'Rio de Janeiro', 'RJ', 'Endereço 2', 'Copacabana', 'Avenida Secundária', 'Casa 2'),
    (789, '98765-432', 'Belo Horizonte', 'MG', 'Endereço 3', 'Barro Preto', 'Rua dos Exemplos', 'Sala 3A'),
    (1011, '10101-010', 'Brasília', 'DF', 'Endereço 4', 'Asa Sul', 'Quadra Principal', 'Bloco A'),
    (1515, '15151-515', 'Recife', 'PE', 'Endereço 5', 'Boa Viagem', 'Rua das Praias', 'Loja 5B'),
    (222, '22222-222', 'Salvador', 'BA', 'Endereço 6', 'Barra', 'Avenida da Praia', 'Casa 6C'),
    (777, '77777-777', 'Curitiba', 'PR', 'Endereço 7', 'Batel', 'Rua das Árvores', 'Apartamento 7D'),
    (555, '55555-555', 'Fortaleza', 'CE', 'Endereço 8', 'Aldeota', 'Avenida Principal', 'Loja 8E');


INSERT INTO pessoa_enderecoprincipal(id_enderecoprincipal, id_pessoa) VALUES 
(5, 1),
(6, 2),
(7, 3),
(8, 4);

INSERT INTO pessoa_enderecoreserva (id_enderecoreserva, id_pessoa) VALUES 
(1, 1),
(2, 2),
(3, 3),
(4, 4);

INSERT INTO telefone (codigoArea, numero) VALUES
('63', '91111-1111'),
('62', '92222-2222'),
('61', '93333-3333'),
('55', '94444-4444'),
('63', '95555-5555'),
('62', '96666-6666'),
('61', '97777-7777'),
('55', '98888-8888');

INSERT INTO pessoa_telefone (id_pessoa, id_telefone) VALUES 
(1, 1),
(2, 2),
(3, 3),
(4, 4);

INSERT INTO pessoa_whatsapp (id_pessoa, id_whatsapp) VALUES 
(1, 5),
(2, 6),
(3, 7),
(4, 8);
