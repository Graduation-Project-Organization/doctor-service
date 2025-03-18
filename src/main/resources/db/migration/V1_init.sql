-- Here you type the SQL commands to create the tables
CREATE TABLE bio_information (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    middle_name VARCHAR(255),
    last_name VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    gender VARCHAR(10) NOT NULL
);

CREATE TABLE contact_information (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    phone_number BIGINT NOT NULL,
    city VARCHAR(255),
    state VARCHAR(255),
    country VARCHAR(255)
);

CREATE TABLE profile_information (
    id SERIAL PRIMARY KEY,
    medical_license INT UNIQUE NOT NULL,
    years_of_experience INT NOT NULL,
    medical_license_expiry_date DATE NOT NULL,
    biography TEXT,
    profile_image BYTEA
);

CREATE TABLE doctors (
    id SERIAL PRIMARY KEY,
    bio_information_id INT UNIQUE NOT NULL,
    profile_information_id INT UNIQUE NOT NULL,
    contact_information_id INT UNIQUE NOT NULL,
    CONSTRAINT fk_doctors_bio FOREIGN KEY (bio_information_id) REFERENCES bio_information (id) ON DELETE CASCADE,
    CONSTRAINT fk_doctors_profile FOREIGN KEY (profile_information_id) REFERENCES profile_information (id) ON DELETE CASCADE,
    CONSTRAINT fk_doctors_contact FOREIGN KEY (contact_information_id) REFERENCES contact_information (id) ON DELETE CASCADE
);
