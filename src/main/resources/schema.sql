DROP TABLE IF EXISTS author, film;

CREATE TABLE author (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255)
);

CREATE TABLE film (
                      id SERIAL PRIMARY KEY,
                      name VARCHAR(254),
                      release_date date,
                      author_id INTEGER REFERENCES author(id)
);
