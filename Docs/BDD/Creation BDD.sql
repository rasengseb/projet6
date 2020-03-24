
CREATE SEQUENCE public.cotation_id_seq;

CREATE TABLE public.Cotation (
                id INTEGER NOT NULL DEFAULT nextval('public.cotation_id_seq'),
                nom VARCHAR NOT NULL,
                CONSTRAINT cotation_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.cotation_id_seq OWNED BY public.Cotation.id;

CREATE SEQUENCE public.departement_id_seq;

CREATE TABLE public.Departement (
                id INTEGER NOT NULL DEFAULT nextval('public.departement_id_seq'),
                numero INTEGER NOT NULL,
                nom VARCHAR NOT NULL,
                CONSTRAINT departement_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.departement_id_seq OWNED BY public.Departement.id;

CREATE SEQUENCE public.region_id_seq;

CREATE TABLE public.Region (
                id INTEGER NOT NULL DEFAULT nextval('public.region_id_seq'),
                nom VARCHAR NOT NULL,
                id_departement INTEGER NOT NULL,
                CONSTRAINT region_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.region_id_seq OWNED BY public.Region.id;

CREATE SEQUENCE public.adresse_id_seq;

CREATE TABLE public.Adresse (
                id INTEGER NOT NULL DEFAULT nextval('public.adresse_id_seq'),
                numero INTEGER NOT NULL,
                rue VARCHAR NOT NULL,
                codePostal INTEGER NOT NULL,
                ville VARCHAR NOT NULL,
                id_departement INTEGER NOT NULL,
                id_region INTEGER NOT NULL,
                CONSTRAINT adresse_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.adresse_id_seq OWNED BY public.Adresse.id;

CREATE TABLE public.Site (
                id INTEGER NOT NULL,
                nom VARCHAR NOT NULL,
                id_adresse INTEGER NOT NULL,
                id_secteur INTEGER NOT NULL,
                id_image INTEGER NOT NULL,
                id_commentaire INTEGER NOT NULL,
                isOfficiel BOOLEAN NOT NULL,
                CONSTRAINT site_pk PRIMARY KEY (id)
);


CREATE TABLE public.Commentaire (
                id INTEGER NOT NULL,
                id_site INTEGER NOT NULL,
                commentaire VARCHAR NOT NULL,
                isPublic BOOLEAN NOT NULL,
                CONSTRAINT commentaire_pk PRIMARY KEY (id)
);


CREATE TABLE public.Secteur (
                id INTEGER NOT NULL,
                id_site INTEGER NOT NULL,
                id_voie INTEGER NOT NULL,
                id_image INTEGER NOT NULL,
                CONSTRAINT secteur_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.voie_id_seq;

CREATE TABLE public.Voie (
                id INTEGER NOT NULL DEFAULT nextval('public.voie_id_seq'),
                id_secteur INTEGER NOT NULL,
                nom VARCHAR NOT NULL,
                id_cotation INTEGER NOT NULL,
                longueur INTEGER NOT NULL,
                description VARCHAR,
                id_image INTEGER,
                CONSTRAINT voie_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.voie_id_seq OWNED BY public.Voie.id;

CREATE SEQUENCE public.image_id_seq;

CREATE TABLE public.Image (
                id INTEGER NOT NULL DEFAULT nextval('public.image_id_seq'),
                chemin VARCHAR NOT NULL,
                id_voie INTEGER,
                id_secteur INTEGER,
                id_site INTEGER,
                CONSTRAINT image_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.image_id_seq OWNED BY public.Image.id;

CREATE SEQUENCE public.topo_id_seq;

CREATE TABLE public.Topo (
                id INTEGER NOT NULL DEFAULT nextval('public.topo_id_seq'),
                nom VARCHAR NOT NULL,
                description VARCHAR NOT NULL,
                id_site INTEGER NOT NULL,
                dateParution DATE NOT NULL,
                disponible BOOLEAN NOT NULL,
                CONSTRAINT topo_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.topo_id_seq OWNED BY public.Topo.id;

CREATE SEQUENCE public.utilisateur_id_seq;

CREATE TABLE public.Utilisateur (
                id INTEGER NOT NULL DEFAULT nextval('public.utilisateur_id_seq'),
                nom VARCHAR NOT NULL,
                prenom VARCHAR NOT NULL,
                pseudo VARCHAR NOT NULL,
                mdp VARCHAR NOT NULL,
                mail VARCHAR NOT NULL,
                isAdmin BOOLEAN NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.utilisateur_id_seq OWNED BY public.Utilisateur.id;

CREATE SEQUENCE public.reservation_id_seq;

CREATE TABLE public.Reservation (
                id INTEGER NOT NULL DEFAULT nextval('public.reservation_id_seq'),
                id_utilisateur INTEGER NOT NULL,
                id_topo INTEGER NOT NULL,
                dateReservation DATE NOT NULL,
                CONSTRAINT reservation_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.reservation_id_seq OWNED BY public.Reservation.id;

ALTER TABLE public.Voie ADD CONSTRAINT cotation_voie_fk
FOREIGN KEY (id_cotation)
REFERENCES public.Cotation (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Adresse ADD CONSTRAINT departement_adresse_fk
FOREIGN KEY (id_departement)
REFERENCES public.Departement (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Region ADD CONSTRAINT departement_region_fk
FOREIGN KEY (id_departement)
REFERENCES public.Departement (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Adresse ADD CONSTRAINT region_adresse_fk
FOREIGN KEY (id_region)
REFERENCES public.Region (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Site ADD CONSTRAINT adresse_site_fk
FOREIGN KEY (id_adresse)
REFERENCES public.Adresse (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Topo ADD CONSTRAINT site_topo_fk
FOREIGN KEY (id_site)
REFERENCES public.Site (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Secteur ADD CONSTRAINT site_secteur_fk
FOREIGN KEY (id_site)
REFERENCES public.Site (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Commentaire ADD CONSTRAINT site_commentaire_fk
FOREIGN KEY (id_site)
REFERENCES public.Site (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Image ADD CONSTRAINT site_image_fk
FOREIGN KEY (id_site)
REFERENCES public.Site (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Site ADD CONSTRAINT commentaire_site_fk
FOREIGN KEY (id_commentaire)
REFERENCES public.Commentaire (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Site ADD CONSTRAINT secteur_site_fk
FOREIGN KEY (id_secteur)
REFERENCES public.Secteur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Voie ADD CONSTRAINT secteur_voie_fk
FOREIGN KEY (id_secteur)
REFERENCES public.Secteur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Image ADD CONSTRAINT secteur_image_fk
FOREIGN KEY (id_secteur)
REFERENCES public.Secteur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Secteur ADD CONSTRAINT voie_secteur_fk
FOREIGN KEY (id_voie)
REFERENCES public.Voie (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Image ADD CONSTRAINT voie_image_fk
FOREIGN KEY (id_voie)
REFERENCES public.Voie (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Site ADD CONSTRAINT image_site_fk
FOREIGN KEY (id_image)
REFERENCES public.Image (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Voie ADD CONSTRAINT image_voie_fk
FOREIGN KEY (id_image)
REFERENCES public.Image (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Secteur ADD CONSTRAINT image_secteur_fk
FOREIGN KEY (id_image)
REFERENCES public.Image (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Reservation ADD CONSTRAINT topo_reservation_fk
FOREIGN KEY (id_topo)
REFERENCES public.Topo (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Reservation ADD CONSTRAINT utilisateur_reservation_fk
FOREIGN KEY (id_utilisateur)
REFERENCES public.Utilisateur (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
