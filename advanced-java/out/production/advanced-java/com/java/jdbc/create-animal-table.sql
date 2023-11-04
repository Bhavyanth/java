CREATE TABLE IF NOT EXISTS public.animal
(
    name character varying COLLATE pg_catalog."default",
    age integer,
    breed character varying COLLATE pg_catalog."default"
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.animal
    OWNER to postgres;