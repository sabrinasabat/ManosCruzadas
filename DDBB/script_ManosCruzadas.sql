drop database if exists ManosCruzadas;
create database if not exists ManosCruzadas;
use ManosCruzadas;


create table if not exists Usuario(
`id_usuario` int auto_increment primary key,
`nombre` varchar(100) not null,
`email` varchar(250) unique not null,
`password` varchar(255) not null,
`ubicacion` varchar(255),
`foto_perfil` longblob,
`fecha_alta` timestamp default current_timestamp
);

create table if not exists Categoria(
`id_categoria` int auto_increment primary key,
`nombre` varchar(100) not null
);

create table if not exists SubCategoria(
`id_subcategoria` int auto_increment primary key,
`id_categoria` int not null,
`nombre` varchar(100) not null,
foreign key(id_categoria) references Categoria (id_categoria)
);

create table if not exists Habilidad_Servicio(
`id_habilidad` int auto_increment primary key,
`id_subcategoria` int not null,
`id_usuario` int not null,
`tipo` enum('ofrece', 'busca') not null,
`descripcion` text,
`fecha_alta` timestamp default current_timestamp,
foreign key(id_subcategoria) references SubCategoria(id_subcategoria),
foreign key(id_usuario) references Usuario(id_usuario)
);

create table if not exists Evaluacion(
`id_evaluacion` int auto_increment primary key,
`id_usuario_evaluador` int not null,
`id_usuario_evaluado` int not null,
`nota` int check(nota between 1 and 5),
`comentario` text,
`fecha_evaluacion` timestamp default current_timestamp,
foreign key(id_usuario_evaluador) references Usuario(id_usuario),
foreign key(id_usuario_evaluado) references Usuario(id_usuario)
);

create table if not exists Matches(
`id_match` int auto_increment primary key,
`id_usuario1` int not null,
`id_usuario2` int not null,
`status` enum('pendiente', 'acepto', 'rechazado') not null default 'pendiente',
`fecha_match` timestamp default current_timestamp,
foreign key(id_usuario1) references Usuario(id_usuario),
foreign key(id_usuario2) references Usuario(id_usuario)
);

create table if not exists Mensaje(
`id_mensaje` int auto_increment primary key,
`id_usuario_remitente` int not null,
`id_usuario_destinatario` int not null,
`id_match` int not null,
`mensaje` text,
`fecha_envio` timestamp default current_timestamp,
foreign key(id_usuario_remitente) references Usuario(id_usuario),
foreign key(id_usuario_destinatario) references Usuario(id_usuario),
foreign key(id_match) references Matches(id_match)
);