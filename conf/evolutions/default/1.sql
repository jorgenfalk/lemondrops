# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table board (
  id                        bigint not null,
  size                      integer,
  constraint pk_board primary key (id))
;

create table solution (
  id                        bigint not null,
  moves                     varchar(255),
  size                      integer,
  score                     integer,
  constraint pk_solution primary key (id))
;

create sequence board_seq;

create sequence solution_seq;




# --- !Downs

drop table if exists board cascade;

drop table if exists solution cascade;

drop sequence if exists board_seq;

drop sequence if exists solution_seq;

