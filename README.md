# Wildlife Tracker

This is an an application that allows Rangers to track wildlife sightings in the area.

## Author

This app was made by Bruno Towett

## Technologies Used 
- Java
- Spark
- Handlebars
- Sql
- Sql2o
- PostgreSQL
- Bootstrap
- CSS

## Installation

* `git clone <https://github.com/BTG001/wildife-tracker>` this repository
* `cd wild-tracker`

## Running / Development

* `gradle run`

### Running Tests

* `gradle test`

### Building

* `gradle build`

### SQL

* cd to src/main/resources/db folder
* You will see such a file:
    * `CREATE DATABASE wildlife_tracker;`
    * `\c wildlife_tracker;`
    * `CREATE TABLE IF NOT EXISTS endangered_animals(
       	id SERIAL PRIMARY KEY,
           animal_id int,
           animal_name VARCHAR ,
           animal_age VARCHAR,
           animal_health VARCHAR
       );`
    * `CREATE TABLE IF NOT EXISTS animals(
       	id SERIAL PRIMARY KEY,
           animal_id int,
           animal_name VARCHAR
       );`
    *  `CREATE TABLE IF NOT EXISTS sightings(
            id SERIAL PRIMARY KEY,
            animal_id int,
            animal_location VARCHAR ,
            ranger_name VARCHAR,
            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
        );
`
    * `CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;`
* Type in psql -U (username eg postgres) < create.sql

:phone: Incase of anything you can easily reach me through:
* brunokipkorir2@gmail.com

### License

* MIT LICENCE [MIT](http://opensource.org/licenses/MIT)
© 2020 BRUNO TOWETT

