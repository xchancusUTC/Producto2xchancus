# --- First database schema

# --- !Ups

create table restaurante (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_restaurante primary key (id))
;

create table pedido (
  id                        bigint not null,
  name                      varchar(255),
  tipo                      varchar(255),
  cantidad                  bigint not null,
   precio                   bigint not null,
  restaurante_id                bigint,
  constraint pk_pedido primary key (id))
;

create sequence restaurante_seq start with 1000;

create sequence pedido_seq start with 1000;

alter table pedido add constraint fk_pedido_restaurante_1 foreign key (restaurante_id) references restaurante (id) on delete restrict on update restrict;
create index ix_pedido_restaurante_1 on pedido (restaurante_id);


# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists restaurante;

drop table if exists pedido;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists restaurante_seq;

drop sequence if exists pedido_seq;

