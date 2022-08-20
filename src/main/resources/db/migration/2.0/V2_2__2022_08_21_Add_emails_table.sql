--date: 2020-05-25
--author: stvort

create table emails (
                        id bigserial,
                        user_id bigint,
                        email varchar(50)
)