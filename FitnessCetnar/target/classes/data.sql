INSERT INTO FITNESS_CENTAR (adresa,br_telefona,email,naziv) VALUES ('herojaPinkija','123123123','best@gmail.com','BestFit');

INSERT INTO KORISNIK(aktivan,datum,email,ime,password,position,prezime,telefon,username,fitness_centar_id) VALUES (true,'2000-05-07','dsmirkovic@gmail.com','Predrag','Pedja-2000',0,'Mirkovic','0624414','pedja123',1);

INSERT INTO KORISNIK(aktivan,datum,email,ime,password,position,prezime,telefon,username,fitness_centar_id) VALUES (true,'2000-05-07','xzcxzcc@gmail.com','Dejan','Pedja-2000',1,'Mirkovic','0666414','pedja1234',1);

INSERT INTO KORISNIK(aktivan,datum,email,ime,password,position,prezime,telefon,username,fitness_centar_id) VALUES (false ,'2000-05-07','xzzzsdc@gmail.com','Dejan','Pedja-2000',2,'Mirkovic','0364414','pedja1234',1);

INSERT INTO TRENER(fitness_centar_id,korisnik_id) VALUES (1,1);

INSERT INTO CLAN_FITNES_CENTRA(korisnik_id) VALUES (2);

INSERT INTO TRENING(trajanje,naziv,cena,opis,tip_treninga,trener_id) VALUES ('60','Aerobic','800','sve','grupni',1);

INSERT INTO TRENING(trajanje,naziv,cena,opis,tip_treninga,trener_id) VALUES ('120','Push','2000','grudi','personalni',1);

INSERT INTO TRENING(trajanje,naziv,cena,opis,tip_treninga,trener_id) VALUES ('90','Leg','1500','noge','personalni',1);

INSERT INTO OCENA_ODRADJENIH_TRENINGA (clan_id,termin_id) VALUES (1,1);

INSERT INTO TERMINSKA_LISTA(broj_clanova,cena,dan,fitness_centar_id,trening_id) VALUES ('30','50','utorak',1,1);

INSERT INTO TERMINSKA_LISTA(broj_clanova,cena,dan,fitness_centar_id,trening_id) VALUES ('30','50','utorak',1,2);

INSERT INTO TERMINSKA_LISTA(broj_clanova,cena,dan,fitness_centar_id,trening_id) VALUES ('30','50','utorak',1,3);

INSERT INTO SALA (kapacitet,oznaka_sale,fitness_centar_id,trening_id) VALUES ('20','1',1,1);
INSERT INTO SALA (kapacitet,oznaka_sale,fitness_centar_id,trening_id) VALUES ('20','2',1,2);
INSERT INTO SALA (kapacitet,oznaka_sale,fitness_centar_id,trening_id) VALUES ('20','3',1,3);

INSERT INTO ODRADJENI_TRENINZI (ocena,korisnik_id,trening_id) VALUES ('5',1,1);

