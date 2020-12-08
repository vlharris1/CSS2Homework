DROP TABLE IF EXISTS tasks;

CREATE TABLE tasks (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  to_do VARCHAR(250) NOT NULL,
  month VARCHAR(250) NOT NULL,
  done VARCHAR(250) DEFAULT NULL
);

INSERT INTO tasks (to_do, month, done) VALUES
  ('Learn Latin', 'August', 'no'),
  ('Buy a typewriter', 'September', 'no'),
  ('Read The Bell Jar', 'October', 'no');