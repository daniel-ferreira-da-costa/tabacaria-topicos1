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

INSERT INTO telefone (codigoArea, numero) VALUES
    ('63', '1111-1111'),
    ('62', '2222-2222'),
    ('61', '3333-3333'),
    ('55', '4444-4444'),
    ('63', '5555-5555'),
    ('62', '6666-6666'),
    ('61', '7777-7777'),
    ('55', '8888-8888');
INSERT INTO usuario (nome, login, senha) VALUES
    ('Daniel', 'jacare', '333'),
    ('Andre', 'bene', '444'),
    ('Hirosh', 'labosta', '555'),
    ('Giovanna', 'gih', '666');

INSERT INTO usuario_telefone (id_usuario, id_telefone) VALUES
    (1, 1),
    (2, 2),  
    (3, 3),  
    (4, 4);

INSERT INTO usuario_whatsapp (id_usuario, id_whatsapp) VALUES
    (1, 5),
    (2, 6),  
    (3, 7),  
    (4, 8);