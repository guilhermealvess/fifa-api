CREATE TABLE IF NOT EXISTS confederation(
    id UUID NOT NULL,
    name VARCHAR(60) NOT NULL UNIQUE,
    president VARCHAR(60) NOT NULL,
    locale VARCHAR(10) NOT NULL UNIQUE,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP
);