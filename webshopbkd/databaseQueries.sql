CREATE TABLE category (
id IDENTITY,
name varchar(50),
description varchar(255),
image_url varchar(50),
is_active BOOLEAN,

CONSTRAINT pk_category_id PRIMARY KEY (id)
);

INSERT into category (name, description, image_url, is_active) values ('MP3Player' ,'MP3 Player System','CAT5.img','TRUE');
INSERT into category (name, description, image_url, is_active) values ('HeadPhone' ,'Music HeadSet','CAT6.img','TRUE');