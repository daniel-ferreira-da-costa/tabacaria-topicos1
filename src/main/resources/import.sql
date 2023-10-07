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

INSERT INTO estado (sigla, nome) VALUES
    ('AC', 'Acre'),
    ('AL', 'Alagoas'),
    ('AP', 'Amapá'),
    ('AM', 'Amazonas'),
    ('BA', 'Bahia'),
    ('CE', 'Ceará'),
    ('DF', 'Distrito Federal'),
    ('ES', 'Espírito Santo'),
    ('GO', 'Goiás'),
    ('MA', 'Maranhão'),
    ('MT', 'Mato Grosso'),
    ('MS', 'Mato Grosso do Sul'),
    ('MG', 'Minas Gerais'),
    ('PA', 'Pará'),
    ('PB', 'Paraíba'),
    ('PR', 'Paraná'),
    ('PE', 'Pernambuco'),
    ('PI', 'Piauí'),
    ('RJ', 'Rio de Janeiro'),
    ('RN', 'Rio Grande do Norte'),
    ('RS', 'Rio Grande do Sul'),
    ('RO', 'Rondônia'),
    ('RR', 'Roraima'),
    ('SC', 'Santa Catarina'),
    ('SP', 'São Paulo'),
    ('SE', 'Sergipe'),
    ('TO', 'Tocantins');

INSERT INTO cidade (id_estado, nome) VALUES
    (1, 'Rio Branco'), -- Acre (AC)
    (2, 'Maceió'), -- Alagoas (AL)
    (3, 'Macapá'), -- Amapá (AP)
    (4, 'Manaus'), -- Amazonas (AM)
    (5, 'Salvador'), -- Bahia (BA)
    (6, 'Fortaleza'), -- Ceará (CE)
    (7, 'Brasília'), -- Distrito Federal (DF)
    (8, 'Vitória'), -- Espírito Santo (ES)
    (9, 'Goiânia'), -- Goiás (GO)
    (10, 'São Luís'), -- Maranhão (MA)
    (11, 'Cuiabá'), -- Mato Grosso (MT)
    (12, 'Campo Grande'), -- Mato Grosso do Sul (MS)
    (13, 'Belo Horizonte'), -- Minas Gerais (MG)
    (14, 'Belém'), -- Pará (PA)
    (15, 'João Pessoa'), -- Paraíba (PB)
    (16, 'Curitiba'), -- Paraná (PR)
    (17, 'Recife'), -- Pernambuco (PE)
    (18, 'Teresina'), -- Piauí (PI)
    (19, 'Rio de Janeiro'), -- Rio de Janeiro (RJ)
    (20, 'Natal'), -- Rio Grande do Norte (RN)
    (21, 'Porto Alegre'), -- Rio Grande do Sul (RS)
    (22, 'Porto Velho'), -- Rondônia (RO)
    (23, 'Boa Vista'), -- Roraima (RR)
    (24, 'Florianópolis'), -- Santa Catarina (SC)
    (25, 'São Paulo'), -- São Paulo (SP)
    (26, 'Aracaju'), -- Sergipe (SE)
    (27, 'Palmas'); -- Tocantins (TO)

INSERT INTO pessoa(cpf, email, nome, senha)
VALUES
  ('123.456.789-01', 'jacare@example.com', 'jacare', 'senha1'),
  ('987.654.321-09', 'bene@example.com', 'bene', 'senha2'),
  ('456.789.012-34', 'labosta@example.com', 'labosta', 'senha3'),
  ('234.567.890-12', 'gih@example.com', 'gih', 'senha4');

INSERT INTO endereco( id_cidade, bairro, cep, complemento, logradouro, nome, numero)
VALUES
  (1, 'Bairro 1', '12345-678', 'Complemento 1', 'Rua 1', 'Casa 1', '123'),
  (2, 'Bairro 2', '23456-789', 'Complemento 2', 'Rua 2', 'Casa 2', '456'),
  (3, 'Bairro 3', '34567-890', 'Complemento 3', 'Rua 3', 'Casa 3', '789'),
  (4, 'Bairro 4', '45678-901', 'Complemento 4', 'Rua 4', 'Casa 4', '101'),
  (5, 'Bairro 5', '56789-012', 'Complemento 5', 'Rua 5', 'Casa 5', '202'),
  (6, 'Bairro 6', '67890-123', 'Complemento 6', 'Rua 6', 'Casa 6', '111'),
  (7, 'Bairro 7', '78901-234', 'Complemento 7', 'Rua 7', 'Casa 7', '222'),
  (8, 'Bairro 8', '89012-345', 'Complemento 8', 'Rua 8', 'Casa 8', '333');

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
    ('63', '1111-1111'),
    ('62', '2222-2222'),
    ('61', '3333-3333'),
    ('55', '4444-4444'),
    ('63', '5555-5555'),
    ('62', '6666-6666'),
    ('61', '7777-7777'),
    ('55', '8888-8888');

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
