CREATE TABLE account_details
(
  id             INTEGER  NOT NULL AUTO_INCREMENT,
  account_number INTEGER,
  account_type   VARCHAR(255) NOT NULL,
  address        VARCHAR(255) NOT NULL,
  first_name     VARCHAR(255) NOT NULL,
  last_name      VARCHAR(255) NOT NULL,
  email          VARCHAR(255) NOT NULL,
  zip_code       VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
  );
  
 