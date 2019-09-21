CREATE TABLE public."CUSTOMER"
(
  "CUSTOMERID" character varying(128) NOT NULL,
  "PHONENO" character varying(128) NOT NULL,
  "FIRSTNAME" character varying(128) NOT NULL,
  "LASTNAME" character varying(128) NOT NULL,
  "TYPE" integer NOT NULL DEFAULT 1,
  "ISACTIVE" boolean,
  CONSTRAINT "CUSTOMERID_PK1" PRIMARY KEY ("CUSTOMERID")
)